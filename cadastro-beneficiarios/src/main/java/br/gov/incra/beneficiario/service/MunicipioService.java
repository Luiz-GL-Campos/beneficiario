package br.gov.incra.beneficiario.service;

import java.sql.SQLException;

import br.gov.incra.beneficiario.dao.MunicipioDAO;
import br.gov.incra.beneficiario.form.EnderecoForm;

public class MunicipioService {
    public void cadastrar(EnderecoForm enderecoForm) throws ClassNotFoundException, SQLException {
        MunicipioDAO municipioDAO = new MunicipioDAO();
        municipioDAO.cadastrar(enderecoForm);
    }
}
