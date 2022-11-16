<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ page import = "java.util.*" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Add New Tourist</title>
<meta charset="utf-8">
<meta name="viewport" content="width=device-width, initial-scale=1">
<link rel="stylesheet"
	href="https://cdn.jsdelivr.net/npm/bootstrap@4.6.1/dist/css/bootstrap.min.css">
<script
	src="https://cdn.jsdelivr.net/npm/jquery@3.6.0/dist/jquery.slim.min.js"></script>
<script
	src="https://cdn.jsdelivr.net/npm/popper.js@1.16.1/dist/umd/popper.min.js"></script>
<script
	src="https://cdn.jsdelivr.net/npm/bootstrap@4.6.1/dist/js/bootstrap.bundle.min.js"></script>

</head>
<body>

<h2>Add New Tourist</h2>
<p>* marked items entry is compulsory</p>

<form action="/addNewTourist">
		Tourist ID: <input type="text" name="touristId" placeholder="teamId" disabled><br>
		<br> *Enter Tourist Name: <input type="text" name="touristName" placeholder="Name" required><br>
		<br> *Enter Address: <input type="text" name="address" placeholder="address" required><br>
		<br> *Enter Tour Date: <input type="text" name="tourDate" placeholder="date of tour" required><br>
		<br> *Enter Booking Amount Paid: <input type="text" name="bookingAmount" placeholder="Booking Amount Charges" required><br>
		<br> *Enter 1st Phone Number: <input type="text" name="phoneNum1" placeholder="1st Phone Number" required><br>
		<br> Enter 2nd Phone Number: <input type="text" name="phoneNum2" placeholder="2nd Phone Number"><br>
		<br> Enter 3rd Phone Number: <input type="text" name="phoneNum3" placeholder="3rd Phone Number"><br>
		<br><input type="hidden" name="" value=""><br> 
		<br> <input type="submit" value="Submit">


	</form>

</body>
</html>