package fase06.dominio;

public class ContaBancaria {
    private String titular;
    private double saldo;

public ContaBancaria(String titular, double saldo) {
    this.titular = titular;
    this.saldo = saldo;
    }

public String getTitular() {
    return titular;
}

public double getSaldo() {
    return saldo;
}

public void setTitular(String titular) {
    this.titular = titular;
}

public void setSaldo(double saldo) {
    this.saldo = saldo;
}

}

