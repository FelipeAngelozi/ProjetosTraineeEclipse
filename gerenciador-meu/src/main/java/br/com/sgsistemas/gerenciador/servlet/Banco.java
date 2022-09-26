package br.com.sgsistemas.gerenciador.servlet;

import java.util.ArrayList;
import java.util.List;

public class Banco {
	
	public static List<Empresa> lista = new ArrayList<>();
	
	
	
	public void adiciona(Empresa empresa) {
		lista.add(empresa);
	}

	public List<Empresa> getEmpresas(){
		return Banco.lista;
	}
}
