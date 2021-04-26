import java.io.*;

public class Methods {

    public static void dispMenu() {
        // int opcion_1;

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

    public static void readCsv(String args, Sedes a) {
        String path = System.getProperty("user.dir") + "/" + args;
        String line = "";
        int bookNumber = 0, firstLine = 0;

        try {
            BufferedReader csvReader = new BufferedReader(new FileReader(path));
            while ((line = csvReader.readLine()) != null) {
                if (firstLine == 0) {
                    firstLine++;
                    continue;
                }
                bookNumber++;
                line = line.replace(",\"", "@\"");
                line = line.replace("\",", "\"@");
                line = line.replace(", ", "?");
                line = line.replace(",", "@");
                line = line.replace("?", ", ");
                String[] row = line.split("@");

                Book b = new Book(row[0], row[1], Integer.valueOf(row[2]));

                Shelve sh = new Shelve(Integer.valueOf(row[3]), row[4]);
                sh.addBook(b);

                Sede se = new Sede(Integer.valueOf(row[5]), row[6], row[7]);
                se.addShelve(sh);

                a.addSede(se);

                // System.out.println(se);
            }

            csvReader.close();
            // System.out.print(a);

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

}
