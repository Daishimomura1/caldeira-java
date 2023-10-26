package exercicios.aula5;

import java.util.ArrayList;

public class exercicio3 {
    public static void main(String[] args) {
        ArrayList<String> ListaDeTarefas = new ArrayList<String>();
        ListaDeTarefas.add("lavar roupa");
        ListaDeTarefas.add("estudar");
        ListaDeTarefas.add("jogar");
        ListaDeTarefas.add("varrer a casa");
        ListaDeTarefas.remove(2);
        System.out.println(ListaDeTarefas);


    }
}
