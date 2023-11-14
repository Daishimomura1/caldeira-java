package exercicios.aula6.aplicativo;

import exercicios.aula6.livros.Livro;

import java.util.HashSet;
import java.util.Stack;

public class main {
    public static void main(String[] args) {
        Stack<Livro> pilha = new Stack<>();
       pilha.add(new Livro("livro1", "desenho"));
       pilha.add(new Livro("livro2", "aventura"));
       pilha.add(new Livro("livro3", "drama"));
       pilha.add(new Livro("livro4", "anime"));

       int total = pilha.size(); //descobre o total de itens

        pilha.remove("livro1"); //remove livro1
        System.out.println(pilha);



    }

}
