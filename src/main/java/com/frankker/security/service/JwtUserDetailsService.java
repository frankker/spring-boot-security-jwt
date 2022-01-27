package com.frankker.security.service;

import java.util.ArrayList;

import java.util.HashSet;
import java.util.Set;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;

@Service
public class JwtUserDetailsService implements UserDetailsService {

	@Override
	public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
		if ("frankker".equals(username)) {
			Set<GrantedAuthority> grantedAuthorities = new HashSet<>();
			grantedAuthorities.add(new SimpleGrantedAuthority("SUPPORT_ENGINEER"));

			return new User("frankker",
//					new BCryptPasswordEncoder().encode("password"),
					"$2a$10$ixlPY3AAd4ty1l6E2IsQ9OFZi2ba9ZQE0bP7RFcGIWNhyFrrT3YUi",
					new ArrayList<>(grantedAuthorities));
		} else {
			throw new UsernameNotFoundException("User not found with username: " + username);
		}
	}

/*	AppUser user = userRepository.findByUsername(username);

	Set<GrantedAuthority> grantedAuthorities = new HashSet<>(); // use list if you wish
	for (AppRole role : user.getRoles()) {
			grantedAuthorities.add(new SimpleGrantedAuthority(role.getName()));
		}
	return new org.springframework.security.core.userdetails.User(
			user.getUsername(),
			user.getPassword(),
		grantedAuthorities
	);*/
}