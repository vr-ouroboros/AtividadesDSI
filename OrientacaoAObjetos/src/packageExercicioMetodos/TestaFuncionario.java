/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package packageExercicioMetodos;

/**
 *
 * @author Vitor
 */
public class TestaFuncionario {

    public static void main(String[] args) {
    Funcionario f1 = new Funcionario();
    
    f1.nome = "Vitor Rodrigues";
    f1.salario = 1800;
        
        
    Funcionario f2 = new Funcionario();
        
    f2.nome = "Marcos Costa";
    f2.salario = 5000;
        
        
        System.out.println("Nome do Funcionário: " + f1.nome);
        System.out.println("Salário do Funcionário: " + f1.salario);
        
        System.out.println("Nome do Funcionário: " + f2.nome);
        System.out.println("Salário do Funcionário: " + f2.salario);
        
        f1.aumentaSalario(300);
        f1.consultaDados();
        
        f2.aumentaSalario(50);
        f2.consultaDados();
    }
    
}
