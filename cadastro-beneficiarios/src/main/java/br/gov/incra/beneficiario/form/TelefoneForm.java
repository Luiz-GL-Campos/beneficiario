package br.gov.incra.beneficiario.form;

import javax.servlet.http.HttpServletRequest;

public class TelefoneForm {
    private Long idTipoTelefone;
    private String telefone;
    private String cpf;

    public TelefoneForm(HttpServletRequest req, BeneficiarioForm beneficiarioForm) {
        this.idTipoTelefone = (Long) req.getAttribute("selectTelefone");
        this.telefone = (String) req.getAttribute("telefone");
        this.cpf = beneficiarioForm.getCpf();
    }
}
