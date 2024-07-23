public class CalculadoraDesconto {
    private DescontoStrategy descontoStrategy;

    public void setDescontoStrategy(DescontoStrategy descontoStrategy) {
        this.descontoStrategy = descontoStrategy;
    }

    public double calcularDesconto(double consumo) {
        return descontoStrategy.calcularDesconto(consumo);
    }
}
