package br.com.saulocalixto.dsp20191.aulas1316.ap.Persistencia.dml.consulte;

import br.com.saulocalixto.dsp20191.aulas1316.ap.Model.Cargo;
import br.com.saulocalixto.dsp20191.aulas1316.ap.Model.Departamento;
import br.com.saulocalixto.dsp20191.aulas1316.ap.Model.Funcionario;
import br.com.saulocalixto.dsp20191.aulas1316.ap.Model.Lotacao;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class ConsulteLotacao extends ConsultePadrao<Lotacao> {

    private List<Lotacao> lotacoes;

    public List<Lotacao> consultaPorCargoEDepartamento(long idCargo, long idDepartamento) {
        try {
            lotacoes = new ArrayList<>();
            preparaPersistencia();

            String sql = stringConsultaPorDepartamentoECargo();
            PreparedStatement pstmt = connection.prepareStatement(sql);
            pstmt.setLong(1,idCargo);
            pstmt.setLong(2,idDepartamento);

            ExecuteEFecheConexao(pstmt);
        } catch (SQLException e) {
            System.err.println("Ocorreu um erro ao rodar o script: " + e.getMessage());
        } finally {
            return lotacoes;
        }
    }

    private String stringConsultaPorDepartamentoECargo() {
        return "SELECT * FROM " + nomeTabela() + " WHERE ID_CARGO = ? AND ID_DEPARTAMENTO = ?";
    }

    @Override
    protected String comandoSqlParaExecutar() {
        return "SELECT * FROM " + nomeTabela() + " WHERE ID_LOTACOES = ?";
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

        while(rs.next()) {
            objeto = new Lotacao();
            objeto.setId(rs.getLong("ID_LOTACOES"));
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

            lotacoes.add(objeto);
        }
    }
}
