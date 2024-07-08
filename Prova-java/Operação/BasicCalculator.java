//Universidade Federal Fluminense Darcy Ribeiro
//Paradigams de linguagem de programação, Prof. Ausberto
//Autor: Marcos Bruno P. Campos
//ano:2024
////////////////////////////////////////////////////////////
import java.util.Scanner;

public class BasicCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Solicita ao usuário para inserir dois números
        System.out.print("Digite o primeiro numero: ");
        double num1 = scanner.nextDouble();

        System.out.print("Digite o segundo numero: ");
        double num2 = scanner.nextDouble();

        // Realiza as operações básicas
        double sum = num1 + num2;
        double difference = num1 - num2;
        double product = num1 * num2;
        double quotient = 0;

        // Verifica se a divisão é possível
        if (num2 != 0) {
            quotient = num1 / num2;
        } else {
            System.out.println("Divisão por zero não permitida");
        }

        // Exibe os resultados 
        System.out.println("Marcos Bruno P. Campos");
        System.out.println("Soma: " + sum);
        System.out.println("Diferença: " + difference);
        System.out.println("Produto: " + product);
        if (num2 != 0) {
            System.out.println("Quociente: " + quotient);
        }

        scanner.close();
    }
}
