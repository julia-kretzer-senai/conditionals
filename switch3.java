package julia;

import java.util.Scanner;

public class switch3 {

	public static void main(String[] args) {
		Scanner Sc = new Scanner(System.in);
		
		int books;
		
		double a, b;
		
		System.out.println("Insira a quantidade de livros comprados: ");
		books = Sc.nextInt();
		
		a = 0.25 * books + 7.5;
		b = 0.5 * books + 2.5;
		
		if (a > b) {
			System.out.println("O desconto B é mais vantajoso");
		} else if (a < b) {
			System.out.println("O desconto A é mais vantajoso");
		} else {
			System.out.println("Os dois descontos dão o mesmo resultado");
		}
		
		Sc.close();

	}

}
