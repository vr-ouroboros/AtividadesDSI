/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package packageOrientacao;

/**
 *
 * @author Vitor
 */
public class TestaTudo {

    public static void main(String[] args) {
        Agencia a1 = new Agencia();
        Cliente c1 = new Cliente();
        Conta co1 = new Conta();
        CartaoDeCredito cdc1 = new CartaoDeCredito();
        
        c1.codigo = 1;
        c1.nome = "Vitor Rodrigues";
        a1.numero = 1234;
        
        co1.numero = 1234;
        co1.saldo = 1000;
        co1.limite = 500;
        
        cdc1.numero = 1111;
        cdc1.dataDeValidade = "12/12/2027";
        
        System.out.println("Agencia: " + a1.numero);
        System.out.println("Código do Cliente: " + c1.codigo);
        System.out.println("Nome do Cliente: " + c1.nome);
        System.out.println("Número da Conta do Cliente: " + co1.numero);
        System.out.println("Saldo da Conta do Cliente: " + co1.saldo);
        System.out.println("Limite da Conta do Cliente: " + co1.limite);
        System.out.println("Número do Cartão de Crédito do Cliente: " + cdc1.numero);
        System.out.println("Data de Validade do Cartão de Crédito: " + cdc1.dataDeValidade);
    }
    
}
