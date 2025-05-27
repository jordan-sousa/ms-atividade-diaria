package com.jordan.user.service;

import com.jordan.user.dto.UserRequestDTO;
import com.jordan.user.dto.UserResponseDTO;

import java.util.List;

public interface UserService {
    UserResponseDTO createUser(UserRequestDTO dto);
    List<UserResponseDTO> getAllUsers();
}
