import java.util.Arrays;


public class j5 {
    public static void main(String[] args) {
        int[] array = {12,32,54,6,8,89,64,64,6,17,100};
        int[] array2 = {12,32,54,6,8,89,64,64,6,17,100};
        int cont = 0;

        for (int i=0; i<array.length; i++) {

            if (array[i] == array2[i]) {

                cont++;

            }

        }

        if (cont == array.length) {

            System.out.println("Arrays Iguais");

        } else {

            System.out.println("Arrays Diferentes");

        }

    }