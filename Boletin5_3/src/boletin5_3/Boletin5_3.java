/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package boletin5_3;

import javax.swing.JOptionPane;

/**
 *
 * @author csantamariacameselle
 */
public class Boletin5_3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // 3
        int num3;
        num3 = Integer.parseInt(JOptionPane.showInputDialog("Escriba un numero: "));

        if (num3 > 0)
            System.out.println("+");
        else if (num3 < 0)
            System.out.println("-");
        else
            System.out.println("Cero");
    }
    
}
