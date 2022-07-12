package condicionaisJulia;

import java.util.Scanner;

public class atv4 {

	public static void main(String[] args) {

		Scanner Sc = new Scanner(System.in);
		
		System.out.print("Insira o primeiro número: ");
		double a = Sc.nextDouble();
		
		System.out.print("Insira o segundo número: ");
		double b = Sc.nextDouble();
		
		System.out.print("Insira o terceiro número: ");
		double c = Sc.nextDouble();
		
		if (a > b && b > c) { //3, 2, 1
			System.out.print(c + "\n" + b + "\n" + a);
		}
		
		if (c > a && a > b) { //2, 1, 3
			System.out.print(b + "\n" + a + "\n" + c);
		}
		
		if (c > b && b > a) { //1, 2, 3
			System.out.print(a + "\n" + b + "\n" + c);
		}
		
		if (a > c && c > b) { //3, 1, 2
			System.out.print(b + "\n" + c + "\n" + a);
		}
		
		if (b > a && a > c) { //2, 3, 1
			System.out.print(c + "\n" + a + "\n" + b);
		}
		
		if (b > c && b > a && c > a){ //1, 3, 2
			System.out.print(a + "\n" + c + "\n" + b);
		}
	}

}
