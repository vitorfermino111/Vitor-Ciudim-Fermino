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
public class NoConteiner {
    private NoPessoa first;          
// -------------------------------------------------------------
   public NoConteiner()              
      {
      first = null;              
      }
// -------------------------------------------------------------
   public boolean isEmpty()       
      {                            
      return (first==null);
      }
// -------------------------------------------------------------                                
   public void insertFirst(String nome, String nomePessoa)  
      {                           
      NoPessoa newNo = new NoPessoa(nome, nomePessoa);
      newNo.setNext(first);     
      first = newNo;            
      }
// -------------------------------------------------------------
   public NoPessoa deleteFirst()     
      {                           
      NoPessoa temp = first;        
      first = first.getNext();     
      return temp;            
      }
// -------------------------------------------------------------
   public void displayList()
      {
      System.out.print("Lista (primeiro-->último): ");
      NoPessoa current = first;       
      while(current != null)      
         {
         current.displayNo(); 
         current = current.getNext();
         }
      System.out.println("");
      }
}
