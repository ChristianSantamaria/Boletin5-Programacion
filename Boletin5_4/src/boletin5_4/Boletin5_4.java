/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package boletin5_4;

import javax.swing.JOptionPane;

/**
 *
 * @author csantamariacameselle
 */
public class Boletin5_4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // 4
        int pers1, pers2;
        pers1 = Integer.parseInt(JOptionPane.showInputDialog("Escriba un numero: "));
        pers2 = Integer.parseInt(JOptionPane.showInputDialog("Escriba un numero: "));

        if(pers1 > pers2)
           System.out.println("Manolo pesa: "+ pers1); 
        else
            System.out.println("Jose pesa: "+ pers2);
    }
    
}
