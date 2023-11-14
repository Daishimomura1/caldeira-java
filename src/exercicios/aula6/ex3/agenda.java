package exercicios.aula6.ex3;

import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

public class agenda {
    public static void main(String[] args) {
        Scanner scanner =  new Scanner(System.in);
        TreeMap<String, String> agendaTreeMap = new TreeMap<>(); //CRIA TREE MAP

        agendaTreeMap.put("Lucas",new String("Lucas, 4002-8922, casa amarela, norte"));
        agendaTreeMap.put("Rita",new String("Rita, 4232-8465, casa branca, Sul"));
        agendaTreeMap.put("Mario",new String("Mario, 2136-8314, casa laranja, centro"));
        agendaTreeMap.put("Rafaela",new String("Rafaela, 8418-2934, casa cinza, noroeste"));

        String infolucas = agendaTreeMap.get("Lucas");
        System.out.println("informações contato1 " + infolucas);



    }
}
