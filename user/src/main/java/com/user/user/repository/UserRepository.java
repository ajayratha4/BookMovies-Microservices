package com.user.user.repository;

import com.user.user.entites.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, String> {
    User findOneByuserIdAndEmail(Long userId, String email);
}
