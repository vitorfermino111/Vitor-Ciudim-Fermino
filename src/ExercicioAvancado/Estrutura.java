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
   public Jogador findOrdenado(int e)
      {                              // encontra jogadores com a idade determina
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
//--------------------------------------------------------------  
   public String findLinear(String nome)
   {
       for(int x = 0; x < n ; x++)
       {
           if (a[x].getNome().equals(nome))
           {
               return ("O nome encontrado foi: "+nome);
           }
       }
        return "O nome não foi encontardo!";
   }
//--------------------------------------------------------------              
   public void insert(String nome, double altura, int idade)
      {
          int j;
          a[n] = new Jogador(nome, altura, idade);
      for(j=0; j<n; j++)        // localiza onde esse elemento se encaixa
         if(a[j].getIdade() < idade)            // Usando aqui busca linear
         {a[n] = new Jogador(nome, altura, idade);}// insere o elemento na posição necessária
         else{
             a[n] = a[n-1];
             a[n-1] = new Jogador(nome, altura, idade);
         }
      n++;
      }
//--------------------------------------------------------------
   public boolean delete(String searchName)
      {                              
      for(int j=0; j<n; j++){        // varre o vetor 
         if( searchName.equals(a[j].getNome())){
            for(int k=j; k<n; k++){ // move os mais altos para "frente"
                System.out.println("O nome " + a[k].getNome() + " foi excluido na linha " + (k+1) + " do vetor.");
                if (k+1==n) 
                n--;
                else{
                    a[k] = a[k+1];
                    n--;
                }
                return true;
            }
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
