package br.gov.incra.beneficiario.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import br.gov.incra.beneficiario.enums.SituacaoBeneficiarioEnum;
import br.gov.incra.beneficiario.form.BeneficiarioForm;
import br.gov.incra.beneficiario.utilitaries.Conexao;

public class SituacaoBeneficiarioDAO {
    public void deveCadastrarSituacaoBeneficiario(BeneficiarioForm beneficiarioForm, SituacaoBeneficiarioEnum situacaoEnum) throws ClassNotFoundException, SQLException {
        Connection conexao = Conexao.abrirConexao();
        String query = "insert into beneficiario.situacao_beneficiario(id_situacao, cpf_beneficiario) values (?,?);";

        PreparedStatement preparedStatement = conexao.prepareStatement(query);
        preparedStatement.setLong(1, SituacaoBeneficiarioEnum.AGUARDANDO_APROVACAO.getId());
        preparedStatement.setString(2, beneficiarioForm.getCpf());

        preparedStatement.executeUpdate();
    }
}
