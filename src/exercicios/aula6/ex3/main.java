package exercicios.aula6.ex3;

import java.util.Arrays;
import java.util.Map;
import java.util.TreeMap;

public class main {
    public static void main(String[] args) {
        TreeMap<String, Agenda> Agenda = new TreeMap<>();

        Agenda.put("Pedro", new Agenda("Pedro", "4002-7923", "zona norte", "Porto Alegre"));
        Agenda.put("Arthur", new Agenda("Arthur","3193-2314", "zona leste", "Gravataí"));
        Agenda.put("Rafaela", new Agenda("rafaela", "9821-4125", "centro", "Canoas" ));
        Agenda.put("Dai", new Agenda("Dai", "9851-4123", "centro", "Itati"));
        Agenda.put("Marta", new Agenda("Marta", "9871-1234", "zona sul", "Porto Alegre"));

        //ordem alfabetica
        System.out.println("ordem alfabética");
        for (Map.Entry<String, Agenda> entry :  Agenda.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue(). getNome());
            System.out.println(entry.getKey() + ". Telefone: " + entry.getValue().getTelefone());
            System.out.println(entry.getKey() + ". Cidade: " + entry.getValue().getCidade());
            System.out.println(entry.getKey() + ". Endereço: " + entry.getValue().getEndereco());


        }
    }
}
