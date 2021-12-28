package br.gov.incra.beneficiario.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import br.gov.incra.beneficiario.model.NivelEscolaridade;
import br.gov.incra.beneficiario.utilitaries.Conexao;

public class NivelEscolaridadeDAO {
    public List<NivelEscolaridade> listar() throws ClassNotFoundException, SQLException {
        List<NivelEscolaridade> listNivelEscolaridade = new ArrayList<>();
        Connection conexao = Conexao.abrirConexao();

        String query = "select * from beneficiario.escolaridade;";
        PreparedStatement preparedStatement = conexao.prepareStatement(query);
        ResultSet resultSet = preparedStatement.executeQuery();

        while(resultSet.next()){
            NivelEscolaridade nivelEscolaridade = new NivelEscolaridade();
            nivelEscolaridade.setIdEscolaridade(resultSet.getLong("id_escolaridade"));
            nivelEscolaridade.setNivelEscolaridade(resultSet.getString("nivel_escolaridade"));
            listNivelEscolaridade.add(nivelEscolaridade);
        }
        return listNivelEscolaridade;
    }
}
