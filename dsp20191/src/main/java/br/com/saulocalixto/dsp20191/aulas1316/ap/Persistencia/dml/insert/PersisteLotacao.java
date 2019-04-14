package br.com.saulocalixto.dsp20191.aulas1316.ap.Persistencia.dml.insert;

import br.com.saulocalixto.dsp20191.aulas1316.ap.Model.Lotacao;
import br.com.saulocalixto.dsp20191.aulas1316.ap.Persistencia.dml.ManipulacaoBdPadrao;
import br.com.saulocalixto.dsp20191.utilitario.UtilitarioDeData;

public class PersisteLotacao extends ManipulacaoBdPadrao<Lotacao> {

    public PersisteLotacao(Lotacao objeto) {
        super(objeto);
    }

    @Override
    protected String comandoSqlParaExecutar() {
        return "INSERT INTO " + nomeTabela()  +
                " VALUES('" + objeto.getId() +
                "', TO_DATE('" +  UtilitarioDeData.parseDataParaPersistir(objeto.getDataInicial()) + "', 'yyyy-MM-DD HH24:MI:ss')" +
                ", TO_DATE('" +  UtilitarioDeData.parseDataParaPersistir(objeto.getDataFinal()) + "', 'yyyy-MM-DD HH24:MI:ss')" +
                ",'" + objeto.getCargo().getId() +
                "','" + objeto.getDepartamento().getId() +
                "','" + objeto.getFuncionario().getId() +
                "')";
    }

    @Override
    protected String nomeTabela()  {
        return "LOTACOES";
    }
}
