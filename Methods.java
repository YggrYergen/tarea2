import java.io.*;

public class Methods {

    public static void readCsv(String args, Rack books, Floor shelves, Sedes sedes) {
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
                line = line.replace(", ", "*");
                line = line.replace(",", "@");
                line = line.replace("*", ", ");
                line = line.replace("\"", "");
                String[] row = line.split("@");

                Book b = new Book(row[0], row[1], Integer.valueOf(row[2]));
                Shelve sh = new Shelve(Integer.valueOf(row[3]), row[4]);
                Sede se = new Sede(Integer.valueOf(row[5]), row[6], row[7]);

                books.addBook(b);
                shelves.addShelve(sh);
                sedes.addSede(se);
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
