import java.util.HashMap;
import java.util.Scanner;

public class Codigo7 {

    public static void main(String[] args) {

        // Creamos un objeto Scanner para leer la entrada del usuario
        Scanner scanner = new Scanner(System.in);

        // Creamos un HashMap para almacenar países y capitales
        HashMap<String, String> capitales = new HashMap<>();

        // Inicializamos el HashMap con algunos países y capitales
        capitales.put("Canadá", "Ottawa");
        capitales.put("Estados Unidos", "Washington DC");
        capitales.put("México", "Ciudad de México");
        capitales.put("Belice", "Belmopán");
        capitales.put("Costa Rica", "San José");
        capitales.put("El Salvador", "San Salvador"); // Corregido: Nombre de la capital
        capitales.put("Guatemala", "Ciudad de Guatemala");
        capitales.put("Honduras", "Tegucigalpa");
        capitales.put("Nicaragua", "Managua");
        capitales.put("Panamá", "Panamá");

        // Variable para almacenar la entrada del usuario
        String pais;

        // Bucle principal del programa
        do {
            // Pedimos al usuario que ingrese un país
            System.out.print("Escribe el nombre de un país y te diré su capital (o escribe 'salir' para terminar): ");
            pais = scanner.nextLine();

            // Verificamos si el usuario quiere salir
            if (!pais.equalsIgnoreCase("salir")) {
                // Verificamos si el país está en el HashMap
                if (capitales.containsKey(pais)) {
                    // Imprimimos la capital del país
                    System.out.println("La capital de " + pais + " es " + capitales.get(pais));
                } else {
                    // El país no está en el HashMap, preguntamos al usuario por la capital
                    System.out.print("No conozco la respuesta. ¿Cuál es la capital de " + pais + "?: ");
                    String capital = scanner.nextLine();

                    // Agregamos el país y la capital al HashMap
                    capitales.put(pais, capital);
                    System.out.println("Gracias por enseñarme nuevas capitales.");
                }
            }
        } while (!pais.equalsIgnoreCase("salir")); // El bucle continúa hasta que el usuario escribe "salir"

        // Cerramos el Scanner
        scanner.close();
    }
}
