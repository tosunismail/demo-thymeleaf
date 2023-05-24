package com.example.demothymeleaf.repository;

import com.example.demothymeleaf.model.*;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {
}
