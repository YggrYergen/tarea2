import java.io.*;

public class Methods {

    public static void readCsv(String args, Biblioteca biblioteca) {
        String path = System.getProperty("user.dir") + "/" + args;

        String line = "";
        int firstLine = 0;

        try {
            BufferedReader csvReader = new BufferedReader(new FileReader(path));
            while ((line = csvReader.readLine()) != null) {
                if (firstLine == 0) {
                    firstLine++;
                    continue;
                }

                String[] row = Methods.splitLine(line);
                Book book = new Book(row[0], row[1], Integer.valueOf(row[2]));
                Rack rack = new Rack(Integer.valueOf(row[3]), row[4]);
                Floor floor = new Floor(Integer.valueOf(row[5]));
                Edificio edificio = new Edificio(row[6]);
                Sede sede = new Sede(row[7]);

                biblioteca.addSede(sede);
                sede.addEdificio(edificio);
                edificio.addFloor(floor);
                floor.addRack(rack);
                rack.addBook(book);
            }

            csvReader.close();

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void writeCSV(String args, Biblioteca biblioteca) throws IOException {
        String path = System.getProperty("user.dir") + "/" + args;
        for (int i = 0; i < biblioteca.sedes.size(); i++) {
            try {
                // Escribir el header del CSV
                if (i == 0) {
                    PrintWriter writer = new PrintWriter(path);
                    writer.write("titulo,autor,anio,estante_numero,estante_seccion,piso,edificio,sede");
                    writer.append("\n");
                    writer.close();
                }

                // Checks si array esta vacío (no contiene libro)
                if ((biblioteca.sedes.get(i).getEdificios().isEmpty() == true)
                        || (biblioteca.sedes.get(i).getEdificios().get(0).getFloors().isEmpty() == true)
                        || (biblioteca.sedes.get(i).getEdificios().get(0).getFloors().get(0).getRacks()
                                .isEmpty() == true)) {
                    continue;
                }

                // Título del libro para obtener toda su información en formato CSV mediante
                // .obtenerInfoCSV()

                String str_tit = biblioteca.sedes.get(i).getEdificios().get(0).getFloors().get(0).getRacks().get(0)
                        .getBooks().get(0).getTitulo();
                String bookCSV = biblioteca.obtenerInfoCSV(str_tit);

                // String bookCSV = biblioteca.obtenerInfoCSV(str_tit);

                // Escribir toda la información en el archivo
                BufferedWriter writer = new BufferedWriter(new FileWriter(path, true));
                writer.append(bookCSV);

                if (i != (biblioteca.sedes.size() - 1)) {
                    writer.append("\n");
                }
                writer.close();
            } catch (IndexOutOfBoundsException e) {
            }
        }
    }

    public static void deleteBook(Biblioteca biblioteca, String titulo) {
        for (int i = 0; i < biblioteca.sedes.size(); i++) {
            if (biblioteca.sedes.get(i).getEdificios().get(0).getFloors().get(0).getRacks().get(0).getBooks().get(0)
                    .getTitulo().equals(titulo)) {
                try {
                    biblioteca.sedes.get(i).getEdificios().get(0).getFloors().get(0).getRacks().get(0).getBooks()
                            .remove(0);
                } catch (IndexOutOfBoundsException e) {
                    // Hacer nada ._.
                }
            }
        }
    }

    public static String[] splitLine(String line) {
        String[] user_add;
        line = line.replace(",\"", "@\"");
        line = line.replace("\",", "\"@");
        line = line.replace(", ", "*");
        line = line.replace(",", "@");
        line = line.replace("*", ", ");
        line = line.replace("\"", "");
        user_add = line.split("@");
        return user_add;
    }

}
