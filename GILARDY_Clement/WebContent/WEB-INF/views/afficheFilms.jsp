<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<link rel="stylesheet" type="text/css" href="css/bootstrap.min.css">
<link rel="stylesheet" type="text/css" href="css/header.css">
<title>Liste des films</title>
</head>
<body>
<c:import url="/WEB-INF/views/header.jsp">
	<c:param name="page" value="1"/>
</c:import>
<div class="corps col-sm-6 text-center">
	<h1>Liste des films</h1>

	<table class="col-sm-6 table table-striped table-hover">
		<tr>
			<th class="text-center">Acteurs</th>
			<th class="text-center">code film</th>
			<th class="text-center">Titre</th>
			<th class="text-center">Année</th>
		</tr>
	<c:forEach items="${films}" var="film">
		<tr>
			<td><a href="?action=afficheActeurs&codeFilm=${film.codeFilm }">Acteurs</a></td>
			<td>${film.codeFilm}</td>
			<td>${film.titreFilm}</td>
			<td>${film.anneeFilm}</td>
			<!--  <td><a href="?action=supp&amp;id=${acteur.code}">Supprimer</a></td>-->
		</tr>
	</c:forEach>
	</table>
</div>
	<script type="text/javascript" src="js/bootstrap.min.js"> </script>
</body>
</html>
