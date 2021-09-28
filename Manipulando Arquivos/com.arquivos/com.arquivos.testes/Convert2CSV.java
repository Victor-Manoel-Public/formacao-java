package com.arquivos.testes;


import java.io.File;
import java.io.FileInputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

import javax.swing.JOptionPane;

public class Convert2CSV {
	
	/*
		Create a class named Convert2CSV.
		This class needs one constructor and two inicial fields, initialFile and endFile.
		A method named named getInitialFile that returns the initialFile.
		A method named getEndFile that returns the endFile.
		A method named convert without any parameters
			The method needs to find a txt file and copy to a csv file.
		In total, write 3 methods and one constructor.
	
	*/

	private String initialFile;
	private String endFile;

	public Convert2CSV(String initialFile, String endFile) {
		super();
		this.initialFile = initialFile;
		this.endFile = endFile;
	}

	public String getInitialFile() {
		return initialFile;
	}

	public String getEndFile() {
		return endFile;
	}

	public void convert() throws IOException {
		// find first file
		File firstFile = new File(this.getInitialFile());
		File lastFile = new File(this.getEndFile());

		// create csv file
		if (!lastFile.exists()) {
			lastFile.createNewFile();
		}

		// first file to read
		FileInputStream file2read = new FileInputStream(firstFile);

		// read lines from file 1
		Scanner sc = new Scanner(file2read, "utf-8");
		FileWriter writer = new FileWriter(lastFile);

		while (sc.hasNext()) {

			String line = sc.nextLine();

			if (!line.isEmpty()) {
				writer.write(line + "\n");
			}

		}

		writer.close();
		sc.close();

		JOptionPane.showMessageDialog(null, "File converted successfully.");

	}

}
