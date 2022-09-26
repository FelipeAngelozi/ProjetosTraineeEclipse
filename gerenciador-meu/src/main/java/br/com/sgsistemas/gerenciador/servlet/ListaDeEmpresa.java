package br.com.sgsistemas.gerenciador.servlet;

import java.io.IOException;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class ListaDeEmpresa
 */
@WebServlet("/listaDeEmpresa")
public class ListaDeEmpresa extends HttpServlet {
	private static final long serialVersionUID = 1L;
    
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	
		
		Banco banco = new Banco();
		List<Empresa> lista = banco.getEmpresas();
		
		response.sendRedirect("listaEmpresa.jsp");
//		
//		RequestDispatcher requestDispacher = request.getRequestDispatcher("listaEmpresa.jsp");
//		request.setAttribute("empresas", lista);
//		requestDispacher.forward(request, response);
		
	}


}
