<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Header</title>
</head>
<body>

<div class="lien">
	<a href="?action=afficheFilms">tous les films</a><br>
	<a href="?action=afficheActeurs">tous les acteurs</a>
</div>

	<form action="?action=afficheFilms&regexFilm=ok" method="post">
		<div class="col-sm-2">
			<input type="text" name="rechercheFilm" class="form-control" placeholder="Rechercher vos films"/>
		</div> 
		<input type="submit" class="btn btn-primary" value="rechercher"/>
	</form><br>
	<form action="?action=afficheActeurs&regexActeur=ok" method="post">
		<div class="col-sm-2">
			<input type="text" name="rechercheActeur" class="form-control" placeholder="Rechercher vos acteurs"/>
		</div> 
		<input type="submit" class="btn btn-primary" value="rechercher"/>
	</form>

</body>
</html>