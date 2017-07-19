package com.company;

import java.time.LocalDateTime;

public abstract class Notification {
    private LocalDateTime createdAt;
    private String subject;
    private String body;
    protected String status = "successful";

    public Notification(String subject, String body) {
        this.subject = subject;
        this.body = body;
        createdAt = LocalDateTime.now();
    }

    public LocalDateTime getCreatedAt() {
        return createdAt;
    }

    public String getSubject() {
        return subject;
    }

    public String getBody() {
        return body;
    }

    public abstract void transport();

    public String showStatus() {
        System.out.println("Status: " + status);
        return status;
    }

    protected void printText() {
        System.out.println("Here's some text to show that protected methods can be in the constructors and methods!");
    }
}
