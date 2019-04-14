package br.com.saulocalixto.dsp20191.aulas1316.ap.Persistencia.dml.consulte;

import br.com.saulocalixto.dsp20191.aulas1316.ap.Model.Cargo;

import java.sql.ResultSet;
import java.sql.SQLException;

public class ConsulteCargo extends ConsultePadrao<Cargo> {

    @Override
    protected String comandoSqlParaExecutar() {
        return "SELECT * FROM " + nomeTabela() + " WHERE ID_CARGO = ?";
    }

    @Override
    protected String nomeTabela() {
        return "CARGOS";
    }

    @Override
    protected void preencheObjeto(ResultSet rs) throws SQLException {
        objeto = new Cargo();
        while(rs.next()){
            objeto.setId(rs.getLong("ID_CARGO"));
            objeto.setNome(rs.getString("NOME"));
            objeto.setSalario(rs.getDouble("SALARIO"));
        }
    }
}
