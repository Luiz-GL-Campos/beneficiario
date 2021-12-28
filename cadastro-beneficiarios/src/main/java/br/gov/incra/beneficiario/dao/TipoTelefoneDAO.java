package br.gov.incra.beneficiario.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import br.gov.incra.beneficiario.model.TipoTelefone;
import br.gov.incra.beneficiario.utilitaries.Conexao;

public class TipoTelefoneDAO {
    public List<TipoTelefone> listar() throws ClassNotFoundException, SQLException {
        List<TipoTelefone> listTipoTelefone = new ArrayList<>();
        Connection conexao = Conexao.abrirConexao();

        String query = "select * from beneficiario.tipo_telefone;";
        PreparedStatement preparedStatement = conexao.prepareStatement(query);
        ResultSet resultSet = preparedStatement.executeQuery();

        while(resultSet.next()) {
            TipoTelefone tipoTelefone = new TipoTelefone();
            tipoTelefone.setIdTipoTelefone(resultSet.getLong("id_tipo_telefone"));
            tipoTelefone.setDescricaoTipoTelefone(resultSet.getString("descricao_tipo_telefone"));
            listTipoTelefone.add(tipoTelefone);
        }
        return listTipoTelefone;
    }
}
