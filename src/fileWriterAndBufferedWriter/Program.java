package fileWriterAndBufferedWriter;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class Program {

	public static void main(String[] args) {
	
		//array de String para leitura
		String[] lines = new String[] {	"Good morning", "Good afternoon" , "Good night"	};
		
		String path = "c:\\temp\\out.txt";
		
		try (BufferedWriter bw = new BufferedWriter(new FileWriter(path, true))){
			 for(String line : lines) {
				 bw.write(line); // ler a lina do arquivo, para gravar o mesmo
				 bw.newLine(); // realiza a quebra de linha.
			 }
			
		} catch (IOException e) {
			e.printStackTrace();
		}
		

	}

}
