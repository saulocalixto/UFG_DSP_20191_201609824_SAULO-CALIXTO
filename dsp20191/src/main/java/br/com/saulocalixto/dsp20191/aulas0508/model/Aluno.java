package br.com.saulocalixto.dsp20191.aulas0508.model;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

public class Aluno implements Serializable {

    private static final long serialVersionUID = 1L;

    private String nome;
    private long matricula;
    private List<Double> notas;

    public Aluno() {
        notas = new ArrayList<Double>();
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public long getMatricula() {
        return matricula;
    }

    public void setMatricula(long matricula) {
        this.matricula = matricula;
    }

    public List<Double> getNotas() {
        return notas;
    }

    public void setNotas(Double nota) {
        notas.add(nota);
    }

    @Override
    public String toString() {
        StringBuffer texto = new StringBuffer();
        Double media = notas.stream().mapToDouble(nota -> nota).sum() / notas.size();
        texto.append("Matrícula: ")
                .append(matricula)
                .append(System.lineSeparator())
                .append("Nome: ")
                .append(nome)
                .append(System.lineSeparator());
        retorneNotas(texto);
        texto.append("Média de Notas: ")
                .append(media)
                .append(System.lineSeparator())
                .append("Situação: ")
                .append(media >= 5 ? "Aprovado" : "Reprovado")
                .append(System.lineSeparator());

        return texto.toString();
    }

    private void retorneNotas(StringBuffer texto) {
        notas.stream().forEach(x -> texto.append("Nota - ").append(x).append("\n"));
    }
}
