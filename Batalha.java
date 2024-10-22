/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package aula05;

import java.util.Scanner;

public class Batalha {

    private Scanner scanner;
    Mago g3;
    Arqueiro g2;
    Guerreiro g1;

    public Batalha() {
        this.scanner = new Scanner(System.in);
    }

    public void iniciar() {

        System.out.println("Fale o nome do guerreiro:");
        String nome = scanner.nextLine();
        g1 = new Guerreiro(nome);

        System.out.println("Fale o nome do arqueiro:");
        String nome2 = scanner.nextLine();
        g2 = new Arqueiro(nome2);

        System.out.println("Fale o nome do mago:");
        String nome3 = scanner.nextLine();
        g3 = new Mago(nome3);
    }

    public void menu() {
        while (true) {
            System.out.print("1 - para atacar \n2 - para usar a habilidade\n");
            int menu = scanner.nextInt();
            scanner.nextLine();

            switch (menu) {
                case 1:
                    System.out.print("Fale o nome de quem vai atacar: ");
                    String n = scanner.nextLine();

                    if (n.equals(g1.nome)) {
                        System.out.println("Fale o nome de quem vai ser atacado:");
                        String n2 = scanner.nextLine();
                        if (n2.equals(g2.nome)) {
                            g1.atacar(g2);
                        } else if (n2.equals(g3.nome)) {
                            g1.atacar(g3);
                        } else {
                            System.out.println("Nome não encontrado");
                        }
                    } else if (n.equals(g2.nome)) {
                        System.out.println("Fale o nome de quem vai ser atacado:");
                        String n2 = scanner.nextLine();
                        if (n2.equals(g1.nome)) {
                            g2.atacar(g1);
                        } else if (n2.equals(g3.nome)) {
                            g2.atacar(g3);
                        } else {
                            System.out.println("Nome não encontrado");
                        }
                    } else if (n.equals(g3.nome)) {
                        System.out.println("Fale o nome de quem vai ser atacado:");
                        String n2 = scanner.nextLine();
                        if (n2.equals(g1.nome)) {
                            g3.atacar(g1);
                        } else if (n2.equals(g2.nome)) {
                            g3.atacar(g2);
                        } else {
                            System.out.println("Nome não encontrado");
                        }
                    } else {
                        System.out.println("Nome não encontrado");
                    }
                    break;

                case 2:
                    System.out.println("Fale o nome de quem vai usar habilidade:");
                    String n3 = scanner.nextLine();
                    if (n3.equals(g1.nome)) {
                        g1.habilidade();
                    } else if (n3.equals(g2.nome)) {
                        g2.habilidade();
                    } else if (n3.equals(g3.nome)) {
                        g3.habilidade();
                    } else {
                        System.out.println("Nome não encontrado");
                    }
                    break;

                default:
                    System.out.println("Opção inválida.");
                    break;
            }
        }
    }
}
