/*
    Usando o conceito de pilha para produzir uma aplicação que simula a montagem de equipamentos
e manutenção caso há peças com defeito.
 */

package e4;

/**
 *
 * @author Home
 */
public class Peca {
    
    private String nome; //atributo privato para amazenar nome da peça
    
    public Peca (String nome)// metodo construtor para pegar o nome da peça
    {
        this.nome = nome;
    }
    
    public String getNome() // metodo para retornar nome da peça
    {
        return nome;
    }
}
