package br.gov.incra.beneficiario.service;

import java.sql.SQLException;
import java.util.List;

import br.gov.incra.beneficiario.dao.GeneroDAO;
import br.gov.incra.beneficiario.model.Genero;

public class GeneroService {
    public List<Genero> listar() throws ClassNotFoundException, SQLException{
        GeneroDAO generoDAO = new GeneroDAO();
        return generoDAO.listar();
    }
}
