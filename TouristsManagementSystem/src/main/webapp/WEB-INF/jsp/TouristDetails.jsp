<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ page import = "java.util.*" %>
<%@ page import = "com.touristManagementSystem.model.*" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Tourist Details</title>
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
<body style="text-align:center">

<h1>Tourist Details</h1>
<% 
	TouristMaster tourist = (TouristMaster)request.getAttribute("tourist");
	TouristContact touristContact = (TouristContact)request.getAttribute("touristContact");
	TouristContact touristContact2 = (TouristContact)request.getAttribute("touristContact2");
	TouristContact touristContact3 = (TouristContact)request.getAttribute("touristContact3");
%>

<p>Tourist Id:<%= tourist.getTouristId() %></p>
<p>Tourist Name:<%= tourist.getTouristName()%></p>
<p>Address:<%= tourist.getAddress()%></p>
<p>Tour Date:<%=tourist.getTourDate()%></p>
<p>Booking Amount:<%= tourist.getBookingAmount() %></p>
<p>Phone Number1:<%= touristContact.getContactNumber() %></p>


<p>Phone Number2:<%= touristContact2.getContactNumber()%></p>
<p>Phone Number3:<%= touristContact3.getContactNumber()%></p>


<a href="/index">Return</a>


</body>
</html>