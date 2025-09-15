import java.util.Date;

public class Main {
    public static void main(String[] args) {
        ContaBancaria conta = new ContaBancaria("João", 1000.0, new Date());
        conta.getInformacaoConta();
        conta.depositar(500);
        conta.levantar(200);
        conta.getInformacaoConta();
    }
}