package com.example.abbigliamento;

public class Abbigliamento  {
    private String taglia;
    private String materiale;

    public Abbigliamento(String materiale, String taglia) {
        this.materiale = materiale;
        this.taglia = taglia;
    }

    // Altri metodi specifici per le scarpe, se necessario

    public String getTaglia() {
        return taglia;
    }

    public void setTaglia(String taglia) {
        this.taglia = taglia;
    }

    public String getMateriale() {
        return materiale;
    }

    public void setMateriale(String materiale) {
        this.materiale = materiale;
    }
}

