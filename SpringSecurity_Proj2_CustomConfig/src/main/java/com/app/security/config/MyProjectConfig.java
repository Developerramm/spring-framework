package com.app.security.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.crypto.password.NoOpPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.security.provisioning.InMemoryUserDetailsManager;

@Configuration
public class MyProjectConfig {

    @Bean
    UserDetailsService userDetailsServie() {
		
		UserDetails userDetails = User.withUsername("amitpal")
										.password("1234")
										.authorities("read")
										.build();
		
		UserDetails userDetails2 = User.withUsername("rampal")
				.password("1234")
				.authorities("read")
				.build();
		
		UserDetails userDetails3 = User.withUsername("pooja")
				.password("1234")
				.authorities("read")
				.build();
		
		UserDetailsService userDetailsService = new InMemoryUserDetailsManager(userDetails,userDetails2,userDetails3);
		
		return userDetailsService;
	}

    @SuppressWarnings("deprecation")
	@Bean
    PasswordEncoder passwordEncoder() {
		return NoOpPasswordEncoder.getInstance();
	}

}
