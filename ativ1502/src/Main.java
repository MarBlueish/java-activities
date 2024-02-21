// Classe principal
public class Poligono {
    // Atributos da classe Poligono
    private int numeroLados;

    // Construtor da classe Poligono
    public Poligono(int numeroLados) {
        this.numeroLados = numeroLados;
    }

    // Método da classe Poligono
    public void exibirNumeroLados() {
        System.out.println("Número de lados: " + numeroLados);
    }
}

// Subclasse Triangulo, que herda da classe Poligono
public class Triangulo extends Poligono {
    // Atributo adicional da subclasse Triangulo
    private String tipo;

    // Construtor da subclasse Triangulo
    public Triangulo(int numeroLados, String tipo) {
        // Chama o construtor da classe Poligono usando a palavra-chave "super"
        super(numeroLados);
        this.tipo = tipo;
    }

    // Método adicional da subclasse Triangulo
    public void exibirTipo() {
        System.out.println("Tipo de triângulo: " + tipo);
    }
}
