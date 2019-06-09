<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<link rel="stylesheet" href="CardNoTouchy.css">
<title>Insert title here</title>
</head>
<body>


	<c:forEach var="card" items="${ drawcards }">
		<span>
			<img src="${card.image }"> ${card.value} of ${card.suit }
		</span>
	</c:forEach>



</body>
</html>