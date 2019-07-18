package file;

import java.io.File;
import java.util.Scanner;

public class Get {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("Informe o caminho do arquivo.");
		String strPath = sc.nextLine();

		File path = new File(strPath);

		// pegando so o nome do arquivo,
		System.out.println("getName: " + path.getName());

		// pegado so camonho do arquivo (pasta)
		System.out.println("getparent: " + path.getParent());
		

		// pegando o caminho completo
		System.out.println("getPath: " + path.getPath());

		sc.close();
	}

}
