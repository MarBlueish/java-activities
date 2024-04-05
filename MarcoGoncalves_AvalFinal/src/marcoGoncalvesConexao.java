import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class marcoGoncalvesConexao {
    private Connection conexao;

    public void marcoGoncalvesconectar() {
        try {
            // URL de conexão com a base de dados
            String url = "jdbc:mysql://localhost:3306/projetopessoas";
            // Nome de usuário e senha do banco de dados
            String usuario = "root";
            String senha = "";

            // Estabelecer a conexão
            conexao = DriverManager.getConnection(url, usuario, senha);
            System.out.println("Conexão estabelecida com sucesso.");
        } catch (SQLException e) {
            System.err.println("Erro ao conectar à base de dados: " + e.getMessage());
        }
    }

    public void marcoGoncalvesdesconectar() {
        if (conexao != null) {
            try {
                conexao.close();
                System.out.println("Conexão fechada.");
            } catch (SQLException e) {
                System.err.println("Erro ao fechar conexão: " + e.getMessage());
            }
        }
    }

    public Connection getConexao() {
        return conexao;
    }
}