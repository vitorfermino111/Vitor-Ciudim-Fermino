/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package e6;

import java.util.Scanner;

/**
 *
 * @author Aluno
 */
public class Usuaria {
    public static void main (String[] args)
    {
        String no = null;
        int pri = 0;
        Construtor c = new Construtor();
        Scanner i = new Scanner(System.in);
        Scanner nome = new Scanner(System.in);
        
        while (c.getEs() == true)
        {
            System.out.println("\n Bem vindo a hospital cura total, escolha a opção:");
            System.out.println(" Digite 1 para cadastra paciente.");
            System.out.println(" Digite 2 para chamar o próximo paciente.");
            System.out.println(" Digite 3 para finalizar o sitema.");
            int pega = i.nextInt();
            switch(pega)
            {
                case 1:
                {
                    System.out.println("\nInforme o nome do paciente:");
                    no = nome.nextLine();
                    System.out.println("Informe a prioridade do paciente; 1-Baixa, 2-Média e 3-Alta.");
                    pri = i.nextInt();
                    System.out.println(c.Inserir(no, pri));
                    break;
                }
                case 2:
                {
                    System.out.println(c.Remove());
                    break;
                }
                case 3:
                {
                    c.statu();
                    System.out.println("\n Aplicação finalizada.");
                    break;
                }
                  
            }
        }        
    }
}
