/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package problematica03;

/**
 *
 * @author Joel
 */
public class Problematica03 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int numero = 2;
        int incremento = 3 ;
        int contador = 1;
        int limite = 6;
        while (contador <= limite){
            System.out.println("" + numero);
            numero = numero + incremento;
            incremento = incremento + 2;
            contador = contador + 1;        
        }
            
    }
}
