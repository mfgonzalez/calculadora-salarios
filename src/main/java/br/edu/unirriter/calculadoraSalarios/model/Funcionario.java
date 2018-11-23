package br.edu.unirriter.calculadoraSalarios.model;

public class Funcionario {

    private String nome;
    private Double salario;
    private CargoEnum cargo;

    public Funcionario(String nome, Double salario, CargoEnum cargo) {
        this.cargo = cargo;
        this.nome = nome;
        this.salario = salario;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Double getSalario() {
        return salario;
    }

    public void setSalario(Double salario) {
        this.salario = salario;
    }

    public CargoEnum getCargo() {
        return cargo;
    }

    public void setCargo(CargoEnum cargo) {
        this.cargo = cargo;
    }
}
