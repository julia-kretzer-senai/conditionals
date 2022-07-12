package julia;

import java.util.Scanner;

public class ex02 {

	public static void main(String[] args) {

		Scanner Sc = new Scanner(System.in);

		System.out.println("Insira o dia: ");
		int d = Sc.nextInt();

		System.out.println("Insira o mês: ");
		int m = Sc.nextInt();

		System.out.println("Insira o ano: ");
		int y = Sc.nextInt();

		System.out.println("Insira a hora: ");
		int h = Sc.nextInt();

		System.out.println("Insira o minuto: ");
		int min = Sc.nextInt();

		if (m == 1) {
			System.out.println(d + "/" + m + "/" + y + " janeiro " + h + ":" + min);
		} else if (m == 2) {
			System.out.println(d + "/" + m + "/" + y + " fevereiro " + h + ":" + min);
		} else if (m == 3) {
			System.out.println(d + "/" + m + "/" + y + " março " + h + ":" + min);
		} else if (m == 4) {
			System.out.println(d + "/" + m + "/" + y + " abril " + h + ":" + min);
		} else if (m == 5) {
			System.out.println(d + "/" + m + "/" + y + " maio " + h + ":" + min);
		} else if (m == 6) {
			System.out.println(d + "/" + m + "/" + y + " junho " + h + ":" + min);
		} else if (m == 7) {
			System.out.println(d + "/" + m + "/" + y + " julho " + h + ":" + min);
		} else if (m == 8) {
			System.out.println(d + "/" + m + "/" + y + " agosto " + h + ":" + min);
		} else if (m == 9) {
			System.out.println(d + "/" + m + "/" + y + " setembro " + h + ":" + min);
		} else if (m == 10) {
			System.out.println(d + "/" + m + "/" + y + " outubro " + h + ":" + min);
		} else if (m == 11) {
			System.out.println(d + "/" + m + "/" + y + " novembro " + h + ":" + min);
		} else if (m == 12) {
			System.out.println(d + "/" + m + "/" + y + " dezembro " + h + ":" + min);
		}

		Sc.close();
	}
}