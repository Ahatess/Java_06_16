package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        //Parašyti metodą kuris patikrina ar per parametrus paduotame žodyje yra raidžių
        //derinių “ab”. Prieš atliekant veiksmus patikrinti ar paduotas žodis yra tinkamas, jei ne,
        //grąžinti 0. Užuomina: radus “a” raidę, tikrinti ar tai nėra paskutinė žodžio raidė, ir jeigu
        //ne, tuomet tikrinti ar sekanti raidė (i + 1) yra “b”.
        Main objektas = new Main();
        //paprasyti ivesti zodi
        System.out.println("Iveskite zodi, ieskosime ab kombinaciju kiekio");
        //nuskaityti ivesta zodi
        Scanner sc = new Scanner(System.in);
        String zodis = sc.nextLine();
        int kiekis = 0;
        boolean arSkaicius = false;
        try {
            Float.parseFloat(zodis);
            arSkaicius = false;
            System.out.println("Ivedete skaiciu");

        } catch (Exception klaida) {
            arSkaicius = true;
        }
        if (arSkaicius == true) {
            abpaieska(zodis, kiekis);


        }
    }

    public static void abpaieska(String zodis, int kiekis) {
        try {
            for (int i = 0; i < zodis.length(); i++) {
                char raidePirma = zodis.charAt(i);
                if (raidePirma == 'a' || raidePirma == 'A' && zodis.charAt(i) < zodis.length()) {
                    i++;
                    char raideAntra = zodis.charAt(i);
                    if (raideAntra == 'b' || raideAntra == 'B' && zodis.charAt(i) < zodis.length()) {
                        kiekis++;

                    }
                }
            }
        } catch (Exception klaida) {
            System.out.println("A paskutinė raidė");
        }
        System.out.println("Ivestu raidziu ab kiekis yra: " + kiekis);
    }
}
