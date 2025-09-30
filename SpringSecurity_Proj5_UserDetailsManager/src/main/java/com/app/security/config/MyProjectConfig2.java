package com.app.security.config;

import javax.sql.DataSource;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.crypto.password.NoOpPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.security.provisioning.JdbcUserDetailsManager;


@Configuration
public class MyProjectConfig2 {
	
	@Bean
	public JdbcUserDetailsManager userDetailsManager(DataSource dataSource) {
		JdbcUserDetailsManager userDetailsManager = new JdbcUserDetailsManager(dataSource);
		
		// custom query to get the user
		userDetailsManager.setUsersByUsernameQuery
		("SELECT uname,pass,enabled FROM myuser WHERE uname = ?");
		
		// get the user authority
		userDetailsManager.setAuthoritiesByUsernameQuery
		("SELECT uname,authority FROM myuser_authorities WHERE uname = ?");
		
		
		// custom query to crate user
		userDetailsManager.setCreateUserSql
		("INSERT into myuser (uname,pass,enabled) values(?,?,?)");
		
		// custom query to create the user authority
		userDetailsManager.setCreateAuthoritySql(
			    "INSERT into myuser_authorities (uname, authority) values (?, ?)"
			);
	
		
		return userDetailsManager;
	}
	

    @SuppressWarnings("deprecation")
	@Bean
    PasswordEncoder passwordEncoder() {
		return NoOpPasswordEncoder.getInstance();
	}

}
