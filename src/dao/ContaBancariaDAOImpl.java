/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dao;

import java.util.ArrayList;
//import java.util.List;
import domain.ContaBancaria;
/**
 *
 * @author dougl
 */
public class ContaBancariaDAOImpl implements ContaBancariaDAO{
    private ArrayList<ContaBancaria> contas = new ArrayList<>();

    @Override
    public void adicionarContaBancaria(ContaBancaria conta) {
        contas.add(conta);
    }

    @Override
    public ContaBancaria getContaBancariaPorNumero(String numeroConta) {
        for (ContaBancaria conta : contas) {
            if (conta.getNumeroConta().equals(numeroConta)) {
                return conta;
            }
        }
        return null;
    }

    @Override
    public ArrayList<ContaBancaria> getAllContasBancarias() {
        return new ArrayList<>(contas);
    }

    @Override
    public void atualizarContaBancaria(ContaBancaria conta) {
        for (int i = 0; i < contas.size(); i++) {
            if (contas.get(i).getNumeroConta().equals(conta.getNumeroConta())) {
                contas.set(i, conta);
                return;
            }
        }
    }

    @Override
    public void removerContaBancaria(ContaBancaria conta) {
        contas.remove(conta);
    }
}
