package condicionaisJulia;

import java.util.Scanner;

public class atv1 {

	public static void main(String[] args) {
		Scanner Sc = new Scanner(System.in);
		
		System.out.print("Digite a nota da atividade de laboratório: ");
		double lab = Sc.nextDouble();
		
		System.out.print("Digite a nota da avaliação semestral: ");
		double sem = Sc.nextDouble();
	
		System.out.print("Digite a nota do exame final: ");
		double last = Sc.nextDouble();
		
		double avg = ((lab * 2) + (sem * 3) + (last * 5))/10;
		
		if (avg >= 8) {
			System.out.print("Conceito A");
		}

if (avg >= 7 && avg < 8) {
			System.out.print("Conceito B");
		} 

if (avg >= 6 && avg < 7) {
			System.out.print("Conceito C");
		} 

if (avg >= 5 && avg < 6) {
			System.out.print("Conceito D");
		}

if (avg < 5) {
			System.out.print("Conceito E");
		}

	}

}
