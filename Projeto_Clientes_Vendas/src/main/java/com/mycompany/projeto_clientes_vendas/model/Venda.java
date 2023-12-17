/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.projeto_clientes_vendas.model;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author Mateus Santos
 */
public class Venda {
    private int numeroVenda;
    private int codigoCliente;
    private double valorVenda;
    private LocalDate data;

    public Venda(int numeroVenda, int codigoCliente, double valorVenda) {
        this.numeroVenda = numeroVenda;
        this.codigoCliente = codigoCliente;
        this.valorVenda = valorVenda;
        this.data = LocalDate.now();
    }
    
    public Venda() {
        
    }

    public static ArrayList<Venda> listaVendas = new ArrayList<>();
    
    public int getNumeroVenda() {
        return numeroVenda;
    }

    public LocalDate getData() {
        return data;
    }

    public void setData(LocalDate data) {
        this.data = data;
    }

    public void setNumeroVenda(int numeroVenda) {
        this.numeroVenda = numeroVenda;
    }

    public int getCodigoCliente() {
        return codigoCliente;
    }

    public void setCodigoCliente(int codigoCliente) {
        this.codigoCliente = codigoCliente;
    }

    public double getValorVenda() {
        return valorVenda;
    }

    public void setValorVenda(double valorVenda) {
        this.valorVenda = valorVenda;
    }
    
    public Venda cadastrarVenda() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite o número da venda:");
        int novaNumeroVenda = scanner.nextInt();

        System.out.println("Digite o código do cliente:");
        int novaCodigoCliente = scanner.nextInt();

        System.out.println("Digite o valor da venda:");
        double novaValorVenda = scanner.nextDouble();

        Venda v = new Venda(novaNumeroVenda, novaCodigoCliente, novaValorVenda);
        return v;    
    }
    
    public void listarVendas() {
        System.out.println("Lista de Vendas:");
        for (Venda venda : listaVendas) {
            System.out.println("Número da Venda: " + venda.getNumeroVenda());
            System.out.println("Código do Cliente: " + venda.getCodigoCliente());
            System.out.println("Valor da Venda: " + venda.getValorVenda());
            System.out.println("Data da Venda: " + venda.getData());
            System.out.println("--------------");
        }
    }
}
