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
public class Animal {
    private String nome;
    private String cor;
    private double tamanho;
    
    public Animal(String nome, String cor, double tamanho)
    {
        this.nome = nome;
        this.cor = cor;
        this.tamanho = tamanho;
    }
    
    public String getNome()
    {
        return nome;
    }
    
    public String getCor()
    {
        return cor;
    }
    
    public double getTamanho()
    {
        return tamanho;
    }
    
    public String displayAnimal()
    {
        return ("Nome: "+nome+". Tamanho: "+tamanho+". Cor: "+cor);
    }
    
}
