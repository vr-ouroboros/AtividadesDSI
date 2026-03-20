/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package packageHeranca;

/**
 *
 * @author Vitor
 */
public class Secretaria extends Funcionario{
    private int ramal;
    
    public int getRamal() {
        return ramal;
    }
    
    public void setRamal(int ramal){
        this.ramal = ramal;
    }
    
    void mostraDados() {
        System.out.println("Ramal: " + this.getRamal());
    }
}
