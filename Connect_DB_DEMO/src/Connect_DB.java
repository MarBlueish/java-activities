import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Connect_DB {
    // Definição das constantes
    private static final String driver = "com.mysql.cj.jdbc.Driver";
    private static final String url = "jdbc:mysql://localhost:3306/test"; // Preencher de acordo com a BD
    private static final String user = "root"; // Preencher de acordo com a BD
    private static final String pass = ""; // Preencher de acordo com a BD

    // Método para estabelecer a ligação à Base de Dados
    public static Connection conectar() {

        Connection conexao = null;

        try {

            Class.forName(driver);

            conexao = DriverManager.getConnection(url, user, pass);
            System.out.println("Base de Dados Ligada!");
        } catch (ClassNotFoundException Driver) {
            System.out.println("Driver não localizado: " + Driver);
        } catch (SQLException Fonte) {
            System.out.println("Erro na ligação com a base de dados: " + Fonte);
        }

        return conexao;
    }
}
