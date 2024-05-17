/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package aula04b;

/**
 *
 * @author spfcr
 */
public class NovaConta {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here

        ContaNova droga = new ContaNova();

        droga.abrirConta("cc");
        System.out.println(droga.getStatus());
        droga.fecharConta();
        droga.pagarM(50);
        droga.fecharConta();
        System.out.println(droga.getStatus());
        /*System.out.println(droga.getStatus());
        System.out.println( droga.getSaldo());*/

    }

}
