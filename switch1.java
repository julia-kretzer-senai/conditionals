package julia;

import java.util.Scanner;

public class switch1 {

	public static void main(String[] args) {
		
		Scanner Sc = new Scanner(System.in);

		int code;
		double sal, newSal;
		
		System.out.println("Insira o c�digo do seu cargo: ");
		code = Sc.nextInt();
		
		switch (code) {
		
		case 1:
			
			System.out.println("Insira o seu sal�rio: ");
			sal = Sc.nextDouble();
			
			newSal = sal + (sal/2);
			System.out.println("Escritur�rio: 50% de aumento\nNovo sal�rio: " + newSal);
			break;
			
		case 2:
			
			System.out.println("Insira o seu sal�rio: ");
			sal = Sc.nextDouble();
			
			newSal = sal + (sal/100*35);
			System.out.println("Secret�rio: 35% de aumento\nNovo sal�rio: " + newSal);
			break;
			
		case 3:
			
			System.out.println("Insira o seu sal�rio: ");
			sal = Sc.nextDouble();
			
			newSal = sal + (sal/5);
			System.out.println("Caixa: 20% de aumento\nNovo sal�rio: " + newSal);
			break;
			
		case 4:
			
			System.out.println("Insira o seu sal�rio: ");
			sal = Sc.nextDouble();
			
			newSal = sal + (sal/10);
			System.out.println("Gerente: 10% de aumento\nNovo sal�rio: " + newSal);
			break;
			
		case 5:
			System.out.println("Diretor: n�o tem aumento");
			break;
			
		default:
			System.out.println("C�digo inv�lido");
		}
		
		Sc.close();
	}

}
