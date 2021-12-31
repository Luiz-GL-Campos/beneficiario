package br.gov.incra.beneficiario.form;

import javax.servlet.http.HttpServletRequest;

public class EmailForm {
    private String email;
    private String cpf;

    public EmailForm(HttpServletRequest req, BeneficiarioForm beneficiarioForm) {
        this.email = (String) req.getAttribute("inputEmail");
        this.cpf = beneficiarioForm.getCpf();
    }

}
