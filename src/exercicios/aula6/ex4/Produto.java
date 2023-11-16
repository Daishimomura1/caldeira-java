package exercicios.aula6.ex4;
import java.util.Map;
import java.util.HashMap;
import java.util.LinkedHashMap;
        public class Produto {
            public static void main(String[] args) {
                LinkedHashMap<String, Double> produto = new LinkedHashMap<>();

                produto.put("Chocolate", 6.45);
                produto.put("Cerveja", 10.00);
                produto.put("Batata", 7.98);
                produto.put("Refrigerante", 5.00);
                produto.put("Laranja", 4.99);



                for (Map.Entry<String, Double> mapElementos : produto.entrySet()) {
                    System.out.println(mapElementos.getKey() + "= " + mapElementos.getValue() + "R$");
                }
            }
        }