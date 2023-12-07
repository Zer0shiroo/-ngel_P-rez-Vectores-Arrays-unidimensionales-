public class Ejercicio12 {
    public static void main(String[] args) {
        int[] array = new int[10];
        boolean bucle = true;


        do {
            System.out.println("Menú");
            System.out.println("a.Mostrar valores");
            System.out.println("b.Introducir valor");
            System.out.println("c.Salir");

            String opcion = System.console().readLine();
            if (opcion.equals("a")) {
                for (int i = 0; i < array.length; i++) {
                    System.out.println("Valor número " + (i + 1) + ": " + array[i]);
                }
            }
            if (opcion.equals("b")) {
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
            if (opcion.equals("c")) {
                System.out.println("Hasta pronto :)");
                break;
            }

        } while (bucle);

    }
}
