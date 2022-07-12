package condicionaisJulia;

import java.util.Scanner;

public class atv6 {

	public static void main(String[] args) {

		Scanner Sc = new Scanner(System.in);
		
		System.out.print("Insira o número: ");
		double a = Sc.nextDouble();
		
		if (a % 2 == 0) {
			System.out.print("Número par");
		}
		
		if (a % 2 != 0) {
			System.out.print("Número ímpar");
		}
	}

}
