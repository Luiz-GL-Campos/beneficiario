package br.gov.incra.beneficiario.service;

import java.sql.SQLException;
import java.util.List;

import br.gov.incra.beneficiario.dao.NivelEscolaridadeDAO;
import br.gov.incra.beneficiario.model.NivelEscolaridade;

public class NivelEscolaridadeService {
    public List<NivelEscolaridade> listar() throws ClassNotFoundException, SQLException {
        NivelEscolaridadeDAO nivelEscolaridadeDAO = new NivelEscolaridadeDAO();
        return nivelEscolaridadeDAO.listar();
    }
}
