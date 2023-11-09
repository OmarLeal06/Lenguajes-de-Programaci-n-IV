/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.actividad_1;

import vista.calcularIMC;

/**
 *
 * @author omar.leal
 */
public class Actividad_1 {

    public static void main(String[] args) {
        System.out.println("Hello World!");
        
        
                java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new calcularIMC().setVisible(true);
            }
        });
    }
}
