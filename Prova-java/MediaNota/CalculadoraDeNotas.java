// Universidade Federal Fluminense Darcy Ribeiro
// Paradigams de linguagem de programação, Prof. Ausberto
// Autor: Marcos Bruno P. Campos
// ano:2024
////////////////////////////////////////////////////////////
import java.util.Scanner;

public class CalculadoraDeNotas {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        

        // Nome
        System.out.println("Marcos Bruno P. Campos");
        // Solicitar as cinco notas do usuário
        System.out.println("Digite as cinco notas:");

        double nota1 = obterNota(scanner, 1);
        double nota2 = obterNota(scanner, 2);
        double nota3 = obterNota(scanner, 3);
        double nota4 = obterNota(scanner, 4);
        double nota5 = obterNota(scanner, 5);

        // Calcular a média das notas
        double media = (nota1 + nota2 + nota3 + nota4 + nota5) / 5;

        // Exibir a média
        System.out.println("A média das notas é: " + media);

        // Verificar se o aluno foi aprovado ou reprovado
        if (media >= 6.0) {
            System.out.println("Resultado: Aprovado");
        } else {
            System.out.println("Resultado: Reprovado");
        }

        scanner.close();
    }

    // Método auxiliar para obter as notas
    private static double obterNota(Scanner scanner, int numeroNota) {
        System.out.print("Nota " + numeroNota + ": ");
        return scanner.nextDouble();
    }
}

