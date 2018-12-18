/*
Nome do autor: Elian Melo Morais
Data de criação do arquivo: 18/12/2018
Objetivo sucinto do programa: Demonstrar o tratamento da exceção Arithmetic Exception
Referência ao enunciado/origem do exercício: https://docs.google.com/document/d/1cCI5x1i5kef9dWZKrvrobbZddDXuLhhK5Kw8Pdj-ouA/edit
*/
import java.lang.ArithmeticException;

class Demonstra_ArithmeticException {

    public static void main(String[] args){
        try {
            int x = 20;
            int y = 0;
            int z = x / y;
        } catch(ArithmeticException e) {
            System.out.println("Não é possível dividir por zero");
        }
    }
}
