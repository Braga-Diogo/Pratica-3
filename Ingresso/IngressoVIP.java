class IngressoVIP extends Ingresso {
    private boolean acessoBackstage;
    private int numeroLounge;

    public IngressoVIP(int codigo, String nomeEvento, String setor, double valorBase, boolean acessoBackstage, int numeroLounge) {
        super(codigo, nomeEvento, setor, valorBase);
        this.acessoBackstage = acessoBackstage;
        this.numeroLounge = numeroLounge;
    }

    @Override
    public double calcularValorFinal() { return valorBase * 1.8; }

    @Override
    public String obterBeneficios() { 
        return "Acesso Lounge VIP" + (acessoBackstage ? " e Acesso ao Backstage." : ".");
    }
}