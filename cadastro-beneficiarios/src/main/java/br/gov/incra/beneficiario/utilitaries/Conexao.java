package br.gov.incra.beneficiario.utilitaries;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Conexao {
    public static Connection abrirConexao() throws ClassNotFoundException, SQLException {
        Class.forName("org.postgresql.Driver");
        Connection connection = DriverManager
            .getConnection("jdbc:postgresql://localhost:5434/db_beneficiario", "beneficiario_web", "1234");
        return connection;
    }
}
