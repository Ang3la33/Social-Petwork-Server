package com.socialpetwork.user;

import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long>{

    User findByEmail(String email);
    boolean existsByEmail(String email);

    User findByUsername(String username);
    boolean existsByUsername(String username);

    User findByUsernameAndPassword(String username, String password);
}