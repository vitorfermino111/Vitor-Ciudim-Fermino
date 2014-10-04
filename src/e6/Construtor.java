/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package e6;

/**
 *
 * @author Aluno
 */
public class Construtor {
    private int nEl;
    private Paciente p[];
    private boolean es = true;
    
    public Construtor()
    {
        nEl = 0;
        p = new Paciente [10000];
    }
    
    public String Inserir(String nome, int prioridade)
    {
        int j;
        if(nEl == 0)
            p[nEl++] = new Paciente(nome, prioridade);
        else
        {
            for (j = nEl-1; j>=0; j--)
            {
                if(prioridade <= p[j].RetornoPrioridade())
                    p[j+1] = p[j];
                else
                    break;
            }
            p[j+1] = new Paciente(nome, prioridade);
            nEl++;
            return ("O paciente: "+p[j+1].RetornoNome()+" com prioridade "+TratarPrioridade(j+1)+", foi cadastrado.");
        }     
        return ("O paciente: "+p[nEl-1].RetornoNome()+" com prioridade "+TratarPrioridade(nEl-1)+", foi cadastrado.");
    }
    
    public String TratarPrioridade(int prioridade)
    {
        String retorno = "nenhuma";
        if(p[prioridade].RetornoPrioridade()==1)
            retorno = "baixa";
        if(p[prioridade].RetornoPrioridade()==2)
            retorno = "média";
        if(p[prioridade].RetornoPrioridade()==3)
            retorno = "alta";
        return retorno;
    }
    
    public String Remove()
    {
        try
        {
        int re = --nEl;
        return ("O paciente: "+p[re].RetornoNome()+" com prioridade "+TratarPrioridade(re)+", foi atendido.");
        }
        catch(Exception ex)
        {
            nEl = 0;
            return ("Não tem paciente na fila.");
        }
    }
    
    public void statu()
    {
        es = false;
    }
    
    public boolean getEs()
    {
        return es;
    }
    
}
