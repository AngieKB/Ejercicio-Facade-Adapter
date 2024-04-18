package co.edu.uniquindio.calculadora;

public class Calculadora implements CalculadoraEnteros {
    private AdaptadorCalculadora adaptador;

    public Calculadora(AdaptadorCalculadora adaptador) {

        this.adaptador = new AdaptadorCalculadora(null);
    }

    public int sumarEnteros(int num1, int num2){
        int suma = adaptador.sumarEnteros(num1, num2);
        return suma;
    }
}