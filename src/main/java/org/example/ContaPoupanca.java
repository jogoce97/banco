package org.example;

public class ContaPoupanca implements Conta {
    //composiçao, atributo do tipo clase
    private PessoaFisica pessoaFisica;
    //encapsulamento usando privates e getters
    private Double saldo = 0.0;

    public static Double getTaxa() {
        return taxa;
    }

    public static void setTaxa(Double taxa) {
        ContaPoupanca.taxa = taxa;
    }

    private static Double taxa = 5.0;

    @Override
    public Double depositar(double valor) {
        saldo = saldo + valor;
        return valor;
    }

    public ContaPoupanca(PessoaFisica pessoaFisica, Double saldo) {
        this.pessoaFisica = pessoaFisica;
        this.saldo = saldo;
    }
    //polimorfismo
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
