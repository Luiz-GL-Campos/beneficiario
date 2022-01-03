package br.gov.incra.beneficiario.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import br.gov.incra.beneficiario.form.ContaForm;
import br.gov.incra.beneficiario.utilitaries.Conexao;

public class ContaDAO {
    public void cadastrar(ContaForm contaForm) throws ClassNotFoundException, SQLException {
        Connection conexao = Conexao.abrirConexao();
        String query = "insert into beneficiario.conta(agencia, numero_conta, id_tipo_conta, cod_banco, cpf_beneficiario) "
        + "values (?,?,?,?,?);";
        PreparedStatement preparedStatement = conexao.prepareStatement(query);
        preparedStatement.setString(1, contaForm.getAgencia());
        preparedStatement.setString(2, contaForm.getNumeroConta());
        preparedStatement.setLong(3, contaForm.getIdTipoConta());
        preparedStatement.setLong(4, contaForm.getCodBanco());
        preparedStatement.setString(5, contaForm.getCpf());

        preparedStatement.executeUpdate();
    }
}
