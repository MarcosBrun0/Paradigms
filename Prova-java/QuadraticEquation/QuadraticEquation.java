
//Universidade Federal Fluminense Darcy Ribeiro
//Paradigams de linguagem de programação, Prof. Ausberto
//Autor: Marcos Bruno P. Campos
//ano:2024
////////////////////////////////////////////////////////////
import java.util.Scanner;
      

   
public class QuadraticEquation {
 
    // Campos de dados privados
    private double a;
    private double b;
    private double c;

    // Construtor para os argumentos a, b, e c
    public QuadraticEquation(double a, double b, double c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    // Métodos getter para a, b, e c
    public double getA() {
        return a;
    }

    public double getB() {
        return b;
    }

    public double getC() {
        return c;
    }

    // Método para obter o discriminante
    public double getDiscriminant() {
        return b * b - 4 * a * c;
    }

    // Métodos para obter as raízes
    public double getRoot1() {
        double discriminant = getDiscriminant();
        if (discriminant < 0) {
            return 0; // Não existem raízes reais
        } else {
            return (-b + Math.sqrt(discriminant)) / (2 * a);
        }
    }

    public double getRoot2() {
        double discriminant = getDiscriminant();
        if (discriminant < 0) {
            return 0; // Não existem raízes reais
        } else {
            return (-b - Math.sqrt(discriminant)) / (2 * a);
        }
    }

    public static void main(String[] args) {
        java.util.Scanner input = new java.util.Scanner(System.in);

        // Solicitar ao usuário os valores de a, b, e c
        System.out.print("Digite o valor de a: ");
        double a = input.nextDouble();
        System.out.print("Digite o valor de b: ");
        double b = input.nextDouble();
        System.out.print("Digite o valor de c: ");
        double c = input.nextDouble();
        // Nome
        System.out.println("Marcos Bruno P. Campos");
        // Criar uma instância da classe QuadraticEquation
        QuadraticEquation equation = new QuadraticEquation(a, b, c);

        // Obter e exibir o discriminante
        double discriminant = equation.getDiscriminant();
        System.out.println("O discriminante é: " + discriminant);

        // Exibir as raízes, se houver
        if (discriminant > 0) {
            System.out.println("A equação tem duas raízes: " + equation.getRoot1() + " e " + equation.getRoot2());
        } else if (discriminant == 0) {
            System.out.println("A equação tem uma raiz: " + equation.getRoot1());
        } else {
            System.out.println("A equação não tem raízes reais.");
        }

        input.close();
    }
}

