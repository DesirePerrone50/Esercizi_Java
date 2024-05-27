package com.example.abbigliamento;

public class Vestito extends Abbigliamento {
    private String tipoManiche;
    private String colore;

    public Vestito(String materiale, String taglia, String tipoManiche, String colore) {
        super(materiale, taglia);
        this.tipoManiche = tipoManiche;
        this.colore = colore;
    }

    public String getTipoManiche() {
        return tipoManiche;
    }

    public void setTipoManiche(String tipoManiche) {
        this.tipoManiche = tipoManiche;
    }

    public String getColore() {
        return colore;
    }

    public void setColore(String colore) {
        this.colore = colore;
    }
}
