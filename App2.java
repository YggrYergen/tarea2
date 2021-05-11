import java.text.Bidi;

public class App2 {

    public static void main(String[] args) {
        biblioteca biblioteca = new biblioteca();+

        Methods.readCsv(args[0],biblioteca);
        DisplayMenu.dispMenu(biblioteca);
    }
}
