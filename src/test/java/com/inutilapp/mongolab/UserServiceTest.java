package com.inutilapp.mongolab;


import com.inutilapp.mongolab.model.User;
import com.inutilapp.mongolab.service.UserService;
import lombok.extern.slf4j.Slf4j;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.Optional;

import static org.assertj.core.api.Assertions.*;

@Slf4j
@RunWith(SpringRunner.class)
@SpringBootTest
public class UserServiceTest {

    @Autowired
    UserService userService;

    @Test
    public void addUserTest() {

        /*
        User user = new User();
        user.setCod("1234");
        user.setFirstName("Teodoro Pancrasio");
        user.setLastName("Moya Piña");
        user.setEnabled(false);
        */

        User user = new User("123", "Violeta", "Rojo");
        Optional<User> u = userService.addUser(user);
        log.info("User -> {}", u.toString());

        assertThat(u).isNotEmpty();

    }

}
