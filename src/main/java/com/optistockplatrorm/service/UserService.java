package com.optistockplatrorm.service;

import com.optistockplatrorm.dto.UserRequestDTO;
import com.optistockplatrorm.dto.UserResponseDTO;
import com.optistockplatrorm.entity.User;
import com.optistockplatrorm.mapper.UserMapper;
import com.optistockplatrorm.repository.UserRepository;
import com.optistockplatrorm.util.PasswordUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService {

    @Autowired
    private UserRepository userRepository;

    @Autowired
    private UserMapper userMapper;

    public UserResponseDTO findUserByEmailAndByPassword(UserRequestDTO dto){
        User user = userRepository.findByEmail(dto.email())
                .orElseThrow(() -> new RuntimeException("User not found"));

        if (!PasswordUtil.verify(dto.password(), user.getPassword())) {
            throw new RuntimeException("Invalid password");
        }

        return userMapper.toDto(user);
    }
}
