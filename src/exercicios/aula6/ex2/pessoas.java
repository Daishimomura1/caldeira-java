package exercicios.aula6.ex2;

import java.util.HashMap;
import java.util.Map;


public class pessoas {
   public static void main (String[] args) {
      //CRIAR MAPA
      Map<String, Integer> mapa = new HashMap<>();
      //adicionar elemento ao mapa
      mapa.put("pedro", 20);
      mapa.put("maria", 30);
      mapa.put("fernando", 40);
      mapa.put("roberta", 71);
      mapa.put("mario", 80);

      TerceiraIdade(mapa); //chamar aplicação
      }

   public static void TerceiraIdade (Map<String,Integer>mapa) {
      for (Map.Entry<String,Integer> aplicacao: mapa.entrySet()) {
         if (aplicacao.getValue() >= 60) {
         System.out.println(aplicacao.getKey()+ " idoso");
         }
      }
   }
}