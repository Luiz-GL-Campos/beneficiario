package br.gov.incra.beneficiario.model;

public class Banco {
    Long codBanco;
    String nomeBanco;

    public Long getCodBanco() {
        return this.codBanco;
    }

    public void setCodBanco(Long codBanco) {
        this.codBanco = codBanco;
    }

    public String getNomeBanco() {
        return this.nomeBanco;
    }

    public void setNomeBanco(String nomeBanco) {
        this.nomeBanco = nomeBanco;
    }
}
