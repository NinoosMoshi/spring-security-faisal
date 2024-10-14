package com.ninos.notes.services;


import com.ninos.notes.dtos.UserDTO;
import com.ninos.notes.models.User;

import java.util.List;

public interface UserService {
    void updateUserRole(Long userId, String roleName);

    List<User> getAllUsers();

    UserDTO getUserById(Long id);

    User findByUsername(String username);
}

