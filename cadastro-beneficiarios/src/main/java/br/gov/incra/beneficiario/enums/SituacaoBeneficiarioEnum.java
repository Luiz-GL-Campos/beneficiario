package br.gov.incra.beneficiario.enums;

public enum SituacaoBeneficiarioEnum {
    AGUARDANDO_APROVACAO(1L, "Aguardando Aprovação"), 
    APROVADO(2L, "Aprovado"), 
    AGUARDANDO_LIBERACAO_DE_CREDITO(3L, "Aguardando Liberação de Crédito"), 
    CREDITO_LIBERADO(4L, "Crédito Liberado");

    private final String descricao;
    private final Long id;

    private SituacaoBeneficiarioEnum(Long id, String descricao) {
        this.id = id;
        this.descricao = descricao;
    }

    public Long getId(){
        return id;
    }

    public String descricao(){
        return descricao;
    }
}
