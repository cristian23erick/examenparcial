/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package examenparcial;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author alumno
 */
public class Examenparcial {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        //marcas de celular
       TelefonoMovil telefonoMovil01 = new TelefonoMovil();
        telefonoMovil01.setPantalla("4.7");
        telefonoMovil01.setCamara("8MP");
        telefonoMovil01.setProcesador("1.4GHZ");
        
        TelefonoMovil telefonoMovil02 = new TelefonoMovil();
        telefonoMovil01.setPantalla("4.7");
        telefonoMovil01.setCamara("8MP");
        telefonoMovil01.setProcesador("1.4GHZ");
        
        TelefonoMovil telefonoMovil03 = new TelefonoMovil();
        telefonoMovil01.setPantalla("4.7");
        telefonoMovil01.setCamara("8MP");
        telefonoMovil01.setProcesador("1.4GHZ");
        
        ArrayList<TelefonoMovil> listaTelefonoMoviles = new ArrayList<TelefonoMovil>();
        
        listaTelefonoMoviles.add(telefonoMovil01);
        listaTelefonoMoviles.add(telefonoMovil02);
        listaTelefonoMoviles.add(telefonoMovil03);

                
        
        
    System.out.println("EXAMEN PARCIAL");
        System.out.println("TOMAYLLA ERICK");
    System.out.println(" ");
    System.out.println(" CATALOGO DE TELEFONO MOVIL");
    System.out.println(" ");
    System.out.println(" TELEFONO MOVILES");
    System.out.println(" [1] SAMSUNG S6");
    System.out.println(" [2]  IPHONE 6");
    System.out.println(" [1]  HUAWEI P8");
    System.out.println("\n SELECCIONE UN MODELO");
    
char opcion = input.next().charAt(0);

switch (opcion) {
    case 1:
        System.out.println(" PANTALLA  : 8.4\n");
        System.out.println("CAMARA     :8M'P\n ");
        System.out.println("PROCESADOR : 1.4GHZ");
        break;
        
        case 2:
        System.out.println(" PANTALLA  : 8.4\n");
        System.out.println("CAMARA     :8M'P\n ");
        System.out.println("PROCESADOR : 1.4GHZ");
        break;
            
            case 3:
        System.out.println(" PANTALLA  : 8.4\n");
        System.out.println("CAMARA     :8M'P\n ");
        System.out.println("PROCESADOR : 1.4GHZ");
        break;
                
                System.out.println(" [C] Claro");
                System.out.println(" [E] ENTEL");
                System.out.println(" [M] MOVISTAR");
            
                
        System.out.println("\n Seleccione la operadora :");
                     
                     char operadora = sc.next().charAt(0);
                
                
                
                
                             
                             
                             
                             
}
        }
    
}
