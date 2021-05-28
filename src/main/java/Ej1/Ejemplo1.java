package Ej1;

import java.util.Scanner;

/**
 * En un hospital existen tres área : ginecología, pediatría y traumatología
 * El  presupuesto Anual del hospital se reparte de la siguiente manera:
 * 1.Ginecología        40%
 * 2.Pediatría          30%
 * 3.Traumatología      25%
 * 4.Administración      5%
 * Determinar cuanta cantidad de dinero va a cada area siendo el monto de presupuesto el dato de entrada
 */
public class Ejemplo1 {
    public static void main(String[] args) {
        double presupuesto, gineco, pedia, trauma, admin;
        Scanner lectura = new Scanner(System.in);
        Scanner pedir = new Scanner(System.in);
        String usuario;
        
        System.out.println("Ingrese su usuario");
        usuario = pedir.nextLine();
        System.out.println("Ud. esta logueado como: " + usuario);
        
        
//        System.out.println("Ingrese presupuesto anual a repartir por las areas");
//        presupuesto = lectura.nextDouble();
//        
//        gineco = (presupuesto * 40) / 100;
//        pedia = (presupuesto * 30) / 100;
//        trauma = (presupuesto * 25) / 100;
//        admin = (presupuesto * 5) / 100;
//        
//        System.out.println("Presupuesto asignado");
//        System.out.println("1.Ginecología        40%\t" + gineco);
//        System.out.println("2.Pediatría          30%\t" + pedia);
//        System.out.println("3.Traumatología      25%\t" + trauma);
//        System.out.println("4.Administración      5%\t" + admin);
//        System.out.println("TOTAL\t\t\t" + presupuesto);
        int valor;
        int suma = 0;
        for (int a = 0; a < 10; a++){
            System.out.println("ingrese nro " + (a+1) + ": ");
            valor = lectura.nextInt();
            suma += valor;
        }
        
        System.out.println("la suma de todos los nros es: " + suma);

    }
}
