/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejemplor;

/**
 *
 * @author Usuario iTC
 */
public class EjemploR {

    /**
     * @param args the command line arguments
     */
    
    public static int potencia(int a, int b) {
        if (b == 0) return 1;
        return a * potencia(a, b - 1);
    }

    public static void main(String[] args) {
        System.out.println(potencia(2, 10)); // Salida: 1024
    }
}
    
    

