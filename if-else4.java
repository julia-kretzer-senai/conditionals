package julia;

import java.util.Scanner;

public class ex04 {

	public static void main(String[] args) {
		Scanner Sc = new Scanner(System.in);

		System.out.println("Insira a hora de início: ");
		int h1 = Sc.nextInt();
		
		System.out.println("Insira o minuto de início: ");
		int m1 = Sc.nextInt();
		
		System.out.println("Insira a hora de término: ");
		int h2 = Sc.nextInt();
		
		System.out.println("Insira o minuto de término: ");
		int m2 = Sc.nextInt();
		
		if (h1 > h2 && m1 > m2) {
			int hF = 23 - h1 + h2;
			int mF = 60 - m1 + m2;
			System.out.println(hF + ":" + mF);
		} else if (h1 > h2 && m1 < m2) {
			int hF = 24 - h1 + h2;
			int mF = 60 - m2 - m1;
			System.out.println(hF + ":" + mF);
		} else if (h1 == h2 && m1 > m2) {
			int hF = 23;
			int mF = 60 - m1 + m2;
			System.out.println(hF + ":" + mF);
		} else if (h1 == h2 && m1 < m2) {
			int hF = 0;
			int mF = m2 - m1;
			System.out.println(hF + ":" + mF);
		} else if (h1 < h2 && m1 > m2) {
			int hF = h2 - h1 - 1;
			int mF = 60 - m1 + m2;
			System.out.println(hF + ":" + mF);
		} else if (h1 < h2 && m1 < m2) {
			int hF = h2 - h1;
			int mF = m2 - m1;
			System.out.println(hF + ":" + mF);
		} else if (h1 > h2 && m1 == m2) { //07:20  - 06:20
			int hF = 24 - h1 + h2;
			int mF = 0;
			System.out.println(hF + ":" + mF);
		} else if (h1 < h2 && m1 == m2){
			int hF = h2 - h1;
			int mF = 0;
			System.out.println(hF + ":" + mF);
		}
		
		Sc.close();
	}

}