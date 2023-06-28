package Es01;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Inserisci una stringa");
		String frase = input.nextLine();
		pariDispari(frase);
		System.out.println("Inserisci un anno");
		int anno = input.nextInt();
		annoBisesitile(anno);
		input.close();
	}

	public static void pariDispari(String stringa) {
		if (stringa.length() % 2 == 0) {
			System.out.println(true);
		} else {
			System.out.println(false);
		}
	}

	public static void annoBisesitile(int anno) {
		if (anno % 4 == 0) {
			System.out.println(true);
		} else if (anno % 100 == 0 && anno % 400 == 0) {
			System.out.println(true);
		} else {
			System.out.println(false);
		}
	}
}
