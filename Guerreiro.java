/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package aula05;

/**
 *
 * @author MIGUELDONATODEMIRAND
 */
public class Guerreiro extends Personagem {

    public Guerreiro(String nome) {
        super(nome, 100, 15);

    }

    public void habilidade() {
        System.out.println("BANKAI");
        System.out.println("ZANKA NO TACHI");
        this.ataque += 50;
    }
}
