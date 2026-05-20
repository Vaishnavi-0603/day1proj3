# day1proj3 - Helpdesk Ticket System

A simple Java console application that models a helpdesk ticketing system using OOP concepts.

## Project Structure

```
day1proj3/
├── src/main/java/com/day1proj3/
│   ├── App.java       # Entry point
│   ├── Ticket.java    # Ticket model
│   └── User.java      # User model
└── pom.xml
```

## Classes

- **User** — holds user ID, name, and email
- **Ticket** — holds ticket ID, title, description, status, and an associated `User`
- **App** — creates sample users and tickets, then prints their details

## Sample Output

```
=== Helpdesk Tickets ===
Ticket [101] Login Issue | Status: Open
  Desc: Cannot log in with valid credentials
  User [1] Alice | alice@example.com

Ticket [102] Slow Dashboard | Status: In Progress
  Desc: Dashboard takes 30s to load
  User [2] Bob | bob@example.com

Ticket [103] Email Not Sent | Status: Open
  Desc: Password reset email not received
  User [1] Alice | alice@example.com
```

## Requirements

- Java 17
- Maven

## Run

```bash
mvn compile exec:java -Dexec.mainClass="com.day1proj3.App"
```

or

```bash
mvn package
java -cp target/day1proj3-1.0-SNAPSHOT.jar com.day1proj3.App
```
