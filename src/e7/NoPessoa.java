/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package e7;

/**
 *
 * @author Nit0
 */
public class NoPessoa {
   private String Nome;              
   private String NomePe;           
   private NoPessoa next;
// -------------------------------------------------------------
   public NoPessoa(String nome, String nomep)
      {
      Nome = nome;                 
      NomePe = nomep;              
      }                          
// -------------------------------------------------------------
   public void displayNo()      
      {
      System.out.print("{" + Nome + ", " + NomePe + "} ");
      }
   
   public void setNext(NoPessoa n){
       next = n;
   }
   
   public NoPessoa getNext(){
       return next;
   }
}
