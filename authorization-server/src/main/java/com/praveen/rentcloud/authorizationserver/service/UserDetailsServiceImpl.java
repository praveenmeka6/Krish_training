package com.praveen.rentcloud.authorizationserver.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.authentication.AccountStatusUserDetailsChecker;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import com.praveen.rentcloud.authorizationserver.model.AuthUserDetails;
import com.praveen.rentcloud.authorizationserver.model.User;
import com.praveen.rentcloud.authorizationserver.repository.UserDetailsServiceRepository;

@Service("userDetailsService")
public class UserDetailsServiceImpl implements UserDetailsService{

	@Autowired
	UserDetailsServiceRepository userDetailsServiceRepository;
	
	@Override
	public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
		Optional<User> optionalUser = userDetailsServiceRepository.findByUsername(username);
		
		optionalUser.orElseThrow(() -> new UsernameNotFoundException("username or password wrong"));
		
		UserDetails userDetails = new AuthUserDetails(optionalUser.get());
		
		new AccountStatusUserDetailsChecker().check(userDetails);
		
		return userDetails;
	}

}
