/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dao;

import java.util.ArrayList;
//import java.util.List;
import domain.Cliente;

/**
 *
 * @author dougl
 * @author Pablo
 */
public class ClienteDAOImpl implements ClienteDAO{
    private ArrayList<Cliente> clientes = new ArrayList<>();

    @Override
    public void adicionarCliente(Cliente cliente) {
        clientes.add(cliente);
    }

    @Override
    public Cliente getClientePorCpf(String cpf) {
        for (Cliente cliente : clientes) {
            if (cliente.getCpf().equals(cpf)) {
                return cliente;
            }
        }
        return null;
    }

    @Override
    public ArrayList<Cliente> getAllClientes() {
        return new ArrayList<>(clientes);
    }

    @Override
    public void atualizarCliente(Cliente cliente) {
        for (int i = 0; i < clientes.size(); i++) {
            if (clientes.get(i).getCpf().equals(cliente.getCpf())) {
                clientes.set(i, cliente);
                return;
            }
        }
    }

    @Override
    public void removerCliente(Cliente cliente) {
        clientes.remove(cliente);
    }
}
