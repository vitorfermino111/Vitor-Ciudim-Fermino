/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package e3;

import java.util.Scanner;

/**
 *
 * @author Home
 */
public class Usuaria {
   public static void main(String[] args)
   {
        Scanner d = new Scanner(System.in);
        Scanner s = new Scanner(System.in);
        Scanner i = new Scanner(System.in);
        System .out.println("Informe a quantidade de animais!");
        int max = i.nextInt();
        Conteiner c = new Conteiner(max);
        for (int x = 0; x<max; x++)
        {
            System.out.println("\nInforme o nome do "+(x+1)+"º animal.");
            String nome = s.nextLine();
            System.out.println("Informe a cor do "+(x+1)+"º animal.");
            String cor = s.nextLine();
            System.out.println("Informe o tamanho do "+(x+1)+"º animal.");
            double tamanho = d.nextDouble();
            c.inserir(nome, cor, tamanho);
        }
        
        c.ordenaTamanho();
        c.mostrarAnimal(); 
   
   }
}
