class IngressoEstudante extends Ingresso {
    private String instituicaoEnsino;

    public IngressoEstudante(int codigo, String nomeEvento, String setor, double valorBase, String instituicao) {
        super(codigo, nomeEvento, setor, valorBase);
        this.instituicaoEnsino = instituicao;
    }

    @Override
    public double calcularValorFinal() { return valorBase * 0.5; }

    @Override
    public String obterBeneficios() { return "Direito à meia-entrada."; }
}