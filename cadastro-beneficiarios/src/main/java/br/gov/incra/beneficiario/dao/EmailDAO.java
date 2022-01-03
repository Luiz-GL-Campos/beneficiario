package br.gov.incra.beneficiario.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import br.gov.incra.beneficiario.form.EmailForm;
import br.gov.incra.beneficiario.utilitaries.Conexao;

public class EmailDAO {
   public void cadastrar(EmailForm emailForm) throws ClassNotFoundException, SQLException{
      Connection conexao = Conexao.abrirConexao();
      String query = "insert into beneficiario.email(enderenco_email, cpf_beneficiario) "
      + "values(?,?);";
      PreparedStatement preparedStatement = conexao.prepareStatement(query);
      preparedStatement.setString(1, emailForm.getEmail());
      preparedStatement.setString(2, emailForm.getCpf());

      preparedStatement.executeUpdate();
   } 
}
