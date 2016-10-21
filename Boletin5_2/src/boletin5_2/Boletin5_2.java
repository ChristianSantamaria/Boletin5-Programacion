/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package boletin5_2;

import javax.swing.JOptionPane;

/**
 *
 * @author csantamariacameselle
 */
public class Boletin5_2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // 2
        short sho1, sho2;
        sho1 = Short.parseShort(JOptionPane.showInputDialog("Escriba un numero: "));
        sho2 = Short.parseShort(JOptionPane.showInputDialog("Escriba un numero: "));

        if (sho1 > sho2)
            System.out.println(sho1 - sho2);
        else
            System.out.println(sho1 + sho2);
    }
    
}
