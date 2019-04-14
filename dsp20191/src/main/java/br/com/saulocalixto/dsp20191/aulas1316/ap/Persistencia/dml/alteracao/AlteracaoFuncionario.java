package br.com.saulocalixto.dsp20191.aulas1316.ap.Persistencia.dml.alteracao;

import br.com.saulocalixto.dsp20191.aulas1316.ap.Model.Funcionario;
import br.com.saulocalixto.dsp20191.aulas1316.ap.Persistencia.dml.ManipulacaoBdPadrao;

public class AlteracaoFuncionario extends ManipulacaoBdPadrao<Funcionario> {

    public AlteracaoFuncionario(Funcionario objeto) {
        super(objeto);
    }

    @Override
    protected String comandoSqlParaExecutar() {
        return "UPDATE FUNCIONARIO\n"
                + "SET MATRICULA = '" + objeto.getMatricula() + "',"
                + "SET NOME = '" + objeto.getNome() + "'\n"
                + "WHERE ID_FUNCIONARIO = " + objeto.getId();
    }

    @Override
    protected String nomeTabela() {
        return "FUNCIONARIOS";
    }
}
