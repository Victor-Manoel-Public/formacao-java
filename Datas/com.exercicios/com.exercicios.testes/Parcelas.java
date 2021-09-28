package com.exercicios.testes;


import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class Parcelas {
    public static void main(String[] args) throws IOException {
        // pedir nome, total da compra e parcelas do usuario
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nome do cliente: ");
        String nomeCliente = scanner.next();

        System.out.println("Valor da compra: R$");
        double valorCompra = scanner.nextDouble();

        System.out.println("Quantas parcelas deseja fazer? ");
        int vezesParcela = scanner.nextInt();

        LocalDateTime localDateTime = LocalDateTime.now();

        File vendas = new File("./vendas.txt");

        if( !vendas.exists() ){
            vendas.createNewFile();
        }

        FileWriter escrita = new FileWriter(vendas);
        escrita.write("====================================\n");
        escrita.write(String.format("%s realizou uma compra de R$%.2f em %s e dividiu em %d vez(es).\n",
                nomeCliente, valorCompra, localDateTime.format(DateTimeFormatter.ofPattern("dd/MM/yyyy")), vezesParcela));
        escrita.write("Próxima(s) parcela(s):\n");
        for (int i = 1; i <= vezesParcela; i++) {
            localDateTime = localDateTime.plusMonths(1);
            escrita.write(String.format("R$%.2f em %s\n", (valorCompra / vezesParcela) ,localDateTime.format(DateTimeFormatter.ofPattern("dd/MM/yyyy"))));
        }
        escrita.write("====================================");
        escrita.flush();
        escrita.close();

        scanner.close();


    }
}
