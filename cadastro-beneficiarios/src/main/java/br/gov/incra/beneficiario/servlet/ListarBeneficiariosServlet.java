package br.gov.incra.beneficiario.servlet;

import java.io.IOException;
import java.sql.SQLException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import br.gov.incra.beneficiario.model.Beneficiario;
import br.gov.incra.beneficiario.service.BeneficiarioService;

public class ListarBeneficiariosServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException{
        BeneficiarioService beneficiarioService = new BeneficiarioService();
        try {
            List<Beneficiario> listaBeneficiario = beneficiarioService.listar();
            req.setAttribute("beneficiarios", listaBeneficiario);
            req.getRequestDispatcher("listar-beneficiario.jsp").forward(req, resp);
        } catch (ClassNotFoundException | SQLException e) {
            e.printStackTrace();
        }
    }
}
