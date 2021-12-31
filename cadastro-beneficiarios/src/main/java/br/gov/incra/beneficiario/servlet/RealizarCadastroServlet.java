package br.gov.incra.beneficiario.servlet;

import java.io.IOException;
import java.time.LocalDate;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class RealizarCadastroServlet extends HttpServlet{
    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException{
        String nomeCompleto = (String) req.getAttribute("nome");
        LocalDate dataNascimento = (LocalDate) req.getAttribute("dataNascimento");
        String cpf = (String) req.getAttribute("cpf");
        String rg = (String) req.getAttribute("rg");
        String orgaoEmissor = (String) req.getAttribute("orgaoEmissor");
        LocalDate dataEmissao = (LocalDate) req.getAttribute("dataEmissao");
        Long idGenero = (Long) req.getAttribute("selectGenero");
        Long idEscolaridade = (Long) req.getAttribute("selectNEscolaridade");
        Long idTipoTelefone = (Long) req.getAttribute("selectTelefone");
        String telefone = (String) req.getAttribute("telefone");
        String email = (String) req.getAttribute("inputEmail");
        String cep = (String) req.getAttribute("cep");
        Long estado = (Long) req.getAttribute("estado");
        String municipio = (String) req.getAttribute("municipio");
        String bairro = (String) req.getAttribute("bairro");
        String endereco = (String) req.getAttribute("endereco");
        String numero = (String) req.getAttribute("numero");
        Long banco = (Long) req.getAttribute("selectBanco");
        String agencia = (String) req.getAttribute("agencia");
        String numeroConta = (String) req.getAttribute("numeroConta");
        Long idTipoConta = (Long) req.getAttribute("selectTipoConta");
    }
}