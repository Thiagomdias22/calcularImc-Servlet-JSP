<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
	<head>
		<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
		<title>JSP Page</title>
	</head>
	
	<body>
		<h1>Calcular IMC (JSP e Expression Language)</h1>
		
		<form action="CalcularImc2.jsp">
			<label>Altura: </label> <input type="text" name="altura" onchange="this.value = this.value.replace(',', '.')"><br/><br/>
			<label>Peso: </label> <input type="text" name="peso" onchange="this.value = this.value.replace(',', '.')"><br/><br/>
			<input type="submit" value="Calcular">
		</form>
	</body>
</html>