package com.example.labirintosolver;

import java.util.Arrays;

public class RisolutoreLabirinto {
    private static final int N = 5; // Dimensione del labirinto (esempio: 5x5)
    private static char[][] labirinto = new char[N][N]; // Rappresentazione del labirinto (o 'o' per muro, ' ' per passaggio)

    // Esempio: inizializzazione del labirinto (personalizzalo con il tuo labirinto)
    static {
        // Esempio di labirinto:
        // o o o o o
        // o   o   o
        // o o o o o
        // o   o   o
        // o o o o o

        // Inizializza il labirinto con spazi vuoti
        for (int i = 0; i < N; i++) {
            Arrays.fill(labirinto[i], ' ');
        }

        // Imposta i muri (esempio: impostiamo i muri in posizioni specifiche)
        labirinto[1][1] = 'o';
        labirinto[1][3] = 'o';
        labirinto[3][1] = 'o';
        labirinto[3][3] = 'o';
    }
    }