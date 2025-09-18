package com.healthcare;
import java.time.LocalDateTime;

public class Appointment {
    private Long id;
    private String title;
    private String description;
    private LocalDateTime startTime;
    private LocalDateTime endTime;
    private String location;

    // Constructors
    public Appointment(Long id, String title, String description, LocalDateTime startTime, LocalDateTime endTime, String location) {
        this.id = id;
        this.title = title;
        this.description = description;
        this.startTime = startTime;
        this.endTime = endTime;
        this.location = location;
    }

}


