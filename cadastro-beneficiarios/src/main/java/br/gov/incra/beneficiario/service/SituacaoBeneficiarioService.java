package br.gov.incra.beneficiario.service;

import java.sql.SQLException;

import br.gov.incra.beneficiario.dao.SituacaoBeneficiarioDAO;
import br.gov.incra.beneficiario.enums.SituacaoBeneficiarioEnum;
import br.gov.incra.beneficiario.form.BeneficiarioForm;

public class SituacaoBeneficiarioService {
    public void cadastrar(BeneficiarioForm beneficiarioForm, SituacaoBeneficiarioEnum situacaoEnum) throws ClassNotFoundException, SQLException{
        SituacaoBeneficiarioDAO situacaoBeneficiarioDAO = new SituacaoBeneficiarioDAO();
        situacaoBeneficiarioDAO.deveCadastrarSituacaoBeneficiario(beneficiarioForm, situacaoEnum);
    }
}