package br.gov.incra.beneficiario.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import br.gov.incra.beneficiario.form.BeneficiarioForm;
import br.gov.incra.beneficiario.model.Beneficiario;
import br.gov.incra.beneficiario.utilitaries.Conexao;

public class BeneficiarioDAO {
    public List<Beneficiario> listar() throws ClassNotFoundException, SQLException {
        List<Beneficiario> listBeneficiario = new ArrayList<>();
        Connection conexao = Conexao.abrirConexao();

        String query = "select nome_beneficiario, numero_rg_beneficiario, cpf_beneficiario, data_nascimento_beneficiario from beneficiario.beneficiario b;";
        PreparedStatement preparedStatement = conexao.prepareStatement(query);
        ResultSet resultSet = preparedStatement.executeQuery();

        while(resultSet.next()) {
            Beneficiario beneficiario = new Beneficiario();
            beneficiario.setNome(resultSet.getString("nome_beneficiario"));
            beneficiario.setRg(resultSet.getString("numero_rg_beneficiario"));
            beneficiario.setCpf(resultSet.getString("cpf_beneficiario")); 
            beneficiario.setDataNascimento(resultSet.getString("data_nascimento_beneficiario"));
            listBeneficiario.add(beneficiario);
        }
        return listBeneficiario;
    }

    public void cadastrar(BeneficiarioForm beneficiarioForm) throws ClassNotFoundException, SQLException {
        Connection conexao = Conexao.abrirConexao();
        String query = "insert into beneficiario.beneficiario (cpf_beneficiario, nome_beneficiario, data_nascimento_beneficiario, id_genero, id_escolaridade, numero_rg_beneficiario, orgao_emissor_rg, data_emissao_rg) "
        + "values (?,?,?,?,?,?,?,?)" ;
        PreparedStatement preparedStatement = conexao.prepareStatement(query);
        preparedStatement.setString(1, beneficiarioForm.getCpf());
        preparedStatement.setString(2, beneficiarioForm.getNomeCompleto());
        preparedStatement.setDate(3, beneficiarioForm.getDataNascimento());
        preparedStatement.setLong(4, beneficiarioForm.getIdGenero());
        preparedStatement.setLong(5, beneficiarioForm.getIdEscolaridade());
        preparedStatement.setString(6, beneficiarioForm.getRg());
        preparedStatement.setString(7, beneficiarioForm.getOrgaoEmissor());
        preparedStatement.setDate(8, beneficiarioForm.getDataEmissao());
    }
}
