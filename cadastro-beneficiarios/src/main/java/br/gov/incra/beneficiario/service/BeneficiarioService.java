package br.gov.incra.beneficiario.service;

import java.sql.SQLException;
import java.util.List;

import br.gov.incra.beneficiario.dao.BeneficiarioDAO;
import br.gov.incra.beneficiario.form.BeneficiarioForm;
import br.gov.incra.beneficiario.model.Beneficiario;

public class BeneficiarioService {

    public List<Beneficiario> listar() throws ClassNotFoundException, SQLException{
        BeneficiarioDAO beneficiarioDAO = new BeneficiarioDAO();
        return beneficiarioDAO.listar();
    }

    public void cadastrar(BeneficiarioForm beneficiarioForm) throws ClassNotFoundException, SQLException{
        BeneficiarioDAO beneficiarioDAO = new BeneficiarioDAO();
        beneficiarioDAO.cadastrar(beneficiarioForm);
    }
}
