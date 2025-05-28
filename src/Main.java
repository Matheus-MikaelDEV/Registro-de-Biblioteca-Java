import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int i = 1, j = 0, escolha, continuar = 1;
        String[] nomeLivro = new String[100], nomeAutor = new String[100], nomePessoa = new String[100];

        while (true) {
            System.out.println("1 - Cadastrar pessoa que pegou livro.\n2 - Ver quem pegou livro.\n3 - Sair.");
            escolha = sc.nextInt();
            sc.nextLine();

            if (escolha == 1){
                while (i == 1){
                    System.out.println("Digite o nome da pessoa: ");
                    nomePessoa[j] = sc.nextLine();

                    System.out.println("Digite o nome do livro: ");
                    nomeLivro[j] = sc.nextLine();

                    System.out.println("Digite o nome do autor: ");
                    nomeAutor[j] = sc.nextLine();

                    System.out.println("Quer continuar a cadastrar pessoas que pegaram livros?(1 = SIM / 0 = NÃO) ");
                    i = sc.nextInt();
                    sc.nextLine();

                    if (i == 1){
                        j++;
                    }
                }
            }else if (escolha == 2){
                for (i = 0; i <= j; i++){
                    System.out.printf("Pessoa %d:\n", i+1);
                    System.out.printf("Nome da pessoa: %s\nNome do livro: %s\nNome do autor: %s\n", nomePessoa[i], nomeLivro[i], nomeAutor[i]);
                    System.out.println("---------------------------------------");
                }
            }else if (escolha == 3){
                break;
            }else if (escolha >= 4){
                System.out.println("Opção Inválido!(1,2 ou 3)");
            }
        }

        sc.close();
    }
}