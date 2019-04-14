package br.com.saulocalixto.dsp20191.aulas1316.ap.Persistencia.dml.consulte;

import br.com.saulocalixto.dsp20191.aulas1316.ap.Persistencia.Base.PersistenciaJdbc;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public abstract class ConsultePadrao<T> extends PersistenciaJdbc {

    protected T objeto;

    public T consultaPorId(long id) {
        try {
            preparaPersistencia();

            String sql = comandoSqlParaExecutar();
            PreparedStatement pstmt = connection.prepareStatement(sql);
            pstmt.setLong(1,id);

            ExecuteEFecheConexao(pstmt);
        } catch (SQLException e) {
            System.err.println("Ocorreu um erro ao rodar o script: " + e.getMessage());
        } finally {
            return objeto;
        }
    }

    protected void ExecuteEFecheConexao(PreparedStatement pstmt) throws SQLException {
        ResultSet rs = pstmt.executeQuery();

        preencheObjeto(rs);

        rs.close();
        pstmt.close();
        stmt.close();
        connection.close();
    }

    protected abstract String comandoSqlParaExecutar();
    protected abstract String nomeTabela();
    protected abstract void preencheObjeto(ResultSet rs) throws SQLException;
}
