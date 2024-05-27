package com.example.labirintosolver;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.ArrayList;
import java.util.List;

public class LabirintoSolver {

    public List<int[]> risolviLabirinto(int[][] labirinto, int startX, int startY, int endX, int endY) {
        // Verifica se le coordinate di partenza e arrivo sono valide
        if (!isValidCoordinate(labirinto, startX, startY) || !isValidCoordinate(labirinto, endX, endY)) {
            throw new IllegalArgumentException("Coordinate di partenza o arrivo non valide.");
        }

        List<int[]> soluzione = new ArrayList<>();
        boolean[][] visitato = new boolean[labirinto.length][labirinto[0].length];

        // Avvia la ricerca del percorso
        dfs(labirinto, startX, startY, endX, endY, visitato, soluzione);

        return soluzione;
    }

    private void dfs(int[][] labirinto, int x, int y, int endX, int endY, boolean[][] visitato, List<int[]> soluzione) {
        // Controlla se abbiamo raggiunto il punto di arrivo
        if (x == endX && y == endY) {
            soluzione.add(new int[]{x, y});
            return;
        }

        // Segna la cella corrente come visitata
        visitato[x][y] = true;

        // Direzioni possibili: su, giù, sinistra, destra
        int[][] direzioni = {{-1, 0}, {1, 0}, {0, -1}, {0, 1}};

        for (int[] dir : direzioni) {
            int newX = x + dir[0];
            int newY = y + dir[1];

            if (isValidCoordinate(labirinto, newX, newY) && !visitato[newX][newY]) {
                dfs(labirinto, newX, newY, endX, endY, visitato, soluzione);
                if (!soluzione.isEmpty()) {
                    // Aggiungi la cella corrente solo se abbiamo trovato una soluzione
                    soluzione.add(0, new int[]{x, y});
                    return;
                }
            }
        }
    }

    private boolean isValidCoordinate(int[][] labirinto, int x, int y) {
        return x >= 0 && x < labirinto.length && y >= 0 && y < labirinto[0].length && labirinto[x][y] == 0;
    }

    public static void main(String[] args) {
        // Esempio di utilizzo
        int[][] labirinto = {
                {1, 1, 1, 1, 1},
                {1, 0, 0, 0, 1},
                {1, 1, 1, 0, 1},
                {1, 0, 0, 0, 1}};
    }
}
