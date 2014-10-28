
package com.festa.controller;

import com.festa.dao.ClienteDao;
import com.festa.model.Cliente;
import java.awt.event.ActionEvent;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;

@ManagedBean(name = "clienteBean")
@ViewScoped
public class ClienteBean {
    
    private Cliente cliente = new Cliente();
   // List clientes = new ArrayList();
    
    //Construtor

    public ClienteBean() {
        
        cliente = new Cliente();
    }
    
    //Metodo do botao
    
    public void cadastrar(ActionEvent actionEvent){
        
        new ClienteDao().adicionar(cliente);
        cliente = new Cliente();
      
    }
    //getter and setter
    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }
    
    
    
    
    
    
    
    
    
    
    
        
}
