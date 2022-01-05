package br.gov.incra.beneficiario.servlet;

import java.io.IOException;
import java.sql.SQLException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import br.gov.incra.beneficiario.model.Banco;
import br.gov.incra.beneficiario.model.Estado;
import br.gov.incra.beneficiario.model.Genero;
import br.gov.incra.beneficiario.model.NivelEscolaridade;
import br.gov.incra.beneficiario.model.TipoConta;
import br.gov.incra.beneficiario.model.TipoTelefone;
import br.gov.incra.beneficiario.service.BancoService;
import br.gov.incra.beneficiario.service.EstadoService;
import br.gov.incra.beneficiario.service.GeneroService;
import br.gov.incra.beneficiario.service.NivelEscolaridadeService;
import br.gov.incra.beneficiario.service.TipoContaService;
import br.gov.incra.beneficiario.service.TipoTelefoneService;

public class IniciarCadastroServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        GeneroService generoService = new GeneroService();
        NivelEscolaridadeService nivelEscolaridadeService = new NivelEscolaridadeService();
        TipoTelefoneService tipoTelefoneService = new TipoTelefoneService();
        EstadoService estadoService = new EstadoService();
        BancoService bancoService = new BancoService();
        TipoContaService tipoContaService = new TipoContaService();

        try {
            List<Genero> listaGenero = generoService.listar();
            List<NivelEscolaridade> listaNivelEscolaridade = nivelEscolaridadeService.listar();
            List<TipoTelefone> listaTipoTelefone = tipoTelefoneService.listar();
            List<Estado> listaEstado = estadoService.listar();
            List<Banco> listaBanco = bancoService.listar();
            List<TipoConta> listaTipoConta = tipoContaService.listar();

            req.setAttribute("generos", listaGenero);
            req.setAttribute("escolaridades", listaNivelEscolaridade);
            req.setAttribute("tiposTelefone", listaTipoTelefone);
            req.setAttribute("estados", listaEstado);
            req.setAttribute("bancos", listaBanco);
            req.setAttribute("tiposConta", listaTipoConta);

            req.getRequestDispatcher("pages/cadastrar.jsp").forward(req, resp);
            
        } catch (ClassNotFoundException | SQLException e) {
            e.printStackTrace();
        }
    }
}
