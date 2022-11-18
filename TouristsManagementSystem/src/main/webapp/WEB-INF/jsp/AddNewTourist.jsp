<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ page import = "java.util.*" %>
<%@ page import="com.touristManagementSystem.model.*" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>


<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Add New Tourist</title>
<meta charset="ISO-8859-1">
<meta name="viewport" content="width=device-width, initial-scale=0.5">
<link rel="stylesheet"
	href="https://cdn.jsdelivr.net/npm/bootstrap@4.6.1/dist/css/bootstrap.min.css">
<script
	src="https://cdn.jsdelivr.net/npm/jquery@3.6.0/dist/jquery.slim.min.js"></script>
<script
	src="https://cdn.jsdelivr.net/npm/popper.js@1.16.1/dist/umd/popper.min.js"></script>
<script
	src="https://cdn.jsdelivr.net/npm/bootstrap@4.6.1/dist/js/bootstrap.bundle.min.js"></script>
<link rel="stylesheet"
	href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/4.7.0/css/font-awesome.min.css">
</head>
<body style="text-align:center">

<h2 style="color:blue;font-family:Lucida Sans;">Add New Tourist</h2>
<p style="text-align:center">* marked items entry is compulsory</p>

<form action="/saveTourist" method="post" >
		<br> *Enter Tourist Name: <input type="text" name="touristName" placeholder="touristName" required><br>
		<br> *Enter Address: <input type="text" name="address" placeholder="address" required><br>
		<br> *Enter Tour Date: <input type="text" name="tourDate" placeholder="date of tour" required><br>
		<br> *Enter Booking Amount Paid: <input type="text" name="bookingAmount" placeholder="Booking Amount Charges" required><br>
		<br> *Enter 1st Phone Number: <input type="text" name="phoneNumber1" placeholder="1st Phone Number" required><br>
		<br> Enter 2nd Phone Number: <input type="text" name="phoneNumber2" placeholder="2nd Phone Number" ><br>
		<br> Enter 3rd Phone Number: <input type="text" name="phoneNumber3" placeholder="3rd Phone Number" ><br>
		<br> <input type="submit" value="Submit">


	</form>

</body>
</html>