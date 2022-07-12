package julia;

import java.util.Scanner;

public class ex03 {

	public static void main(String[] args) {

		Scanner Sc = new Scanner(System.in);

		System.out.println("Insira o dia da primeira data: ");
		int d1 = Sc.nextInt();

		System.out.println("Insira o m�s da primeira data: ");
		int m1 = Sc.nextInt();

		System.out.println("Insira o ano da primeira data: ");
		int y1 = Sc.nextInt();

		System.out.println("Insira o dia da segunda data: ");
		int d2 = Sc.nextInt();

		System.out.println("Insira o mês da segunda data: ");
		int m2 = Sc.nextInt();

		System.out.println("Insira o ano da segunda data: ");
		int y2 = Sc.nextInt();

		if (y2 > y1) {
			System.out.println(d2 + "/" + m2 + "/" + y2);
		} else if (y1 == y2 && m2 > m1) {
			System.out.println(d2 + "/" + m2 + "/" + y2);
		} else if (y1 == y2 && m2 == m1 && d2 > d1) {
			System.out.println(d2 + "/" + m2 + "/" + y2);
		} else {
			System.out.println(d1 + "/" + m1 + "/" + y1);
		}

		Sc.close();
	}

}
