package br.com.saulocalixto.dsp20191.aulas1316.ap.Persistencia.dml.consulte;

import br.com.saulocalixto.dsp20191.aulas1316.ap.Model.Cargo;
import br.com.saulocalixto.dsp20191.aulas1316.ap.Model.Departamento;
import br.com.saulocalixto.dsp20191.aulas1316.ap.Model.Funcionario;
import br.com.saulocalixto.dsp20191.aulas1316.ap.Model.Lotacao;

import java.sql.ResultSet;
import java.sql.SQLException;

public class ConsulteLotacao extends ConsultePadrao<Lotacao> {

    @Override
    protected String comandoSqlParaExecutar() {
        return "SELECT * FROM " + nomeTabela() + " WHERE ID_LOTACAO = ?";
    }

    @Override
    protected String nomeTabela() {
        return "LOTACOES";
    }

    @Override
    protected void preencheObjeto(ResultSet rs) throws SQLException {

        Departamento departamento = new Departamento();
        Cargo cargo = new Cargo();
        Funcionario funcionario = new Funcionario();
        objeto = new Lotacao();

        while(rs.next()) {
            objeto.setId(rs.getLong("ID_LOTACAO"));
            objeto.setDataInicial(rs.getDate("DATAINICIAL"));
            objeto.setDataFinal(rs.getDate("DATAFINAL"));
            departamento.setId(rs.getLong("ID_DEPARTAMENTO"));
            cargo.setId(rs.getLong("ID_CARGO"));
            funcionario.setId(rs.getLong("ID_FUNCIONARIO"));

            funcionario = (new ConsulteFuncionario()).consultaPorId(funcionario.getId());
            departamento = (new ConsulteDepartamento()).consultaPorId(departamento.getId());
            cargo = (new ConsulteCargo()).consultaPorId(cargo.getId());

            objeto.setDepartamento(departamento);
            objeto.setCargo(cargo);
            objeto.setFuncionario(funcionario);
        }
    }
}
