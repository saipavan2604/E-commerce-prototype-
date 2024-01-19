package com.user.Repository;

import java.util.Optional;
import org.springframework.data.jpa.repository.JpaRepository;
import com.user.DAO.User;

public interface UserRepository extends JpaRepository<User, Long> {
    Optional<User> findByUsername(String username);
}