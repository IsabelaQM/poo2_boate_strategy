public class DescontoClienteVIP implements DescontoStrategy {
    public Double calcularDesconto(double consumo) {
        if(consumo > 1000) {
            return consumo * 0.10;
        } else {
            return consumo * 0.05;
        }
    }
}
