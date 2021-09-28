package com.arquivos;

import java.io.File;
import java.io.IOException;
import javax.swing.JOptionPane;

public class CriarArquivo {

	public static void main(String[] args) throws IOException {
		
		String caminho = JOptionPane.showInputDialog("Caminho e nome do arquivo");
		File arquivo = new File(caminho);
		
		if(!arquivo.exists()) {
			arquivo.createNewFile();
		}
		
		JOptionPane.showConfirmDialog(null, String.format("Arquivo %s criado.", caminho));
	}

}
