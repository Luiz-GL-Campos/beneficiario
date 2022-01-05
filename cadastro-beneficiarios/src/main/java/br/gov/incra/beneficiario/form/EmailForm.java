package br.gov.incra.beneficiario.form;

import javax.servlet.http.HttpServletRequest;

public class EmailForm {
    private String email;
    private String cpf;

    public EmailForm(HttpServletRequest req, BeneficiarioForm beneficiarioForm) {
        this.email = req.getParameter("inputEmail");
        this.cpf = beneficiarioForm.getCpf();
    }

    public String getEmail() {
        return this.email;
    }

    public String getCpf() {
        return this.cpf;
    }

}
