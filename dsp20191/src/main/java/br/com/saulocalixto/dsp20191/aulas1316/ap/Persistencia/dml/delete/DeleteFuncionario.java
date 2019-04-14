package br.com.saulocalixto.dsp20191.aulas1316.ap.Persistencia.dml.delete;

import br.com.saulocalixto.dsp20191.aulas1316.ap.Model.Funcionario;
import br.com.saulocalixto.dsp20191.aulas1316.ap.Persistencia.dml.ManipulacaoBdPadrao;

public class DeleteFuncionario extends ManipulacaoBdPadrao<Funcionario> {
    public DeleteFuncionario(Funcionario objeto) {
        super(objeto);
    }

    @Override
    protected String comandoSqlParaExecutar() {
        return "DELETE FROM " + nomeTabela() + " WHERE ID_FUNCIONARIO = " + objeto.getId();
    }

    @Override
    protected String nomeTabela() {
        return "FUNCIONARIOS";
    }
}
