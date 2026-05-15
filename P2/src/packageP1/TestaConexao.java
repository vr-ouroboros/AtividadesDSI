/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package packageP1;

/**
 *
 * @author Vitor
 */
public class TestaConexao {

    public static void main(String[] args) {
        Conexao c = new Conexao();
        c.abrirConexao();
        
        try {
            Thread.sleep(4000);
            c.fecharConexao();
        } catch(InterruptedException ex) {
            System.out.println("Houve algum problema no teste de conexão." + ex.getMessage());
        }
    }
    
}
