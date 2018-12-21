/*
Nome do autor: Elian Melo Morais
Data de criação do arquivo: 18/12/2018
Objetivo sucinto do programa: Demonstrar o tratamento da exceção IllegalArgument Exception
Referência ao enunciado/origem do exercício: https://docs.google.com/document/d/1cCI5x1i5kef9dWZKrvrobbZddDXuLhhK5Kw8Pdj-ouA/edit
*/
import java.lang.IllegalArgumentException;

class Demonstra_IllegalArgumentException {
    private int valor;

    Demonstra_IllegalArgumentException() {}

    Demonstra_IllegalArgumentException(int valor) {
        if (valor != 1) {
            throw new IllegalArgumentException(Integer.toString(valor));
        }
            this.valor = valor;
    }

    public void setValor(int valor){
        if (valor != 1) {
            throw new IllegalArgumentException(Integer.toString(valor));
        }
            this.valor = valor;
    }

    public int getValor() {
        return valor;
    }

    public static void main(String[] args){
        try {
            Demonstra_IllegalArgumentException valor = new Demonstra_IllegalArgumentException(2);
        } catch(IllegalArgumentException e){
            System.out.println("Argumento inválido");
        }
    }
}
