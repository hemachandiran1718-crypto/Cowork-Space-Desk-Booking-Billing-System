🚀 Cowork Space Desk Booking & Billing System

A robust Java + Oracle Database application designed to manage coworking space operations efficiently, including desk booking, customer handling, and billing management.

📌 Project Description

The Cowork Space Desk Booking & Billing System is built to simplify and automate daily operations in coworking environments. It allows administrators to manage customers, allocate desks, and generate billing records with ease.

This project demonstrates strong knowledge in:

Java application development
Database design using Oracle
JDBC integration
Real-world system design
✨ Features
🧑‍💼 Customer Management
Add, update, delete, and view customer details
🪑 Desk Booking
Allocate desks efficiently
Manage availability
💳 Billing System
Generate bills based on bookings
Track payments
📊 Transaction Records
Store and retrieve transaction history
🔗 Database Integration
Seamless connection using JDBC
🛠️ Tech Stack
Java (Core Java)
JDBC
Oracle Database
SQL & PL/SQL
Git & GitHub
📂 Project Structure
Cowork-Space-Desk-Booking-Billing-System/
│
├── src/
│   ├── dao/        # Data Access Layer
│   ├── service/    # Business Logic
│   ├── model/      # Entity Classes
│   └── util/       # Utility (DB Connection)
│
├── database/       # SQL Scripts
├── README.md
└── .gitignore
⚙️ Setup Instructions
1️⃣ Clone Repository
git clone https://github.com/hemachandiran1718-crypto/Cowork-Space-Desk-Booking-Billing-System.git
2️⃣ Open in IDE
Eclipse / IntelliJ IDEA
3️⃣ Configure Database
Install Oracle Database
Create required tables
Run SQL scripts
4️⃣ Update Database Connection

In DBUtil.java:

String url = "jdbc:oracle:thin:@localhost:1521:xe";
String username = "your_username";
String password = "your_password";
▶️ How to Run
Compile the project
Run the main class
Perform operations:
Add Customer
Book Desk
Generate Bill
📈 Future Enhancements
🌐 Web-based UI (Spring Boot + React)
📱 Mobile App Integration
🔐 User Authentication & Roles
📊 Dashboard & Analytics
🤝
