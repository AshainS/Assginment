<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
<%@ page import="db.Student" %>
<!DOCTYPE html>
<html>
<head>
    <title>Edit Student Details</title>
    
    <link rel="stylesheet" href="./StyleSheets/EditStudent.css" >
    
</head>
<body>

	
	<%
	
	
	response.setHeader("Cache-Control", "no-cache, no-store, must-revalidate");
	
	response.setHeader("Pragma", "no-cache");
	
	response.setHeader("Expires", "0");
	
	
		if(session.getAttribute("username") == null){
			response.sendRedirect("Login.jsp");
		}
	
	%>


<div class="container">
    <h1>Edit Details</h1>
    
    <form action="CRUD_Servlet" method="post">
        <input type="hidden" name="action" value="update">
        <input type="hidden" name="regNo" value="<%= ((Student) request.getAttribute("student")).getRegNo() %>">
        <div class="form-group">
            <label for="name">Name:</label>
            <input type="text" name="name" value="<%= ((Student) request.getAttribute("student")).getName() %>" required>
        </div>
        <div class="form-group">
            <label for="email">Email:</label>
            <input type="email" name="email" value="<%= ((Student) request.getAttribute("student")).getEmail() %>" required>
        </div>
        <div class="form-group">
            <label for="department">Department:</label>
            <input type="text" name="department" value="<%= ((Student) request.getAttribute("student")).getDepartment() %>" required>
        </div>
        <div class="form-group">
            <label for="contact">Contact:</label>
            <input type="text" name="contact" value="<%= ((Student) request.getAttribute("student")).getContact() %>" required>
        </div>
        <div class="form-group">
            <label for="district">District:</label>
            <input type="text" name="district" value="<%= ((Student) request.getAttribute("student")).getDistrict() %>" required>
        </div>
        <div class="form-group">
            <button type="submit">Update</button>
            <button type="submit">Back</button>
        </div>
        
        
    </form>
</div>
</body>
</html>