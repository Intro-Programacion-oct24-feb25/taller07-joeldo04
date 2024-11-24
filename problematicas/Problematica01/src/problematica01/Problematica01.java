/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package problematica01;

import java.util.Locale;
import java.util.Scanner;

/**
 *
 * @author Joel
 */
public class Problematica01 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        entrada.useLocale(Locale.US);
        String nombre; 
        String posicion; 
        int edad; 
        double estatura; 
        boolean salida = true; 
        String listado_jugadores = "Listado de Jugadores\n";
        String listado_edades = "Listado de Edades\n"; 
        double sumaEdades = 0;
        double sumaEstaturas = 0;
        int contador = 1;
        String respuesta; 
        while (salida) {
            System. out.println("Ingrese el nombre del jugador");
            nombre = entrada.nextLine() ;
            System.out.println("Ingrese la posicion en el campo de juego del "
                               + "jugador");
            posicion = entrada.nextLine();
            System.out.println("Ingrese la edad del jugador");
            edad = entrada.nextInt ();
            System.out.println("Ingrese la estatura del jugador");
            estatura = entrada. nextDouble();
            entrada. nextLine ();
            listado_jugadores = String.format("%s %d. %s -%s-, edad %d, estatura"
                                              + " %.2f\n", listado_jugadores,
                                            contador, nombre, posicion, edad, 
                                            estatura);
            listado_edades = String.format("%s%d\n", listado_edades, edad);
            sumaEdades = sumaEdades + edad;
            sumaEstaturas = sumaEstaturas + estatura;
            
            contador = contador +1;
            System.out.println("Escriba si para salir");
            respuesta = entrada.nextLine();
            if (respuesta.equals ("si")){
                salida = false;               
                
            }
        }
        double prom_edades =sumaEdades / (contador -1);
        double prom_estatura =sumaEstaturas / (contador -1);
        
        System.out.printf("\n%s\n%s", listado_jugadores, listado_edades);
        System.out.printf("\nPromedio de edades: %.1f", prom_edades);
        System.out.printf("\nPromedio de estaturas: %.1f", prom_estatura);
    }
        
}            
   