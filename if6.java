package condicionaisJulia;

import java.util.Scanner;

public class atv6 {

	public static void main(String[] args) {

		Scanner Sc = new Scanner(System.in);
		
		System.out.print("Insira o n�mero: ");
		double a = Sc.nextDouble();
		
		if (a % 2 == 0) {
			System.out.print("N�mero par");
		}
		
		if (a % 2 != 0) {
			System.out.print("N�mero �mpar");
		}
	}

}
