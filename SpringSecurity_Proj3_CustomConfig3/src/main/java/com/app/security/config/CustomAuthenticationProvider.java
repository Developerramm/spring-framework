package com.app.security.config;

import java.util.Arrays;

import org.springframework.security.authentication.AuthenticationCredentialsNotFoundException;
import org.springframework.security.authentication.AuthenticationProvider;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.AuthenticationException;
import org.springframework.stereotype.Component;

@Component
public class CustomAuthenticationProvider implements AuthenticationProvider {

	@Override
	public Authentication authenticate(Authentication authentication) throws AuthenticationException {
		// TODO Auto-generated method stub
		
			String username = authentication.getName();
			String password = String.valueOf(authentication.getCredentials());
			
			if("john".equals(username) && "123".equals(password)) {
				return new UsernamePasswordAuthenticationToken(username, password,Arrays.asList());
			}else {
				throw new AuthenticationCredentialsNotFoundException("password " + password + " is not found");
			}

	}

	@Override
	public boolean supports(Class<?> authentication) {

		return UsernamePasswordAuthenticationToken.class.isAssignableFrom(authentication);
	}

}
