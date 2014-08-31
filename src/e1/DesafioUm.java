/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package e1;

/**
 *
 * @author aleaguado
 */
import java.util.Scanner;

class EstruturaDados{
    
    private final String[] StringVetor; //Instancio o vetor
    private boolean teste = false;
    private int n;
    private static int curIn;
    
    public EstruturaDados(int max)
    {       
        StringVetor = new String[max];
        n=0;
    }
    
    public void Entrada( String e)
    {   
      int j;
      for(j=0; j<n; j++)        // localiza onde esse elemento se encaixa
         if(StringVetor[j].compareTo(e) > 0)            // OBS: Usando aqui busca linear!!! Poderia ser binária!
            break;
      for(int k=n; k>j; k--)    // move os elementos maiores uma posição p/ frente
         StringVetor[k] = StringVetor[k-1];
      StringVetor[j] = e;                  // insere o elemento na posição necessária
      n++;
    }
    
     
    public void  SaidaVerificada(String busca)
    {
        for (int i = 0; i < n; i++) {   //Varemos o vetor neste for ... 
             
            if (StringVetor[i].charAt(0) == busca.charAt(0)) { //Comparamos o primeiro caracter 
                 System.out.println("O nome " + StringVetor[i] + " começa com a letra " + busca ); 
                teste = true;
            }
            }
          
           if (!teste) { //Se não houver nenhum nome c/ a letra, imprimimos isso ...
            System.out.println("Nenhum nome começa com a letra: " + busca);
           }     
    }
    
      public void delete(String busca)
      {
        for(int j=0; j<n; j++){        // varre o vetor 
         if( busca.equals(StringVetor[j]) ){
            for(int k=j; k<n; k++){ // move os mais altos para "frente"
                System.out.println("O nome " + StringVetor[k] + " foi excluido na linha " + (k+1) + " do vetor.");
                if (k+1==n) 
                n--;
                else{
                    StringVetor[k] = StringVetor[k+1];
                    n--;
                }
                teste = true;
            }
          }
        }
      if (!teste)
                 System.out.println("Não existe esse nome!");
      }
    
    public boolean find(String e)
    {
      if (curIn != n){
      int lowerBound = 0;
      int upperBound = n-1;

      while(true)
         {        
            curIn = (lowerBound + upperBound ) / 2;
         if(StringVetor[curIn].charAt(0) == e.charAt(0))
         {   
             for (int x=curIn; StringVetor[x].charAt(0) == e.charAt(0); x--)
             {                
                 if (x == 0)
                     break;
                 else
                     curIn = x;
             }
             
             for (int y=curIn; StringVetor[y].charAt(0) == e.charAt(0); y++)
             {  
                 System.out.println(StringVetor[y] +" está na posição "+ y+" do array!"); 
                 if (y == n-1)
                     break;                                                 
             }
             curIn = n;
             return true;
         }                  // encontrei!
         else if(lowerBound > upperBound)
                 return false;              // não pude encontra-lo
         else                          // divide o range
            {
            if(StringVetor[curIn].compareTo(e) > 0)
               lowerBound = curIn + 1; // esta na metade de cima
            else
               upperBound = curIn - 1; // esta na metade de baixo
            }  // fim do else de divisão de range
         }// fim do while
      }        
        return true;
      }  // fim do método de pesquisa binária()
   
    public void display()
    {
        for(int i=0; i<n; i++)
        System.out.println((i+1)+"-"+StringVetor[i]);
    }
}

public class DesafioUm {
     public static void main(String[] args)
      {
          Scanner entrada = new Scanner (System.in); //Instancio o objeto entrada do tipo Scanner
          Scanner entrada2 = new Scanner (System.in); //Instancio o objeto entrada do tipo Scanner
          String en;
          int q = 0;
          
          System.out.println("Bem Vindo ao Programa de Vetores!!!");
          
          System.out.println("\nInforme a quantidade de nomes desejados!");
          q = entrada.nextInt();
          System.out.println("");
          EstruturaDados s = new EstruturaDados(q);
          
          for (int x=0; x<q; x++)
          { 
          System.out.println("Digite o "+(x+1)+"º nome!!!");
          en = entrada2.nextLine();
          s.Entrada(en);
          }
          
          System.out.println("\nMuito Bem! Agora que você cadastrou os nomes, digite uma letra");
          en = entrada2.nextLine();
          s.SaidaVerificada(en); 
          
          System.out.println("\nMuito Bem! Agora digite um nome para encontrar!");
          en = entrada2.nextLine();
          if (!s.find(en))
              System.out.println("Não ha nome que começa com essa letra.");
          else
              s.find(en);
          
          System.out.println("\nMuito Bem! Selecione um nome para deletar:");
          en = entrada2.nextLine();
          s.delete(en);
          
          System.out.println("");
          s.display();
      }  // termina o metodo main
}