package br.gov.incra.beneficiario.service;

import java.sql.SQLException;
import java.util.List;

import br.gov.incra.beneficiario.dao.EstadoDAO;
import br.gov.incra.beneficiario.model.Estado;

public class EstadoService {
    public List<Estado> listar() throws ClassNotFoundException, SQLException {
        EstadoDAO estadoDAO = new EstadoDAO();
        return estadoDAO.listar();
    }
}
