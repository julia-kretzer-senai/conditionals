package julia;

import java.util.Scanner;

public class ex01 {

	public static void main(String[] args) {

		Scanner Sc = new Scanner(System.in);

		System.out.println("Menu de opções: \n1. Somar dois números \n2. Raiz quadrada de um número");
		int a = Sc.nextInt();

		if (a == 1) {
			System.out.println("Insira o primeiro número: ");
			int b = Sc.nextInt();

			System.out.println("Insira o segundo número: ");
			int c = Sc.nextInt();

			System.out.println(b + c);
		} else {
			System.out.println("Insira o número: ");
			int b = Sc.nextInt();
			System.out.println(Math.sqrt(b));
		}
		
		Sc.close();
	}

}
