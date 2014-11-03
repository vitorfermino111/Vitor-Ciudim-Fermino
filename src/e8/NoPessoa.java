/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package e8;

/**
 *
 * @author Aluno
 */
public class NoPessoa {
    private String Nome;              
   private String NomePe;
   private int Idade;
   private NoPessoa next;
// -------------------------------------------------------------
   public NoPessoa(String nome, String nomep, int ida)
      {
      Nome = nome;                 
      NomePe = nomep;
      Idade = ida;
      }                          
// -------------------------------------------------------------
   public void displayNo()      
      {
      System.out.print("{" + Nome + ", " + NomePe + ", "+ Idade +"}" );
      }
   
   public void setNext(NoPessoa n){
       next = n;
   }
   
   public NoPessoa getNext(){
       return next;
   }
   
   public int getIdade()
   {
       return Idade;
   }
   
   public String getNome()
   {
       return Nome;
   }
}
