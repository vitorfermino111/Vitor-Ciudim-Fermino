/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package e4;

/**
 *
 * @author Home
 */
public class EstruturaDados {
    private Peca p[];
    private int nEl;
    private int top;            // topo da pilha
    private boolean montagem;
     
    
    public EstruturaDados (int m)// metodo construtor que atribui o tamanho do array
    {
        p = new Peca [m];
        nEl = m;
        top = -1;
        montagem = true; //determina que o produto ainda esta em montagem
    }
    
    public boolean Statu() //retorna a situação do produto
    {
        return montagem;
    }
    
    public void Pronto()
    {
        montagem = false;
    }
    
    public void Insirir(String nome) //inserir o nome das pessas no array
    {
      p[++top] = new Peca(nome);
    }
    
    public String Topo(int t)
    {
        return p[t].getNome();
    }
    
    public String mostrarPeca(int t)
    {
            return p[t].getNome();
    }    
    
    public int findByName(String searchKey)
      {
          for (int x = 0; x<nEl; x++)
          {
              if (p[x].getNome().equals(searchKey))
                  return x;
          }
        return 0;
      }
}
