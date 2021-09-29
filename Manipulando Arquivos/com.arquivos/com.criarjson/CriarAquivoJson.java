package com.criarjson;

import java.io.File;
import java.io.FileWriter;
import java.util.ArrayList;
import java.io.IOException;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

public class CriarAquivoJson {

	public static void main(String[] args) throws IOException {
		
    // listas com dados ficticios
		DadosUsuarioJson usuario1 = new DadosUsuarioJson("Victor", "victor@email.com", "29/09/2021");
		DadosUsuarioJson usuario2 = new DadosUsuarioJson("Manoel", "manoel@email.com", "29/09/2021");
		DadosUsuarioJson usuario3 = new DadosUsuarioJson("Silvia", "silvia@email.com", "29/09/2021");
		DadosUsuarioJson usuario4 = new DadosUsuarioJson("Ellen", "ellen@email.com", "29/09/2021");

		ArrayList<DadosUsuarioJson> usuarios = new ArrayList<>();
		usuarios.add(usuario1);
		usuarios.add(usuario2);
		usuarios.add(usuario3);
		usuarios.add(usuario4);
		

		Gson gson = new GsonBuilder().setPrettyPrinting().create(); // colocar o json em formato organizado
		String json = gson.toJson(usuarios);
		
		
		File arquivo = new File("./src/com/criarjson/arquivoJson.json");
		
		if(!arquivo.exists()) {
			arquivo.createNewFile();
		}

		FileWriter escreverNoArquivo = new FileWriter(arquivo);
		escreverNoArquivo.write(json); // escrever json em arquivo
		escreverNoArquivo.flush();
		escreverNoArquivo.close();
	}

}
