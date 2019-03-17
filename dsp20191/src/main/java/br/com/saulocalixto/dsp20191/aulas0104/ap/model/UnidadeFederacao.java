package br.com.saulocalixto.dsp20191.aulas0104.ap.model;

public class UnidadeFederacao {

    private String idUF;
    private String nomeUF;
    private String siglaUF;

    public UnidadeFederacao(String linha) {
        String[] dadosDaLinha = linha.split(",");
        if(dadosDaLinha.length == 4) {
            idUF = dadosDaLinha[0];
            siglaUF = dadosDaLinha[1];
            nomeUF = dadosDaLinha[2];
        }
    }

    @Override
    public String toString() {
        StringBuilder builder = new StringBuilder();
        if(idUF != null) {
            builder.append("Id: ")
                    .append(idUF)
                    .append("\nSigla: ")
                    .append(siglaUF)
                    .append("\nNome: ")
                    .append(nomeUF)
                    .append("\n\n");
            return builder.toString();
        }
        return "";
    }
}
