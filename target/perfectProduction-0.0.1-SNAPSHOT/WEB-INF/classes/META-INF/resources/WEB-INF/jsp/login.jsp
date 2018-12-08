<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
    
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Perfect Production</title>
<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">
  <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.3.1/jquery.min.js"></script>
  <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>
  <script src="bootstrap/js/boot.js"></script>
</head>
<body>
<div class="jumbotron text-center">
  <h1>Login</h1>
  <p>Perfect production for perfect person.</p> 
</div>
<div class="container">
  <h2>Horizontal form</h2>
  <form:form class="form-horizontal" action="/logins" modelAttribute="logindto">
    <div class="form-group">
      <label class="control-label col-sm-2" for="email">Email or Phone:</label>
      <div class="col-sm-10">
        <form:input type="text" class="form-control" path="email" id="email" placeholder="Enter email" name="email"></form:input>
      </div>
    </div>
    <div class="form-group">
      <label class="control-label col-sm-2" for="pwd">Password:</label>
      <div class="col-sm-10">          
        <form:input type="password" class="form-control" path="password" id="pwd" placeholder="Enter password" name="pwd"></form:input>
      </div>
    </div>
   
    <div class="form-group">        
      <div class="col-sm-offset-2 col-sm-10">
        <button type="submit" class="btn btn-default">Submit</button>
      </div>
    </div>
  </form:form>
</div>

</body>
</html>