package com.scravlon.springlogindemo.service;

import com.scravlon.springlogindemo.dao.UserRepository;
import com.scravlon.springlogindemo.models.MyUserDetail;
import com.scravlon.springlogindemo.models.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import java.util.Optional;
@Service
public class MyUserDetailsService implements UserDetailsService {

    @Autowired
    UserRepository userRepository;

    @Override
    public UserDetails loadUserByUsername(String s) throws UsernameNotFoundException {
        Optional<User> user = userRepository.findByUserName(s);
        user.orElseThrow(() -> new UsernameNotFoundException("Not found: " + s));
        return user.map(MyUserDetail::new).get();
    }

    public boolean findUser(String s) {
        Optional<User> user = userRepository.findByUserName(s);
        System.out.print(user.isPresent());
        return user.isPresent();
    }

    public void addUser(User user){
        userRepository.save(user);
    }
}
