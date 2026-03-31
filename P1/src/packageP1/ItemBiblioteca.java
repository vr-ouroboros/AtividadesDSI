/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package packageP1;

/**
 *
 * @author Vitor
 */
public class ItemBiblioteca {
    private String titulo;
    private String autor;
    private int ano;
    
    public String getTitulo() {
        return titulo;
    }
    
    public String getAutor() {
        return autor;
    }
    
    public int getAno() {
        return ano;
    }
    
    public void setTitulo(String titulo){
        this.titulo = titulo;
    }
    
    public void setAutor(String autor){
        this.autor = autor;
    }
    
    public void setAno(int ano){
        this.ano = ano;
    }
    
        public void informacoes(){
        System.out.println("Nome do Livro: " + getTitulo());
        System.out.println("Autor do Livro: " + getAutor());
        System.out.println("Ano de Lançamento: " + getAno());
    }
        
}
