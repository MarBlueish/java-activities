import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Numeros numeros = new Numeros();
        int numero1, numero2;

        System.out.print("Insira um numero: ");
        numero1 = new Scanner(System.in).nextInt();

        System.out.print("Insira o outro numero: ");
        numero2 = new Scanner(System.in).nextInt();

        numeros.insert_nums(num1, num2);
    }
}

class Numeros {
    Scanner scanner = new Scanner(System.in);

    public void insert_nums(int num1, int num2) {
        int resultado = 0;

        try {
            resultado = num1 / num2;

        } catch (ArithmeticException e) {
            System.out.println("Erro: Divisão por zero.");
        } catch (InputMismatchException e) {
            System.out.println("Erro: Entrada inválida. Por favor, insira um número");
        } finally {
            System.out.println("Resultado: " + resultado);
            System.out.println("Fim");
        }
    }
}

class TesteExcecao {
    public static void teste() throws Newexcept {
        throw new Newexcept();
    }

    public static void main(String[] args) {
        try {
            System.out.println("try ");
            teste();
        } catch (Newexcept e) {
            System.out.println("catch ");
        } finally {
            System.out.println("finally ");
        }

        System.out.println("fim");
    }
}

class Vetores {
    Scanner scanner = new Scanner(System.in);
    int[] vetors = new int[1];

    public void inserir_elementos(int[] vetor) {
        this.vetors = vetor;
        int contador = 0;

        try {
            while (vetor[contador] != 0) {
                System.out.print("Insira Elementos no Vetor: ");
                vetor[contador] = scanner.nextInt();
                contador++;
            }
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Erro: Limite do Array Excedido");
        } catch (InputMismatchException e) {
            System.out.println("Erro: Valor inserido nao e Numerico");
        } finally {
            System.out.println("Programa Encerrado");
        }
    }
}
