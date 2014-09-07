
package ExercicioAvancado;

public class Jogador 
{
   private String nome;     // instacia das variáveis 
   private double altura;
   private int idade;
//--------------------------------------------------------------
      public Jogador(String nome, double altura, int a)
      {                               
      this.nome = nome;
      this.altura = altura;
      idade = a;
      }
//--------------------------------------------------------------
   public void displayJogador()   //Imprime na tela os atributos da classe jogador
      {
      System.out.print("   Nome: " + nome);    
      System.out.print(", Altura: " + altura);
      System.out.println(", Idade: " + idade);
      }
//--------------------------------------------------------------
   public int getIdade()           // retorna a idade do jogador
      { return idade; }
//--------------------------------------------------------------
   public String getNome()           // retorna a idade do jogador
      { return nome; }
   
   public double getAltura()           // retorna a idade do jogador
      { return altura; }
}

