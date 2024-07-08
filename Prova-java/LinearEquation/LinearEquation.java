//Universidade Federal Fluminense Darcy Ribeiro
//Paradigams de linguagem de programação, Prof. Ausberto
//Autor: Marcos Bruno P. Campos
//ano:2024
////////////////////////////////////////////////////////////
public class LinearEquation {
    // Campos de dados privados
    private double a, b, c, d, e, f;

    // Construtor para inicializar os campos
    public LinearEquation(double a, double b, double c, double d, double e, double f) {
        this.a = a;
        this.b = b;
        this.c = c;
        this.d = d;
        this.e = e;
        this.f = f;
    }

    // Métodos getter para a, b, c, d, e, f
    public double getA() {
        return a;
    }

    public double getB() {
        return b;
    }

    public double getC() {
        return c;
    }

    public double getD() {
        return d;
    }

    public double getE() {
        return e;
    }

    public double getF() {
        return f;
    }

    // Método para verificar se a equação é solucionável
    public boolean isSolvable() {
        return a * d - b * c != 0;
    }

    // Métodos para obter as soluções x e y
    public double getX() {
        if (isSolvable()) {
            return (e * d - b * f) / (a * d - b * c);
        } else {
            throw new ArithmeticException("A equação não tem solução.");
        }
    }

    public double getY() {
        if (isSolvable()) {
            return (a * f - e * c) / (a * d - b * c);
        } else {
            throw new ArithmeticException("A equação não tem solução.");
        }
    }

    public static void main(String[] args) {
        java.util.Scanner input = new java.util.Scanner(System.in);

       // Nome
        System.out.println("Marcos Bruno P. Campos");
        // Solicitar ao usuário os valores de a, b, c, d, e, f
        System.out.print("Digite o valor de a: ");
        double a = input.nextDouble();
        System.out.print("Digite o valor de b: ");
        double b = input.nextDouble();
        System.out.print("Digite o valor de c: ");
        double c = input.nextDouble();
        System.out.print("Digite o valor de d: ");
        double d = input.nextDouble();
        System.out.print("Digite o valor de e: ");
        double e = input.nextDouble();
        System.out.print("Digite o valor de f: ");
        double f = input.nextDouble();

        // Criar uma instância da classe LinearEquation
        LinearEquation equation = new LinearEquation(a, b, c, d, e, f);

        // Verificar se a equação é solucionável e exibir as soluções
        if (equation.isSolvable()) {
            System.out.println("x é: " + equation.getX());
            System.out.println("y é: " + equation.getY());
        } else {
            System.out.println("A equação não tem solução.");
        }

        input.close();
    }
}

