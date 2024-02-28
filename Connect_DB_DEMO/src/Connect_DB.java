import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import javax.swing.JOptionPane;

public class Connect_DB 
{
    // Definição das constantes
    private static final String driver = "com.mysql.cj.jdbc.Driver";
    private static final String url = "jdbc:mysql://localhost:3306/test"; //preencher de acordo com a BD
    private static final String user = "root"; //preencher de acordo com a BD
    private static final String pass = ""; //preencher de acordo com a BD

    // Método para estabelecer a ligação à Base de Dados
    public static Connection conectar()
    {
	// Objeto de ligação à BD
        Connection conexao = null;
        // Tratamento de exceções
        try
        {
            // Chamada ao Driver de MySQL
	    Class.forName(driver);
	    // É estabelecida a ligação à BD
            conexao = DriverManager.getConnection(url, user, pass);
            JOptionPane.showMessageDialog(null, "Base de Dados Ligada!");
        }
        catch(ClassNotFoundException Driver)
        {
            JOptionPane.showMessageDialog(null, "Driver não localizado: " + Driver);

        }
        catch(SQLException Fonte)
        {
            JOptionPane.showMessageDialog(null, "Erro na ligação\n com a base de dados: \n" + Fonte);

        }
        // Retorna o objeto do tipo Connection
        return conexao;
    }
}