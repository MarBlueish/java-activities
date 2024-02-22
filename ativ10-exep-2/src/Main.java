import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int[] vetor = new int[10]; // criado vetor com max 10 pos
        int indx = 0; // inicializa index a 0

        Scanner inputUser = new Scanner(System.in);

        try {
            while (true) {
                System.out.println("Insira um número inteiro");
                int nmr = inputUser.nextInt();
                vetor[indx] = nmr; // armazena o número no vetor
                indx++;
            }


        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Valor acima do tamanho do array ");
        } catch (InputMismatchException e) {
            System.out.println("Valor fora não inteiro/numérico ");
        }
    }
}
