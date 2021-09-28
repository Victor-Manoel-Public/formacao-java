package com.arquivos;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Scanner;

import javax.swing.JOptionPane;

public class LerArquivo {

	public static void main(String[] args) throws FileNotFoundException {
		
		String caminho = JOptionPane.showInputDialog("Caminho e nome do arquivo para ler");
		FileInputStream leitura = new FileInputStream(new File(caminho));
		
		Scanner sc = new Scanner(leitura, "utf-8");
		
		while(sc.hasNext()) {
			System.out.println(sc.nextLine());
		}
		
		sc.close();
	}
	
}
