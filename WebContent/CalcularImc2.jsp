<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
	<head>
		<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
		<title>JSP Page</title>
	</head>
	
	<body>
		
		<% 
				double peso = Double.parseDouble(request.getParameter("peso"));
				double altura = Double.parseDouble(request.getParameter("altura"));
				double imc = peso/(altura*altura);
				
				String result="";
				String n="";
				
				if(imc < 18.5) {
					result="Resultado: Magreza"+"<br/>";
					n="Sinto muito, seu IMC é "+String.format("%.2f", imc)+" Kg/m2 e você precisa ganhar peso!";
				}
				else if(imc >= 18.5 && imc < 24.9) {
					result="Resultado: Normal"+"<br/>";
					n="Parabéns, seu IMC é "+String.format("%.2f", imc)+" Kg/m2 e você está dentro do peso adequado!";
				}
				else if(imc >= 24.9 && imc < 30) {
					result="Resultado: Sobrepeso"+"<br/>";
					n="Sinto muito, seu IMC é "+String.format("%.2f", imc)+" Kg/m2 e por isso você está acima do peso e deveria emagrecer!";
				}
				else if(imc >= 30) {
					result="Resultado: Obesidade"+"<br/>";
					n="Sinto muito, seu IMC é "+String.format("%.2f", imc)+" Kg/m2 e por isso você está acima do peso e deveria emagrecer!";
				}
				
			%>
			
			<h2><%=result %></h2>
			<h4><%=n%></h4>
	</body>
</html>