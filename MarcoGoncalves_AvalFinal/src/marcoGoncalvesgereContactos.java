import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;

public class marcoGoncalvesgereContactos  {

    marcoGoncalvesConexao conexao;
    Scanner scanner;



    public marcoGoncalvesgereContactos() {
        conexao = new marcoGoncalvesConexao();
        conexao.marcoGoncalvesconectar();
        scanner = new Scanner(System.in);
        MostraMenu(); // erro localizado aqui
    }

    public void marcoGoncalvesinserirContato() {

        System.out.println("Vamos inserir um novo contato!");
        System.out.println("Comece por inserir o nome:");
        String nome = scanner.nextLine();
        System.out.println("Agora insira o número de telefone:");
        int telefone = Integer.parseInt(scanner.nextLine());
        System.out.println("Agora insira o email:");
        String email = scanner.nextLine();
        System.out.println("Agora insira o genero:");
        String genero = scanner.nextLine();
        System.out.println("Agora insira a idade:");
        int idade = Integer.parseInt(scanner.nextLine());


        marcoGoncalvesContacto novoContato = new marcoGoncalvesContacto(nome, idade, genero, telefone, email);
    }

    public void marcoGoncalvesApagarContacto()  {
        try {
            System.out.println("Vamos apagar um contato!");
            System.out.println("Escolha o contato a apagar:");
            String sql = "SELECT * FROM contato";
            PreparedStatement statement = conexao.getConexao().prepareStatement(sql);
            System.out.println("Agora, escolha o id a apagar");
            int idContato = scanner.nextInt();
            scanner.nextLine(); // Consumir a nova linha pendente

            // Lógica para apagar o contato com o ID selecionado
            String deleteSQL = "DELETE FROM contato WHERE id = ?";
            PreparedStatement deleteStatement = conexao.getConexao().prepareStatement(deleteSQL);
            deleteStatement.setInt(1, idContato);
            int rowsAffected = deleteStatement.executeUpdate();

            if (rowsAffected > 0) {
                System.out.println("Contato com ID " + idContato + " apagado com sucesso.");
            } else {
                System.out.println("Nenhum contato encontrado com o ID " + idContato + ".");
            }

        } catch (SQLException e) {
            System.err.println("Erro ao apagar contato: " + e.getMessage());
        }
    }



    public void marcoGoncalvesAlterarContacto() {
        try {
            System.out.println("Vamos alterar um contato");
            System.out.println("Escolha o contato a alterar:");
            String sql = "SELECT * FROM contato";
            PreparedStatement statement = conexao.getConexao().prepareStatement(sql);
            ResultSet resultSet = statement.executeQuery();

            // mostra que contactos existem na db
            while (resultSet.next()) {
                int id = resultSet.getInt("id");
                String nome = resultSet.getString("nome");
                System.out.println("ID: " + id + ", Nome: " + nome);
            }

            System.out.println("Agora, escolha o ID do contato a alterar:");
            int idContato = scanner.nextInt();
            scanner.nextLine();

            // pede os novos detalhes
            System.out.println("Insira o novo nome a alterar:");
            String novoNome = scanner.nextLine();
            System.out.println("Insira o novo número de telefone a alterar:");
            int novoTelefone = scanner.nextInt();
            scanner.nextLine(); // Limpar o buffer
            System.out.println("Insira o novo email a alterar:");
            String novoEmail = scanner.nextLine();
            System.out.println("Insira o novo genero a alterar:");
            String novoGenero = scanner.nextLine();
            System.out.println("Insira a nova idade a alterar:");
            int novaIdade = scanner.nextInt();

            // Preparar a instrução de atualização
            String updateSQL = "UPDATE contato SET nome = ?, telefone = ?, email = ?, genero = ?, idade = ? WHERE id = ?";
            PreparedStatement updateStatement = conexao.getConexao().prepareStatement(updateSQL);
            updateStatement.setString(1, novoNome);
            updateStatement.setInt(2, novoTelefone);
            updateStatement.setString(3, novoEmail);
            updateStatement.setString(4, novoGenero);
            updateStatement.setInt(5, novaIdade);
            updateStatement.setInt(6, idContato);

            // Executar a atualização
            int rowsAffected = updateStatement.executeUpdate();

            if (rowsAffected > 0) {
                System.out.println("Contato com ID " + idContato + " atualizado com sucesso.");
            } else {
                System.out.println("Nenhum contato encontrado com o ID " + idContato + ".");
            }

        } catch (SQLException e) {
            System.err.println("Erro ao alterar o contacto: " + e.getMessage());
        }
    }




    //private void marcoGoncalvesEliminarContacto() nao cheguei a implantar esta função, devido a redundância entre apagar e eliminar




}
