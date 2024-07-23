public class App {
    public static void main(String[] args) throws Exception {
        
        CalculadoraDesconto calculadoraDesconto = new CalculadoraDesconto();

        //Cliente Regular
        DescontoStrategy descontoClienteRegular = new DescontoClienteRegular();
        calculadoraDesconto.setDescontoStrategy(descontoClienteRegular);
        calculadoraDesconto.calcularDesconto(2000);
        System.out.println("Desconto Cliente Regular: " + descontoClienteRegular.calcularDesconto(2000));

        // Cliente VIP
        DescontoStrategy descontoClienteVIP = new DescontoClienteVIP();
        calculadoraDesconto.setDescontoStrategy(descontoClienteVIP);
        calculadoraDesconto.calcularDesconto(2000);
        System.out.println("Desconto Cliente VIP: " + descontoClienteVIP.calcularDesconto(2000));

        // Funcionário
        DescontoStrategy descontoFuncionario = new DescontoFuncionario();
        calculadoraDesconto.setDescontoStrategy(descontoFuncionario);
        calculadoraDesconto.calcularDesconto(2000);
        System.out.println("Desconto Funcionário: " + descontoFuncionario.calcularDesconto(2000));
    }
}
