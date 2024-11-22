package com.mysite.mylogin.repository;

import com.mysite.mylogin.entity.CalendarEntity;
import com.mysite.mylogin.entity.UserEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface CalendarRepository extends JpaRepository<CalendarEntity, Long> {
    List<CalendarEntity> findByUserid(UserEntity userid);
}
