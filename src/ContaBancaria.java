import java.util.Date;

public class ContaBancaria {
    // Atributos
    private final String titular;
    private double saldo;
    private final Date dataAbertura;

    // Construtor
    public ContaBancaria(String titular, double saldo, Date dataAbertura) {
        this.titular = titular;
        this.saldo = saldo;
        this.dataAbertura = dataAbertura;
    }

    // Métodos
    public void getInformacaoConta() {
        System.out.println("Titular: " + titular);
        System.out.println("Saldo: " + saldo);
        System.out.println("Data de Abertura: " + dataAbertura);
    }

    public void depositar(double valor) {
        if (valor > 0) {
            saldo += valor;
        }
    }

    public void levantar(double valor) {
        if (valor <= saldo) {
            saldo -= valor;
        }
    }
}