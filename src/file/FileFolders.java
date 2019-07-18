package file;

import java.io.File;
import java.util.Scanner;

public class FileFolders {

	/* Lenda as Pastas, dado um caminho */

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("Informe o caminho de uma Pasta.");
		String strPath = sc.nextLine();

		File path = new File(strPath);

		//lista de pastas
		File[] folders = path.listFiles(File::isDirectory);
		System.out.println("FOLDRES: ");

		for (File folder : folders) {
			System.out.println(folder);
		}

	}

}
