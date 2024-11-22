package com.mysite.mylogin.service;

import com.mysite.mylogin.entity.CalendarEntity;
import com.mysite.mylogin.entity.UserEntity;
import com.mysite.mylogin.repository.CalendarRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CalendarService {

    private final CalendarRepository calendarRepository;

    public CalendarService(CalendarRepository calendarRepository) {
        this.calendarRepository = calendarRepository;
    }

    public List<CalendarEntity> getAllEvents(){
        return calendarRepository.findAll();
    }

    public CalendarEntity getEventByID(Long id){
        return calendarRepository.findById(id).orElse(null);
    }

    public List<CalendarEntity> getEventsByUserId(UserEntity userid){
        return calendarRepository.findByUserid(userid);
    }

    public CalendarEntity saveEvent(CalendarEntity calendar){
        return calendarRepository.save(calendar);
    }

    public void deleteEvent(Long id){
        calendarRepository.deleteById(id);
    }
}
