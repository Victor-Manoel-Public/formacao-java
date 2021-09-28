package com.exercicios;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class SimpleData {
    public static void main(String[] args) {
        Date date = new Date();
        SimpleDateFormat simpleDateFormat = null;
        // convertendo data pra descobrir algum dia, mes
        simpleDateFormat = new SimpleDateFormat("dd/MM/yyyy");
        Scanner sc = new Scanner(System.in);
        System.out.print("Data de nascimento: ");
        String diaNascimento = sc.next();
        try {
            int dia = simpleDateFormat.parse(diaNascimento).getDay();
            switch (dia){
                case 0:
                    diaNascimento = "no Domingo";
                    break;
                case 1:
                    diaNascimento = "na Segunda";
                    break;
                case 2:
                    diaNascimento = "na Terça";
                    break;
                case 3:
                    diaNascimento = "na Quarta";
                    break;
                case 4:
                    diaNascimento = "na Quinta";
                    break;
                case 5:
                    diaNascimento = "na Sexta";
                    break;
                case 6:
                    diaNascimento = "no Sabado";
                    break;
                default:
                    diaNascimento = "Dia invalido";
                    break;

            }

            System.out.println("Você nasceu " + diaNascimento);


        } catch (ParseException e) {
            e.printStackTrace();
        }
        sc.close();
    }
}
