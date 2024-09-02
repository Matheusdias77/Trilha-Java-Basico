package org.example;
import java.util.Scanner;
import org.example.Domain.ParametrosInvalidosException;

public class Contador {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("Digite o primeiro parâmetro");
        int parametroUm = teclado.nextInt();
        System.out.println("Digite o segundo parâmetro");
        int parametroDois = teclado.nextInt();

        try {
            contar(parametroUm, parametroDois);

        }catch (ParametrosInvalidosException exception) {
            System.out.println(exception.getMessage());
        }

    }
    static void contar(int parametroUm, int parametroDois ) throws ParametrosInvalidosException {
        if (parametroUm > parametroDois){
            throw new ParametrosInvalidosException("O segundo parametro deve ser maior que o primeiro");
        }

        int contagem = parametroDois - parametroUm;
        for (int i = 1 ; i <= contagem ; i++){
            System.out.println("Imprimindo Número " + i);
        }
    }
}
