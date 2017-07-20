<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">

<html>
<head>
	<meta name="viewport" content="width=device-width, initial-scale=1.0">
	<title>Signup</title>
	<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">
  	<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.2.1/jquery.min.js"></script>
  	<script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>
</head>
<body background="geometry.jpg">


<form action="#">
  <div class="container" align="center">
  <br>
  <br>
  <div class="well">
  <h2 align="center">Signup Form</h2>
   <div class="form-group">
  	<label class="control-label col-sm-1 col-sm-offset-3" for="name">Name:</label>
      <div class="col-sm-6">
      <input type="text" class="form-control" id="name" placeholder="Enter name" name="name">
      </div>
      </div>
  	<br>
  	<br>
  	<div class="form-group">
      <label class="control-label col-sm-1 col-sm-offset-3 " for="email">Email:</label>
      <div class="col-sm-6">
      <input type="email" class="form-control" id="email" placeholder="Enter email" name="email" required>
      </div>
     </div>
    <br>
    <br>
    <div class="form-group">
      <label class="control-label col-sm-1 col-sm-offset-3" for="password">Password:</label>
      <div class="col-sm-6">
      <input type="password" class="form-control" id="password" placeholder="Enter password" name="password" required>
      </div>
     </div>
     <br>
     <br>
    <div class="form-group">
      <label class="control-label col-sm-1 col-sm-offset-3" for="psw-repeat">Repeat Password:</label>
      <div class="col-sm-6">
      <input type="password" class="form-control" id="psw-repeat" placeholder="Repeat password" name="psw-repeat">
      </div>
     </div>
    <br>
    <br>
    <div class="form-group">
    <div class="col-sm-3 col-sm-offset-5">
      <label class="control-label col-sm-1 col-sm-offset-1" for="checkbox">Remember me</label>
      
      <input type="checkbox" checked="checked">
     </div>
     </div>
    <br>
    <br>
    <p align="center">By creating an account you agree to our <a href="#">Terms & Conditions</a>.</p>

    <div class="clearfix">
      <button type="button" class="btn btn-info">Cancel</button>
      <button type="button" class="btn btn-success">Sign Up</button>
    </div>
    </div>
  </div>
  </form>


</body>
</html>