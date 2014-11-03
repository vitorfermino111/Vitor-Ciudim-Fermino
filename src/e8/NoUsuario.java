/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package e8;

import java.util.Scanner;

/**
 *
 * @author Aluno
 */
public class NoUsuario {
    public static void main (String [] args)
    {
      NoConteiner theList = new NoConteiner();
      Scanner i = new Scanner(System.in);
      Scanner s = new Scanner(System.in);
      boolean ve = true;
      while (ve == true)
      {
          System.out.println("\n Bem vindo a hospital cura total, escolha a opção:");
          System.out.println(" Digite 1 para cadastra nome.");
          System.out.println(" Digite 2 para buscar nome.");
          System.out.println(" Digite 3 para buscar idade.");  
          System.out.println(" Digite 4 para deletar.");
          System.out.println(" Digite 5 para mostrar todos os nomes.");
          System.out.println(" Digite 6 para finalizar o sitema.");
            int pega = i.nextInt();
            switch(pega)
            {
                case 1:
                {
                   System.out.println("Informe o seu nome:");
                   String nome = s.nextLine();
                   System.out.println("Informe o nome da sua pessoa querida:");
                   String nomep = s.nextLine();
                   System.out.println("Informe a sua idade:");
                   int ida = i.nextInt();
                   theList.insertOrdenado(nome, nomep, ida);
                   System.out.println("Cadastro feito com sucesso");
                   System.out.println("");
                   break;
                }
                case 2:
                {
                    System.out.println("Informe o nome que deseja buscar:");
                   String nome = s.nextLine();
                    System.out.println(theList.buscaNome(nome));
                    break;
                }
                case 3:
                {
                    System.out.println("Informe a idade que deseja buscar:");
                    int ida = i.nextInt();
                    System.out.println(theList.buscaIdade(ida));
                    break;
                }
                case 4:
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
                case 5:
                {
                    theList.displayList();   
                    break;
                }
                case 6:
                {
                    ve = false;
                    System.out.println("Aplicação finalizada!");
                    break;                       
                }
            }
          
        }
    }
}
