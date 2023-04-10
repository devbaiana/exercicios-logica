package exercicio02;

import org.w3c.dom.ls.LSOutput;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc;
        sc = new Scanner(System.in);
        System.out.println("Insira a senha: ");
        String codigo = sc.nextLine();
        String senha = "123ABC";
        if (codigo.equals(senha)) {
            System.out.println("Acesso permitido");
        } else {
            System.out.println("Acesso negado");
        }


        sc.close();

    }


    }

