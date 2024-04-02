/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package pkginterface;

/**
 *
 * @author Quiqu
 */
public class Interface {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        AreaCalculavel a = new Retangulo(3,2);
        AreaCalculavel a2 = new Circulo(2);
        AreaCalculavel a3 = new Quadrado(2);
        System.out.println(a.calculaArea());
        System.out.printf("%.2f\n",a2.calculaArea());
        System.out.println(a3.calculaArea());
    }
    
}
