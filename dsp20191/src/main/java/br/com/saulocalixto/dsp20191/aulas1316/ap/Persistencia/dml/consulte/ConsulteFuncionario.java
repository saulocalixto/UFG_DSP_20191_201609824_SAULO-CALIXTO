package br.com.saulocalixto.dsp20191.aulas1316.ap.Persistencia.dml.consulte;

import br.com.saulocalixto.dsp20191.aulas1316.ap.Model.Funcionario;

import java.sql.ResultSet;
import java.sql.SQLException;

public class ConsulteFuncionario extends  ConsultePadrao<Funcionario> {

    @Override
    protected String comandoSqlParaExecutar() {
        return "SELECT * FROM " + nomeTabela() + " WHERE ID_FUNCIONARIO = ?";
    }

    @Override
    protected String nomeTabela() {
        return "FUNCIONARIOS";
    }

    @Override
    protected void preencheObjeto(ResultSet rs) throws SQLException {
        objeto = new Funcionario();
        while(rs.next()){
            objeto.setId(rs.getLong("ID_FUNCIONARIO"));
            objeto.setNome(rs.getString("NOME"));
            objeto.setMatricula(rs.getLong("MATRICULA"));
        }
    }
}
