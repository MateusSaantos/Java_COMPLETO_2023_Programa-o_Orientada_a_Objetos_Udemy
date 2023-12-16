/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.projeto_clientes_vendas.controller;

import com.mycompany.projeto_clientes_vendas.model.Cliente;
import static com.mycompany.projeto_clientes_vendas.model.Cliente.listaClientes;

/**
 *
 * @author Mateus Santos
 */
public class Cliente_Controller {
    Cliente cliente = new Cliente();
    
    public String Cadastrar_Cliente(){
        Cliente c = cliente.cadastrarCliente();
        listaClientes.add(c);
        return "Cliente cadastrado com sucesso!";
    }
    
    public void Listar_Clientes(){
        cliente.listarClientes();
    }
}
