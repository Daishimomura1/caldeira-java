package exercicios.aula5;

public class exercicio2 {
    public static void main(String[] args) {
        int[] random = new int[10];
        for (int j = 0; random.length > j; j++) {
            int rand  = (int) (Math.random() * (100 - 1)) + 1;
            random[j] = rand;
            System.out.println(random[j]);
        }

    }
}
