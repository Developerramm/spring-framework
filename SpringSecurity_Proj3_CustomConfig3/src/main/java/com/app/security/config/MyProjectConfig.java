package com.app.security.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.Customizer;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.crypto.password.NoOpPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.security.web.SecurityFilterChain;

@Configuration
public class MyProjectConfig {
	

	private CustomAuthenticationProvider customAuthenticationProvider;
	
	public MyProjectConfig(CustomAuthenticationProvider authenticationProvider) {
		this.customAuthenticationProvider = authenticationProvider;
	}

    @Bean
    SecurityFilterChain securityFilterChain(HttpSecurity httpSecurity) throws Exception {
		
		httpSecurity.httpBasic(Customizer.withDefaults());
		
		httpSecurity.authenticationProvider(customAuthenticationProvider);
					
		httpSecurity.authorizeHttpRequests(c-> c.anyRequest().authenticated());
		

		
		return httpSecurity.build();
	}

    @SuppressWarnings("deprecation")
	@Bean
    PasswordEncoder passwordEncoder() {
		return NoOpPasswordEncoder.getInstance();
	}

}
