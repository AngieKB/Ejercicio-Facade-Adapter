package co.edu.uniquindio.calculadora;

public class AdaptadorCalculadora implements CalculadoraEnteros {
    private CalculadoraDecimales calculadoraDecimales;
    
    public AdaptadorCalculadora(CalculadoraDecimales calculadoraDecimales) {
        this.calculadoraDecimales = new CalculadoraDecimal();
    }

    @Override
    public int sumarEnteros(int num1, int num2){
        double decimal1 = adaptar(num1);
        double decimal2 = adaptar(num2);
        return (int) calculadoraDecimales.sumarDecimales(decimal1, decimal2);
    }

    public double adaptar(Integer num){
        return num.doubleValue();
    }

    public double sumarDecimales(double num1, double num2){
        return calculadoraDecimales.sumarDecimales(num1, num2);
    }
}
