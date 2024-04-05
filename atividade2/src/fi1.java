import java.util.*;


public class fi1 {
    public static void main(String[] args) {
        int i=0;
        int soma = 0;



        int[] respostas = new int[10]; // declaração de array

        Scanner sc= new Scanner(System.in);
        while (i<10){
            System.out.print("Insira o número ");
            respostas[i] = sc.nextInt();
            soma = (soma+respostas[i]);
            i++;

        }
        int media = (+soma / 10);
        System.out.println("A soma de todos os elementos é " +soma);
        System.out.print("A média de todos os elementos é " +media);


    }
}
