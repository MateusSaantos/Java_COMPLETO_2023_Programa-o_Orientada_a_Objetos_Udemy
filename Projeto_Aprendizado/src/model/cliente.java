package model;

import java.util.Scanner;

public class cliente {
    private int codigo;
    private String nome;
    private double saldo;

    public cliente(int codigo, String nome, double saldo) {
        this.codigo = codigo;
        this.nome = nome;
        this.saldo = saldo;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public cliente cadastrarCliente(){
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite o código do cliente:");
        int novoCodigo = scanner.nextInt();

        System.out.println("Digite o nome do cliente:");
        scanner.nextLine();
        String novoNome = scanner.nextLine();

        System.out.println("Digite o saldo do cliente:");
        double novoSaldo = scanner.nextDouble();

        cliente c = new cliente(novoCodigo, novoNome, novoSaldo);

        return c;
    }
}


