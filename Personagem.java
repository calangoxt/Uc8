/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package aula05;



/**
 *
 * @author MIGUELDONATODEMIRAND
 */
public class Personagem {


    public String nome;
    public int vida;
    public int ataque;

    public Personagem(String nome, int vida, int ataque) {
        this.nome = nome;
        this.ataque = ataque;
        this.vida = vida;


    }

    public void atacar(Personagem nome) {
        nome.vida -= this.ataque;
        System.out.println(this.nome);
        System.out.println(this.ataque);
        System.out.println(this.vida);
    }

    public boolean estaVivo() {
        if (this.vida <= 0) {
            return false;
        } else {
            return true;
        }
    }
}

