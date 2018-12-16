<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
	<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
	<title>All Students</title>
	<link rel="stylesheet"
		href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">
	<link rel="stylesheet"
		href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap-theme.min.css">
        <script>
             function keyUp(){
                 var firstName = document.getElementById("firstName").value;
                 if(firstName!==""){
                     document.getElementById("aFirstName").href="StudentServlet.do?action=find&firstName="+firstName;
                 }

             }
            </script>
            
</head>
<body>
    <div class="container container-default">
  
	   <h1>Student List Page</h1>  
           <label for="firstName" class="col-2 col-form-label">First
						Name</label>
					<div class="col-10">
						<input class="form-control" onkeyup="keyUp()" type="text" name="firstName"
							value="<c:out value="${student.firstName}"/>" id="firstName"
							placeholder="First Name">
                                                <a class="btn btn-primary" role="button" id="aFirstName" style="padding-left:5px;"
	                        href="StudentServlet.do?action=find&firstName=<c:out value="${student.firstName }"/>"/>Find</a>
	                    
					</div>
	    <table class="table table-striped">
	        <thead>
	            <tr>
	                <th>Student ID</th>
	                <th>First Name</th>
	                <th>Last Name</th>
	                <th>Course</th>
	                <th>Year</th>
	                <th colspan="2">Action</th>
	            </tr>
	        </thead>
	        <tbody>
	            <c:forEach items="${students}" var="student">
	                <tr>
	                    <td><c:out value="${student.studentId}" /></td>
	                    <td><c:out value="${student.firstName}" /></td>
	                    <td><c:out value="${student.lastName}" /></td>
	                    <td><c:out value="${student.course}" /></td>
	                    <td><c:out value="${student.year}" /></td>
	                    <td><a class="btn btn-warning" role="button"
	                        href="StudentServlet.do?action=edit&studentId=<c:out value="${student.studentId }"/>">Update</a>
	                    <a class="btn btn-danger" role="button" style="padding-left:5px;"
	                        href="StudentServlet.do?action=delete&studentId=<c:out value="${student.studentId }"/>">Delete</a>
	                    
	                    </td>
	           
	                </tr>
	            </c:forEach>
	        </tbody>
	    </table>
	    <p>
	        <a href="StudentServlet.do?action=insert" class="btn btn-primary" role="button">Add Student</a>
	    </p>
	</div>
</body>
</html>