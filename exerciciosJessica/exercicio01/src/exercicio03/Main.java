package exercicio03;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Descubra se seu número é positivo ou negativo" + "\n");
        System.out.println("Insira o número: ");
        Scanner sc;
        sc = new Scanner(System.in);
        int num = sc.nextInt();
        if (num < 0) {
            System.out.println("Número negativo" + "\n");
        } else {
            System.out.println("Número positivo" + "\n");
        }
    }
}
