package br.com.saulocalixto.dsp20191.aulas1316.ap.Persistencia.dml.insert;
import br.com.saulocalixto.dsp20191.aulas1316.ap.Persistencia.Base.PersistenciaJdbc;


public abstract class PersistePadrao<T> extends PersistenciaJdbc {

    protected T objeto;
    
    public PersistePadrao(T objeto)
    {
        this.objeto = objeto;
    }  
          
    public boolean persisteAluno() throws Exception {

        preparaPersistencia();

        String sql = stringInsert();

        stmt.executeUpdate(sql);
        System.out.println("O " + nomeTabela() + "foi persistido corretamente.");
        stmt.close();
        connection.close();

        return true;
    }

    abstract String stringInsert();
    abstract String nomeTabela();
}