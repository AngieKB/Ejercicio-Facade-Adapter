package co.edu.uniquindio.calculadora;

public class Main {
    public static void main(String[] args) {
        // Crear una instancia de Calculadora y un adaptador para CalculadoraDecimal
        Calculadora calculadora = new Calculadora(null);
        CalculadoraDecimales calculadoraDecimal = new CalculadoraDecimal();
        AdaptadorCalculadora adaptador = new AdaptadorCalculadora(calculadoraDecimal);

        // Sumar números enteros usando la Calculadora original
        System.out.println("Suma de enteros: " + calculadora.sumarEnteros(5, 3));

        // Sumar números decimales usando la CalculadoraDecimal original
        System.out.println("Suma de decimales: " + calculadoraDecimal.sumarDecimales(5.5, 3.3));

        // Sumar números decimales usando la Calculadora original y el Adaptador
        System.out.println("Suma de decimales adaptada: " + adaptador.sumarEnteros(5,3));
    }
}