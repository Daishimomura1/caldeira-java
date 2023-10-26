package exercicios.aula4.exercicio2;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<FigurasGeometricas> arr = new ArrayList<>();
        arr.add(new Circulo(4));
        arr.add(new Losango(8, 2));
        arr.add(new Quadrado(1));
        arr.add(new Retangulo(5, 9));
        arr.add(new Triangulo(4, 2));

        for (FigurasGeometricas f : arr) {
            f.CalcularArea();
        }

    }
}