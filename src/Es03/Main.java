package Es03;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		String x = ":q";
		Scanner input = new Scanner(System.in);
		String frase;

		do {
			System.out.println("Inserisci una stringa");
			frase = input.nextLine();
			if (!frase.equals(x)) {
				String[] nomi = frase.split("");
				for (int i = 0; i < nomi.length; i++) {
					System.out.print(nomi[i] + ",");
				}
			}

			System.out.println();
		} while (!frase.equals(x));
		input.close();
		System.out.println("programma terminato");
	}

}
