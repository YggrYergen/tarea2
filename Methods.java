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
                line = line.replace(",\"", "@\"");
                line = line.replace("\",", "\"@");
                line = line.replace(", ", "*");
                line = line.replace(",", "@");
                line = line.replace("*", ", ");
                line = line.replace("\"", "");
                String[] row = line.split("@");

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

    public static void writeCSV() {

    }

}
