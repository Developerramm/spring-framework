package com.app.security.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.ldap.core.support.LdapContextSource;
import org.springframework.security.config.Customizer;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.crypto.password.NoOpPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.security.ldap.userdetails.LdapUserDetailsManager;
import org.springframework.security.web.SecurityFilterChain;
@Configuration
public class MyProjectConfig {
	
	@Bean
	public LdapContextSource ldapContextSource() {
		LdapContextSource contextSource = new LdapContextSource();
		contextSource.setUrl("ldap://localhost:8389");
		contextSource.setBase("dc=example,dc=com");
		
		return contextSource;
	}
	
	@Bean
	public LdapUserDetailsManager ldapUserDetailsManager(LdapContextSource ldapContextSource) {
		LdapUserDetailsManager userDetailsManager = new LdapUserDetailsManager(ldapContextSource);
//		userDetailsManager.setUserDnBase("dc=example,dc=com");
		userDetailsManager.setGroupSearchBase("ou=users");
		
		return userDetailsManager;
	}
	
	@Bean
	public SecurityFilterChain securityFilterChain(HttpSecurity httpSecurity) throws Exception {
		httpSecurity.httpBasic(Customizer.withDefaults())
					.authorizeHttpRequests(c-> c.anyRequest().permitAll());

		
		return httpSecurity.build();
	}


    @SuppressWarnings("deprecation")
	@Bean
    PasswordEncoder passwordEncoder() {
		return NoOpPasswordEncoder.getInstance();
	}

}
