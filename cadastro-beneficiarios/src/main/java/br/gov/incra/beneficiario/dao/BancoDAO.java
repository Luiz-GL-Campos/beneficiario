package br.gov.incra.beneficiario.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import br.gov.incra.beneficiario.model.Banco;
import br.gov.incra.beneficiario.utilitaries.Conexao;

public class BancoDAO {
    public List<Banco> listar() throws ClassNotFoundException, SQLException {
        List<Banco> listEstado = new ArrayList<>();
        Connection conexao = Conexao.abrirConexao();

        String query = "select * from beneficiario.banco;";
        PreparedStatement preparedStatement = conexao.prepareStatement(query);
        ResultSet resultSet = preparedStatement.executeQuery();

        while(resultSet.next()) {
            Banco banco = new Banco();
            banco.setCodBanco(resultSet.getLong("cod_banco"));
            banco.setNomeBanco(resultSet.getString("nome_banco"));
            listEstado.add(banco);
        }
        return listEstado;
    }
}
