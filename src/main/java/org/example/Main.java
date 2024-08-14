package org.example;

public class Main {
    public static void main(String[] args) {

        PessoaFisica pessoaFisica = new PessoaFisica("098972329");

        pessoaFisica.setNome("juanita");
        pessoaFisica.setDataNascimento("18/07/1997");
        pessoaFisica.setCpf("09883723923");

        System.out.println(pessoaFisica.toString());
    }
}