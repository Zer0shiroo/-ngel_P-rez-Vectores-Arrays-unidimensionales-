/**
 * Programa que cree un array de 10 enteros y luego muestre
 * el siguiente menú con distintas opciones.
 * La opción ‘a’ mostrará todos los valores por pantalla. La opción ‘b’ pedirá
 * un valor V y una posición P, luego escribirá V en la posición P del array.
 * El menú se repetirá indefinidamente hasta que el usuario elija la opción ‘c’ que terminará el programa.
 * 
 * @author Ángel Pérez Gutiérrez
 */
public class Ejercicio12 {
    public static void main(String[] args) {
        int[] array = new int[10];//Creamos un array para que el usuario defina después sus valores
        boolean bucle = true;//Un bucle que se repite de forma indefinida hasta que el usuario elija la opción c en el menú

        do {
            System.out.println("Menú");
            System.out.println("a.Mostrar valores");
            System.out.println("b.Introducir valor");
            System.out.println("c.Salir");

            String opcion = System.console().readLine();
            if (opcion.equals("a")) {//Se muestran todos los valores del array
                for (int i = 0; i < array.length; i++) {
                    System.out.println("Valor número " + (i + 1) + ": " + array[i]);
                }
            }
            if (opcion.equals("b")) {//El usuario elige un valor y una posición del array
                System.out.println("Dime un valor");
                int valorV = Integer.parseInt(System.console().readLine());

                System.out.println("Dime un posición");
                int posicionP = Integer.parseInt(System.console().readLine());
                while (posicionP < 1 || posicionP > 10) {
                    System.out.println("La posición tiene que ser un valor entre 1 y 10");
                    System.out.println("Dime un posición");
                    posicionP = Integer.parseInt(System.console().readLine());
                }

                array[posicionP - 1] = valorV;

            }
            if (opcion.equals("c")) {//Sale del bucle
                System.out.println("Hasta pronto :)");
                break;
            }

        } while (bucle);

    }
}
