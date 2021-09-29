package com.criarjson;

import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.util.ArrayList;
import java.util.List;
import java.io.IOException;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.JsonArray;
import com.google.gson.JsonElement;
import com.google.gson.JsonParser;

public class CriarAquivoJson {

	public static void main(String[] args) throws IOException {
		// dados ficticios
		DadosUsuarioJson usuario1 = new DadosUsuarioJson("Victor", "victor@email.com", "29/09/2021");
		DadosUsuarioJson usuario2 = new DadosUsuarioJson("Manoel", "manoel@email.com", "29/09/2021");
		DadosUsuarioJson usuario3 = new DadosUsuarioJson("Silvia", "silvia@email.com", "29/09/2021");
		DadosUsuarioJson usuario4 = new DadosUsuarioJson("Ellena", "ellena@email.com", "29/09/2021");

		ArrayList<DadosUsuarioJson> usuarios = new ArrayList<>();
		usuarios.add(usuario1);
		usuarios.add(usuario2);
		usuarios.add(usuario3);
		usuarios.add(usuario4);
		

		Gson gson = new GsonBuilder().setPrettyPrinting().create();
		String json = gson.toJson(usuarios);
		
		
		File arquivo = new File("./src/com/criarjson/arquivoJson.json");
		
		if(!arquivo.exists()) {
			arquivo.createNewFile();
		}
		// escrever os dados
		FileWriter escreverNoArquivo = new FileWriter(arquivo);
		escreverNoArquivo.write(json);
		escreverNoArquivo.flush();
		escreverNoArquivo.close();
		
		// ler arquivo json
		
		FileReader jsonParaLer = new FileReader(arquivo);
		JsonArray jsonArray = (JsonArray) JsonParser.parseReader(jsonParaLer);
		
		List<DadosUsuarioJson> listaDeUsuarios = new ArrayList<DadosUsuarioJson>();
		
		for (JsonElement elemento : jsonArray) {
			DadosUsuarioJson usuario = new Gson().fromJson(elemento, DadosUsuarioJson.class);
			listaDeUsuarios.add(usuario);
		}
		
		for (DadosUsuarioJson dadosUsuarioJson : listaDeUsuarios) {
			System.out.println(dadosUsuarioJson);
		}
	}

}
