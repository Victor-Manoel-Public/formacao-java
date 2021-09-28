package com.exercicios;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class ParcelarCompra {

    public static void main(String[] args) {
        LocalDate localDate = LocalDate.parse("2000-10-28");
        Scanner sc = new Scanner(System.in);

        // valor da compra
        System.out.print("Valor total da compra: R$");
        double total = sc.nextDouble();

        // total parcelas
        System.out.print("Quantas vezes quer dividir? ");
        int vezes = sc.nextInt();

        for (int i = 1; i <= vezes; i++) {
            localDate = localDate.plusMonths(1);
            System.out.printf("%dx parcela R$%.2f. vencimento: %s\n", i, (total/vezes) ,localDate.format(DateTimeFormatter.ofPattern("dd/MM/yyyy")));
        }
        sc.close();
    }
}
