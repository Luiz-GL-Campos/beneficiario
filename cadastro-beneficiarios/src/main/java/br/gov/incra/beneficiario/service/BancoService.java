package br.gov.incra.beneficiario.service;

import java.sql.SQLException;
import java.util.List;

import br.gov.incra.beneficiario.dao.BancoDAO;
import br.gov.incra.beneficiario.model.Banco;

public class BancoService {
    public List<Banco> listar() throws ClassNotFoundException, SQLException {
        BancoDAO bancoDAO = new BancoDAO();
        return bancoDAO.listar();
    }
}
