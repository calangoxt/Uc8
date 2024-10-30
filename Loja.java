/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Mercado;

/**
 *
 * @author MIGUELDONATODEMIRAND
 */
import java.util.Scanner;
import java.util.ArrayList;

public class Loja {
    

    public static void main(String[] args) {
        double Vt = 0;
        Scanner scanner = new Scanner(System.in);
        ArrayList<Produto> Carrinho = new ArrayList<>();
        while (true) {
            System.out.println("1 - Add item 2 - remover item 3 - ver carrinho 4-fazer pagamento");
            int menu = scanner.nextInt();
            switch (menu) {
                case 1:
                    System.out.println("1-bola 2-Bebida 3-eletronico 4-fruta 5-roupa");
                    int menu2 = scanner.nextInt();
                    switch (menu2) {
                        case 1:
                            Bola bola = new Bola("bola",20);
                            Carrinho.add(bola);
                            break;
                        case 2:
                            Bebida bebida = new Bebida("coca-cola",6);
                            Carrinho.add(bebida);
                            break;
                        case 3:
                            Eletronico eletronico = new Eletronico("celular",2000);
                            Carrinho.add(eletronico);
                            break;
                        case 4:
                            Fruta fruta = new Fruta("maça",5);
                            Carrinho.add(fruta);
                            break;
                        case 5:
                            Roupa roupa = new Roupa("camisa-nike",120);
                            Carrinho.add(roupa);
                            break;
                    }
                    break;
                case 2:
                    for (int i = 0; i < Carrinho.size(); i++) {
                        System.out.println((i+1) + ")" + Carrinho.get(i).nome);
                    }
                    System.out.println("fale o numero do que deseja remover");
                    int remo = scanner.nextInt();
                    if (remo <= Carrinho.size()) {
                        Carrinho.remove(remo-1);
                        System.out.println("item removido");
                    } else {
                        System.out.println("numero neo encontrado");
                    }
                    break;
                case 3:
                     if (Carrinho.isEmpty()) {
                        System.out.println("O carrinho está vazio.");
                    } else {
                        Vt = 0;
                        for (Produto produto : Carrinho) {
                            System.out.println(produto.nome);
                            Vt += produto.valor;
                        }
                        System.out.println("Valor total no carrinho: R$" + Vt);
                    }
                case 4:
                    System.out.println("a compra de: "+Vt);
                    Carrinho.clear();
                    break;
            }
        }
    }
}
