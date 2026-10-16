class IngressoComum extends Ingresso {
    public IngressoComum(int codigo, String nomeEvento, String setor, double valorBase) {
        super(codigo, nomeEvento, setor, valorBase);
    }

    @Override
    public double calcularValorFinal() { return valorBase; }

    @Override
    public String obterBeneficios() { return "Sem benefícios adicionais."; }
}