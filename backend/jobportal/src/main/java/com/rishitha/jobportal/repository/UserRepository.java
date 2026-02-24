package com.rishitha.jobportal.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.rishitha.jobportal.entity.User;
public interface UserRepository extends JpaRepository<User, Long> {
        User findByEmail(String email);


}
