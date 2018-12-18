/*
Nome do autor: Elian Melo Morais
Data de criação do arquivo: 18/12/2018
Objetivo sucinto do programa: Demonstrar o tratamento da exceção NullPointerException Exception
Referência ao enunciado/origem do exercício: https://docs.google.com/document/d/1cCI5x1i5kef9dWZKrvrobbZddDXuLhhK5Kw8Pdj-ouA/edit
*/
import java.lang.NullPointerException;

class Demonstra_NullPointerException {

    public static void main(String[] args){
        try {
            String palavra = null;
            palavra.equals("oi");
        } catch(NullPointerException e) {
            System.out.println("Ponteiro posicionado em um valor nulo");
        }
    }
}
