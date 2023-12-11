/**
 * El programa crea un array de enteros de tamaño 100 y lo rellena con valores
 * enteros aleatorios entre 1 y 10. Luego pide un valor N y mostrará en 
 * qué posiciones del array aparece N
 * 
 * @author Ángel Pérez Gutiérrez
 */
public class Ejercicio9 {
    public static void main(String[] args) {
        int[] num = new int[100];
        for (int i = 0; i < num.length; i++) {//Se rellena el array con 100 valores aleatorios
            num[i] = (int) Math.floor(Math.random() * 10 + 1);

        }
        System.out.println("Introduce un valor");
        int valor = Integer.parseInt(System.console().readLine());
        for (int i = 0; i < num.length; i++) {//El programa comprueba en cuáles posiciones aparece N en el array
            if (valor == num[i]) {
                System.out.println("Posición del array número " + i);
            }
        }
    }
}
