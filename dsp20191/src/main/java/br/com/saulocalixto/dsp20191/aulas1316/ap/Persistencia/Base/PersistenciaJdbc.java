package br.com.saulocalixto.dsp20191.aulas1316.ap.Persistencia.Base;

import br.com.saulocalixto.dsp20191.aulas1316.ap.Exceptions.InvalidDataBaseTypeException;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;

public class PersistenciaJdbc {
    protected Connection connection = null;
    protected Statement stmt = null;
    protected CriaConexao criaConexao = new CriaConexao();
    protected String connectionType = "file";

    protected void preparaPersistencia() {

        try {

            //STEP 3: Open a connection
            connection = criaConexao.getConnection(connectionType);
            //STEP 4: Execute a SQL statement
            stmt = connection.createStatement();

        } catch (InvalidDataBaseTypeException e) {
            System.err.println("Erro ao tentar abrir conexão com o banco " + e.getMessage());
        } catch (SQLException e) {
            System.err.println("Erro na operação sql " + e.getMessage());
        }
    }
}