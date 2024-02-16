package com.loginregister.loginRegister.repository;


import org.springframework.data.jpa.repository.JpaRepository;

import com.loginregister.loginRegister.entity.Role;

public interface RoleRepository extends JpaRepository<Role, Long> {

    Role findByName(String name);
}
