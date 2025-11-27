🚀 User Authentication System using Servlets & JDBC

A professional Java Web Application built using Servlets, JDBC, and MySQL, implemented in Eclipse and deployed on Apache Tomcat.
This project handles secure User Registration, Login, Session Management, and demonstrates real-world backend development concepts.

🏷️ Technologies Used

Java (Servlet API)

JDBC (MySQL Connector)

HTML5

Apache Tomcat 9

Eclipse IDE

MySQL

🌟 Features

🔐 User Registration

🔑 User Login

🧑‍💻 Session Management

➕ Addition Servlet (GET/POST Demo)

🗄️ Database Integration using JDBC

📡 Deployed using Apache Tomcat

🧱 Clean Project Structure

📂 Project Structure
src/main/java/com/project/
    ├── RegisterServlet.java
    ├── LoginServlet.java
    ├── AdditionServlet.java
    ├── Projects.java
    └── DBConnection.java

src/main/webapp/
    ├── index.html
    ├── login.html
    ├── register.html
    ├── index1.html
    └── WEB-INF/web.xml


🛢 Database Setup (MySQL)

Run the following SQL:

CREATE DATABASE userdb;
USE userdb;
CREATE TABLE users (
    id INT PRIMARY KEY AUTO_INCREMENT,
    fullname VARCHAR(100),
    email VARCHAR(100),
    username VARCHAR(50),
    password VARCHAR(50)
);

🔌 Database Connection (DBConnection.java)

Your DB configuration:

jdbc:mysql://localhost:3306/userdb?useSSL=false&allowPublicKeyRetrieval=true&serverTimezone=UTC
user = root
password = sql123   // replace with your MySQL password


Place MySQL Connector JAR inside:

src/main/webapp/WEB-INF/lib/

▶️ How to Run the Project

Import project into Eclipse

Add Apache Tomcat 9 to Servers tab

Add MySQL JDBC connector to WEB-INF/lib

Right-click project → Run on Server

Open in browser:

http://localhost:8080/SERVLETPROJECT1/

💻 Clone This Repository
git clone https://github.com/UmeshDc13/servlet-registration-app.git

📈 Future Enhancements

Password encryption (SHA-256 / BCrypt)

Email verification

Admin dashboard

CRUD operations (Edit/Delete users)

JSP-based MVC architecture

👨‍💻 Author

Umesh DC
Java Developer | Web App Learner

🔗 GitHub: https://github.com/UmeshDc13

⭐ Support

If you like this project:
👉 Star this repository ⭐
It motivates me to build more projects!
