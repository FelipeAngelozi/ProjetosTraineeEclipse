<%-- <%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%> --%>
<% 
	String nomeEmpresa = (String) request.getAttribute("empresa");
	System.out.println(nomeEmpresa);
%>

<!DOCTYPE html> 
<html>
<head>
<meta charset="UTF-8">
<title>Teste</title>
</head>
<body>
Empresa ${empresa} cadastrada com sucesso!
</body>
</html>