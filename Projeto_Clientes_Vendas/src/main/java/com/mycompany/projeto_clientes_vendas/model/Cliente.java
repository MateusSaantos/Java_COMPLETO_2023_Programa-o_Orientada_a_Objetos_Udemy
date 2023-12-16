/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.projeto_clientes_vendas.model;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author Mateus Santos
 */
public class Cliente {
    private int codigo;
    private String nome;
    private double saldo;

    public Cliente(int codigo, String nome, double saldo) {
        this.codigo = codigo;
        this.nome = nome;
        this.saldo = saldo;
    }
    
    public Cliente() {
        
    }
    
    public static ArrayList<Cliente> listaClientes = new ArrayList<>();

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

    public Cliente cadastrarCliente(){
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite o código do cliente:");
        int novoCodigo = scanner.nextInt();

        System.out.println("Digite o nome do cliente:");
        scanner.nextLine();
        String novoNome = scanner.nextLine();

        System.out.println("Digite o saldo do cliente:");
        double novoSaldo = scanner.nextDouble();

        Cliente c = new Cliente(novoCodigo, novoNome, novoSaldo);

        return c;
    }
    
    public void listarClientes() {
        System.out.println("Lista de Clientes:");
        for (Cliente cliente : listaClientes) {
            System.out.println("Código: " + cliente.getCodigo());
            System.out.println("Nome: " + cliente.getNome());
            System.out.println("Saldo: " + cliente.getSaldo());
            System.out.println("--------------");
        }
    }
}
