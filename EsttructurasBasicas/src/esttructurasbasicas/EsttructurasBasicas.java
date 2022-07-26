/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package esttructurasbasicas;

import java.util.Scanner;

/**
 *
 * @author user
 */
public class EsttructurasBasicas {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        int cantidad = 0;
        int desgloce = 0;
        Scanner sc = new Scanner (System.in);
       
        System.out.println("Bienvenido, que cantidad desea retirar?");
        cantidad = sc.nextInt();
        
        if (cantidad>=500) {
            desgloce = cantidad / 500;
            System.out.println("Billetes " + desgloce + " billetes de 500 Lempiras");
            cantidad = cantidad % 500;
        }
         if (cantidad>=200) {
            desgloce = cantidad / 200;
            System.out.println("Billetes " + desgloce + " billetes de 200 Lempiras");
            cantidad = cantidad % 200;
        }
        
        
        
    }
    
}
