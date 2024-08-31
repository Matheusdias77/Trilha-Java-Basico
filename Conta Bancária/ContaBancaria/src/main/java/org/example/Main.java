package org.example;

import org.example.Domain.ContaTerminal;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        ContaTerminal conta = new ContaTerminal();
        Scanner teclado = new Scanner(System.in);

        System.out.println("Digite o Número da sua Conta:");
        int numeroConta = teclado.nextInt();
        conta.setNumero(numeroConta);

        teclado.nextLine();

        System.out.println("Digite o Número da sua Agência:");
        String numeroAgencia = teclado.nextLine();
        conta.setAgencia(numeroAgencia);

        System.out.println("Digite o seu Nome:");
        String nome = teclado.nextLine();
        conta.setNomeCliente(nome);

        System.out.println("Digite o Saldo da sua conta:");
        double saldo = teclado.nextDouble();
        conta.setSaldo(saldo);

        teclado.close();

        System.out.println("Olá " + conta.getNomeCliente() + ", obrigado por criar uma conta em nosso banco, sua agência é "
                + conta.getAgencia() + ", conta " + conta.getNumero() + " e seu saldo " + conta.getSaldo() + " já está disponível para saque.");
    }
}
