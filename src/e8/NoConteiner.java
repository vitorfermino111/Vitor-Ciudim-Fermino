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
   /*public void insertFirst(String nome, String nomePessoa, int ida)  
      {                           
      NoPessoa newNo = new NoPessoa(nome, nomePessoa, ida);
      newNo.setNext(first);     
      first = newNo;            
      }*/
   
   public void insertOrdenado(String nome, String nomePessoa, int ida)
   {
       if (first == null)
       {
           NoPessoa newNo = new NoPessoa(nome, nomePessoa, ida);
           newNo.setNext(first);     
           first = newNo;
       }
       else
       {
            NoPessoa current = first;              // a bola da vez é o first
            NoPessoa previous = first;              // e precisamos referenciar o anterior também!
            while(current.getIdade() <= ida && current != null )
            {
                previous = current;          // caminhamos "um nó" pra frente ... 
                current = current.getNext();
            }
            if(current == first)
            {
                NoPessoa newNo = new NoPessoa(nome, nomePessoa, ida);
                newNo.setNext(first);     
                first = newNo;
            }
            else
            {
                
            }
       }
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
