/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package e3;

import ExercicioAvancado.Jogador;

/**
 *
 * @author Aluno
 */
public class Conteiner {
    private Animal m[];
    private int nEl;
    
    public Conteiner(int m)
    {
        this.m = new Animal[m];
        nEl = 0;
    }
    
    public void inserir(String n, String c, double t)
    {
        if (nEl == 0)
            m[0] = new Animal(n, c, t);
          int j;
      for(j=0; j<nEl; j++)
         {
             m[nEl] = new Animal(n, c, t);
         }// insere o elemento na posição necessária
      nEl++;
    }
    
    public void ordenaTamanho()
    {
        int x, y;

        for (x = 1; x<nEl; x++)
        {
            Animal tempo = m[x];
            y = x;
            while (y>0 && m[y-1].getTamanho()>= tempo.getTamanho())
            {
                m[y] = m[y-1];               
                y--;
            }
            m[y] = tempo;
        }
    }
    
    public void mostrarAnimal()
    {
        for (int t = 0; t<nEl; t++)
            m[t].displayAnimal();
    }
    
}
