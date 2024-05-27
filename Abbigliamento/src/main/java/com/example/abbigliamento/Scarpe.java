package com.example.abbigliamento;


public class Scarpe extends Abbigliamento {
    private int misura;
    private String tipoSuola;

    public Scarpe(String materiale, String taglia, int misura, String tipoSuola) {
        super(materiale, taglia);
        this.misura = misura;
        this.tipoSuola = tipoSuola;
    }

    public int getMisura() {
        return misura;
    }

    public void setMisura(int misura) {
        this.misura = misura;
    }

    public String getTipoSuola() {
        return tipoSuola;
    }

    public void setTipoSuola(String tipoSuola) {
        this.tipoSuola = tipoSuola;
    }
}

