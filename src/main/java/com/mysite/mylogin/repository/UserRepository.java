package com.mysite.mylogin.repository;

import com.mysite.mylogin.entity.UserEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<UserEntity, String> {
    //중복검증
    boolean existsByUsername(String username);

    UserEntity findByUsername(String username);
}



