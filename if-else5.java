package julia;

import java.util.Scanner;

public class ex05 {
    public static void main(String[] args) {
        Scanner Sc = new Scanner(System.in);

        System.out.println("Insira o código do cargo: ");
        int code = Sc.nextInt();

        System.out.println("Insira o salário atual: ");
        double init = Sc.nextDouble();

        if (code == 1) {
            double fin = init + (init/100 * 50);
            System.out.println("Escriturário: 50% de aumento. \nNovo salário: " + fin);
        } else if (code == 2) {
            double fin = init + (init/100 * 35);
            System.out.println("Secretário: 35% de aumento. \nNovo salário: " + fin);
        } else if (code == 3) {
            double fin = init + (init/100 * 20);
            System.out.println("Caixa: 20% de aumento. \nNovo salário: " + fin);
        } else if (code == 4) {
            double fin = init + (init/100 * 10);
            System.out.println("Gerente: 10% de aumento. \nNovo salário: " + fin);
        } else {
            System.out.println("Diretor: não há aumento.");
        }

        Sc.close();
    }
}
