# Assignment
Web application with CRUD operations using JSP, Servlets, Sessions &amp; Cookies, MySQL, JDBC.

# Student Management System

This is a simple student management system developed using Java, JSP, Servlets, MySQL, and Apache Tomcat. The application allows users to register, log in, and perform CRUD (Create, Read, Update, Delete) operations on student records.

## Project Overview

The project includes the following functionalities:
- User Registration and Login
- Student Creation
- Viewing Student Details
- Updating Student Information
- Deleting Student Records

## Team Members and Contributions

The CRUD operations were developed by the following team members:
- **Malith Jayathilake - KEG/IT/2021/F/0015**: Update functionality
- **Shashikala Somarathne - KEG/IT/2021/F/0019**: View functionality
- **Dilki Wikramasinghe - KEG/IT/2021/F/0104**: Delete functionality
- **Ashain Silva - KEG/IT/2021/F/0115**: Create functionality

## Technologies Used

- **Java**: Backend development
- **JSP**: Frontend development
- **Servlets**: Handling HTTP requests and responses
- **MySQL**: Database management
- **Apache Tomcat**: Web server
- **CSS**: Styling the web pages
- **Sessions and Cookies**: Managing user sessions and data

## Getting Started

### Prerequisites

- **Java Development Kit (JDK)**: Version 8 or higher
- **Eclipse IDE**: For Java EE developers
- **Apache Tomcat**: Application server
- **MySQL**: Database server

### Installation

1. **Clone the repository**:
   ```bash
   git clone https://github.com/AshainS/Assignment.git
   
2. **Import the project into Eclipse**:
  - Open Eclipse IDE.
  - Go to File -> Import -> General -> Existing Projects into Workspace.
  - Select the cloned repository directory and click Finish.

3. **Configure MySQL Database**:
- Create a database named student.
- Create the necessary tables:

  ```bash
  CREATE TABLE user (
    u_id INT(11) AUTO_INCREMENT PRIMARY KEY,
    username VARCHAR(50) NOT NULL,
    password VARCHAR(50) NOT NULL,
    confirmPassword	VARCHAR(50) NOT NULL
    );

  
  CREATE TABLE students_details (
    regNo VARCHAR(10) PRIMARY KEY,
    name VARCHAR(50) NOT NULL,
    email	VARCHAR(50) NOT NULL,
    department VARCHAR(50) NOT NULL,
    contact VARCHAR(10) NOT NULL,
    district VARCHAR(50) NOT NULL
    );

4. **Configure Data Source in Tomcat**:
  - Add the following resource to context.xml (located in the conf directory of your Tomcat installation):

  <Resource name="jdbc/StudentDB" auth="Container" type="javax.sql.DataSource"
          maxTotal="100" maxIdle="30" maxWaitMillis="10000"
          username="root" password="password" driverClassName="com.mysql.cj.jdbc.Driver"
          url="jdbc:mysql://localhost:3306/student"/>
          

5. **Update Database Configuration**:
  - Ensure the database connection details in your project match those configured in Tomcat.


6. **Run the Project**:
  - Right-click the project in Eclipse.
  - Select Run As -> Run on Server.
  - Choose Apache Tomcat server and click Finish.

### Usage

1. **Registration**:
  - Access the registration page via http://localhost:8080/student-management-system/register.jsp.
  - Fill in the username, password, and confirm password fields and submit.

2. **Login**:
  - Access the login page via http://localhost:8080/student-management-system/login.jsp.
  - Enter the registered username and password to log in.

3. **Student CRUD Operations**:
  - After logging in, you will be redirected to the home page.
  - Use the Student Details button to view, create, update, or delete student records.

### Acknowledgements

We would like to thank our project supervisor and all the contributors who helped in developing this project.
