package org.example;

public class Main {
    public static void main(String[] args) {

        PessoaFisica pessoaFisica = new PessoaFisica("098972329");
        ContaPoupanca contaPoupanca = new ContaPoupanca(pessoaFisica,100.0);

        contaPoupanca.sacar(10);
        System.out.println(contaPoupanca.getSaldo());

        ContaPoupanca contaPoupanca2 = new ContaPoupanca(pessoaFisica,50.0);
        contaPoupanca2.sacar(10);
        System.out.println(contaPoupanca2.getSaldo());
        contaPoupanca2.sacar(13.0,ContaPoupanca.getTaxa());
        System.out.println(contaPoupanca2.getSaldo());

        Double taxa = ContaCorrente.taxa;

        pessoaFisica.setNome("juanita");
        pessoaFisica.setDataNascimento("18/07/1997");
        pessoaFisica.setCpf("09883723923");

        System.out.println(pessoaFisica.toString());

    }
}