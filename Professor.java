package Argo;

import java.util.Scanner;

public class Professor 
{
    public static void main( String[] args )
    {
        Agenda agend = new Agenda();
        try (Scanner scan = new Scanner(System.in)) {
            int menu = 0;

            while(menu != 5){

                System.out.println("***** Cadastrar Professor *****");
                System.out.println("Escolha uma das opções:");
                System.out.println("1 - Cadastrar um novo professor.");
                System.out.println("2 - Listar todos os professores.");
                System.out.println("3 - Sair do cadastro.");

                menu = scan.nextInt();

                switch (menu) {
                    case 1:
                    System.out.println("Cadastro de Professor");
                    System.out.println("Digite o nome do Professor: ");
                    String nome = scan.next();
                    System.out.println("Digite o curso do Professor: ");
                    String curso = scan.next();

                    Contato cont = new Contato(nome, curso);

                    agend.adiconarContato(cont);

                    break;
                    case 2:
                        System.out.println(agend.listarContato());
                    break;
                    case 3:
                    System.out.println("Sair do Sistema");
                    break;
                    default:
                    System.out.println("Opção Inválida");

                        break;
                }

            }
        }
    }
}