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
import java.awt.HeadlessException;
import java.awt.SystemColor;
import java.awt.event.ActionEvent;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JOptionPane;
import javax.swing.JPasswordField;
import javax.swing.JTextField;
public class Cadastro extends JFrame{
    
    private final JPanel tela;
    private final JTextField txtNome;
    private final JTextField txtUsuario;
    private final JPasswordField passSenha;
    private final JPasswordField passConfSenha;
    private boolean usuarioValido;
    private boolean cadastroValido;
    
    private String mensagemJOption;
    private int mensagemTipo = 0;
    
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
        
        btnCadastrar.addActionListener((ActionEvent e) -> {
            try {
                Usuario usu = new Usuario();
                
                usu.setNome(txtNome.getText());
                usu.setUsuario(txtUsuario.getText());
                usu.setSenha(passSenha.getText());
                
                if("".equals(usu.getNome())){
                    mensagemJOption = "Campo nome do usuário precisa ser informado!";
                    mensagemTipo = 0;
                } else if ("".equals(usu.getUsuario())){
                    mensagemJOption = "Campo usuario precisa ser informado!";
                    mensagemTipo = 0;
                } else if ("".equals(usu.getSenha())){
                    mensagemJOption = "Campo senha precisa ser informado!";
                    mensagemTipo = 0;
                } else if (!usu.getSenha().equals(passConfSenha.getText())){
                    mensagemJOption = "Senhas não coincidem!";
                    mensagemTipo = 0;
                } else {
                    usuarioValido = usu.verificaUsuario(usu.getUsuario());
                    
                    if (usuarioValido == true){
                        mensagemJOption = "Usuario já existe.";
                        mensagemTipo = 0;
                    } else {
                        cadastroValido = usu.cadastraUsuario(usu.getNome(),
                                                             usu.getUsuario(),
                                                             usu.getSenha());
                        
                        if (cadastroValido == true){
                            mensagemJOption = "Usuario cadastrado com sucesso!";
                            mensagemTipo = 1;
                        } else {
                            mensagemJOption = "Erro ao cadastrar usuário!";
                            mensagemTipo = 0;
                        }
                    }
                }
                
                JOptionPane.showMessageDialog(null,
                        mensagemJOption, "Atenção", mensagemTipo );
                if (mensagemTipo == 1){
                    Login nLogin = new Login();
                    nLogin.mostraTela();
                    
                    dispose();
                }
            }catch (HeadlessException ec){
                System.out.println("Erro no cadastro do usuário "
                + ec.getMessage());
            }
        });
        
        btnCancelar.addActionListener((ActionEvent e) -> {
            Login nLogin = new Login();
            nLogin.mostraTela();
            dispose();
        });
    }
    public void abreTela() {
        Cadastro panelCadastro = new Cadastro();
        panelCadastro.setVisible(true);
    }
}
