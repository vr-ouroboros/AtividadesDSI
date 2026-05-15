/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package packageP1;

/**
 *
 * @author Vitor
 */
public class TestaBiblioteca {

    public static void main(String[] args) {
        Livro l = new Livro();
        
        l.setTitulo("Vidas Secas");
        l.setAutor("Graciliano Ramos");
        l.setnumeroPaginas(176);
        l.setAno(1938);
        l.setgenero("Ficção");
        l.setDisponivel(true);
        
        
        Revista r = new Revista();
        
        r.setTitulo("Superinteressante");
        r.setEditora("Abril");
        r.setAutor("Almyr Gajardoni");
        r.setmesPublicacao("Setembro");
        r.setAno(1987);
        r.setnumeroEdicao(0001);
        r.setDisponivel(true);
        
        //Imprimindo dados
        
        System.out.println("=================================================");
        System.out.println("Informações do Livro: ");
        l.informacoes();

        
        System.out.println("=================================================");
        System.out.println("Informações da Revista: ");
        r.informacoes();
        
        //testando empréstimo e imprimindo dados
        l.emprestaLivro(15);
        l.informacoes();
        
        r.emprestaRevista(20);
        r.informacoes();
        
        // testando devolução
        l.devolveLivro();
        l.informacoes();
        
        r.devolveRevista();
        r.informacoes();
    }
    
}
