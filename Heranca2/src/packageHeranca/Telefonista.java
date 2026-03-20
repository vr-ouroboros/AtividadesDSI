/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package packageHeranca;

/**
 *
 * @author Vitor
 */
public class Telefonista extends Funcionario{
    private int estacaoDeTrabalho;
    
    public int getEstacaoDeTrabalho() {
        return estacaoDeTrabalho;
    }
    
    public void setEstacaoDeTrabalho (int estacaoDeTrabalho) {
        this.estacaoDeTrabalho = estacaoDeTrabalho;
    }
    
    void mostraDados() {
        System.out.println("Estação de Trabalho: " + this.getEstacaoDeTrabalho());
    }
}
