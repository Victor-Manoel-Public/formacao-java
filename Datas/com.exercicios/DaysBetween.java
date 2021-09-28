package com.exercicios;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

public class DaysBetween {
    public static void main(String[] args) {
        // contador de tempo a partir de uma data ate o dia atual
        long diasPassados = ChronoUnit.DAYS.between(LocalDate.parse("2000-10-28"), LocalDate.now());
        System.out.printf("Passaram-se %d dias desde 28/10/2018 até hoje.", diasPassados);
    }
}
