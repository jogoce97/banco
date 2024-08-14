package org.example;

public class ContaPoupanca implements Conta {
    private PessoaFisica pessoaFisica;
    private Double saldo = 0.0;

    @Override
    public Double depositar(double valor) {
        saldo = saldo + valor;
        return valor;
    }
   //sobreescrita
    @Override
    public Double sacar(double valor) {
        saldo = saldo - valor;
        return valor;
    }
    //sobrecarga
    public Double sacar(double valor , double taxa) {
        saldo = saldo - valor - taxa;
        return valor;
    }

    public Double getSaldo() {
        return saldo;
    }
}
