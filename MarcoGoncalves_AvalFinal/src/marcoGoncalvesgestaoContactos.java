import java.util.Scanner;

public class marcoGoncalvesgestaoContactos extends marcoGoncalvesgereContactos {


    marcoGoncalvesConexao conexao;
    Scanner scanner;





    public void MostraMenu() {
        while (true) {
            System.out.println("Escolha uma opção:");
            System.out.println("1. Inserir novo contato");
            System.out.println("2. Apagar um  contacto");
            System.out.println("3. Alterar um contacto");
            System.out.println("5. Sair");
            int opcao = scanner.nextInt();
            scanner.nextLine();

            switch (opcao) {
                case 1:
                    marcoGoncalvesinserirContato();
                    break;
                case 2:
                    marcoGoncalvesApagarContacto();
                    break;
                case 3:
                    marcoGoncalvesAlterarContacto();
                    break;
                case 5:
                    System.out.println("Opção sair selecionada");
                    return;
                default:
                    System.out.println("Selecione uma opção de 1-5");
            }
        }
    }


}
