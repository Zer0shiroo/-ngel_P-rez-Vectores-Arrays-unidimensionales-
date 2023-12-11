/**
 * Programa para realizar cálculos relacionados con la altura de personas
 * Pedirá un valor N y luego almacenará en un array N alturas introducidas por
 * teclado.
 * Luego mostrará la altura mínima, media y máxima así como cuántas personas
 * mide por
 * encima y debajo de la media
 * 
 * @author Ángel Pérez Gutiérrez
 * 
 * 
 */
public class Ejercicio10 {
    public static void main(String[] args) {
        int valorEncimaMedia = 0;
        int valorDebajoMedia = 0;
        float mediaAltura = 0;
        System.out.println("Dime cuántas alturas desea almacenar");// El usuario dice cuántas alturas desea almacenar y
                                                                   // se van almacenando en un array
        int valor = Integer.parseInt(System.console().readLine());
        float nAltura[] = new float[valor];
        for (int i = 0; i < valor; i++) {
            System.out.println("Dime la altura número " + (i + 1));
            nAltura[i] = Float.parseFloat(System.console().readLine());
        }
        float alturaMax = 0;
        float alturaMin = 4;
        for (int i = 0; i < nAltura.length; i++) { // Un bucle for para definir cuál es la altura máxima, mínima y media

            if (nAltura[i] > alturaMax) {
                alturaMax = nAltura[i];
            }
            if (nAltura[i] < alturaMin) {
                alturaMin = nAltura[i];
            }
            mediaAltura += nAltura[i];
        }
        mediaAltura = mediaAltura / valor;
        System.out.print("Valores por encima de la media:");// Se comparan los valores para saber cuales están por
                                                            // encima de la media o por debajo de esta
        for (int i = 0; i < nAltura.length; i++) {
            if (mediaAltura < nAltura[i]) {
                valorEncimaMedia++;
            }
        }
        System.out.println(valorEncimaMedia);
        System.out.print("Valores por debajo de la media:");
        for (int i = 0; i < nAltura.length; i++) {
            if (mediaAltura > nAltura[i]) {
                valorDebajoMedia++;
            }
        }

        System.out.println(valorDebajoMedia);

        System.out.printf("Esta es la media: %.2f%n", mediaAltura);//Se imprimen todos los resultados restantes
        System.out.println("La altura máxima es:" + alturaMax);
        System.out.println("La altura mínima es:" + alturaMin);

    }
}
