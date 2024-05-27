package com.example.abbigliamento;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;


@SpringBootApplication
public class AbbigliamentoApplication {

    public static void main(String[] args) {
        SpringApplication.run(AbbigliamentoApplication.class, args);
        Vestito mioVestito = new Vestito("Cotone", "M", "Corte", "Blu");
        Scarpe mieScarpe = new Scarpe("Pelle", "42", 9, "Gomma");

        System.out.println("Dettagli del vestito:");
        System.out.println("Materiale: " + mioVestito.getMateriale());
        System.out.println("Taglia: " + mioVestito.getTaglia());
        System.out.println("Tipo di maniche: " + mioVestito.getTipoManiche());
        System.out.println("Colore: " + mioVestito.getColore());

        System.out.println("\nDettagli delle scarpe:");
        System.out.println("Materiale: " + mieScarpe.getMateriale());
        System.out.println("Taglia: " + mieScarpe.getTaglia());
        System.out.println("Misura: " + mieScarpe.getMisura());
        System.out.println("Tipo di suola: " + mieScarpe.getTipoSuola());
    }

}
