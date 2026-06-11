package com.smartlogix.backend.controller;

import com.smartlogix.backend.dto.UserDTO;
import com.smartlogix.backend.entity.User;
import com.smartlogix.backend.service.UserService;

import jakarta.validation.Valid;

import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/users")
public class UserController {

    private final UserService userService;

    public UserController(UserService userService) {
        this.userService = userService;
    }

    // CREATE USER
    @PostMapping
    public UserDTO createUser(@Valid @RequestBody User user) {
        return userService.createUser(user);
    }

    // GET ALL USERS
    @GetMapping
    public List<UserDTO> getAllUsers() {
        return userService.getAllUsers();
    }

    // GET USER BY ID
    @GetMapping("/{id}")
    public UserDTO getUserById(@PathVariable Long id) {
        return userService.getUserById(id);
    }

    // UPDATE USER
    @PutMapping("/{id}")
    public UserDTO updateUser(
            @PathVariable Long id,
            @Valid @RequestBody User user) {

        return userService.updateUser(id, user);
    }

    // DELETE USER
    @DeleteMapping("/{id}")
    public String deleteUser(@PathVariable Long id) {

        userService.deleteUser(id);

        return "User deleted successfully";
    }
}