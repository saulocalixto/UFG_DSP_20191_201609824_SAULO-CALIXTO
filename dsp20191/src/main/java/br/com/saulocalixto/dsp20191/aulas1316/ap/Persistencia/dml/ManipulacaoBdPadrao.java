package br.com.saulocalixto.dsp20191.aulas1316.ap.Persistencia.dml;

import br.com.saulocalixto.dsp20191.aulas1316.ap.Persistencia.Base.PersistenciaJdbc;

import java.sql.SQLException;

public abstract class ManipulacaoBdPadrao<T> extends PersistenciaJdbc {
    protected T objeto;

    public ManipulacaoBdPadrao(T objeto)
    {
        this.objeto = objeto;
    }

    public boolean execute() {

        try {
            preparaPersistencia();

            String sql = comandoSqlParaExecutar();

            stmt.executeUpdate(sql);
            System.out.println("A operação na tabela " + nomeTabela() + " foi concluída sem erros.");
            stmt.close();
            connection.close();

            return true;
        } catch (SQLException e) {
            System.err.println("Ocorreu um erro ao rodar o script: " + e.getMessage());
            return false;
        }

    }

    protected abstract String comandoSqlParaExecutar();
    protected abstract String nomeTabela();
}
