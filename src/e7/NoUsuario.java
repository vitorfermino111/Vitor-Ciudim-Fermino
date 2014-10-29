/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package e7;

import java.util.Scanner;

/**
 *
 * @author Nit0
 */
public class NoUsuario {
    public static void main(String[] args)
      {
      NoConteiner theList = new NoConteiner();
      Scanner i = new Scanner(System.in);
      Scanner s = new Scanner(System.in);
      boolean ver = true;
      while (ver == true)
      {
          System.out.println("\n Bem vindo a hospital cura total, escolha a opção:");
            System.out.println(" Digite 1 para cadastra nome.");
            System.out.println(" Digite 2 para deletar.");
            System.out.println(" Digite 3 para mostrar todos os nomes.");
            System.out.println(" Digite 4 para finalizar o sitema.");
            int pega = i.nextInt();
            switch(pega)
            {
                case 1:
                {
                   System.out.println("Informe o seu nome:");
                   String nome = s.nextLine();
                   System.out.println("Informe o nome da sua pessoa querida:");
                   String nomep = s.nextLine();
                   theList.insertFirst(nome, nomep);
                   System.out.println("Cadastro feito com sucesso");
                   System.out.println("");
                   break;
                }
                case 2:
                {
                    while( !theList.isEmpty() )         
                    {
                        NoPessoa aLink = theList.deleteFirst();   
                        System.out.print("Deletado ");          
                        aLink.displayNo();                     
                        System.out.println("");
                    }
                    break;
                }
                case 3:
                {
                    theList.displayList();   
                    break;
                }
                case 4:
                {
                    ver = false;
                    System.out.println("Aplicação finalizada!");
                    break;                       
                }
            }
          
        }            
      }
}
