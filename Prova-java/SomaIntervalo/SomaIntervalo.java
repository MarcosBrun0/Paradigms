//Universidade Federal Fluminense Darcy Ribeiro
//Paradigams de linguagem de programação, Prof. Ausberto
//Autor: Marcos Bruno P. Campos
//ano:2024
////////////////////////////////////////////////////////////

import java.util.Scanner;

public class SomaIntervalo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // Nome
        System.out.println("Marcos Bruno P. Campos");
        // Solicitar os valores de A e B ao usuário
        System.out.print("Digite o valor de A: ");
        int A = scanner.nextInt();

        System.out.print("Digite o valor de B: ");
        int B = scanner.nextInt();

        // Garantir que A seja menor ou igual a B
        if (A > B) {
            System.out.println("O valor de A deve ser menor ou igual ao valor de B.");
        } else {
            int soma = 0;

            // Calcular a soma dos inteiros no intervalo [A, B]
            for (int i = A; i <= B; i++) {
                soma += i;
            }

            // Exibir o resultado
            System.out.println("A soma dos inteiros no intervalo de " + A + " até " + B + " é: " + soma);
        }

        scanner.close();
    }
}

