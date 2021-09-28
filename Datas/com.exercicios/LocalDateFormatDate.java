package com.exercicios;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class LocalDateFormatDate {
    public static void main(String[] args) {
        // datas formatadas com LocalDate
        LocalDate lc = LocalDate.now();
        System.out.println(lc.format(DateTimeFormatter.ofPattern("dd/MM/yyyy")));
        System.out.println("Dia da semana: " + lc.getDayOfWeek());
        System.out.println("Dia do mês: " + lc.getDayOfMonth());
        System.out.println("Mês: " + lc.getMonth());
        System.out.println("Ano: " + lc.getYear());
    }
}
