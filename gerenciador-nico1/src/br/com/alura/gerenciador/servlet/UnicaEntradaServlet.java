package br.com.alura.gerenciador.servlet;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import br.com.alura.gerenciador.acao.Acao;
import br.com.alura.gerenciador.acao.AlteraEmpresa;
import br.com.alura.gerenciador.acao.ListaEmpresas;
import br.com.alura.gerenciador.acao.MostraEmpresa;
import br.com.alura.gerenciador.acao.NovaEmpresa;
import br.com.alura.gerenciador.acao.NovaEmpresaForm;
import br.com.alura.gerenciador.acao.RemoveEmpresas;

/**
 * Servlet implementation class UnicaEntradaServlet
 */
@WebServlet("/entrada")
public class UnicaEntradaServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void service(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		String paramAcao = request.getParameter("acao");
		String nome;
		
		try {
			Class classe = Class.forName("br.com.alura.gerenciador.acao." + paramAcao);
			Acao acao = (Acao) classe.newInstance();
			nome = acao.executar(request, response);
		} catch (ClassNotFoundException | InstantiationException | IllegalAccessException | ServletException
				| IOException e) {
			throw new ServletException(e);
		}
		
		String[] tipoEEndereco = nome.split(":");

		if (tipoEEndereco[0].equals("forward")) {
			RequestDispatcher rd = request.getRequestDispatcher("WEB-INF/view/" + tipoEEndereco[1]);
			rd.forward(request, response);
		} else {
			response.sendRedirect(tipoEEndereco[1]);
		}

//		if (paramAcao.equals("ListaEmpresas")) {
//			System.out.println("listando");
//
//			ListaEmpresas acao = new ListaEmpresas();
//			nome = acao.executar(request, response);
//
//		} else if (paramAcao.equals("RemoveEmpresa")) {
//			System.out.println("removendo");
//
//			RemoveEmpresas acao = new RemoveEmpresas();
//			nome = acao.remover(request, response);
//
//		} else if (paramAcao.equals("MostrarEmpresa")) {
//			System.out.println("mostrando");
//
//			MostraEmpresa acao = new MostraEmpresa();
//			nome = acao.mostrar(request, response);
//
//		} else if (paramAcao.equals("AlteraEmpresa")) {
//			System.out.println("alterando");
//
//			AlteraEmpresa acao = new AlteraEmpresa();
//			nome = acao.(request, response);
//
//		} else if (paramAcao.equals("NovaEmpresa")) {
//			System.out.println("mostrando");
//
//			NovaEmpresa acao = new NovaEmpresa();
//			nome = acao.criar(request, response);
//		} else if (paramAcao.equals("NovaEmpresaForm")) {
//			
//			NovaEmpresaForm acao = new NovaEmpresaForm();
//			nome = acao.novoForm(request, response);
//		}

	
	}
}
