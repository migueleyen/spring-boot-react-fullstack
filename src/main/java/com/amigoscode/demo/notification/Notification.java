package com.amigoscode.demo.notification;

import java.time.ZonedDateTime;

public class Notification {

    private String name;
    private ZonedDateTime timestamp;

    public Notification() {
    }

    public Notification(String name, ZonedDateTime timestamp) {
        this.name = name;
        this.timestamp = timestamp;
    }
}
