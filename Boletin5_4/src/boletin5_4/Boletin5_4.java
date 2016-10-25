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
        String nom1 = "Manolo";
        String nom2 = "Juan";
        pers1 = Integer.parseInt(JOptionPane.showInputDialog("Escriba el peso de Manolo: "));
        pers2 = Integer.parseInt(JOptionPane.showInputDialog("Escriba el peso de Juan: "));

        if(pers1 > pers2){
           System.out.println(nom1 + " pesa: "+ pers1 +"Kg"); 
           System.out.println("La diferencia es de: "+ (pers1 - pers2) +"Kg");
        }
        if else(pers2 > pers1){
            System.out.println(nom2 +" pesa: "+ pers2);
            System.out.println("La diferencia es de: "+ (pers2 - pers1) +"Kg");
        }
        else{
            System.out.println(nom1 + "pesa igual que " + nom2);
        }
    }
    
}
