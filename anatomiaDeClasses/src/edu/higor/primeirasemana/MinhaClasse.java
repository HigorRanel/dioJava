package edu.higor.primeirasemana;
public class MinhaClasse {
    public static void main(String[] args) {
        System.out.println("Hello Word!");
        String primeiroNome = "Higor";
        String segundoNome = "Ranel";

        String nomeCompleto = nomeCompleto(primeiroNome, segundoNome);

        System.out.println( nomeCompleto);


      //  final String BR = "Brasil"; //não pode ser mudada *constante"
        
        
    }

    public static String nomeCompleto (String primeiroNome, String segundoNome){
        return primeiroNome.concat(" ").concat(segundoNome);
    }

}

