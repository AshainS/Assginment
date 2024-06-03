<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<html>
<head>
    <title>Home</title>
    
    <link rel="stylesheet" href="./StyleSheets/Home.css"> 
    
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

       	<header> 

		<div class="logosec"> 
			<div class="logo">Student Management App <h4>Welcome <%= session.getAttribute("username") %></h4></div> 
			<img src= ""> 
		</div> 

		<div class="searchbar"> 
			<input type="text" placeholder="Search"> 
			<div class="searchbtn"> 
			<img src= "./images/search.png"
					class="icn srchicn"
					alt="search-icon"> 
			</div> 
		</div> 

	</header> 

	<div class="main-container"> 
		<div class="navcontainer"> 
			<nav class="nav"> 
				<div class="nav-upper-options"> 
					<div class="nav-option option1"> 
						<img src= "./images/dash.png"
						
							class="nav-img"
							alt="dashboard"> 
						<a href=""><h3> DashBoard</h3></a>
					</div> 

					<div class="option2 nav-option"> 
						<img src= 
"./images/announce.png"
							class="nav-img"
							alt="announcements"> 
						<a href=""><h3> Announcements</h3></a>
					</div> 

					<div class="nav-option option3"> 
						<img src= 
"./images/about.png"
							class="nav-img"
							alt="about"> 
						<a href=""><h3> About</h3></a>
					</div> 

					<div class="nav-option option4"> 
						<img src= 
"./images/studetails.png"
							class="nav-img"
							alt="institution"> 
						<a href="StuDetails.jsp"><h3>Student Details</h3></a> 
					</div> 

					<div class="nav-option option5"> 
						<img src= 
"./images/reports.png"
							class="nav-img"
							alt="reports"> 
						<a href=""><h3> Reports</h3></a>
					</div> 

					<div class="nav-option option6"> 
						<img src= 
"./images/help.png"
							class="nav-img"
							alt="settings"> 
						<a href=""><h3> Help</h3></a>
					</div> 

					<div class="nav-option logout"> 
						<img src= 
"./images/logout.png"
							class="nav-img"
							alt="logout"> 
						<a href="LogoutServlet"><h3>Logout</h3></a>
					</div> 

				</div> 
			</nav> 
		</div> 
		<div class="main"> 

			 

			<div class="box-container"> 

				<div class="box box1"> 
					<div class="text"> 
						<h2 class="topic-heading">0015</h2> 
						<h2 class="topic">Malith Ishara</h2> 
					</div> 

					<img src= "./images/malith.jpg"> 
				</div> 

				<div class="box box2"> 
					<div class="text"> 
						<h2 class="topic-heading">0019</h2> 
						<h2 class="topic">Shashikala Somarathne</h2> 
					</div> 

					<img src= "./images/shashi.jpg"> 
				</div> 

				<div class="box box3"> 
					<div class="text"> 
						<h2 class="topic-heading">0104</h2> 
						<h2 class="topic">Dilki Wikramasinghe</h2> 
					</div> 

					<img src= "./images/dilki.jpg"> 
				</div> 

				<div class="box box4"> 
					<div class="text"> 
						<h2 class="topic-heading">0115</h2> 
						<h2 class="topic">Ashain Silva</h2> 
					</div> 

					<img src= "./images/ash.jpg"> 
				</div> 
			</div> 

			<div class="report-container"> 
				<div class="report-header"> 
					<h1 class="recent-Articles">Recent Announcements</h1> 
					<button class="view">View All</button> 
				</div> 

				

			</div> 
		</div> 
	</div> 
    
    
    <!-- <a href="StuDetails.jsp">Student Details</a><br>
    <a href="NewStuForm.jsp">Add New Student</a><br> -->
    <!-- <a href="LogoutServlet">Logout</a> -->
</body>
</html>
