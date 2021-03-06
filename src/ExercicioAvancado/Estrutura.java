package ExercicioAvancado;

public class Estrutura {
    private Jogador[] a;               // declaração de váriaveis
    private int n;    
    private static int curIn;

   public Estrutura(int max)    // determina o numero de jogadores
      {
      a = new Jogador[max];              
      n = 0;                        
      }
//--------------------------------------------------------------
   public void findOrdenado(int e)
      {                              // encontra jogadores com a idade determina
      int lowerBound = 0;
      int upperBound = n-1;
      for (int g = curIn; g<n; g++){
      if (curIn != n){
            curIn = (lowerBound + upperBound ) / 2;
         if(a[curIn].getIdade() == e)
         {   
             for (int x=curIn; a[x].getIdade() == e; x--)
             {                  
                 //System.out.println("Nome: "+a[x].getNome()+", altura: "+a[x].getAltura()+", idade: "+a[x].getIdade());
                 curIn = x;
                 if (x==0)
                     break;
             }
             if (curIn + 1 != n)
             for (int z=curIn; a[z].getIdade() == e; z++)
             { 
                 System.out.println ("Nome: "+a[z].getNome()+", altura: "+a[z].getAltura()+", idade: "+a[z].getIdade()); 
                 if (z == n-1)
                     break;
             }
             curIn = n;
         }                  // encontrei!
         else if(lowerBound > upperBound)
                 System.out.println ("A idade não foi encontarda.");              // não pude encontra-lo
         else                          // divide o range
            {
            if(a[curIn].getIdade() < e)
               lowerBound = curIn + 1; // esta na metade de cima
            else
               upperBound = curIn - 1; // esta na metade de baixo
            }  // fim do else de divisão de range
      }
      }
      }// end find()
//--------------------------------------------------------------  
   public void findLinear(String nome)
   {
       for(int x = 0; x < n ; x++)
       {
           if (a[x].getNome().charAt(0) == nome.charAt(0))
           {
               System.out.println("O resultado; nome: "+a[x].getNome()+", altura: "+a[x].getAltura()+", idade: "+a[x].getIdade());
           }
           else 
               if(x == n-1)
               System.out.println ("O nome não foi encontardo!");
       }      
   }
//--------------------------------------------------------------              
   public void insert(String nome, double altura, int idade)
      {
          if (n == 0)
            a[0] = new Jogador(nome, altura, idade);
          int j;
      for(j=0; j<n; j++)        // localiza onde esse elemento se encaixa
         if(a[j].getIdade() <= idade)            // Usando aqui busca linear
         {a[n] = new Jogador(nome, altura, idade);}// insere o elemento na posição necessária
         else{
             a[n] = a[n-1];
             a[n-1] = new Jogador(nome, altura, idade);
         }
      n++;
      }
//--------------------------------------------------------------
   public boolean delete(String e)
      {                              
      for(int j=0; j<n; j++){        // varre o vetor 
         if( a[j].getNome().charAt(0) == e.charAt(0)){
            for(int k=j; k<=n; k++){ // move os mais altos para "frente"
                System.out.println("O nome " + a[k].getNome() + " foi excluido na linha " + (k+1) + " do vetor.");
                    a[k] = a[k+1];
                    n--;
                }
                return true;
            }
          }
       return false;
      }
//--------------------------------------------------------------
   public void display()            // comentario aqui
      {
      for(int j=0; j<n; j++)       // comentario aqui
         a[j].displayJogador();          // comentario aqui
      }
}
