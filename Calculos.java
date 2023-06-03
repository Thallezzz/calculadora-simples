public class Calculos {
    private double primeiroNumero;
    private double segundoNumero;
    private double resultado;

    public double getResultado() {
        return resultado;
    }

    public void setPrimeiroNumero(double primeiroNumero) {
        this.primeiroNumero = primeiroNumero;
    }

    public void setSegundoNumero(double segundoNumero) {
        this.segundoNumero = segundoNumero;
    }

    public void soma(){
        resultado = primeiroNumero + segundoNumero;
    }

    public void subtrai(){
        resultado = primeiroNumero - segundoNumero;
    }

    public void multiplica(){
        resultado = primeiroNumero * segundoNumero;
    }

    public void divide(){
        resultado = primeiroNumero / segundoNumero;
    }
}
