package com.jwt.mainpac.authentification_jwt2.repositories;

import com.jwt.mainpac.authentification_jwt2.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface UserRepository extends JpaRepository<User, Integer> {
    User findUserByUserName(String username);
    List<User> findAllByRole(String role);
    User findUserByEmail(String email);
    User findUserByUserNameOrEmail(String username, String email);
}
