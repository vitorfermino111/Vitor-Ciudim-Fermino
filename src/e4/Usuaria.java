/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package e4;

import java.util.Scanner;

/**
 *
 * @author Home
 */
public class Usuaria {
    public static void main(String[] args)
    {
        Scanner i = new Scanner(System.in);   
        Scanner s = new Scanner(System.in);
        System.out.println("Bem vindo a aplicação de montagem de equipamento com PILHA!");
        
        System.out.println("\n Informe a quantidade de peças necessárias!");
        int numero = i.nextInt();
        EstruturaDados e  = new EstruturaDados(numero);
        for (int x = 0; x<numero; x++)
        {
            System.out.println("\n Informe o nome da "+(x+1)+"º usada na montagem!");
            String nome = s.nextLine();
            e.Insirir(nome);
        }
        
        while (e.Statu() == true)
        {
            System.out.println("\n Menu montagem de produtos!");
            System.out.println("1 - Listar peças para montar produto.");
            System.out.println("2 - Identificar peças com defeito.");
            System.out.println("3 - Listar peças cadastradas.");
            System.out.println("4 - Produto pronto.");
            int nu = i.nextInt();
            switch (nu)
            {
                case 1:
                {
                    System.out.println("Sequencia de peças para montagem:");
                    for (int x = 0; x<numero; x++)
                        System.out.println(e.Topo(x));
                    break;
                }
                case 2:
                {
                    System.out.println("Informe a peça com defeito:");
                    String defeito = s.nextLine();                    
                    System.out.println("Desmontando, peças retiradas:");
                    int posi = e.findByName(defeito);
                    for (int x = (numero-1); x>=posi; x--)
                        System.out.println(e.Topo(x));
                    System.out.println("Peça trocada: "+e.mostrarPeca(posi));
                    System.out.println("Sequencia de peças para montagem:");
                    for (int x = posi; x<numero; x++)
                        System.out.println(e.Topo(x));
                    break;
                }
                case 3:
                {
                    for (int x = (numero-1); x>=0; x--)
                        System.out.println(e.Topo(x));
                    break;
                }
                case 4:
                {
                    e.Pronto();
                    System.out.println("\n Produto finalizado!");
                    break;
                }
            }           
        }
    }
}
