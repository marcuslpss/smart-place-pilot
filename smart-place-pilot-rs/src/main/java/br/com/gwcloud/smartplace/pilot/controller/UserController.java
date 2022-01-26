package br.com.gwcloud.smartplace.pilot.controller;


import br.com.gwcloud.smartplace.pilot.dto.UserDTO;
import br.com.gwcloud.smartplace.pilot.entities.UserEntity;
import br.com.gwcloud.smartplace.pilot.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Set;

@RestController
@RequestMapping("/api")
public class UserController {

    @Autowired
    private UserService userService;

    @GetMapping("/user")
    public List<UserEntity> getUsers() {


        return userService.findAll();
    }

}