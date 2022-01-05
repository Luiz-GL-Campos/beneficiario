package br.gov.incra.beneficiario.form;

import java.sql.Date;

import javax.servlet.http.HttpServletRequest;

public class BeneficiarioForm {
    private String nomeCompleto;
    private Date dataNascimento;
    private String cpf;
    private String rg;

    private String orgaoEmissor;
    private Date dataEmissao;
    private Long idGenero;
    private Long idEscolaridade;
    
    public BeneficiarioForm(HttpServletRequest req) {
        System.out.println(req.getParameter("nomeCompleto"));
        this.nomeCompleto = req.getParameter("nomeCompleto");
        this.dataNascimento = Date.valueOf(req.getParameter("dataNascimento"));
        this.cpf = req.getParameter("cpf");
        this.rg = req.getParameter("rg");
        this.orgaoEmissor = req.getParameter("orgaoEmissor");
        System.out.println(req.getParameter("dataEmissao"));
        this.dataEmissao = req.getParameter("dataEmissao").isBlank() ? Date.valueOf(req.getParameter("dataEmissao")) : null;
        this.idGenero = Long.valueOf(req.getParameter("selectGenero"));
        this.idEscolaridade = Long.valueOf(req.getParameter("selectNEscolaridade"));
    }
    
    public String getCpf() {
        return cpf;
    }

    public String getNomeCompleto() {
        return this.nomeCompleto;
    }
    
    public Date getDataNascimento() {
        return this.dataNascimento;
    }
    
    public String getRg() {
        return this.rg;
    }
    
    public String getOrgaoEmissor() {
        return this.orgaoEmissor;
    }
    
    public Date getDataEmissao() {
        return this.dataEmissao;
    }
    
    public Long getIdGenero() {
        return this.idGenero;
    }
    
    public Long getIdEscolaridade() {
        return this.idEscolaridade;
    }
}
