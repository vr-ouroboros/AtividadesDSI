/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package packageP1;

/**
 *
 * @author Vitor
 */
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
public class Conexao {
    public Connection con = null;
    public Statement stmt = null;
    public ResultSet resultset = null;
    
    
   private final String servidor = "jdbc:sqlserver://localhost:1433;databaseName=p2_login;encrypt=true;trustServerCertificate=true";
   private final String driver = "com.microsoft.sqlserver.jdbc.SQLServerDriver";
   private final String usuario = "sa";
   private final String senha = "1234";
   
   
   public Connection abrirConexao(){
    try {
        Class.forName(driver);
        
        con = DriverManager.getConnection(servidor, usuario, senha);
        stmt = con.createStatement();
        System.out.println("Conexão aberta com sucesso!");
    } catch (ClassNotFoundException | SQLException e) {
        System.out.println("Falha ao acessar banco de dados, verifique " + e.getMessage());
    }
    return con;
}
   public void fecharConexao() {
       try {
           con.close();
           
           System.out.println("Conexão fechada com sucesso!");
       } catch (SQLException e) {
           System.out.println("Erro ao encerrar conexão" + e.getMessage());
       }
   }
}
