package exercicio01;
import java.util.Scanner;
public class main {
    public static void main(String[] args) {
        // um programa que le quatro notas, calcule a media e exiba uma mensagem

        System.out.println("Olá! Insira nome: ");
        Scanner sc = new Scanner (System.in);
        String nome = sc.next();
        String primeiraLetra = nome.substring(0, 1).toUpperCase();
        String restanteDaString = nome.substring(1);
        String nomeFormatado = primeiraLetra.concat(restanteDaString);

        System.out.println("Insira sua primeira nota: ");
        int nota1 = sc.nextInt();
        System.out.println("Insira sua segunda nota: ");
        int nota2 = sc.nextInt();
        System.out.println("Insira sua terceira nota: ");
        int nota3 = sc.nextInt();
        System.out.println("Insira sua quarta nota: ");
        int nota4 = sc.nextInt();

        int media = (nota1 + nota2 + nota3 + nota4)/4;

        System.out.println("Aluno: " + nomeFormatado + " - " + "Média: " + media);
        sc.close();
    }
}


