package br.gov.incra.beneficiario.form;

import javax.servlet.http.HttpServletRequest;

public class ContaForm {
    private Long idTipoConta;
    private String numeroConta;
    private String agencia;
    private Long banco;
    private String cpf;

    public ContaForm(HttpServletRequest req, BeneficiarioForm beneficiarioForm) {
        this.idTipoConta = (Long) req.getAttribute("selectTipoConta");
        this.numeroConta = (String) req.getAttribute("numeroConta");
        this.agencia = (String) req.getAttribute("agencia");
        this.banco = (Long) req.getAttribute("selectBanco");
        this.cpf = beneficiarioForm.getCpf();
    }
    
}
