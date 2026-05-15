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
public class Cadastro extends JFrame{
    
    private final JPanel tela;
    private final JTextField txtNome;
    private final JTextField txtUsuario;
    private final JPasswordField passSenha;
    private final JPasswordField passConfSenha;
    
    public Cadastro() {
        setLocationRelativeTo(null);
        setResizable(false);
        setTitle("Cadastro");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setBounds(500, 200, 426, 230);
        
        tela = new JPanel();
        tela.setBackground(SystemColor.gray);
        setContentPane(tela);
        tela.setLayout(null);
        
        JLabel lblIdentificacao = new JLabel("Informar campos para cadastro");
        lblIdentificacao.setBounds(60, 0, 500, 39);
        lblIdentificacao.setFont(new Font("Arial", 3, 19));
        tela.add(lblIdentificacao);
        
        JLabel lblNome = new JLabel("Nome");
        lblNome.setBounds(24, 50, 70, 15);
        tela.add(lblNome);
        
        txtNome = new JTextField();
        txtNome.setBounds(120, 50, 219, 19);
        tela. add(txtNome);
        txtNome.setColumns(10);
        
        JLabel lblUsuario = new JLabel("Usuário");
        lblUsuario.setBounds(24, 75, 70, 15);
        tela.add(lblUsuario);
        
        txtUsuario = new JTextField();
        txtUsuario.setBounds(120, 75, 219, 19);
        tela.add(txtUsuario);
        txtUsuario.setColumns(10);
        
        JLabel lblSenha = new JLabel("Senha");
        lblSenha.setBounds(24, 100, 70, 15);
        tela.add(lblSenha);
        
        passSenha = new JPasswordField();
        passSenha.setBounds(120, 100, 219, 19);
        tela.add(passSenha);
        
        JLabel lblConfSenha = new JLabel("Confirmar Senha");
        lblConfSenha.setBounds(24, 125, 100, 15);
        tela.add(lblConfSenha);
        
        passConfSenha = new JPasswordField();
        passConfSenha.setBounds(120, 125, 219, 19);
        tela.add(passConfSenha);
        
        JButton btnCadastrar = new JButton("Cadastrar");
        btnCadastrar.setBounds(200, 156, 117, 25);
        tela.add(btnCadastrar);
        
        JButton btnCancelar = new JButton("Cancelar");
        btnCancelar.setBounds(50, 156, 117, 25);
        tela.add(btnCancelar);
    }
    public void abreTela() {
        Cadastro panelCadastro = new Cadastro();
        panelCadastro.setVisible(true);
    }
}
