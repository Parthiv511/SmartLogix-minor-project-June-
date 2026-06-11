package com.smartlogix.backend.service;

import com.smartlogix.backend.dto.UserDTO;
import com.smartlogix.backend.entity.User;
import com.smartlogix.backend.exception.UserNotFoundException;
import com.smartlogix.backend.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class UserService {

    @Autowired
    private UserRepository userRepository;

    public UserDTO createUser(User user) {

        User savedUser = userRepository.save(user);

        return convertToDTO(savedUser);
    }

    public List<UserDTO> getAllUsers() {

        return userRepository.findAll()
                .stream()
                .map(this::convertToDTO)
                .collect(Collectors.toList());
    }

    public UserDTO getUserById(Long id) {

        User user = userRepository.findById(id)
                .orElseThrow(() -> new UserNotFoundException(id));

        return convertToDTO(user);
    }

    public UserDTO updateUser(Long id, User updatedUser) {

        User user = userRepository.findById(id)
                .orElseThrow(() -> new UserNotFoundException(id));

        user.setName(updatedUser.getName());
        user.setEmail(updatedUser.getEmail());

        User savedUser = userRepository.save(user);

        return convertToDTO(savedUser);
    }

    public String deleteUser(Long id) {

        if (!userRepository.existsById(id)) {
            throw new UserNotFoundException(id);
        }

        userRepository.deleteById(id);

        return "User deleted successfully";
    }

    private UserDTO convertToDTO(User user) {

        return new UserDTO(
                user.getId(),
                user.getName(),
                user.getEmail()
        );
    }
}