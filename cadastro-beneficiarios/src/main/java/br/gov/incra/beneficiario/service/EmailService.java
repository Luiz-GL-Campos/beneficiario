package br.gov.incra.beneficiario.service;

import java.sql.SQLException;

import br.gov.incra.beneficiario.dao.EmailDAO;
import br.gov.incra.beneficiario.form.EmailForm;

public class EmailService {
    public void cadastrar(EmailForm emailForm) throws ClassNotFoundException, SQLException{
        EmailDAO emailDAO = new EmailDAO();
        emailDAO.cadastrar(emailForm);
    }
}
