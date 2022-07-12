package condicionaisJulia;

import java.util.Scanner;

public class atv2 {

	public static void main(String[] args) {
		Scanner Sc = new Scanner(System.in);
		
		System.out.print("Digite a nota 1: ");
		double a = Sc.nextDouble();
		
		System.out.print("Digite a nota 2: ");
		double b = Sc.nextDouble();
	
		System.out.print("Digite a nota 3: ");
		double c = Sc.nextDouble();
		
		double avg = (a + b + c)/3;
		
		if (avg >= 7) {
			System.out.print("Aprovado");
		}

if (avg < 3) {
			System.out.print("Reprovado");
		} 

if (avg >= 3 && avg < 7) {
			double d = 12 - avg;
			System.out.print("Exame, precisa tirar no mínimo " + d);
		}

	}

}
