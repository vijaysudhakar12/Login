# 🔐 Java JSP Login System

A simple **Java Web Application** implementing **Login, Registration, Session Management, and Logout** using  
**JSP, Servlets, JDBC, MySQL, and CSS**.

---

## 🚀 Features
- User Registration
- User Login Authentication
- Session-based Access Control
- Protected Pages (Home & Video)
- Logout with Session Invalidation
- Clean UI with CSS styling

---

## 🛠️ Tech Stack
- **Frontend:** JSP, HTML, CSS
- **Backend:** Java Servlets
- **Database:** MySQL
- **JDBC Driver:** MySQL Connector/J
- **Server:** Apache Tomcat

---

## 📁 Project Structure

Java-JSP-Login-System
│
├── src/main/java
│ ├── com/Servlet
│ │ ├── LoginServlet.java
│ │ ├── AccountServlet.java
│ │ └── LogoutServlet.java
│ │
│ └── com/Servlet/loginDao
│ └── LoginDao.java
│
├── src/main/webapp
│ ├── login.jsp
│ ├── home.jsp
│ ├── video.jsp
│ ├── Account.jsp
│ │
│ └── css
│ ├── login.css
│ └── home.css
│
└── README.md


---

## 🗄️ Database Setup
```sql
CREATE DATABASE muledb;

USE muledb;

CREATE TABLE login (
    uname VARCHAR(50) PRIMARY KEY,
    password VARCHAR(50)
);

⚙️ Configuration

Add MySQL Connector/J to your project build path

Configure Apache Tomcat (v9+ recommended)

Set correct database port and credentials

🔐 Session Flow

User logs in

Session attribute UserName is created

Protected pages check session

Logout invalidates session

Back button disabled using cache control

🖼️ Screens

Login Page

Registration Page

Home Page

Video Page

▶️ How to Run

Clone the repository

Import into Eclipse

Configure Tomcat Server

Start MySQL

Run the project

Access:

http://localhost:8080/YourProjectName/login.jsp

📌 Notes

No frameworks used (Pure JSP & Servlets)

Logic kept simple for learning

Ideal for beginner Java Web projects

👨‍💻 Author
Vijay Sudhakar
