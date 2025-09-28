package com.app.security.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.Customizer;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.crypto.password.NoOpPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.security.provisioning.InMemoryUserDetailsManager;
import org.springframework.security.web.SecurityFilterChain;

@Configuration
public class MyProjectConfig {
	
	@Bean
	public SecurityFilterChain securityFilterChain(HttpSecurity httpSecurity) throws Exception {
		httpSecurity.httpBasic(Customizer.withDefaults())
					.authorizeHttpRequests(c-> c.anyRequest().permitAll());
		
		// create user
		UserDetails u1 =  User.withUsername("ram").password("123").authorities("write").build();
		UserDetails u2 =  User.withUsername("priya").password("123").authorities("write").build();
		
		
		// create the userDetailsManager
		
		 UserDetailsService userDetailsService =  new InMemoryUserDetailsManager(u1,u2);
		
		 httpSecurity.userDetailsService(userDetailsService);
		
		return httpSecurity.build();
	}

//    @Bean
//    UserDetailsService userDetailsServie() {
//		
//		UserDetails userDetails = User.withUsername("amitpal")
//										.password("1234")
//										.authorities("read")
//										.build();
//		
//		UserDetails userDetails2 = User.withUsername("rampal")
//				.password("1234")
//				.authorities("read")
//				.build();
//		
//		UserDetails userDetails3 = User.withUsername("pooja")
//				.password("1234")
//				.authorities("read")
//				.build();
//		
//		UserDetailsService userDetailsService = new InMemoryUserDetailsManager(userDetails,userDetails2,userDetails3);
//		
//		return userDetailsService;
//	}

    @SuppressWarnings("deprecation")
	@Bean
    PasswordEncoder passwordEncoder() {
		return NoOpPasswordEncoder.getInstance();
	}

}
