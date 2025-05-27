package com.jordan.user.service.impl;

import com.jordan.user.dto.UserRequestDTO;
import com.jordan.user.dto.UserResponseDTO;
import com.jordan.user.mapper.UserMapper;
import com.jordan.user.model.User;
import com.jordan.user.repository.UserRepository;
import com.jordan.user.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserRepository repository;

    @Override
    public UserResponseDTO createUser(UserRequestDTO dto) {
        if (repository.findByEmail(dto.email()).isPresent()) {
            throw new RuntimeException("O e-mail já existe");
        }

        User user = UserMapper.toEntity(dto);
        user = repository.save(user);
        return UserMapper.toResponseDTO(user);
    }

    @Override
    public List<UserResponseDTO> getAllUsers() {
        return repository.findAll()
                .stream()
                .map(UserMapper::toResponseDTO)
                .collect(Collectors.toList());
    }
}
