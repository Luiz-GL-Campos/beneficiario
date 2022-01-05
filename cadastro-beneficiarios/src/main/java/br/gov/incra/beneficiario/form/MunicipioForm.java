package br.gov.incra.beneficiario.form;

import javax.servlet.http.HttpServletRequest;

public class  MunicipioForm {
    private Long idMunicipio;
    private String nomeMunicipio;
    private Long idEstado;

    public MunicipioForm(HttpServletRequest req, EnderecoForm enderecoForm){
        this.idMunicipio = Long.valueOf(req.getParameter("municipio"));
        this.nomeMunicipio = req.getParameter("municipio");
        this.idEstado = enderecoForm.getEstado();
    }

    public Long getIdMunicipio() {
        return this.idMunicipio;
    }

    public String getNomeMunicipio() {
        return this.nomeMunicipio;
    }

    public Long getIdEstado() {
        return this.idEstado;
    }

}
