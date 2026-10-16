abstract class Ingresso {
    protected int codigo;
    protected String nomeEvento;
    protected String setor;
    protected double valorBase;

    public Ingresso(int codigo, String nomeEvento, String setor, double valorBase) {
        this.codigo = codigo;
        this.nomeEvento = nomeEvento;
        this.setor = setor;
        this.valorBase = valorBase;
    }

    public int getCodigo() { return codigo; }

    public void exibirInformacoesBasicas() {
        System.out.printf("Código: %d | Evento: %s | Setor: %s | Valor Base: %.2f\n", 
                          codigo, nomeEvento, setor, valorBase);
    }

    public abstract double calcularValorFinal();
    public abstract String obterBeneficios();
}