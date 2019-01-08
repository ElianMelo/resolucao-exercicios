/*
Nome do autor: Elian Melo Morais
Data de criação do arquivo: 18/12/2018
Objetivo sucinto do programa: Demonstrar o tratamento da exceção ArrayIndexOutOfBounds Exception
Referência ao enunciado/origem do exercício: https://docs.google.com/document/d/1cCI5x1i5kef9dWZKrvrobbZddDXuLhhK5Kw8Pdj-ouA/edit
*/
import java.lang.ArrayIndexOutOfBoundsException;

class Demonstra_ArrayIndexOutOfBoundsException {

    public static void main(String[] args){
        try {
            int arr[] = {0, 1, 2, 3, 4};
            arr[10] = 50;
        } catch(ArrayIndexOutOfBoundsException e) {
            System.out.println("A posição acessada é inválida");
        }
    }
}
