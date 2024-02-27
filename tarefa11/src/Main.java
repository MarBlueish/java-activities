import java.io.*;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int opcao;

        System.out.println("Insira uma opção de 1-4");
        System.out.println("1 para criar um ficheiro");
        System.out.println("2 para escrever num ficheiro");
        System.out.println("3 para ler um ficheiro");
        System.out.println("4 para apagar um ficheiro");

        opcao = scanner.nextInt();

        switch (opcao) {
            case 1:
                System.out.println("Opção de criação selecionada");
                criacao();
                break;
            case 2:
                System.out.println("Opção de Escrever selecionada");
                escrever();
                break;
            case 3:
                System.out.println("Opção de ler selecionada");
                ler();
                break;
            case 4:
                System.out.println("Opção de apagar selecionada");
                apagar();
                break;
            default:
                System.out.println("Opção inválida");
        }

        scanner.close();
    }

    // métodos
    public static void criacao() {
        System.out.println("Método de criação chamado");
        try {
            File criafile = new File("ficheiroteste.txt");
            if (criafile.createNewFile()) {
                System.out.println("Ficheiro Criado: " + criafile.getName());
            } else {
                System.out.println("Ficheiro já existe.");
            }
        } catch (IOException e) {
            System.out.println("Erro ao criar o ficheiro.");
            e.printStackTrace();
        }
    }

    public static void escrever() {
        System.out.println("Método de escrever chamado");
        try (FileWriter escreveFile = new FileWriter("ficheiroteste.txt")) {
            escreveFile.write("Este é um texto de teste");
            System.out.println("Escrito com sucesso");
        } catch (IOException e) {
            System.out.println("Erro ao escrever no ficheiro.");
            e.printStackTrace();
        }
    }

    public static void ler() {
        System.out.println("Método de ler chamado");
        try (Scanner scanner = new Scanner(new File("ficheiroteste.txt"))) {
            while (scanner.hasNextLine()) {
                String data = scanner.nextLine();
                System.out.println(data);
            }
        } catch (IOException e) {
            System.out.println("Erro ao ler o ficheiro.");
            e.printStackTrace();
        }
    }

    public static void apagar() {
        System.out.println("Método de apagar chamado");
        File file = new File("ficheiroteste.txt");
        try {
            if (file.delete()) {
                System.out.println("Ficheiro Apagado: " + file.getName());
            } else {
                System.out.println("Não foi possível apagar devido a erro");
            }
        } catch (SecurityException e) {
            System.out.println("Erro ao apagar o ficheiro.");
            e.printStackTrace();
        }
    }
}
