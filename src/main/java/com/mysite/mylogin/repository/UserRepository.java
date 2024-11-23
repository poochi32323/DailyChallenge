package com.mysite.mylogin.repository;

import com.mysite.mylogin.entity.UserEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface UserRepository extends JpaRepository<UserEntity, String> {
    //중복검증
    boolean existsById(String userid);

    Optional<UserEntity> findById(String userid);
}



