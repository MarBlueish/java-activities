import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner inputUser = new Scanner(System.in);

        try {
            System.out.println("Insira um número inteiro");
            int num1 = inputUser.nextInt();
            System.out.println("Insira um segundo número");
            int num2  = inputUser.nextInt();

            div(num1, num2);

        } catch (InputMismatchException e){
            System.out.println("Valor numérico incorreto");
        } catch (ArithmeticException e){
            System.out.println("Divisão por zero");
        }
    }

    public static void div(int num1, int num2){
        int resultado = num1 / num2;
        System.out.println("Resultado da divisão: " + resultado);
    }
}