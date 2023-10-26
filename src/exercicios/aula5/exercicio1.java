package exercicios.aula5;

import java.sql.Array;

public class exercicio1 {
    public static void main(String[] args) {
        int[] array = {1,2,3,4,5};
        int total = 0;
        for (int i = 0; array.length > i; i++){
            total += array[i];
        }
        System.out.println(total);

        }

    }





