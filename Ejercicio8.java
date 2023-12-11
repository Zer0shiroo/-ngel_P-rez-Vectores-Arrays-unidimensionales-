/**
 * Programa que cree un array con 100 números reales aleatorios entre 0 y 1 
 * y luego pida al usuario un valor real R y mostrará cuántos valores son superiores a R
 * 
 * @author Ángel Pérez Gutiérrez
 */

public class Ejercicio8 {
    public static void main(String[] args) {
        //Ponemos un contador para mostrar cántos valores son superiores a R
        int contador = 0;
        Double[] num = new Double[100];
        for (int i = 0; i < num.length; i++) {//Aquí seleccionamos 100 valores al azar entre 0 y 1 y los almacenamos en un array
            num[i] = Math.random();
        }
        System.out.println("Inserte un valor real R");
        double valorR = Double.parseDouble(System.console().readLine());

        System.out.print("Valores del array igual o superior a R:");
        for (int i = 0; i < num.length; i++) {
            if (valorR <= num[i]) {//Los valores del array superiores sumarán uno al contador y luego mostrará el contador
                contador++;
            }
        }
        System.out.println(contador);
    }
}
