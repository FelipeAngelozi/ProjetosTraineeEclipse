package br.com.sgsistemas.principal;

import java.io.IOException;
import java.util.Scanner;

import org.apache.http.client.ClientProtocolException;
import org.apache.http.client.fluent.Request;

public class Principal {

	public static void main(String[] args) throws ClientProtocolException, IOException {

		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite o cep que deseja consualta (somente numeros):");
		String cep = sc.nextLine();
		
		
		String url = "https://viacep.com.br/ws/" + cep + "/json/";
		
		
		String resposta = Request.Get(url).execute().returnContent().asString();
		
		System.out.println(resposta);
		
		sc.close();
		
//		Request.Post("http://targethost/login")
//				.bodyForm(Form.form().add("username", "vip").add("password", "secret").build()).execute()
//				.returnContent();
	}

}
