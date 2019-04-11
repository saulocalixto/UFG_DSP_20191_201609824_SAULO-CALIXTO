package br.com.saulocalixto.dsp20191.aulas1316.ap.Persistencia.dml.insert;
import br.com.saulocalixto.dsp20191.aulas1316.ap.Model.Cargo;

public class PersisteCargo extends PersistePadrao<Cargo> {

    public PersisteCargo(Cargo objeto) {
        super(objeto);
    }

    @Override
    String stringInsert() {
        return "INSERT INTO " + nomeTabela()  +
                "VALUES('" + objeto.getId() +
                "','" + objeto.getSalario() +
                "','" + objeto.getNome() +
                "')";
    }

    @Override
    String nomeTabela() {
        return "CARGOS";
    }

    
}