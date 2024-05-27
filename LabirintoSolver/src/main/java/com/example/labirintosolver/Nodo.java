package com.example.labirintosolver;
import java.util.*;

public class Nodo {
    private int x;
    private int y;
    private boolean isWall; // Indica se la cella è un muro

    public Nodo(int x, int y, boolean isWall) {
        this.x = x;
        this.y = y;
        this.isWall = isWall;
    }

    // Getter e setter per x, y e isWall

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

    public boolean isWall() {
        return isWall;
    }

    public void setWall(boolean wall) {
        isWall = wall;
    }
}
