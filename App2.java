import java.io.IOException;
import java.text.Bidi;

public class App2 {

    public static void main(String[] args) throws IOException {
        Biblioteca biblioteca = new Biblioteca();

        Methods.readCsv(args[0], biblioteca);
        DisplayMenu.dispMenu(biblioteca);
    }
}