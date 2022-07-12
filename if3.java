package condicionaisJulia;

import java.util.Scanner;

public class atv3 {

	public static void main(String[] args) {

		Scanner Sc = new Scanner(System.in);
		
		System.out.print("Insira o primeiro número: ");
		double a = Sc.nextDouble();
		
		System.out.print("Insira o segundo número: ");
		double b = Sc.nextDouble();
		
		if (a > b) {
			System.out.print(a);
		}
		
		if (b > a) {
			System.out.print(b);
		}
	}

}
