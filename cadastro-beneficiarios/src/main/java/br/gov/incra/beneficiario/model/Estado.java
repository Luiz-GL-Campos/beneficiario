package br.gov.incra.beneficiario.model;

public class Estado {
    Long idEstado;
    String siglaEstado;

    public Long getIdEstado() {
        return this.idEstado;
    }

    public void setIdEstado(Long idEstado) {
        this.idEstado = idEstado;
    }

    public String getSiglaEstado() {
        return this.siglaEstado;
    }

    public void setSiglaEstado(String siglaEstado) {
        this.siglaEstado = siglaEstado;
    }
}
