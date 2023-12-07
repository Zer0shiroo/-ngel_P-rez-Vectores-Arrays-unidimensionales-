/*Crea un programa que permita al usuario almacenar una secuencia aritmética en un array y
luego mostrarla. Una secuencia aritmética es una serie de números que comienza por un
valor inicial V, y continúa con incrementos de I. Por ejemplo, con V=1 e I=2, la secuencia sería
1, 3, 5, 7, 9… Con V=7 e I=10, la secuencia sería 7, 17, 27, 37… El programa solicitará al
usuario V, I además de N (nº de valores a crear).
*/
public class Ejercicio13 {
    public static void main(String[] args) {
        System.out.println("Dime el valor inicial");
        int valorV = Integer.parseInt(System.console().readLine());
        System.out.println("Dime el incremento");
        int incrementoI = Integer.parseInt(System.console().readLine());
        System.out.println("¿Cuántos valores desea crear?");
        int numeroV = Integer.parseInt(System.console().readLine());

        int[] sucesion = new int[numeroV];
        for(int i = 0; i<numeroV; i++){
            sucesion [i] =valorV;
            System.out.println(" " + valorV + "");
            valorV= valorV+ incrementoI;
        }
    }
}
