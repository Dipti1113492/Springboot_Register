package com.loginregister.loginRegister.service;

import com.loginregister.loginRegister.dto.UserDto;

import java.util.List;

import com.loginregister.loginRegister.entity.User;

public interface UserService {
    void saveUser(UserDto userDto);

    User findUserByEmail(String email);

    List<UserDto> findAllUsers();
}