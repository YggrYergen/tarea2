import java.io.*;

public class App2 {

    public static void main(String[] args) {
        Sedes a = new Sedes();
        readCsv(args[0], a);

        System.out.println(a);
        // .sedes.get(0).shelves.get(0).books.get(0).getAutor()

        // Methods.readCsv(args[0]);
        // Methods.dispMenu();
        // Methods.System.out.println(se);
        // ob1.printLibro();

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
