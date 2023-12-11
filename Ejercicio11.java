/**
 * Programa que crea dos arrays de enteros de tamaño 100. Luego introducirá
 * en el primer array todos los valores del 1 al 100 y deberá copiar todos los valores
 * del primer array al segundo array en orden inverso, y mostrar ambos por pantalla
 *  
 * @author Ángel Pérez Gutiérrez
 * 
 */
public class Ejercicio11 {
    public static void main(String[] args) {
        int[] primerArray = new int[100];
        int contador = 0;//Primer array del 1 al 100 que imprime todos los resultados
        for (contador = 0; contador < primerArray.length; contador++) {
            primerArray[contador] = contador;
            System.out.println(contador + 1);
        }

        int[] segundoArray = new int[100];//Segundo array que imprime los resultados inversos del primer array
        for (primerArray[contador-1]=contador-1; contador > 1; contador--) {
           segundoArray[primerArray[contador-1]] = contador-1;
            System.out.println(contador -1);
        }
    }
}
