package br.gov.incra.beneficiario.model;

public class Genero {
    Long idGenero;
    String tipoGenero;

    public Long getIdGenero() {
        return this.idGenero;
    }

    public void setIdGenero(Long idGenero) {
        this.idGenero = idGenero;
    }

    public String getTipoGenero() {
        return this.tipoGenero;
    }

    public void setTipoGenero(String tipoGenero) {
        this.tipoGenero = tipoGenero;
    }
}
