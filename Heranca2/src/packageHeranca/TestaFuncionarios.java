/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package packageHeranca;

/**
 *
 * @author Vitor
 */
public class TestaFuncionarios {

    public static void main(String[] args) {
        Gerente g = new Gerente();
        
        g.setNome("Vitor Rodrigues");
        g.setSalario(32499.99);
        
        g.setUsuario("Vitão");
        g.setSenha("vitero");
        
        Telefonista t = new Telefonista();
        
        t.setNome("Ketelyn Rodrigues");
        t.setSalario(10999.99);
        
        t.setEstacaoDeTrabalho(6);
        
        Secretaria s = new Secretaria();
        
        s.setNome("Sineide Rodrigues");
        s.setSalario(6487.86);
        
        s.setRamal(6677);
        
        
        /*System.out.println("====================================================");
        System.out.println("GERENTE: ");
        System.out.println("Nome: " + g.getNome());
        System.out.println("Salário: " + g.getSalario());
        System.out.println("Usuário: " + g.getUsuario());
        System.out.println("Senha: " + g.getSenha());
        System.out.println("Bonificação: " + g.calculaBonificacao()); */
        
        
        /*System.out.println("====================================================");
        System.out.println("TELEFONISTA: ");
        System.out.println("Nome: " + t.getNome());
        System.out.println("Salário: " + t.getSalario());
        System.out.println("Estação de Trabalho: " + t.getEstacaoDeTrabalho());
        System.out.println("Bonificação: " + t.calculaBonificacao()); */
        
        
        /*System.out.println("====================================================");
        System.out.println("SECRETÁRIA: ");
        System.out.println("Nome: " + s.getNome());
        System.out.println("Salário: " + s.getSalario());
        System.out.println("Ramal: " + s.getRamal());
        System.out.println("Bonificação: " + s.calculaBonificacao()); */
        
        
        g.imprimeDados();
        g.mostraDados();
        s.imprimeDados();
        s.mostraDados();
        t.imprimeDados();
        t.mostraDados();
    }
    
}
