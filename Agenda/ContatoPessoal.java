class ContatoPessoal extends Contato {
    private String dataAniversario;
    private String parentesco;

    public ContatoPessoal(String nome, String email, String telefone, String dataAniversario, String parentesco) {
        super(nome, email, telefone);
        this.dataAniversario = dataAniversario;
        this.parentesco = parentesco;
    }
    
    // Getters e Setters omitidos por brevidade

    @Override
    public void exibirDados() {
        super.exibirDados();
        System.out.printf("Aniversário: %s | Parentesco: %s\n", dataAniversario, parentesco);
    }
}