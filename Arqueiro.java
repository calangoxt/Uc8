/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package aula05;

/**
 *
 * @author MIGUELDONATODEMIRAND
 */
public class Arqueiro extends Personagem {

    public Arqueiro(String nome) {
        super(nome, 100, 15);

    }

    public void habilidade() {
        this.ataque+=100;
    }
}
