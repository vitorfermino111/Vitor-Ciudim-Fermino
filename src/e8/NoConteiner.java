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
            NoPessoa current = first;            
            NoPessoa previous = null;   
            NoPessoa newNo = new NoPessoa(nome, nomePessoa, ida);
            while(current != null && ida > current.getIdade())
            {
                    previous = current;          // caminhamos "um nó" pra frente ... 
                    current = current.getNext();     // caminhamos "um nó" pra frente ...
            }
            if(previous == null)
            {
                newNo.setNext(first);
                first = newNo;
            }
            else
            {
                previous.setNext(newNo);
                newNo.setNext(current);
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
//--------------------------------------------------------------
   public String buscaNome(String n){
      NoPessoa current = first;       // começamos pelo começo da lista
      while(current != null)      // enquanto não chegarmos no item null ...
         {
         if (current.getNome().equals(n)) {
             return "O nome "+current.getNome()+" foi encontado." ;
         }           
         current = current.getNext();  // movemos a lista para o proximo
      }
    return "Não Encontrado";
   }
//--------------------------------------------------------------
   public String buscaIdade(int i){
      NoPessoa current = first;       // começamos pelo começo da lista
      while(current != null)      // enquanto não chegarmos no item null ...
         {
         if (current.getIdade() == i) {
             return "A idade "+String.valueOf(current.getIdade())+" foi encontado." ;
         }           
         current = current.getNext();  // movemos a lista para o proximo
      }
    return "Não Encontrado";
   }
// -------------------------------------------------------------
}
