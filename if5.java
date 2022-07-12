package condicionaisJulia;

import java.util.Scanner;

public class atv5 {

	public static void main(String[] args) {

		Scanner Sc = new Scanner(System.in);
		
		System.out.print("Insira o primeiro número: ");
		double a = Sc.nextDouble();
		
		System.out.print("Insira o segundo número: ");
		double b = Sc.nextDouble();
		
		System.out.print("Insira o terceiro número: ");
		double c = Sc.nextDouble();
		
		System.out.print("Insira o quarto número: ");
		double d = Sc.nextDouble();
		
		//c - b - a 
		if (d > c){
			System.out.print(d + "\n" + c + "\n" + b + "\n" + a);
		}
		
		if (d > b && d < c) {
			System.out.print(c + "\n" + d + "\n" + b + "\n" + a);
		}
		
		if (d > a && d < b) {
			System.out.print(c + "\n" + b + "\n" + d + "\n" + a);
		}
		
		if (d < a) {
			System.out.print(c + "\n" + b + "\n" + a + "\n" + d);
		}
	}

}
