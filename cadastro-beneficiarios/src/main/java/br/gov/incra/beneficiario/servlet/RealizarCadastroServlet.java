package br.gov.incra.beneficiario.servlet;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import br.gov.incra.beneficiario.form.BeneficiarioForm;
import br.gov.incra.beneficiario.form.ContaForm;
import br.gov.incra.beneficiario.form.EmailForm;
import br.gov.incra.beneficiario.form.EnderecoForm;
import br.gov.incra.beneficiario.form.TelefoneForm;

public class RealizarCadastroServlet extends HttpServlet{
    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException{
        System.out.println("Cadastrando...");
        BeneficiarioForm beneficiarioForm = new BeneficiarioForm(req);
        EmailForm emailForm = new EmailForm(req, beneficiarioForm);
        TelefoneForm telefoneForm = new TelefoneForm(req, beneficiarioForm);
        EnderecoForm enderecoForm = new EnderecoForm(req, beneficiarioForm);
        ContaForm contaForm = new ContaForm(req, beneficiarioForm);
    }
}