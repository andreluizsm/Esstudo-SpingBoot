package com.estudo.curso.config;

import com.estudo.curso.entitites.User;
import com.estudo.curso.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

import java.util.Arrays;

@Configuration
@Profile("test")
public class TestConfig implements CommandLineRunner {

    @Autowired
    private UserRepository userRepository;


    @Override
    public void run(String... args) throws Exception {
        User u1 = new User("99999",null,"testeDaSilva","teste@gmail.com","1234");
        User u2 = new User("88888",null, "alex", "alex@gmail.com", "123456");

        userRepository.saveAll(Arrays.asList(u1,u2));
    }
}
