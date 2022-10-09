package br.com.springboot.controllers;

import br.com.springboot.model.UserVO;
import br.com.springboot.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/users")
public class UserController {

    @Autowired
    private UserRepository userRepository;
    private List<UserVO> userVOList = new ArrayList<>();

    @GetMapping("/all")
    public List<UserVO> getAllUsers() {
        return userRepository.findAll();
    }

    @PostMapping("/saveUser")
    public UserVO saveUser(@RequestBody UserVO userVO){
        userRepository.save(userVO);
        return userVO;
    }
}
