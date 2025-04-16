import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Finalizar {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        ArrayList<Integer> ids = new ArrayList<>();
        ArrayList<String> nomes = new ArrayList<>();

        int proximold = 1;

        while (true) {
            System.out.println("\n ##### MENU #####");
            System.out.println("1 - Cadastrar Produto");
            System.out.println("2 - Listar Produtos");
            System.out.println("3 - Alterar Produto");
            System.out.println("4 - Excluir Produto");
            System.out.println("5 - Sair");

            int opcao = scanner.nextInt();
            scanner.nextLine();

            if (opcao == 1) {
                System.out.println(" Nome do produto: ");
                String nome = scanner.nextLine();


                ids.add(proximold++);
                nomes.add(nome);
                System.out.println("Produtp cadastrado com sucesso!");

            } else if (opcao == 2) {
                if (ids.isEmpty()) {
                    System.out.println("Nenhum produto cadastrado");
                } else {
                    System.out.println("\n ## Lista de Produtos ##");
                    for (int i = 0; i < ids.size(); i++) {
                        System.out.println(" ID: " + ids.get(i) + " Nome: " + nomes.get(i));
                    }
                }
            } else if (opcao == 3) {
                System.out.println("Digite o ID do produto a alterar");
                int idAlt = scanner.nextInt();
                scanner.nextLine();

                int index = ids.indexOf(idAlt);
                if (index != -1) {
                    System.out.println("Novo nome: ");
                    nomes.set(index, scanner.nextLine());
                    System.out.println("Produto alterado com sucesso!");
                } else {
                    System.out.println("Produto não encontrado");

                }
            } else if (opcao == 4) {
                System.out.println("Digite o ID do produto a excluir");
                int idExc = scanner.nextInt();

                int index = ids.indexOf(idExc);
                if (index != -1) {
                    ids.remove(index);
                    nomes.remove(index);
                    System.out.println("Produto removido com sucesso");
                }else {
                    System.out.println("Produto não encontrado");
                }
            } else if (opcao == 5) {
                System.out.println("#### Sistema encerrado ####");
            }else {
                System.out.println("Opção inválida. Tente novamente");
            }

        }

    }
}



