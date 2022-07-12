package julia;

import java.util.Scanner;

public class switch2 {

	public static void main(String[] args) {
		Scanner Sc = new Scanner(System.in);
		
		int country, product, tax;
		double kg, g, price, def, taxValue;
		
		System.out.println("Insira o código do produto comprado: ");
		product = Sc.nextInt();
		
		System.out.println("Insira o peso do produto em quilos: ");
		kg = Sc.nextDouble();
		
		System.out.println("Insira o código do país de origem: ");
		country = Sc.nextInt();
		
		g = kg * 1000;
		
		switch (country) {
				
		case 1:
			switch (product) {
			case 1, 2, 3, 4: 
				price = g * 10;
				System.out.println("Valor de " + price + " para " + g + " gramas de produto\nR$0 de imposto");
				break;
				
			case 5, 6, 7: 
				price = g * 25;
				System.out.println("Valor de " + price + " para " + g + " gramas de produto\nR$0 de imposto");
				break;
			    
			case 8, 9, 10: 
				price = g * 35;
				System.out.println("Valor de " + price + " para " + g + " gramas de produto\nR$0 de imposto");
				break;
			}
			break;
			
		case 2:
			tax = 15;
			switch (product) {
			case 1, 2, 3, 4: 
				price = g * 10;
				taxValue = price/100*tax;
				def = price + taxValue;
				System.out.println("Valor de " + def + " para " + g + " gramas de produto\nR$" + taxValue + " de imposto");
				break;
				
			case 5, 6, 7: 
				price = g * 25;
				taxValue = price/100*tax;
				def = price + taxValue;
				System.out.println("Preço de " + price + " para " + g + " gramas de produto\nR$" + taxValue + " de imposto\nValor fimal: " + def);
				break;
			    
			case 8, 9, 10: 
				price = g * 35;
				taxValue = price/100*tax;
				def = price + taxValue;
				System.out.println("Preço de " + price + " para " + g + " gramas de produto\nR$" + taxValue + " de imposto\nValor fimal: " + def);
				break;
			}
			
			break;
			
		case 3:
			tax = 25;
			switch (product) {
			case 1, 2, 3, 4: 
				price = g * 10;
				taxValue = price/100*tax;
				def = price + taxValue;
				System.out.println("Preço de " + price + " para " + g + " gramas de produto\nR$" + taxValue + " de imposto\nValor fimal: " + def);
				break;
				
			case 5, 6, 7: 
				price = g * 25;
				taxValue = price/100*tax;
				def = price + taxValue;
				System.out.println("Preço de " + price + " para " + g + " gramas de produto\nR$" + taxValue + " de imposto\nValor fimal: " + def);
				break;
			    
			case 8, 9, 10: 
				price = g * 35;
				taxValue = price/100*tax;
				def = price + taxValue;
				System.out.println("Preço de " + price + " para " + g + " gramas de produto\nR$" + taxValue + " de imposto\nValor fimal: " + def);
				break;
			}
		
			break;
		}
		
		Sc.close();
		
	}

}
