package com.my.project.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.my.project.entity.User;
import com.my.project.repository.UserRepository;

@Controller
public class UserController {

	@Autowired
	UserRepository userRepository;

	@RequestMapping("/users")
	public @ResponseBody List<User> test() {
		return userRepository.findAll();
	}

	@RequestMapping("/user/{id}")
	public @ResponseBody User findById(@PathVariable("id") User user) {
		return user;
	}
}
