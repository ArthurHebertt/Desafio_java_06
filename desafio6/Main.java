package desafio7;

import java.util.LinkedList;
import java.util.Scanner;

public class Main {
    static void main(String[] args) {

        Ninja naruto = new Ninja("Naruto Uzumaki", "Vila da Folha", 16);
        Ninja sasuke = new Ninja("Sasuke Uchiha", "Vila da Folha", 16);
        Ninja sakura = new Ninja("Sakura Haruno", "Vila da Folha", 16);
        Ninja neji = new Ninja("Neji Hyuga", "Vila da Folha", 18);
        Ninja kakashi = new Ninja("Kakashi Hatake", "Vila da Folha", 32);
        Ninja gaara = new Ninja("Gaara da Areia", "Vila da Areia", 16);
        Ninja bee = new Ninja("KillerBee", "Vila das Nuvens", 36);


        LinkedList<Ninja> ListaNinja = new LinkedList<>();
        ListaNinja.add(naruto);
        ListaNinja.add(sasuke);
        ListaNinja.add(sakura);
        ListaNinja.add(neji);
        ListaNinja.add(kakashi);
        ListaNinja.add(gaara);
        ListaNinja.add(bee);

        Scanner caixa = new Scanner(System.in);
        Scanner entrada = new Scanner(System.in);

        int opcao = 0;

        while (opcao != 5){
            System.out.println("===== Menu Ninja =====");
            System.out.println("1. Exibir lista de Ninjas");
            System.out.println("2. Adicionar Novos Ninjas a lista");
            System.out.println("3. Remover o primeiro Ninja da lista");
            System.out.println("4. Acessar Ninja especifico");
            System.out.println("5. Sair");
            System.out.print("Escolha uma opção: ");
            opcao= caixa.nextInt();

            switch (opcao){
                case 1:
                    System.out.println(ListaNinja); break;

                case 2:

                    System.out.println("Insira as informações do novo Ninja");
                    System.out.println("Nome: ");
                    String nome = entrada.nextLine();
                    System.out.println("idade: ");
                    int idade = caixa.nextInt();
                    System.out.println("Vila: ");
                    String vila = entrada.nextLine();
                    Ninja novoNinja = new Ninja(nome,vila,idade);
                    ListaNinja.addFirst(novoNinja); ;
                    break;

                case 3:
                    System.out.println("Deseja remover " + ListaNinja.getFirst() + " ?");
                    System.out.println("1 - sim");
                    System.out.println("2 - não");
                    opcao = caixa.nextInt();
                    if (opcao == 1) {
                        System.out.println("O Ninja " + ListaNinja.getFirst() + " foi removido");
                        ListaNinja.removeFirst();
                    } else if (opcao == 2) {
                        System.out.println("Ok, voltando ao MENU ");

                    } else {
                        System.out.println("Selecione uma opção valida");
                    } break;

                case 4:
                    System.out.println("Digite o Indice do Ninja que procura");
                    int indice = caixa.nextInt();
                    System.out.println(ListaNinja.get(indice)); break;

                case 5:
                    System.out.println("Fechando o sistema"); break;

                default:
                    System.out.println("Escolha uma opção válida"); break;


            }

        } caixa.close(); entrada.close();
    }
}
