package ExercicioAvancado;

public class Estrutura {
    private Jogador[] a;               // comentario aqui
   private int n;               /// comentario aqui
   private static int curIn;

   public Estrutura(int max)    // comentario aqui
      {
      a = new Jogador[max];               // comentario aqui
      n = 0;                        // comentario aqui
      }
//--------------------------------------------------------------
   @SuppressWarnings("empty-statement")
   public Jogador find(int e)
      {                              // comentario aqui
      if (curIn != n){
      int lowerBound = 0;
      int upperBound = n-1;        
            curIn = (lowerBound + upperBound ) / 2;
         if(a[curIn].getIdade() == e)
         {   
             for (int x=curIn; a[x].getIdade() == e; x--)
             {                
                 if (x == 0)
                     break;
                 else
                     curIn = x;
             }
             
             for (int y=curIn; a[y].getIdade() == e; y++)
             {  
                 a[y].displayJogador(); 
                 if (y == n-1)
                     break;                                                 
             }
             curIn = n;
         }                  // encontrei!
         else if(lowerBound > upperBound)
                 System.out.println("A idade não foi encontarda.");              // não pude encontra-lo
         else                          // divide o range
            {
            if(a[curIn].getIdade() > e)
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
      a[n] = new Jogador(nome, altura, idade);
      n++;                          // comentario aqui
      }
//--------------------------------------------------------------
   public boolean delete(String searchName)
      {                              
          boolean bo = true;
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
}
