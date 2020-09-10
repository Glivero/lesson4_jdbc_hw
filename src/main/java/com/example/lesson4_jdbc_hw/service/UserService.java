package com.example.lesson4_jdbc_hw.service;

import com.example.lesson4_jdbc_hw.model.User;
import com.example.lesson4_jdbc_hw.repository.UserRepository;
import org.springframework.stereotype.Service;

@Service
public class UserService {

    public UserService(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    UserRepository userRepository;

    public User newUser(String name, String email) {

        User user = new User();
        user.setAge(0L);
        user.setEmail(email);
        user.setName(name);

        return userRepository.save(user);
    }

    public User getById(Long id) {
        return userRepository.getOne(id);
    }

}
