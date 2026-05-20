package com.day1proj3;

public class App {
    public static void main(String[] args) {
        User u1 = new User(1, "Alice", "alice@example.com");
        User u2 = new User(2, "Bob", "bob@example.com");

        Ticket t1 = new Ticket(101, "Login Issue", "Cannot log in with valid credentials", "Open", u1);
        Ticket t2 = new Ticket(102, "Slow Dashboard", "Dashboard takes 30s to load", "In Progress", u2);
        Ticket t3 = new Ticket(103, "Email Not Sent", "Password reset email not received", "Open", u1);

        System.out.println("=== Helpdesk Tickets ===");
        t1.displayDetails();
        System.out.println();
        t2.displayDetails();
        System.out.println();
        t3.displayDetails();
    }
}
