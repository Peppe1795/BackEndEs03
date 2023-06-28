package Es04;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Inserisci un numero: ");
		int numero = input.nextInt();
		System.out.println();
		for (int i = numero; i >= 0; i--) {
			System.out.println(i);
		}
		input.close();
	}

}
