/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.projeto_clientes_vendas.controller;

import com.mycompany.projeto_clientes_vendas.model.Venda;
import static com.mycompany.projeto_clientes_vendas.model.Venda.listaVendas;

/**
 *
 * @author Mateus Santos
 */
public class Venda_Controller {
    Venda venda = new Venda();
    
    public String Cadastrar_Venda(){
        Venda v = venda.cadastrarVenda();
        listaVendas.add(v);
        return "Venda cadastrada com sucesso!";
    }
    
    public void Listar_Venda(){
        venda.listarVendas();
    }
}
