// el código genera números aleatorios, permite al usuario elegir un criterio de divisibilidad
// (múltiplos de 5 o de 7) y luego muestra los números que cumplen con ese criterio resaltados
// de forma especial.

import java.util.Random;
import java.util.Scanner;

public class codigo6 {
    public static void main(String[] args) {
        // Se crea un objeto Random para generar números aleatorios.
        Random rand = new Random();

        // Se declara e inicializa un array de 20 números enteros.
        int[] n = new int[20];

        // Se itera 20 veces para llenar el array con números aleatorios entre 20 y 400.
        for (int i = 0; i < 20; i++) {
            n[i] = rand.nextInt(381) + 20; // Genera un número aleatorio entre 0 y 380 y le suma 20.
            System.out.print(n[i] + " "); // Imprime el número generado.
        }

        // Se imprime un salto de línea para mejorar la legibilidad.
        System.out.println();

        // Se crea un objeto Scanner para leer la entrada del usuario.
        Scanner scanner = new Scanner(System.in);

        // Se pide al usuario que elija qué números resaltar.
        System.out.print("¿Qué números quiere resaltar? ");
        System.out.print("(1 – los múltiplos de 5, 2 – los múltiplos de 7): ");

        // Se lee la opción del usuario y se convierte a entero.
        int opcion = scanner.nextInt();

        // Se determina el múltiplo a utilizar según la opción del usuario.
        int multiplo = (opcion == 1) ? 5 : 7;

        // Se recorre el array de números.
        for (int e : n) {
            // Se comprueba si el número es múltiplo del valor seleccionado.
            if (e % multiplo == 0) {
                System.out.print("[" + e + "] "); // Imprime el número entre corchetes si es múltiplo.
            } else {
                System.out.print(e + " "); // Imprime el número normal si no es múltiplo.
            }
        }

        // Se cierra el objeto Scanner para liberar recursos.
        scanner.close();
    }
}
