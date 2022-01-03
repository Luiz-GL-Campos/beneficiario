package br.gov.incra.beneficiario.service;

import java.sql.SQLException;

import br.gov.incra.beneficiario.dao.TelefoneDAO;
import br.gov.incra.beneficiario.form.TelefoneForm;

public class TelefoneService {
    public void cadastrar(TelefoneForm telefoneForm) throws ClassNotFoundException, SQLException {
        TelefoneDAO telefoneDAO = new TelefoneDAO();
        telefoneDAO.cadastrar(telefoneForm);
    }
}
