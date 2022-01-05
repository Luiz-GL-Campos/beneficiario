package br.gov.incra.beneficiario.form;

import javax.servlet.http.HttpServletRequest;

public class ContaForm {
    private Long idTipoConta;
    private String numeroConta;
    private String agencia;
    private Long codBanco;
    private String cpf;

    public ContaForm(HttpServletRequest req, BeneficiarioForm beneficiarioForm) {
        this.idTipoConta = Long.valueOf(req.getParameter("selectTipoConta"));
        this.numeroConta = req.getParameter("numeroConta");
        this.agencia = req.getParameter("agencia");
        this.codBanco = Long.valueOf(req.getParameter("selectBanco"));
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
