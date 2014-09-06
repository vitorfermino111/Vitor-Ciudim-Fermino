/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package e2;

import java.util.Scanner;

/**
 *
 * @author Home
 */
class Pessoa
   {
    // a ordenação está baseada na profissão
   private String nome;     // instacia das variáveis 
   private String profissao;
   private int idade;
//--------------------------------------------------------------
      public Pessoa(String nome, String profissao, int a)
      {                               
      this.nome = nome;
      this.profissao = profissao;
      idade = a;
      }
//--------------------------------------------------------------
   public void displayPessoa()
      {
      System.out.print("   Nome: " + nome);
      System.out.print(", Profissão: " + profissao);
      System.out.println(", Idade: " + idade);
      }
//--------------------------------------------------------------
   public String getPro()           // comentario aqui
      { return profissao; }
   }  // end class Person
////////////////////////////////////////////////////////////////
class ArrayOrdenado
   {
   private Pessoa[] a;               // comentario aqui
   private int n;               /// comentario aqui
   private static int curIn;

   public ArrayOrdenado(int max)    // comentario aqui
      {
      a = new Pessoa[max];               // comentario aqui
      n = 0;                        // comentario aqui
      }
//--------------------------------------------------------------
   @SuppressWarnings("empty-statement")
   public Pessoa find(String e)
      {                              // comentario aqui
      if (curIn != n){
      int lowerBound = 0;
      int upperBound = n-1;        
            curIn = (lowerBound + upperBound ) / 2;
         if(a[curIn].getPro().charAt(0) == e.charAt(0))
         {   
             for (int x=curIn; a[x].getPro().charAt(0) == e.charAt(0); x--)
             {                
                 if (x == 0)
                     break;
                 else
                     curIn = x;
             }
             
             for (int y=curIn; a[y].getPro().charAt(0) == e.charAt(0); y++)
             {  
                 a[y].displayPessoa(); 
                 if (y == n-1)
                     break;                                                 
             }
             curIn = n;
         }                  // encontrei!
         else if(lowerBound > upperBound)
                 System.out.println("A profissão não foi encontarda.");              // não pude encontra-lo
         else                          // divide o range
            {
            if(a[curIn].getPro().compareTo(e) > 0)
               lowerBound = curIn + 1; // esta na metade de cima
            else
               upperBound = curIn - 1; // esta na metade de baixo
            }  // fim do else de divisão de range
      }  
       return null;
      }// end find()
//--------------------------------------------------------------                                    // put person into array
   public void insert(String nome, String profissao, int idade)
      {
      a[n] = new Pessoa(nome, profissao, idade);
      n++;                          // comentario aqui
      }
//--------------------------------------------------------------
   public boolean delete(String searchName)
      {                              
      for(int j=0; j<n; j++){        // varre o vetor 
         if( searchName.equals(a[j]) ){
            for(int k=j; k<n; k++){ // move os mais altos para "frente"
                System.out.println("O nome " + a[k] + " foi excluido na linha " + (k+1) + " do vetor.");
                if (k+1==n) 
                n--;
                else{
                    a[k] = a[k+1];
                    n--;
                }
                return true;
            }
          }
         return false;
        }
       return true;
      }
//--------------------------------------------------------------
   public void display()            // comentario aqui
      {
      for(int j=0; j<n; j++)       // comentario aqui
         a[j].displayPessoa();          // comentario aqui
      }
//--------------------------------------------------------------
}

class ClassPrincipal
   {
   public static void main(String[] args)
      {
      int q = 0;
      Scanner entrada = new Scanner (System.in);
      Scanner entrada2 = new Scanner (System.in);
      String nome;
      String profissao;
      int idade;
          
      System.out.println("Bem Vindo ao Programa de Vetores!!!");
          
          System.out.println("\nInforme a quantidade de pessoas desejadas!");
          q = entrada.nextInt();
          System.out.println("");
          ArrayOrdenado s = new ArrayOrdenado(q);
          
          for (int x=0; x<q; x++)
          { 
          System.out.println("Digite o "+(x+1)+"º nome!!!");
          nome = entrada2.nextLine();
          System.out.println("Digite a "+(x+1)+"º profissão!!!");
          profissao = entrada2.nextLine();
          System.out.println("Digite o "+(x+1)+"º idade!!!");
          idade = entrada.nextInt();
          s.insert(nome, profissao, idade);
          } 
          
          System.out.println("\nMuito Bem! Agora digite uma profissão para encontrar!");
          profissao = entrada2.nextLine();
          s.find(profissao);
          
          System.out.println("\nMuito Bem! Selecione uma profissao para deletar:");
          profissao = entrada2.nextLine();
          if (!s.delete(profissao))
              System.out.println("Não foi encontrada a profissao!");
          else
          s.delete(profissao);
          
          System.out.println("");
          s.display();                // comentario aqui
      }  // end main()
   }  // end class ClassDataApp
