package br.gov.incra.beneficiario.form;

import javax.servlet.http.HttpServletRequest;

public class ContaForm {
    private Long idTipoConta;
    private String numeroConta;
    private String agencia;
    private Long codBanco;
    private String cpf;

    public ContaForm(HttpServletRequest req, BeneficiarioForm beneficiarioForm) {
        this.idTipoConta = (Long) req.getAttribute("selectTipoConta");
        this.numeroConta = (String) req.getAttribute("numeroConta");
        this.agencia = (String) req.getAttribute("agencia");
        this.codBanco = (Long) req.getAttribute("selectBanco");
        this.cpf = beneficiarioForm.getCpf();
    }

    public Long getIdTipoConta() {
        return this.idTipoConta;
    }

    public String getNumeroConta() {
        return this.numeroConta;
    }

    public String getAgencia() {
        return this.agencia;
    }

    public Long getCodBanco() {
        return this.codBanco;
    }

    public String getCpf() {
        return this.cpf;
    }
}
