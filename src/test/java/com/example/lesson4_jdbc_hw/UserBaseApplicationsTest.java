package com.example.lesson4_jdbc_hw;

import com.example.lesson4_jdbc_hw.model.User;
import com.example.lesson4_jdbc_hw.repository.UserRepository;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@SpringBootTest
@Transactional
class UserBaseApplicationsTest {

    @Autowired
    UserRepository userRepository;

    @Test
    void contextLoads() {

        User one = userRepository.getOne(1L);
        List<User> all = userRepository.findAllByAgeGreaterThan(2L);
        Assertions.assertEquals("Denis", one.getName());
        Assertions.assertEquals(2, all.size());

    }

}