package br.gov.incra.beneficiario.service;

import java.sql.SQLException;

import br.gov.incra.beneficiario.dao.ContaDAO;
import br.gov.incra.beneficiario.form.ContaForm;

public class ContaService {
    public void cadastrar(ContaForm contaForm) throws ClassNotFoundException, SQLException{
        ContaDAO contaDAO = new ContaDAO();
        contaDAO.cadastrar(contaForm);
    }
}
