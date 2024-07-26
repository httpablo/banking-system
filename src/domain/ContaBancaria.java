/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package domain;

import dao.ClienteDAO;
import java.util.ArrayList;

/**
 *
 * @author dougl
 * @author Pablo
 */
public class ContaBancaria {
    private String numeroConta;
    private double saldo;
    private ClienteDAO clienteDAO;
    private ArrayList<Transacao> transacoes;

    // Construtores, getters e setters

    public ContaBancaria(String numeroConta, ClienteDAO clienteDAO) {
        this.clienteDAO = clienteDAO;
        this.numeroConta = numeroConta;
        this.saldo = 0.0;
        this.transacoes = new ArrayList<>();
    }

    public String getNumeroConta() {
        return numeroConta;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }
    
    public void depositar(double valor) {
        saldo += valor;
        transacoes.add(new Transacao("Depósito", valor));
    }

    public boolean sacar(double valor) {
        if (valor <= saldo) {
            saldo -= valor;
            transacoes.add(new Transacao("Saque", valor));
            return true;
        } else {
            return false;
        }
    }
    
    public void receberTransferencia(double valor) {
        this.saldo = saldo + valor;
        transacoes.add(new Transacao("Transferência recebida", valor));
    }
    
    public boolean transferir(String username, String numeroConta, double valor, ClienteDAO clienteDAO) {
        String nome = username;
        String conta = numeroConta;
        
        boolean encontrado = false;
        transacoes.add(new Transacao("Transferência", valor));
            
        for (Cliente cliente : clienteDAO.getAllClientes()) {
            if (cliente.getNome().equals(nome) && cliente.getNumeroConta().equals(conta)) {
                cliente.getConta().receberTransferencia(valor);
                saldo -= valor;
                encontrado = true;
                return encontrado;
            }
        }
        return encontrado;
    }

    public ArrayList<Transacao> getTransacoes() {
        return transacoes;
    }
}

/*//int encontrado = 0;
        if (valor <= saldo) {
            saldo -= valor;            
            transacoes.add(new Transacao("Transferência", valor));
            
            for (Cliente cliente : clienteDAO.getAllClientes()) {
                if (cliente.getNome().equals(username) && cliente.getNumeroConta().equals(numeroConta)) {
                    cliente.getConta().receberTransferencia(valor);
                    break;
                }
            }
            return true;
        } else {
            return false;
        }
    }*/