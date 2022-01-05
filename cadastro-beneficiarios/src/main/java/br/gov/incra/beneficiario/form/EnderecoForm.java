package br.gov.incra.beneficiario.form;

import javax.servlet.http.HttpServletRequest;

public class EnderecoForm {
    private String cep;
    private String bairro;
    private String endereco;
    private String numero;
    private Long estado;
    private Long idMunicipio;
    private String municipio;
    private String cpf;

    public EnderecoForm(HttpServletRequest req, BeneficiarioForm beneficiarioForm) {
        this.cep = req.getParameter("cep");
        this.bairro = req.getParameter("bairro");
        this.endereco = req.getParameter("endereco");
        this.numero = req.getParameter("numero");
        this.estado = Long.valueOf(req.getParameter("estado"));
        this.idMunicipio = Long.valueOf(req.getParameter("municipio"));
        this.municipio = req.getParameter("nomeMunicipio");
        this.cpf = beneficiarioForm.getCpf();
    }

    public String getCep() {
        return this.cep;
    }

    public String getBairro() {
        return this.bairro;
    }

    public String getEndereco() {
        return this.endereco;
    }

    public String getNumero() {
        return this.numero;
    }

    public Long getEstado() {
        return this.estado;
    }

    public Long getIdMunicipio() {
        return this.idMunicipio;
    }

    public String getMunicipio() {
        return this.municipio;
    }

    public String getCpf() {
        return this.cpf;
    }

}
