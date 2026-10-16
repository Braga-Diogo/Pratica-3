import java.util.ArrayList;
import java.util.List;

class Agenda {
    private List<Contato> contatos;
    private int quantidade;

    public Agenda() {
        this.contatos = new ArrayList<>();
        this.quantidade = 0;
    }

    public void adicionarContato(Contato c) {
        contatos.add(c);
        quantidade = contatos.size();
    }

    public boolean removerContato(String nome) {
        Contato c = buscarContatoPorNome(nome);
        if (c != null) {
            contatos.remove(c);
            quantidade = contatos.size();
            return true;
        }
        return false;
    }

    public Contato buscarContatoPorNome(String nome) {
        for (Contato c : contatos) {
            if (c.getNome().equalsIgnoreCase(nome)) return c;
        }
        return null;
    }

    public Contato buscarContatoPorEmail(String email) {
        for (Contato c : contatos) {
            if (c.getEmail().equalsIgnoreCase(email)) return c;
        }
        return null;
    }

    public Contato buscarContatoPorTelefone(String telefone) {
        for (Contato c : contatos) {
            if (c.getTelefone().equals(telefone)) return c;
        }
        return null;
    }

    public int getQuantidade() { return quantidade; }
}