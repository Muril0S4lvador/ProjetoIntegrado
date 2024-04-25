package com.example.demo;

import java.time.LocalDateTime;

import com.example.demo.DemoApplication.Settings;

public class Greeting {
    private String name;
    private LocalDateTime dateTime;
    private String greeting;
    public Greeting(String name, LocalDateTime dateTime) {
        this.name = name;
        this.dateTime = dateTime;
        int hour = dateTime.getHour();
        greeting = (hour < 6) ? "Good night!" :
            (hour < 12) ? "Good morning!" :
            (hour < 18) ? "Good afternoon!"
            : "Good evening!";

    }

    public Greeting(Settings settings, LocalDateTime dateTime) {
        this(settings.name(), dateTime);
        if (settings.ptBR()){
            int hour = dateTime.getHour();
            greeting = (hour < 6) ? "Vai dormir!" :
            (hour < 12) ? "Bom dia!" :
            (hour < 18) ? "Boa tarde!"
            : "Boa noite!";
        }
    }

    public String getName() {
        return name;
    }
    public LocalDateTime getDateTime() {
        return dateTime;
    }
    public String getGreeting() {
        return greeting;
    }

}