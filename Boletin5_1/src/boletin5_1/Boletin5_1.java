/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package boletin5_1;

import javax.swing.JOptionPane;

/**
 *
 * @author csantamariacameselle
 */
public class Boletin5_1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // 1
        int numero;
        numero = Integer.parseInt(JOptionPane.showInputDialog("Escriba un numero: "));

        if (numero > 0)
             System.out.println("Es positivo");      
    }
    
}
