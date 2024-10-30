/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Mercado;

/**
 *
 * @author MIGUELDONATODEMIRAND
 */
public abstract class Produto {

    String nome;
    double valor;

    public Produto(String Nome, double Valor) {
        this.nome = Nome;
        this.valor = Valor;

    }
}
