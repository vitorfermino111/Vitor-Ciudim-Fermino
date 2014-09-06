package ExercicioAvancado;

import java.util.Scanner;

public class Usuario {
    public static void main(String[] args)
      {
      int q = 0;
      Scanner entrada = new Scanner (System.in); //pega int
      Scanner entrada2 = new Scanner (System.in); // pega String
      Scanner entrada3 = new Scanner (System.in); // pega double
      String nome;
      double altura;
      int idade;
          
          System.out.println("\nInforme a quantidade de jogadores desejados!");
          q = entrada.nextInt();
          System.out.println("");
          Estrutura s = new Estrutura(q);
          
          for (int x=0; x<q; x++)
          { 
          System.out.println("\nDigite o "+(x+1)+"º nome!!!");
          nome = entrada2.nextLine();
          System.out.println("Digite a "+(x+1)+"º altura!!!");
          altura = entrada3.nextDouble();
          System.out.println("Digite o "+(x+1)+"º idade!!!");
          idade = entrada.nextInt();
          s.insert(nome, altura, idade);
          } 
          
          System.out.println("\nMuito Bem! Agora digite um nome para encontrar!");
          nome = entrada2.nextLine();
          System.out.println(s.findLinear(nome));
          
          System.out.println("\nMuito Bem! Agora digite uma idade para encontrar!");
          idade = entrada.nextInt();
          s.findOrdenado(idade);
          
          System.out.println("\nMuito Bem! Selecione um nome de jogador para deletar:");
          nome = entrada2.nextLine();
          if (!s.delete(nome))
              System.out.println("Não foi encontrado o nome!");
          else
          s.delete(nome);
          
          System.out.println("");
          s.display();                // comentario aqui
      }  // end main()
}
