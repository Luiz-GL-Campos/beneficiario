package br.gov.incra.beneficiario.service;

import java.sql.SQLException;
import java.util.List;

import br.gov.incra.beneficiario.dao.TipoTelefoneDAO;
import br.gov.incra.beneficiario.model.TipoTelefone;

public class TipoTelefoneService {
    public List<TipoTelefone> listar() throws ClassNotFoundException, SQLException {
        TipoTelefoneDAO tipoTelefoneDAO = new TipoTelefoneDAO();
        return tipoTelefoneDAO.listar();
    }
}
