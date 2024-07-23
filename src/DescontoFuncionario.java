public class DescontoFuncionario implements DescontoStrategy {
    public Double calcularDesconto(double consumo) {
        return consumo * 0.30;
    }

}
