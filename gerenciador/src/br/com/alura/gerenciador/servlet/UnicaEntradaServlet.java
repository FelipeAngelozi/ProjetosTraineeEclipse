package br.com.alura.gerenciador.servlet;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import br.com.alura.gerenciador.acao.AlteraEmpresa;
import br.com.alura.gerenciador.acao.ListaEmpresas;
import br.com.alura.gerenciador.acao.MostraEmpresa;
import br.com.alura.gerenciador.acao.NovaEmpresa;
import br.com.alura.gerenciador.acao.RemoveEmpresas;

/**
 * Servlet implementation class UnicaEntradaServlet
 */
@WebServlet("/entrada")
public class UnicaEntradaServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;


	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	
		String paramAcao = request.getParameter("acao");
				
		if (paramAcao.equals("ListaEmpresas")) {
			System.out.println("listando");
			
			ListaEmpresas acao = new ListaEmpresas();
			acao.executar(request, response);
			
			
		} else if (paramAcao.equals("RemoveEmpresa")) {
			System.out.println("removendo");
			
			RemoveEmpresas acao = new RemoveEmpresas();
			acao.remover(request, response);
			
		} else if (paramAcao.equals("MostrarEmpresa")) {
			System.out.println("mostrando");
			
			MostraEmpresa acao = new MostraEmpresa();
			acao.mostrar(request, response);
		
		} else if (paramAcao.equals("AlteraEmpresa")) {
			System.out.println("mostrando");
			
			AlteraEmpresa acao = new AlteraEmpresa();
			acao.alterar(request, response);
		
		} else if (paramAcao.equals("NovaEmpresa")) {
			System.out.println("mostrando");
			
			NovaEmpresa acao = new NovaEmpresa();
			acao.criar(request, response);
		}
	}
} 


