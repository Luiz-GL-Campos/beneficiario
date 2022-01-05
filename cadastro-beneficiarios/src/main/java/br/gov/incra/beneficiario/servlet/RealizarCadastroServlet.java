package br.gov.incra.beneficiario.servlet;

import java.io.IOException;
import java.sql.SQLException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import br.gov.incra.beneficiario.enums.SituacaoBeneficiarioEnum;
import br.gov.incra.beneficiario.form.BeneficiarioForm;
import br.gov.incra.beneficiario.form.ContaForm;
import br.gov.incra.beneficiario.form.EmailForm;
import br.gov.incra.beneficiario.form.EnderecoForm;
import br.gov.incra.beneficiario.form.TelefoneForm;
import br.gov.incra.beneficiario.service.BeneficiarioService;
import br.gov.incra.beneficiario.service.ContaService;
import br.gov.incra.beneficiario.service.EmailService;
import br.gov.incra.beneficiario.service.EnderecoService;
import br.gov.incra.beneficiario.service.MunicipioService;
import br.gov.incra.beneficiario.service.SituacaoBeneficiarioService;
import br.gov.incra.beneficiario.service.TelefoneService;

public class RealizarCadastroServlet extends HttpServlet{
    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException{
        System.out.println("Cadastrando...");

        BeneficiarioForm beneficiarioForm = new BeneficiarioForm(req);
        EmailForm emailForm = new EmailForm(req, beneficiarioForm);
        TelefoneForm telefoneForm = new TelefoneForm(req, beneficiarioForm);
        EnderecoForm enderecoForm = new EnderecoForm(req, beneficiarioForm);
        ContaForm contaForm = new ContaForm(req, beneficiarioForm);
        
        BeneficiarioService beneficiarioService = new BeneficiarioService();
        EmailService emailService = new EmailService();
        TelefoneService telefoneService = new TelefoneService();
        EnderecoService enderecoService = new EnderecoService();
        MunicipioService municipioService = new MunicipioService();
        ContaService contaService = new ContaService();
        SituacaoBeneficiarioService situacaoBeneficiarioService = new SituacaoBeneficiarioService();

        try{
            beneficiarioService.cadastrar(beneficiarioForm);
            emailService.cadastrar(emailForm);
            telefoneService.cadastrar(telefoneForm);
            enderecoService.cadastrar(enderecoForm);
            municipioService.cadastrar(enderecoForm);
            contaService.cadastrar(contaForm);
            situacaoBeneficiarioService.cadastrar(beneficiarioForm, SituacaoBeneficiarioEnum.AGUARDANDO_APROVACAO);

        }catch(ClassNotFoundException | SQLException e){
            e.printStackTrace();
        }
        req.getRequestDispatcher("/").forward(req, resp);
    }
}