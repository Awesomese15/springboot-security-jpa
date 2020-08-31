package io.thomas.springsecurityjpaandjdbc.service;

import io.thomas.springsecurityjpaandjdbc.model.MyUserDetails;
import io.thomas.springsecurityjpaandjdbc.model.User;
import io.thomas.springsecurityjpaandjdbc.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import java.util.Optional;


@Service
public class MyUserService implements UserDetailsService {
    @Autowired
    UserRepository userRepository;
    @Override
    public UserDetails loadUserByUsername(String s) throws UsernameNotFoundException {
        Optional<User>user= userRepository.findByUserName(s);
        user.orElseThrow(() -> new UsernameNotFoundException("Not Found  ::  "+ s));
        return user.map(MyUserDetails::new).get();
    }
}
