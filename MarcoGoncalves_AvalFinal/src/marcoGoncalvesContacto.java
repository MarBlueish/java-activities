public class marcoGoncalvesContacto extends MarcoGoncalvesPessoa {
    int telefone;
    String email;

    // Construtor
    public marcoGoncalvesContacto(String nome, int idade, String genero, int telefone, String email) {
        super(nome, idade, genero, telefone, email); // chama o constructor da parent class
        this.telefone = telefone;
        this.email = email;
    }

    // Getters e Setters
    public int getTelefone() {
        return telefone;
    }

    public void setTelefone(int telefone) {
        this.telefone = telefone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}