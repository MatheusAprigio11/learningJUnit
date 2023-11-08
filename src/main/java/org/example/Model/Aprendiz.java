package org.example.Model;

public class Aprendiz {
    private String nome;
    private double salario;

    private Desempenho desempenho;

    public Aprendiz(String nome, double salario) {
        this.nome = nome;
        this.salario = salario;
    }

    public Aprendiz(String nome, Desempenho desempenho) {
        this.nome = nome;
        this.desempenho = desempenho;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }
}
