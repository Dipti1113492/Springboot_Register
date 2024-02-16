package com.loginregister.loginRegister.repository;


import org.springframework.data.jpa.repository.JpaRepository;

import com.loginregister.loginRegister.entity.User;

public interface UserRepository extends JpaRepository<User, Long> {

    User findByEmail(String email);

}