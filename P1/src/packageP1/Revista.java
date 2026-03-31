/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package packageP1;

/**
 *
 * @author Vitor
 */
public class Revista extends ItemBiblioteca {
    private int numeroEdicao;
    private String mesPublicacao;
    private String Editora;
    private boolean Disponivel;
    
    public int getnumeroEdicao() {
        return numeroEdicao;
    }
    
    public void setnumeroEdicao(int numeroEdicao) {
        this.numeroEdicao = numeroEdicao;
    }
    
    public String getmesPublicacao() {
        return mesPublicacao;
    }
    
    public void setmesPublicacao(String mesPublicacao) {
        this.mesPublicacao = mesPublicacao;
    }
    
    public String getEditora() {
        return Editora;
    }
    
    public void setEditora(String Editora) {
        this.Editora = Editora;
    }
    
    public boolean getDisponivel() {
        return Disponivel;
    }
    
    public void setDisponivel(boolean Disponivel) {
        this.Disponivel = Disponivel;
    }
    
    @Override
    public void informacoes(){
        System.out.println("Nome da Revista: " + getTitulo());
        System.out.println("Editora: " + getEditora());
        System.out.println("Diretor de Redação: " + getAutor());
        System.out.println("Mês de Publicação: " + getmesPublicacao());
        System.out.println("Ano de Publicação: " + getAno());
        System.out.println("Disponível para Empréstimo: " + getDisponivel());
    }
    
    public void emprestaRevista() {
        this.setDisponivel(false);
    }
    
    public void emprestaRevista(int dias) {
        this.setDisponivel(false);
        System.out.println("Emprestado por: " + dias + "dias");
        System.out.println("=================================================");
    }
    
    public void devolveRevista() {
        this.setDisponivel(true);
    }
}
