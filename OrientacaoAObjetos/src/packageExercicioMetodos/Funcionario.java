/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package packageExercicioMetodos;

/**
 *
 * @author Vitor
 */
public class Funcionario {
String nome;
double salario;


void aumentaSalario(double aumento) {
    this.salario += aumento;
}

void consultaDados () {
    System.out.println("Nome do Funcionário: " + this.nome);
    System.out.println("Salario do Funcionário: " + this.salario);
}
}
