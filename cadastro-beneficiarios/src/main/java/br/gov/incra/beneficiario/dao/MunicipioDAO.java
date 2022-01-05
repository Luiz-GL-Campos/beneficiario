package br.gov.incra.beneficiario.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import br.gov.incra.beneficiario.form.EnderecoForm;
import br.gov.incra.beneficiario.utilitaries.Conexao;

public class MunicipioDAO {
    public boolean deveCadastrarMunicipio() throws ClassNotFoundException, SQLException {
        Integer resultado = 0;
        Connection conexao = Conexao.abrirConexao();
        String query = "select count(*) from beneficiario.municipio where id_municipio = ?";
        PreparedStatement preparedStatement = conexao.prepareStatement(query);
        ResultSet resultSet = preparedStatement.executeQuery();
        if (resultSet.next()) {
          resultado = resultSet.getInt("COUNT");
        }
        return resultado == 0;
    
    }
    
    public void cadastrar(EnderecoForm enderecoForm) throws ClassNotFoundException, SQLException {
        Connection conexao = Conexao.abrirConexao();
        String query = "insert into beneficiario.municipio (id_municipio, nome_municipio, id_estado) values(?,?,?)";
    
        PreparedStatement preparedStatement = conexao.prepareStatement(query);
        preparedStatement.setLong(1, enderecoForm.getIdMunicipio());
        preparedStatement.setString(2, enderecoForm.getMunicipio());
        preparedStatement.setLong(3, enderecoForm.getEstado());

        preparedStatement.executeUpdate();
    }
}
