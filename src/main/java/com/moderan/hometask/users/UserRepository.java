package com.moderan.hometask.users;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.transaction.annotation.Transactional;

@Transactional
public interface UserRepository extends JpaRepository<User, Integer>{

    Optional<User> findByEmail(String email);
    List<User> findByRole(String role);
}
