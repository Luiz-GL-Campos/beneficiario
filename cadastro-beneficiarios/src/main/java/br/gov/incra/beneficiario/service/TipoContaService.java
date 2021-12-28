package br.gov.incra.beneficiario.service;

import java.sql.SQLException;
import java.util.List;

import br.gov.incra.beneficiario.dao.TipoCantaDAO;
import br.gov.incra.beneficiario.model.TipoConta;

public class TipoContaService {
    public List<TipoConta> listar() throws ClassNotFoundException, SQLException {
        TipoCantaDAO tipoCantaDAO = new TipoCantaDAO();
        return tipoCantaDAO.listar();
    }
}
