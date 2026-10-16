import java.util.ArrayList;
import java.util.List;

class Bilheteria {
    private List<Ingresso> ingressos = new ArrayList<>();

    public void adicionarIngresso(Ingresso i) { ingressos.add(i); }

    public boolean removerIngresso(int codigo) {
        Ingresso i = buscarIngresso(codigo);
        if (i != null) {
            ingressos.remove(i);
            return true;
        }
        return false;
    }

    public Ingresso buscarIngresso(int codigo) {
        for (Ingresso i : ingressos) {
            if (i.getCodigo() == codigo) return i;
        }
        return null;
    }

    public void listarIngressos() {
        for (Ingresso i : ingressos) {
            i.exibirInformacoesBasicas();
            System.out.printf("Valor Final: %.2f\n", i.calcularValorFinal());
        }
    }

    public double calcularArrecadacaoTotal() {
        double total = 0;
        for (Ingresso i : ingressos) total += i.calcularValorFinal();
        return total;
    }

    public void listarBeneficios() {
        for (Ingresso i : ingressos) {
            System.out.println("Ingresso " + i.getCodigo() + ": " + i.obterBeneficios());
        }
    }
}