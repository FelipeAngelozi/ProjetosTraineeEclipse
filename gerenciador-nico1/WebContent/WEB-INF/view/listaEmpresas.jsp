<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ page import="br.com.alura.gerenciador.modelo.Empresa, java.util.List"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt" %>

<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Java Standard Taglib</title>
</head>
<body>
	<c:import url="logout-parcial.jsp" />
	
	
	<c:if test="${not empty empresa}">
		Empresa ${ empresa } cadastrada com sucesso!
	</c:if>
	
	
	Sess�o iniciada com o usu�rio : ${usuarioLogado.login }
	
	<br>
	<br>
	
	Lista de empresas: <br />
	
	<ul>
		<c:forEach items="${empresas}" var="empresa">
			
			<li>
				${empresa.nome } - <fmt:formatDate value="${empresa.dataAbertura }" pattern="dd/MM/yyyy"/> 
				<a href="/gerenciador/entrada?acao=MostraEmpresa&id=${empresa.id }">edita</a>
				<a href="/gerenciador/entrada?acao=RemoveEmpresas&id=${empresa.id }">remove</a>
			</li>
		</c:forEach>
	</ul>
	<br>
	<a href="entrada?acao=NovaEmpresaForm">Cadastrar Empresa</a>
</body>
</html>



