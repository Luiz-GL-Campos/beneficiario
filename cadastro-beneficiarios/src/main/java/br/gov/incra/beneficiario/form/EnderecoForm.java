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
        this.cep = (String) req.getAttribute("cep");
        this.bairro = (String) req.getAttribute("bairro");
        this.endereco = (String) req.getAttribute("endereco");
        this.numero = (String) req.getAttribute("numero");
        this.estado = (Long) req.getAttribute("estado");
        this.idMunicipio = (Long) req.getAttribute("municipio");
        this.municipio = (String) req.getAttribute("nomeMunicipio");
        this.cpf = beneficiarioForm.getCpf();
    }
}
