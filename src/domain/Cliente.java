/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package domain;

import dao.ClienteDAO;

/**
 *
 * @author dougl
 * @author Pablo
 */
public class Cliente {
    private String nome;
    private String cpf;
    private String endereco;
    private String telefone;
    private String password;
    private String numeroConta;
    private ContaBancaria conta;
    private ClienteDAO clienteDAO;
    

    // Construtores, getters e setters

    public Cliente(String nome, String cpf, String endereco, String telefone, String password, String numeroConta, ClienteDAO clienteDAO) {
        this.nome = nome;
        this.cpf = cpf;
        this.endereco = endereco;
        this.telefone = telefone;
        this.password = password;
        this.clienteDAO = clienteDAO;
        this.numeroConta = numeroConta;
        this.conta = new ContaBancaria(numeroConta, clienteDAO);
    }

    @Override
    public String toString() {
        return "Cliente{" + "nome=" + nome + ", cpf=" + cpf + ", endereco=" + endereco + ", telefone=" + telefone + ", numeroConta=" + numeroConta + '}';
    }
    
    public ContaBancaria getConta() {
        return conta;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }
   
    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
    
    public String getNumeroConta() {
        return numeroConta;
    }
    
    public void setNumeroConta(String numeroConta) {
        this.numeroConta = numeroConta;
    }
}
