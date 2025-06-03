package Argo;

import java.util.Scanner;

public class Menu {
    public static void main( String[] args )
    {
        Agenda agend = new Agenda();
        try (Scanner scan = new Scanner(System.in)) {
            int menu = 0;

            while(menu != 5){

                System.out.println("***** Cadastrar Aluno *****");
                System.out.println("Escolha uma das opções:");
                System.out.println("1 - Cadastrar um novo aluno");
                System.out.println("2 - Listar todos os aluno");
                System.out.println("3 - Sair do cadastro");

                menu = scan.nextInt();

                switch (menu) {
                    case 1:
                    // System.out.println("Cadastro de Aluno");
                    // System.out.println("Digite o nome do Aluno");
                    // String nome = scan.next();
                    // System.out.println("Digite o curso do Aluno");
                    //String curso = scan.next();
                    Usuario cont = new Usuario(nome, curso);
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