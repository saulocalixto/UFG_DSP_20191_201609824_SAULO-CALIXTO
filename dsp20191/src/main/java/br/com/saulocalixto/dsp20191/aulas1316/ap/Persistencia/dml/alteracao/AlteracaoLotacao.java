package br.com.saulocalixto.dsp20191.aulas1316.ap.Persistencia.dml.alteracao;

import br.com.saulocalixto.dsp20191.aulas1316.ap.Model.Lotacao;
import br.com.saulocalixto.dsp20191.aulas1316.ap.Persistencia.dml.ManipulacaoBdPadrao;

public class AlteracaoLotacao extends ManipulacaoBdPadrao<Lotacao> {
    public AlteracaoLotacao(Lotacao objeto) {
        super(objeto);
    }

    @Override
    protected String comandoSqlParaExecutar() {
        return "UPDATE LOTACOES\n"
                + "SET DATAINICIAL = '" + objeto.getDataInicial() + "',\n"
                + "DATAFINAL = '" + objeto.getDataFinal() + "',\n"
                + "ID_CARGO = " + objeto.getCargo().getId() + ",\n"
                + "ID_DEPARTAMENTO = " + objeto.getDepartamento().getId() + ",\n"
                + "ID_FUNCIONARIO = " + objeto.getFuncionario().getId() + "\n"
                + "WHERE ID_LOTACOES = " + objeto.getId();
    }

    @Override
    protected String nomeTabela() {
        return "LOTACOES";
    }
}
