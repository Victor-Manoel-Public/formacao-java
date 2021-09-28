package com.exercicios;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class AfterAndBefore {
    public static void main(String[] args) throws ParseException {
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("dd/MM/yyyy");
        Scanner scanner = new Scanner(System.in);

        // pedir uma data atual
        System.out.print("Data de hoje (dd/MM/yyyy): ");
        Date dataHoje = simpleDateFormat.parse(scanner.next());

        // pedir a data de vencimento
        System.out.print("Data de vencimento (dd/MM/yyyy): ");
        Date dataVencimento = simpleDateFormat.parse(scanner.next());

        // calcular se esta atrasado ou nao
        if(dataHoje.after(dataVencimento)){
            System.err.println("boleto vencido".toUpperCase());
        }else{
            System.out.println("boleto em dia".toUpperCase());
        }

        scanner.close();

    }
}
