/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package packageP1;

/**
 *
 * @author Vitor
 */
import java.awt.Font;
import java.awt.SystemColor;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;
public class Login extends JFrame{
    
    private final JPanel panelTela;
    
    private final JTextField txtUsuario;
    
    private final JPasswordField pswSenha;
    
    public Login(){
        setLocationRelativeTo(null);
        
        setResizable(false);
        
        setTitle("Login - Biblioteca");
        
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        setBounds(500, 200, 426, 212);
        
        panelTela = new JPanel();
        
        panelTela.setBackground(SystemColor.gray);
        setContentPane(panelTela);
        
        panelTela.setLayout(null);
        
        JLabel lblIdentificacao = new JLabel("IDENTIFICAÇÃO");
        
        lblIdentificacao.setBounds(144, 0, 160, 39);
        
        lblIdentificacao.setFont(new Font("Arial", 3, 19));
        
        panelTela.add(lblIdentificacao);
        
        JLabel lblUsuario = new JLabel("Usuário");
        lblUsuario.setBounds(24, 65, 70, 15);
        panelTela.add(lblUsuario);
        
        JLabel lblSenha = new JLabel("Senha");
        lblSenha.setBounds(24, 92, 70, 15);
        panelTela.add(lblSenha);
        
        
        txtUsuario = new JTextField();
        txtUsuario.setBounds(112, 63, 219, 19);
        panelTela.add(txtUsuario);
        txtUsuario.setColumns(10);
        
        pswSenha = new JPasswordField();
        pswSenha.setBounds(112, 90, 219, 19);
        panelTela.add(pswSenha);
        
        JButton btnEntrar = new JButton("Entrar");
        btnEntrar.setBounds(200, 136, 117, 25);
        panelTela.add(btnEntrar);
        
        JButton btnCadastrar = new JButton("Cadastrar");
        btnCadastrar.setBounds(50, 136, 117, 25);
        panelTela.add(btnCadastrar);
    }
    public void mostraTela(){
        Login tela = new Login();
        tela.setVisible(true);
    }
}
