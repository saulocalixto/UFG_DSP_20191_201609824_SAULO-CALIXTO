package br.com.saulocalixto.dsp20191.aulas1316.ap.Persistencia.dml.insert;
import br.com.saulocalixto.dsp20191.aulas1316.ap.Model.Cargo;
import br.com.saulocalixto.dsp20191.aulas1316.ap.Persistencia.dml.ManipulacaoBdPadrao;

public class PersisteCargo extends ManipulacaoBdPadrao<Cargo> {

    public PersisteCargo(Cargo objeto) {
        super(objeto);
    }

    @Override
    protected String comandoSqlParaExecutar() {
        return "INSERT INTO " + nomeTabela()  +
                " VALUES('" + objeto.getId() +
                "','" + objeto.getSalario() +
                "','" + objeto.getNome() +
                "')";
    }

    @Override
    protected String nomeTabela() {
        return "CARGOS";
    }

    
}