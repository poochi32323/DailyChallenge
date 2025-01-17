package com.mysite.mylogin.controller;

import com.mysite.mylogin.entity.CalendarEntity;
import com.mysite.mylogin.entity.UserEntity;
import com.mysite.mylogin.service.CalendarService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/calendar")
public class CalendarController {

    private final CalendarService calendarService;

    public CalendarController(CalendarService calendarService) {
        this.calendarService = calendarService;
    }

    @GetMapping
    public ResponseEntity<List<CalendarEntity>> getAllEvents() {
        return ResponseEntity.ok(calendarService.getAllEvents());
    }

    @GetMapping("/{id}")
    public ResponseEntity<CalendarEntity> getEventById(@PathVariable Long id) {
        CalendarEntity event = calendarService.getEventByID(id);
        return event != null ? ResponseEntity.ok(event) : ResponseEntity.notFound().build();
    }

    @GetMapping("/user/{userid}")
    public ResponseEntity<List<CalendarEntity>> getEventsByUserID(@PathVariable UserEntity userid) {
        return ResponseEntity.ok(calendarService.getEventsByUserId(userid));
    }

    @PostMapping
    public ResponseEntity<CalendarEntity> createEvent(@RequestBody CalendarEntity calendarEntity) {
        return ResponseEntity.ok(calendarService.saveEvent(calendarEntity));
    }

    @PutMapping("/{id}")
    public ResponseEntity<CalendarEntity> updateEvent(@PathVariable Long id, @RequestBody CalendarEntity calendarEntity) {
        CalendarEntity existingEvent = calendarService.getEventByID(id);
        if (existingEvent != null) {
            calendarEntity.setCalendarId(id);
            return ResponseEntity.ok(calendarService.saveEvent(calendarEntity));
        }
        return ResponseEntity.notFound().build();
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteEvent(@PathVariable Long id) {
        calendarService.deleteEvent(id);
        return ResponseEntity.noContent().build();
    }
}
