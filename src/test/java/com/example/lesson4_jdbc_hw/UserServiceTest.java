package com.example.lesson4_jdbc_hw;

import com.example.lesson4_jdbc_hw.model.User;
import com.example.lesson4_jdbc_hw.service.UserService;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.transaction.annotation.Transactional;

@SpringBootTest
@Transactional
class UserServiceTest {

    @Autowired
    UserService userService;

    @Test
    void newUser() {

        User denis = userService.newUser("Denis", "Denis@mail.ru");
        Assertions.assertNotNull(denis);

        User onceAgain = userService.getById(denis.getId());
        Assertions.assertNotNull(onceAgain);
    }
}