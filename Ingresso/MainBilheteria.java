import java.util.Scanner;

public class MainBilheteria {
    public static void main(String[] args) {
        Bilheteria bilheteria = new Bilheteria();
        Scanner sc = new Scanner(System.in);
        int opcao = 0;

        do {
            System.out.println("\n--- Menu Bilheteria ---");
            System.out.println("1. Cadastrar ingresso");
            System.out.println("2. Remover ingresso");
            System.out.println("3. Buscar ingresso por código");
            System.out.println("4. Listar todos os ingressos");
            System.out.println("5. Calcular arrecadação total");
            System.out.println("6. Listar benefícios");
            System.out.println("7. Finalizar");
            System.out.print("Escolha: ");
            opcao = sc.nextInt();

            switch(opcao) {
                case 1:
                    System.out.println("1-Comum, 2-Estudante, 3-VIP");
                    int tipo = sc.nextInt();
                    bilheteria.adicionarIngresso(new IngressoComum(1, "Show", "Pista", 100.0)); // Exemplo simplificado
                    System.out.println("Cadastrado!");
                    break;
                case 4:
                    bilheteria.listarIngressos();
                    break;
                case 5:
                    System.out.printf("Arrecadação: %.2f\n", bilheteria.calcularArrecadacaoTotal());
                    break;
            }
        } while (opcao != 7);
        sc.close();
    }
}