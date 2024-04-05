public class MarcoGoncalvesPessoa {
    String nome;
    int idade;
    String genero;


    public MarcoGoncalvesPessoa(String nome, int idade, String genero, int telefone, String email) {
        this.nome = nome;
        this.idade = idade;
        this.genero = genero;

    }


    // Getters e Setters
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }
}




