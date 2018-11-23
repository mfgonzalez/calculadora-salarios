package br.edu.unirriter.calculadoraSalarios;

import br.edu.unirriter.calculadoraSalarios.model.Funcionario;

public class CalculadoraDba implements Calculadora {

    public Double calculaSalario(Funcionario funcionario) {
        return Double.valueOf(900d);
    }

}
