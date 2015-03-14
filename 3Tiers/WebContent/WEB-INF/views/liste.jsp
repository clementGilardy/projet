<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h1>Liste des acteurs</h1>
	<table>
		<tr>
			<th>id</th>
			<th>Nom</th>
			<th>Année de naissance</th>
		</tr>
		<c:forEach var="p" items="${personnes}">
			<tr>
				<td><c:out value="${p.id}"/></td>
				<td><c:out value="${p.prenom}"/> <c:out value="${p.nom}"/></td>
				<td><c:out value="${p.anneeNaissance}"/></td>
				<td><a href="<c:url value="?action=supp&id=${p.id}"/>">Supprimer</a></td>
			</tr>
		</c:forEach>
	</table>
</body>
</html>