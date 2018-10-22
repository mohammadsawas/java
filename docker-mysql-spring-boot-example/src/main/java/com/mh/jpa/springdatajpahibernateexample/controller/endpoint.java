package com.mh.jpa.springdatajpahibernateexample.controller;



import com.mh.jpa.springdatajpahibernateexample.model.UserRepository;
import com.mh.jpa.springdatajpahibernateexample.model.Users;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/")
public class endpoint {

    private UserRepository usersRepository;

    public endpoint(UserRepository usersRepository) {
        this.usersRepository = usersRepository;
    }


    @GetMapping
    public List<Users> all() {


        return usersRepository.findAll();
    }


    @GetMapping("create")
    public List<Users> users() {
        Users users = new Users();
        users.setId(1);
        users.setName("Sam");
        users.setSalary(3400);
        users.setTeamName("Development");

        usersRepository.save(users);

        return usersRepository.findAll();
    }
}
