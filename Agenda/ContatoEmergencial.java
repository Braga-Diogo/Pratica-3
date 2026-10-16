class ContatoEmergencia extends Contato {
    private int grauPrioridade;
    private String observacao;

    public ContatoEmergencia(String nome, String email, String telefone, int grauPrioridade, String observacao) {
        super(nome, email, telefone);
        this.grauPrioridade = grauPrioridade;
        this.observacao = observacao;
    }

    @Override
    public void exibirDados() {
        super.exibirDados();
        System.out.printf("Prioridade: %d | Observação: %s\n", grauPrioridade, observacao);
    }
}