package julia;

import java.util.Scanner;

public class ex06 {
    
    public static void main(String[] args) {
        Scanner Sc = new Scanner(System.in);

        System.out.println("Menu de opções: \n1. Imposto\n2. Novo salário\n3. Classificação");
        int option = Sc.nextInt();

        System.out.println("Insira o valor do salário");
        double sal = Sc.nextDouble();

        if (option == 1) {
            if (sal < 500) {
                System.out.println("Valor do imposto: 5% = R$" + sal/100 * 5);
            } else if (sal >= 500 && sal < 850) {
                System.out.println("Valor do imposto: 10% = R$" + sal/100 * 10);
            } else {
                System.out.println("Valor do imposto: 15% = R$" + sal/100 * 15);
            }
        } else if (option == 2) {
            if (sal > 1500) {
                System.out.println("Novo salário: R$" + (sal + 25));
            } else if (sal <= 1500 && sal > 750) {
                System.out.println("Novo salário: R$" + (sal + 50));
            } else if (sal <= 750 && sal > 450) {
                System.out.println("Novo salário: R$" + (sal + 75));
            } else {
                System.out.println("Novo salário: R$" + (sal + 100));
            }
        } else  {
            if (sal <= 700) {
                System.out.println("Mal remunerado");
            } else {
            System.out.println("Bem remunerado");
            }
        }

        Sc.close();
    }
}
