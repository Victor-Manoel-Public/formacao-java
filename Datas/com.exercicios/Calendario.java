package com.exercicios;

import java.util.Calendar;

public class Calendario {
    public static void main(String[] args) {
        Calendar calendar = Calendar.getInstance();
        System.out.printf("Data de hoje: %s/%s/%s%n", calendar.get(Calendar.DAY_OF_MONTH), calendar.get(Calendar.MONTH), calendar.get(Calendar.YEAR) );
        System.out.printf("Hora: %d:%d:%d%n", calendar.get(Calendar.HOUR_OF_DAY), calendar.get(Calendar.MINUTE), calendar.get(Calendar.SECOND));

        System.out.println("Data completa (sem formatação): " + calendar.getTime());
    }
}
