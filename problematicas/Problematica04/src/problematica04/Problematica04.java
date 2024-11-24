/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package problematica04;

/**
 *
 * @author Lenovo
 */
public class Problematica04 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int numerador = 1;
        int denominador = 3;
        int incremento = 2;
        int contador = 1;
        System.out.println (numerador);
        while (denominador <= 15) {
            System.out.println(numerador +"/-" + denominador);
            denominador = denominador + incremento;
            contador = contador + 1;
        }       
       
    }  
}
