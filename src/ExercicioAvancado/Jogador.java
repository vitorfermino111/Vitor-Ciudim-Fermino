
package ExercicioAvancado;

public class Jogador 
{
   private String nome;     // instacia das variáveis 
   private int altura;
   private int idade;
//--------------------------------------------------------------
      public Jogador(String nome, int altura, int a)
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
}

