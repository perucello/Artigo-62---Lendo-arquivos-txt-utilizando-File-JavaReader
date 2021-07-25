package com.educaciencia.fileReader.main;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class LeitorFileReader {

	public static void main(String[] args) {
		String path = "C:\\DocumentoTXT\\";
		String arquivo = "Documento2.txt";
		BufferedReader bufferReader = null;
		FileReader fileReader = null;

		try {
			fileReader = new FileReader(path + arquivo);
			bufferReader = new BufferedReader(fileReader);
			String line = bufferReader.readLine();

			while (line != null) {
				System.out.println(line);
				line = bufferReader.readLine();
			}
		} 
		catch (IOException exio) {
			System.out.println("Error: " + exio.getMessage());
		} 
		finally {
			try {
				if (bufferReader != null)
					bufferReader.close();
				if (fileReader != null)
					fileReader.close();
			} catch (IOException exio) {
				exio.printStackTrace();
			}
		}
	}
}
