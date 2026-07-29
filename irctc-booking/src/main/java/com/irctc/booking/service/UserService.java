package com.irctc.booking.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.irctc.booking.entity.UserEntity;
import com.irctc.booking.repository.UserRepository;
import com.irctc.booking.request.UserRequest;
import com.irctc.booking.response.UserResponse;

@Service
public class UserService {

    @Autowired
    private UserRepository userRepository;

    public UserResponse createUser(UserRequest request) {

        UserEntity user = new UserEntity();

        user.setName(request.getName());
        user.setEmail(request.getEmail());
        user.setMobile(request.getMobile());

        UserEntity savedUser = userRepository.save(user);

        UserResponse response = new UserResponse();

        response.setId(savedUser.getId());
        response.setName(savedUser.getName());
        response.setEmail(savedUser.getEmail());
        response.setMobile(savedUser.getMobile());
        response.setCreatedAt(savedUser.getCreatedAt());

        return response;
    }

}
