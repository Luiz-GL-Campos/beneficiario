package br.gov.incra.beneficiario.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import br.gov.incra.beneficiario.form.EnderecoForm;
import br.gov.incra.beneficiario.utilitaries.Conexao;

public class EnderecoDAO {
    public void cadastrar(EnderecoForm enderecoForm) throws ClassNotFoundException, SQLException {
        Connection conexao = Conexao.abrirConexao();
        String query = "insert into beneficiario.endereco(cep, bairro, endereco, endereco_ativo, numero, cpf_beneficiario, id_municipio) "
        + "values (?,?,?,?,?,?,?);";
        PreparedStatement preparedStatement = conexao.prepareStatement(query);
        preparedStatement.setString(1, enderecoForm.getCep());
        preparedStatement.setString(2, enderecoForm.getBairro());
        preparedStatement.setString(3, enderecoForm.getEndereco());
        preparedStatement.setBoolean(4, true);
        preparedStatement.setString(5, enderecoForm.getNumero());
        preparedStatement.setString(6, enderecoForm.getCpf());
        preparedStatement.setLong(7, enderecoForm.getIdMunicipio());

        preparedStatement.executeUpdate();
    }
}
