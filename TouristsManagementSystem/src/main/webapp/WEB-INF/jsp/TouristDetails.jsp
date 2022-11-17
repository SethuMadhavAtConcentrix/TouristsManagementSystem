<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ page import = "java.util.*" %>
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

<p>Tourist Id:${tourist.touristId}</p>
<p>Tourist Name:${tourist.touristName}</p>
<p>Address:${tourist.address}</p>
<p>Tour Date:${tourist.tourDate}</p>
<p>Booking Amount:${tourist.bookingAmount}</p>
<p>Phone Number1:${tourist.phoneNumber1}</p>
<p>Phone Number2:${tourist.phoneNumber2}</p>
<p>Phone Number3:${tourist.phoneNumber3}</p>

<a href="/index">Return</a>


</body>
</html>