package br.gov.incra.beneficiario.service;

import java.sql.SQLException;

import br.gov.incra.beneficiario.dao.EnderecoDAO;
import br.gov.incra.beneficiario.form.EnderecoForm;

public class EnderecoService {
    public void cadastrar(EnderecoForm enderecoForm) throws ClassNotFoundException, SQLException{
        EnderecoDAO enderecoDAO = new EnderecoDAO();
        enderecoDAO.cadastrar(enderecoForm);
    }
}
