/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package dao;

import java.util.ArrayList;
import domain.Cliente;

/**
 *
 * @author dougl
 * @author Pablo
 */
public interface ClienteDAO {
    
    void adicionarCliente(Cliente cliente);
    Cliente getClientePorCpf(String cpf);
    ArrayList<Cliente> getAllClientes();
    void atualizarCliente(Cliente cliente);
    void removerCliente(Cliente cliente);

}
