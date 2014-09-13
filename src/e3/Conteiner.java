/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package e3;

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
        nEl = m;
    }
    
    public void inserir(String n, String c, double t)
    {
        for (int x = 0; x < nEl; x++)
        {
            m[x] = new Animal(n, c, t);
        }
    }
    
    public void ordenaCor()
    {
        int x, y;
        for (x = 1; x<nEl; x++)
        {
            Animal tempo = m[x];
            y = x;
            while (y>0 && m[y-1].getCor().compareTo(tempo.getCor()) >= 0)
            {
                m[y] = m[y-1];
                y--;
            }
            m[y] = tempo;
        }
    }
    
}
