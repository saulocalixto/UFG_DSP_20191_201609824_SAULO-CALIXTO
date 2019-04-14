package br.com.saulocalixto.dsp20191.aulas1316.ap.Persistencia.dml.consulte;

import br.com.saulocalixto.dsp20191.aulas1316.ap.Model.Departamento;

import java.sql.ResultSet;
import java.sql.SQLException;

public class ConsulteDepartamento extends ConsultePadrao<Departamento> {

    @Override
    protected String comandoSqlParaExecutar() {
        return "SELECT * FROM " + nomeTabela() + " WHERE ID_DEPARTAMENTO = ?";
    }

    @Override
    protected String nomeTabela() {
        return "DEPARTAMENTOS";
    }

    @Override
    protected void preencheObjeto(ResultSet rs) throws SQLException {
        objeto = new Departamento();
        while(rs.next()){
            objeto.setId(rs.getLong("ID_DEPARTAMENTO"));
            objeto.setNome(rs.getString("NOME"));
        }
    }
}
