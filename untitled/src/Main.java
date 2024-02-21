public class Main.java {
    public static void main(String[] args) {
        // Obtendo o valor de π
        double pi = Math.PI;

        // Agora você pode usar a variável 'pi' nos seus cálculos
        System.out.println("O valor de pi é: " + pi);

        // Exemplo de uso em algum cálculo (não fornecendo a resposta final)
        double raio = 5.0;
        double area = calcularAreaDoCirculo(raio);
        System.out.println("A área do círculo com raio " + raio + " é: " + area);
    }

    // Exemplo de uma função que utiliza o valor de π
    public static double calcularAreaDoCirculo(double raio) {
        // Aqui você pode usar Math.PI para calcular a área do círculo
        return Math.PI * raio * raio;
    }
}