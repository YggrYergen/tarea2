import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Methods {
    public static void dispMenu() {
        int opcion_1;

        System.out.println("Ingrese 1 para agregar libro.");
        System.out.println("Ingrese 2 para editar libro.");
        System.out.println("Ingrese 3 para buscar libro.");
        System.out.println("Ingrese 4 para quitar libro.");
        System.out.println("Ingrese 5 para agregar o quitar seccion.");
        System.out.println("Ingrese 6 para agregar o quitar estante.");
        System.out.println("Ingrese 7 para agregar o quitar piso.");
        System.out.println("Ingrese 8 para agregar o quitar edificio.");
        System.out.println("Ingrese 9 para agregar o quitar sede.");
        System.out.println("Ingrese 0 para salir.");
    }

    public static void readCsv(String args) {
        String path = "/home/rodrigo/projects/Git_Hub/tarea2/" + args;
        String line = "";
        try {
            BufferedReader csvReader = new BufferedReader(new FileReader(path));
            while ((line = csvReader.readLine()) != null) {
                // System.out.println(line);

            }
            csvReader.close();

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
