/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package dao;

import java.util.ArrayList;
import domain.ContaBancaria;

/**
 *
 * @author dougl
 * @author Pablo
 */
public interface ContaBancariaDAO {
    void adicionarContaBancaria(ContaBancaria conta);
    ContaBancaria getContaBancariaPorNumero(String numeroConta);
    ArrayList<ContaBancaria> getAllContasBancarias();
    void atualizarContaBancaria(ContaBancaria conta);
    void removerContaBancaria(ContaBancaria conta);
}
