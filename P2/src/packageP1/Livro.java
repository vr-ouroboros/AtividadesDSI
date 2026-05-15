/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package packageP1;

/**
 *
 * @author Vitor
 */
public class Livro extends ItemBiblioteca {
    private int numeroPaginas;
    private String Genero;
    private boolean Disponivel;
    
    public int getnumeroPaginas() {
        return numeroPaginas;
    }
    
    public void setnumeroPaginas(int numeroPaginas){
        this.numeroPaginas = numeroPaginas;
    }
    
    public String getGenero(){
        return Genero;
    }
    
    public void setgenero(String Genero) {
        this.Genero = Genero;
    }
    
    public boolean getDisponivel() {
        return Disponivel;
    }
    
    public void setDisponivel (boolean Disponivel) {
        this.Disponivel = Disponivel;
    }
    
    @Override
    public void informacoes(){
        System.out.println("Nome do Livro: " + getTitulo());
        System.out.println("Autor do Livro: " + getAutor());
        System.out.println("Ano de Lançamento: " + getAno());
        System.out.println("Genêro: " + getGenero());
        System.out.println("Número de Páginas: " + getnumeroPaginas());
        System.out.println("Disponível para Empréstimo: " + getDisponivel());
    }
    
    public void emprestaLivro() {
        this.setDisponivel(false);
    }
    
    public void emprestaLivro(int dias) {
        this.setDisponivel(false);
        System.out.println("Emprestado por: " + dias + "dias");
        System.out.println("=================================================");
    }
    
    public void devolveLivro() {
        this.setDisponivel(true);
    }
}
