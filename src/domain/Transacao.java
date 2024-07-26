/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package domain;

import java.util.Date;
/**
 *
 * @author dougl
 * @author Pablo
 */
public class Transacao {
    private String tipo;
    private double valor;
    private Date data;

    public Transacao(String tipo, double valor) {
        this.tipo = tipo;
        this.valor = valor;
        this.data = new Date();
    }

    public String getTipo() {
        return tipo;
    }

    public double getValor() {
        return valor;
    }

    public Date getData() {
        return data;
    }

    @Override
    public String toString() {
        return tipo + ": R$ " + valor + " em " + data;
    }
}
