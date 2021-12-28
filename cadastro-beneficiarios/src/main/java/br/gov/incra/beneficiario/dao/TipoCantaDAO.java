package br.gov.incra.beneficiario.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import br.gov.incra.beneficiario.model.TipoConta;
import br.gov.incra.beneficiario.utilitaries.Conexao;

public class TipoCantaDAO {
    public List<TipoConta> listar() throws ClassNotFoundException, SQLException {
        List<TipoConta> listTipoConta = new ArrayList<>();
        Connection conexao = Conexao.abrirConexao();

        String query = "select * from beneficiario.tipo_conta;";
        PreparedStatement preparedStatement = conexao.prepareStatement(query);
        ResultSet resultSet = preparedStatement.executeQuery();

        while(resultSet.next()) {
            TipoConta tipoConta = new TipoConta();
            tipoConta.setIdTipoConta(resultSet.getLong("id_tipo_conta"));
            tipoConta.setTipoConta(resultSet.getString("tipo_conta"));
            listTipoConta.add(tipoConta);
        }
        return listTipoConta;
    }
}
