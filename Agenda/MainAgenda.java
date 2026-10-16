import java.util.Scanner;

public class MainAgenda {
    public static void main(String[] args) {
        Agenda agenda = new Agenda();
        Scanner sc = new Scanner(System.in);
        int opcao = 0;

        do {
            System.out.println("\n--- Menu Agenda ---");
            System.out.println("1. Adicionar contato");
            System.out.println("2. Remover contato");
            System.out.println("3. Buscar por nome");
            System.out.println("4. Buscar por email");
            System.out.println("5. Buscar por telefone");
            System.out.println("6. Consultar tamanho");
            System.out.println("7. Finalizar");
            System.out.print("Escolha: ");
            opcao = sc.nextInt();
            sc.nextLine();

            switch(opcao) {
                case 1:
                    System.out.print("Nome: "); String nome = sc.nextLine();
                    System.out.print("Email: "); String email = sc.nextLine();
                    System.out.print("Telefone: "); String telef = sc.nextLine();
                    agenda.adicionarContato(new Contato(nome, email, telef));
                    System.out.println("Adicionado com sucesso!");
                    break;
                case 2:
                    System.out.print("Nome do contato a remover: ");
                    if (agenda.removerContato(sc.nextLine())) System.out.println("Removido com sucesso.");
                    else System.out.println("Contato não encontrado.");
                    break;
                case 3:
                case 4:
                case 5:
                    System.out.print("Termo de busca: ");
                    String termo = sc.nextLine();
                    Contato enc = null;
                    if(opcao == 3) enc = agenda.buscarContatoPorNome(termo);
                    else if(opcao == 4) enc = agenda.buscarContatoPorEmail(termo);
                    else enc = agenda.buscarContatoPorTelefone(termo);
                    
                    if(enc != null) enc.exibirDados();
                    else System.out.println("Contato não encontrado.");
                    break;
                case 6:
                    System.out.println("Total de contatos: " + agenda.getQuantidade());
                    break;
            }
        } while (opcao != 7);
        sc.close();
    }
}