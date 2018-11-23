package br.edu.unirriter.calculadoraSalarios;

import br.edu.unirriter.calculadoraSalarios.model.CargoEnum;

public class CalculadoraFactory {

    public static Calculadora getCalculadora(CargoEnum cargo) {
        switch (cargo) {
            case DBA:
                return createCalculadoraDba();
            case TESTADOR:
                return createCalculadoraTestador();
            case DESENVOLVEDOR:
                return createCalculadoraDesenvolvedor();
        }
        throw new IllegalArgumentException();
    }

    private static Calculadora createCalculadoraDesenvolvedor() {
        return null;
    }

    private static Calculadora createCalculadoraTestador() {
        return null;
    }

    private static CalculadoraDba createCalculadoraDba() {
        return new CalculadoraDba();
    }

}
