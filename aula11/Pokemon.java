/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package aula11;
import java.util.ArrayList;
/**
 *
 * @author MIGUELDONATODEMIRAND
 */
public class Pokemon {
    String nome;
    int nivel;
    String tipo;
   public Pokemon(String Nome, int Nivel,String Tipo){
       this.nome=Nome;
       this.nivel=Nivel;
       this.tipo=Tipo;
   }
public void criarPokemon(ArrayList<Pokemon> dex){
    dex.add(new Pokemon("Bulbasaur", 50, "grama"));
    dex.add(new Pokemon("Ivysaur", 60, "grama"));
    dex.add(new Pokemon("Venusaur", 80, "grama"));
    dex.add(new Pokemon("Charmander", 50, "fogo"));
    dex.add(new Pokemon("Charmeleon", 60, "fogo"));
    dex.add(new Pokemon("Charizard", 80, "fogo"));
    dex.add(new Pokemon("Squirtle", 50, "agua"));
    dex.add(new Pokemon("Wartortle", 60, "agua"));
    dex.add(new Pokemon("Blastoise", 80, "agua"));
    dex.add(new Pokemon("Pidgey", 50, "normal"));
    dex.add(new Pokemon("Pidgeot", 70, "normal"));
    dex.add(new Pokemon("Rattata", 30, "normal"));
    dex.add(new Pokemon("Raticate", 60, "normal"));
    dex.add(new Pokemon("Ekans", 40, "veneno"));
    dex.add(new Pokemon("Arbok", 60, "veneno"));
    dex.add(new Pokemon("Sandshrew", 50, "terra"));
    dex.add(new Pokemon("Sandslash", 70, "terra"));
    dex.add(new Pokemon("Nidoran♀", 40, "veneno"));
    dex.add(new Pokemon("Nidorina", 60, "veneno"));
    dex.add(new Pokemon("Nidoqueen", 80, "veneno"));
}

}
