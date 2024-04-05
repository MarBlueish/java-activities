import java.util.*;

public class fi2 {
    public static void main(String[] args) {
        int[] list = {2, 4, 5, 7, 1, 4, 6, 2, 9, 10}; // lista de elementos
        int compare = 0;
        int valinput = 0;

        System.out.println("Insira o seu elemento e verifique se o mesmo faz parte:");
        Scanner sc = new Scanner(System.in);
        valinput = sc.nextInt();

        // Lógica para verificar se o elemento está na lista
        for (int i = 0; i < list.length; i++) {
            if (list[i] == valinput) {
                compare = 1;
            }
        }

        if (compare == 1) {
            System.out.println("O elemento está na lista.");
        } else {
            System.out.println("O elemento não está na lista.");
        }

        // Imprimir a lista
        System.out.println(Arrays.toString(list));

        sc.close();
    }
}

