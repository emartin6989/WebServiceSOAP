<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
      <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<link rel="stylesheet" href="css/style.css" />
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Conversion</title>
</head>
<body>
	<form method="post" action="ConvServlet">
	<fieldset>
	<legend>Convertir des euros en dollars</legend>
		<label for="mt">Saisir le montant en euro :</label> <input type="text"
			name="mt" id="mt" /></fieldset>
		<input type="submit" value="valider" /><br/><br/>
			
		<c:if test="${conv!=null}">
			<p>Voici l'equivalent en dollar : <span>${conv} $</span>.</p>
			</c:if>
	</form>
</body>
</html>