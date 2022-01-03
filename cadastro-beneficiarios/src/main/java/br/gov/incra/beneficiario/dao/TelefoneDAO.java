package br.gov.incra.beneficiario.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import br.gov.incra.beneficiario.form.TelefoneForm;
import br.gov.incra.beneficiario.utilitaries.Conexao;

public class TelefoneDAO {
    public void cadastrar(TelefoneForm telefoneForm) throws ClassNotFoundException, SQLException {
        Connection conexao = Conexao.abrirConexao();
        String query = "insert into beneficiario.telefone(numero_telefone, telefone_ativo, cpf_beneficiario, id_tipo_telefone) "
        + "values (?,?,?,?);";
        PreparedStatement preparedStatement = conexao.prepareStatement(query);
        preparedStatement.setString(1, telefoneForm.getTelefone());
        preparedStatement.setBoolean(2, true);
        preparedStatement.setString(3, telefoneForm.getCpf());
        preparedStatement.setLong(4, telefoneForm.getIdTipoTelefone());

        preparedStatement.executeUpdate();
    } 
}
