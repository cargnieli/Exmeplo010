package com.local;

import java.time.LocalDate;

public class Exemplo010 {

    public static void main(String[] args) {

        LocalDate hoje = LocalDate.now();
        LocalDate ontem = hoje.minusDays(1);

        System.out.println("Hoje é dia: " + hoje);

        System.out.println("Ontem foi dia: " + ontem);


    }
}
