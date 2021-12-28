package br.gov.incra.beneficiario.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import br.gov.incra.beneficiario.model.Estado;
import br.gov.incra.beneficiario.utilitaries.Conexao;

public class EstadoDAO {
    public List<Estado> listar() throws ClassNotFoundException, SQLException {
        List<Estado> listEstado = new ArrayList<>();
        Connection conexao = Conexao.abrirConexao();

        String query = "select id_estado, sigla_estado from beneficiario.estado;";
        PreparedStatement preparedStatement = conexao.prepareStatement(query);
        ResultSet resultSet = preparedStatement.executeQuery();

        while(resultSet.next()) {
            Estado estado = new Estado();
            estado.setIdEstado(resultSet.getLong("id_estado"));
            estado.setSiglaEstado(resultSet.getString("sigla_estado"));
            listEstado.add(estado);
        }
        return listEstado;
    }
}