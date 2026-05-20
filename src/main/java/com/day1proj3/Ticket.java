package com.day1proj3;

public class Ticket {
    private int ticketId;
    private String title;
    private String description;
    private String status;
    private User user;

    public Ticket(int ticketId, String title, String description, String status, User user) {
        this.ticketId = ticketId;
        this.title = title;
        this.description = description;
        this.status = status;
        this.user = user;
    }

    public int getTicketId() { return ticketId; }
    public String getTitle() { return title; }
    public String getDescription() { return description; }
    public String getStatus() { return status; }
    public User getUser() { return user; }

    public void displayDetails() {
        System.out.println("Ticket [" + ticketId + "] " + title + " | Status: " + status);
        System.out.println("  Desc: " + description);
        user.displayDetails();
    }
}
