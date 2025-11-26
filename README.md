🚀 Servlet Registration App

A Java Web Application built using Servlets, JDBC, and MySQL, developed in Eclipse IDE and deployed on Apache Tomcat 9.
This project demonstrates User Registration, Login, and GET/POST Servlets — perfect for learning backend fundamentals.

🏷️ Badges












🌟 Features

🔐 User Registration

🔑 User Login

➕ Addition (GET/POST Servlet Example)

🗄 MySQL Database Integration

📡 Runs on Apache Tomcat

📁 Clean MVC-style Project Structure

🔰 Great for students & beginners

📂 Project Structure
src/main/java/com/project/
    ├── AdditionServlet.java
    ├── LoginServlet.java
    ├── RegisterServlet.java
    ├── Projects.java
    └── DBConnection.java

src/main/webapp/
    ├── index.html
    ├── index1.html
    ├── login.html
    ├── register.html
    └── WEB-INF/web.xml

⚙️ Technologies Used
Technology	Purpose
Java	Core language
Servlet API	Backend logic
JDBC	Database connectivity
MySQL	Persistent storage
HTML5	Forms & UI
Apache Tomcat 9	Server
Eclipse IDE	Development
🛢️ Database Setup (MySQL)

Run this SQL:

CREATE DATABASE userdb;

USE userdb;

CREATE TABLE users (
    id INT PRIMARY KEY AUTO_INCREMENT,
    fullname VARCHAR(100),
    email VARCHAR(100),
    username VARCHAR(50),
    password VARCHAR(50)
);

🔌 DB Connection Details

Make sure your DBConnection.java looks like this:

jdbc:mysql://localhost:3306/userdb?useSSL=false&allowPublicKeyRetrieval=true&serverTimezone=UTC
user = root
password = sql   // change if needed


Also confirm the JDBC driver is placed in:

src/main/webapp/WEB-INF/lib/
mysql-connector-j.jar

▶️ Running the Application

Import the project into Eclipse

Add Apache Tomcat 9 to Servers tab

Add MySQL JDBC JAR to
WEB-INF/lib/

Right-click project →
Run As → Run on Server

Open the app in browser:

http://localhost:8080/SERVLETPROJECT1/

💻 Clone This Repository

Use this command:

git clone https://github.com/UmeshDc13/servlet-registration-app.git

📦 How to Build & Deploy

Clone repo

Import into Eclipse (File → Import → Existing Maven/Java Project)

Configure Tomcat server

Run the project

Access the pages:

Registration → /register.html

Login → /login.html

Addition → /index1.html

👨‍💻 Author

Umesh DC
Java Developer | Servlet & Spring Learner

🔗 GitHub: https://github.com/UmeshDc13

⭐ Support This Project

If you found this useful:

👉 Star the repository ⭐
👉 Follow for more projects
