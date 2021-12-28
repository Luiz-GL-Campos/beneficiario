package br.gov.incra.beneficiario.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import br.gov.incra.beneficiario.model.Genero;
import br.gov.incra.beneficiario.utilitaries.Conexao;

public class GeneroDAO {
    public List<Genero> listar() throws ClassNotFoundException, SQLException {
        List<Genero> listGenero = new ArrayList<>();
        Connection conexao = Conexao.abrirConexao();

        String query = "select * from beneficiario.genero;";
        PreparedStatement preparedStatement = conexao.prepareStatement(query);
        ResultSet resultSet = preparedStatement.executeQuery();

        while(resultSet.next()) {
            Genero genero = new Genero();
            genero.setIdGenero(resultSet.getLong("id_genero"));
            genero.setTipoGenero(resultSet.getString("tipo_genero"));
            listGenero.add(genero);
        }
        return listGenero;
    }
}
