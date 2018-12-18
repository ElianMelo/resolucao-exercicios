/*
Nome do autor: Elian Melo Morais
Data de criação do arquivo: 18/12/2018
Objetivo sucinto do programa: Demonstrar o tratamento da exceção NumberFormat Exception
Referência ao enunciado/origem do exercício: https://docs.google.com/document/d/1cCI5x1i5kef9dWZKrvrobbZddDXuLhhK5Kw8Pdj-ouA/edit
*/
import java.lang.NumberFormatException;

class Demonstra_NumberFormatException {

    public static void main(String[] args){
        try {
            int numero = Integer.parseInt("five");
        } catch(NumberFormatException e) {
            System.out.println("A string escrita não corresponde a um número");
        }
    }
}
