package br.edu.unirriter.calculadoraSalarios;

import br.edu.unirriter.calculadoraSalarios.model.CargoEnum;
import br.edu.unirriter.calculadoraSalarios.model.Funcionario;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class CalculadoraDbaTests {

    @Test
    public void calculaSalarioDBAMenor3000() {
        Funcionario funcionario = new Funcionario("Nome", Double.valueOf(1000d), CargoEnum.DBA);
        Calculadora calculadoraDba = new CalculadoraDba();
        Double salarioComDescontos = calculadoraDba.calculaSalario(funcionario);
        assertEquals(Double.valueOf(900d), salarioComDescontos);
    }

    @Test
    public void calculaSalarioDBAMaior3000() {
        Funcionario funcionario = new Funcionario("Nome", Double.valueOf(4000d), CargoEnum.DBA);
        Calculadora calculadoraDba = new CalculadoraDba();
        Double salarioComDescontos = calculadoraDba.calculaSalario(funcionario);
        assertEquals(Double.valueOf(3200d), salarioComDescontos);
    }

}
