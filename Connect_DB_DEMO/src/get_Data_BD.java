import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.Arrays;
import java.util.Scanner;

public class get_Data_BD {
        public static void main(String args[]) {
                Scanner scanner = new Scanner(System.in);
                int opcao;

                while (true) {
                        System.out.println("Menu:");
                        System.out.println("1. Listar o id dos Funcionarios");
                        System.out.println("2. Alterar o id dos Funcionarios");
                        System.out.println("3. Apagar o id dos Funcionarios");
                        System.out.println("4. Inserir o id dos Funcionarios");
                        System.out.println("0. Sair");

                        System.out.print("Escolha uma opção: ");
                        opcao = scanner.nextInt();

                        switch (opcao) {
                                case 1:
                                        try {

                                                Connection con = Connect_DB.conectar();


                                                Scanner sc = new Scanner(System.in);
                                                System.out.println("Insira o ID do funcionário: ");
                                                int id_func = sc.nextInt();

                                                // Query variável
                                                PreparedStatement myStmt = null;
                                                ResultSet rs = null;

                                                try {
                                                        myStmt = con.prepareStatement("select * from funcionario where ID_Funcionario >= ?");
                                                        myStmt.setInt(1, id_func);

                                                        rs = myStmt.executeQuery();
                                                        System.out.println("Query variável - traz apenas o funcionário escolhido");
                                                        while (rs.next()) {
                                                                System.out.println(rs.getString(1));
                                                        }

                                                        System.out.println("Query fixa - trazer todos os funcionários");
                                                        // Query fixa
                                                        Statement stmt = con.createStatement();
                                                        rs = stmt.executeQuery("select * from funcionario");
                                                        int i = 0;
                                                        while (rs.next()) {
                                                                System.out.println(rs.getString(1) + "  " + rs.getString(2) + "  " + rs.getString(3));
                                                                i++;
                                                        }

                                                        // Fecho da ligação
                                                        con.close();
                                                } finally {
                                                        // Fechar recursos no bloco finally
                                                        if (rs != null) rs.close();
                                                        if (myStmt != null) myStmt.close();
                                                }
                                        } catch (Exception e) {
                                                e.printStackTrace();
                                        }
                                        break;
                                case 2:
                                        try {
                                                Connection con = Connect_DB.conectar();

                                                Scanner sc = new Scanner(System.in);
                                                System.out.println("Insira o ID do funcionário a ser apagar: ");
                                                int idToUpdate = sc.nextInt();

                                                System.out.println("Insira o novo ID_Funcionario: ");
                                                int novoId = sc.nextInt();

                                                // Query variável
                                                PreparedStatement myStmt = null;

                                                try {
                                                        myStmt = con.prepareStatement("UPDATE funcionario SET ID_Funcionario = ? WHERE ID_Funcionario = ?");
                                                        myStmt.setInt(1, novoId);
                                                        myStmt.setInt(2, idToUpdate);

                                                        int rowsAffected = myStmt.executeUpdate();
                                                        System.out.println(rowsAffected + " linha atualizada.");

                                                        // Fecho da ligação
                                                        con.close();
                                                } finally {
                                                        // Fechar recursos no bloco finally
                                                        if (myStmt != null) myStmt.close();
                                                }
                                        } catch (Exception e) {
                                                e.printStackTrace();
                                        }
                                        break;
                                case 3:
                                        try {
                                                Connection con = Connect_DB.conectar();

                                                Scanner sc = new Scanner(System.in);
                                                System.out.println("Insira o ID do funcionário a apagar: ");
                                                int ApagID = sc.nextInt();

                                                // Query variável
                                                PreparedStatement myStmt = null;

                                                try {
                                                        myStmt = con.prepareStatement("DELETE FROM funcionario (ID_Funcionario) VALUES (?)");
                                                        myStmt.setInt(1, ApagID);

                                                        int rowsAffected = myStmt.executeUpdate();
                                                        System.out.println(rowsAffected + " linha inserida.");

                                                        // Fecho da ligação
                                                        con.close();
                                                } finally {
                                                        // Fechar recursos no bloco finally
                                                        if (myStmt != null) myStmt.close();
                                                }
                                        } catch (Exception e) {
                                                e.printStackTrace();
                                        }
                                        break;
                                case 4:
                                        try {
                                                Connection con = Connect_DB.conectar();

                                                Scanner sc = new Scanner(System.in);
                                                System.out.println("Insira o ID do funcionário a inserir: ");
                                                int InsereID = sc.nextInt();

                                                // Query variável
                                                PreparedStatement myStmt = null;

                                                try {
                                                        myStmt = con.prepareStatement("INSERT INTO funcionario (ID_Funcionario) VALUES (?)");
                                                        myStmt.setInt(1, InsereID);

                                                        int rowsAffected = myStmt.executeUpdate();
                                                        System.out.println(rowsAffected + " linha inserida.");

                                                        // Fecho da ligação
                                                        con.close();
                                                } finally {
                                                        // Fechar recursos no bloco finally
                                                        if (myStmt != null) myStmt.close();
                                                }
                                        } catch (Exception e) {
                                                e.printStackTrace();
                                        }
                                        break;



                                case 0:

                                        System.out.println("A sair do programa...");
                                        System.exit(0);
                                        break;
                                default:
                                        // msg default
                                        System.out.println("Opção nao existe no programa, escolha uma opção de 1-4 ou 0 para sair");
                        }
                }
        }
}

