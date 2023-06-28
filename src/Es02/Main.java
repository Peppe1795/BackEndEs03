package Es02;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Inserisci un numero");
		int numero = input.nextInt();
		numeroStringa(numero);
		input.close();
	}

	public static void numeroStringa(int num) {
		switch (num) {
		case 0: {
			System.out.println("zero");
			break;
		}
		case 1: {
			System.out.println("uno");
			break;
		}
		case 2: {
			System.out.println("due");
			break;
		}
		case 3: {
			System.out.println("tre");
			break;
		}
		default:
			System.out.println("inserisci un numero da 0 a 3");
		}
	}
}
