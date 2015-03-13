<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<link rel="stylesheet" type="text/css" href="css/bootstrap.min.css">
<link rel="stylesheet" type="text/css" href="css/header.css">
<title>Liste des acteurs</title>
</head>
<body>
<c:import url="/WEB-INF/views/header.jsp">
	<c:param name="page" value="1"/>
</c:import>
<div class="corps col-sm-6 text-center">
	<h1>Liste des acteurs</h1>
	<table class="table table-striped table-hover">
			<tr>
				<th class="text-center">Films</th>
				<th class="text-center">code Acteur</th>
				<th class="text-center">nom</th>
				<th class="text-center">Né(e) en</th>
			</tr>
		<c:forEach items="${acteurs}" var="acteur">
			<tr>
				<td><a href="?action=afficheFilms&codeActeur=${acteur.codeActeur }">Films</a></td>
				<td>${acteur.codeActeur}</td>
				<td>${acteur.nomComplet}</td>
				<td>${acteur.anneeNaissance}</td>
				
			</tr>
		</c:forEach>
	</table>
</div>
<script type="text/javascript" src="js/bootstrap.min.js"> </script>
</body>
</html>