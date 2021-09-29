package com.apache.poi.exercicios;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;

public class ManipularAquivoXLS {
	
	public static void main(String[] args) throws IOException {
		
		File arquivo = new File("./src/com/apache/poi/exercicios/arquivo_excel.xls");
		
		if(!arquivo.exists()) {
			arquivo.createNewFile();
		}
		
		Pessoa pessoa1 = new Pessoa("pessoa1", "pessoa1@email.com", 33);
		Pessoa pessoa2 = new Pessoa("pessoa2", "pessoa2@email.com", 34);
		Pessoa pessoa3 = new Pessoa("pessoa3", "pessoa3@email.com", 35);
		Pessoa pessoa4 = new Pessoa("pessoa4", "pessoa4@email.com", 36);
		
		List<Pessoa> pessoas = new ArrayList<>();
		
		pessoas.add(pessoa1);
		pessoas.add(pessoa2);
		pessoas.add(pessoa3);
		pessoas.add(pessoa4);
		
		HSSFWorkbook workbook = new HSSFWorkbook(); // usado pra escrever na planilha
		HSSFSheet sheet = workbook.createSheet(); // usado pra criar a planilha
		
		int numeroDaLinha = 0;
		for(Pessoa p : pessoas) {
			Row linhaPlanilha = sheet.createRow(numeroDaLinha++); // criação da linha da planilha
			
			int celula = 0; // inicialização das celulas
			
			// cada celula corresponde ao limite de dados que foi dado, neste caso, 3 - nome, email, idade -
			
			// celula 1
			Cell celulaDoNome = linhaPlanilha.createCell(celula++);
			celulaDoNome.setCellValue(p.getNome());
			
			// celula 2
			Cell celulaDoEmail = linhaPlanilha.createCell(celula++);
			celulaDoEmail.setCellValue(p.getEmail());
			
			// celula 3
			Cell celulaDaIdade = linhaPlanilha.createCell(celula++);
			celulaDaIdade.setCellValue(p.getIdade());
			
			
		}
		
		FileOutputStream saidaDoArquivo = new FileOutputStream(arquivo);
		workbook.write(saidaDoArquivo);
		saidaDoArquivo.flush();
		saidaDoArquivo.close();
		
		System.out.println("Acho que deu certo");
		
	}

}
