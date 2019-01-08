/*
Nome do autor: Elian Melo Morais
Data de criação do arquivo: 18/12/2018
Objetivo sucinto do programa: Demonstrar o tratamento da exceção StringIndexOutOfBounds Exception
Referência ao enunciado/origem do exercício: https://docs.google.com/document/d/1cCI5x1i5kef9dWZKrvrobbZddDXuLhhK5Kw8Pdj-ouA/edit
*/
//import java.lang.StringIndexOutOfBoundsException;

class Demonstra_StringIndexOutOfBoundsException {

    public static void main(String[] args){
        try {
            String frase = "Este é um teste de erro";
            frase.charAt(50);
        } catch(StringIndexOutOfBoundsException e) {
            System.out.println("A posição acessada na string é inválida");
        }
    }
}
