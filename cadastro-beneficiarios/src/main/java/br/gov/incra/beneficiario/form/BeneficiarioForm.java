package br.gov.incra.beneficiario.form;

import java.time.LocalDate;

import javax.servlet.http.HttpServletRequest;

public class BeneficiarioForm {
    private String nomeCompleto;
    private LocalDate dataNascimento;
    private String cpf;
    private String rg;

    private String orgaoEmissor;
    private LocalDate dataEmissao;
    private Long idGenero;
    private Long idEscolaridade;
    
    public BeneficiarioForm(HttpServletRequest req) {
        this.nomeCompleto = (String) req.getAttribute("nome");
        this.dataNascimento = (LocalDate) req.getAttribute("dataNascimento");
        this.cpf = (String) req.getAttribute("cpf");
        this.rg = (String) req.getAttribute("rg");
        this.orgaoEmissor = (String) req.getAttribute("orgaoEmissor");
        this.dataEmissao = (LocalDate) req.getAttribute("dataEmissao");
        this.idGenero = (Long) req.getAttribute("selectGenero");
        this.idEscolaridade = (Long) req.getAttribute("selectNEscolaridade");
    }
    
    public String getCpf() {
        return cpf;
    }

    public String getNomeCompleto() {
        return this.nomeCompleto;
    }
    
    public LocalDate getDataNascimento() {
        return this.dataNascimento;
    }
    
    public String getRg() {
        return this.rg;
    }
    
    public String getOrgaoEmissor() {
        return this.orgaoEmissor;
    }
    
    public LocalDate getDataEmissao() {
        return this.dataEmissao;
    }
    
    public Long getIdGenero() {
        return this.idGenero;
    }
    
    public Long getIdEscolaridade() {
        return this.idEscolaridade;
    }
}
