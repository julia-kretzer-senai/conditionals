package julia;

import java.util.Scanner;

public class switch4 {

	public static void main(String[] args) {
		Scanner Sc = new Scanner(System.in);

		int option;
		double price, a, b, c;
		
		System.out.println("Insira o valor da compra: ");
		price = Sc.nextDouble();
		
		System.out.println("Opções de pagamento:\n1. À vista: 15% de desconto\n2. Cheque: 10% de desconto"
				+ "\n3. 6 vezes: valor normal\n4. 12 vezes: 8% de juros");
		option = Sc.nextInt();
		
		a = price - (price/100*15);
		b = price - (price/10);
		c = price + (price/100*8);
		
		switch (option) {
		case 1:
			System.out.println("Valor total: " + price + "\nDesconto: " + (price/100*15) + "\nValor final: " + a);
			break;
		case 2:
			System.out.println("Valor total: " + price + "\nDesconto: " + (price/100*10) + "\nValor final: " + b);
			break;
		case 3:
			System.out.println("Valor total: " + price + "\n6 parcelas de " + price/6);
			break;
		case 4:
			System.out.println("Valor total: " + price + "\nJuros: " + (price/100*8) + "\n12 parcelas de " + c/12);
			break;
		}
		
		Sc.close();
	}

}
