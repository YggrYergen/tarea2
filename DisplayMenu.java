import java.util.Scanner;
import java.io.*;

public class DisplayMenu {

  public static void dispMenu(Biblioteca biblioteca) throws IOException {
    Scanner input = new Scanner(System.in);
    boolean salir = false;
    int opcion_menu, opcion_submenu;
    Book book;
    while (salir != true) {
      System.out.println("\n¡Bienvenido a la biblioteca UAI!\n");
      System.out.println("Eliga una de las siguientes opciones:\n");
      System.out.println("[1] Agregar libro.");
      System.out.println("[2] Editar libro.");
      System.out.println("[3] Buscar libro.");
      System.out.println("[4] Quitar libro.");
      System.out.println("[5] Agregar o quitar seccion.");
      System.out.println("[6] Agregar o quitar estante.");
      System.out.println("[7] Agregar o quitar piso.");
      System.out.println("[8] Agregar o quitar edificio.");
      System.out.println("[9] Agregar o quitar sede.");
      System.out.println("[0] Salir.");
      System.out.print("\nOpcion:  ");
      opcion_menu = input.nextInt();
      switch (opcion_menu) {
        case 1: // Agregar libro
          input.nextLine();
          System.out.print("\033[H\033[2J");
          System.out.println("\n[Agregar Libro]\n");
          System.out.println("Ingrese la información del nuevo libro en formato CSV:\n");

          String line = input.nextLine();
          String[] user_add = Methods.splitLine(line);
          biblioteca.addBook(user_add);

          //////////////////
          break;
        case 2: // Editar libro
          input.nextLine();
          System.out.print("\033[H\033[2J");
          System.out.println("\nIngresar Libro a editar:");
          String titulo = input.nextLine();
          System.out.print("\033[H\033[2J");
          System.out.println("Eliga una de las siguientes opciones:\n");
          System.out.println("[1] cambiar titulo.");
          System.out.println("[2] cambiar autor.");
          System.out.println("[3] cambiar anio.");
          System.out.println("[4] cambiar estante.");
          System.out.println("[5] cambiar seccion.");
          System.out.println("[6] cambiar piso.");
          System.out.println("[7] cambiar edifico.");
          System.out.println("[8] cambiar sede.");
          System.out.print("\nOpcion:  ");
          opcion_submenu = input.nextInt();
          switch (opcion_submenu) {
            case 1: // Cambiar titulo
              input.nextLine();
              book = biblioteca.getBook(titulo);
              System.out.println("\nTitulo Actual: " + book.getTitulo());
              System.out.print("\nNuevo titulo: ");
              String newTitle = input.nextLine();
              book.setTitulo(newTitle);
              break;

            case 2: // Cambiar autor
              input.nextLine();
              book = biblioteca.getBook(titulo);
              System.out.println("\nAutor actual: " + book.getAutor());
              System.out.print("\nNuevo autor: ");
              String newAutor = input.nextLine();
              book.setAutor(newAutor);
              break;

            case 3: // Cambiar anio
              input.nextLine();
              book = biblioteca.getBook(titulo);
              System.out.println("\nAnio actual: " + book.getAnio());
              System.out.print("\nNuevo anio: ");
              int newAnio = input.nextInt();
              book.setAnio(newAnio);
              break;

            case 4: // Cambiar estante_numero
              // method.cambiarEstante(etc)
              break;

            case 5: // Cambiar estante_seccion
              // method.cambiarSeccion(etc)
              break;

            case 6: // Cambiar Piso
              // method.cambiarPiso(etc)
              break;

            case 7: // Cambiar Edificio
              // method.cambiarEdificio(etc)
              break;

            case 8: // Cambiar Sede
              // method.cambiarSede(etc)
              break;
          }
          break;

        case 3: // Buscar libro
          input.nextLine();
          System.out.print("\033[H\033[2J");
          System.out.println("Ingresar Titulo a buscar:");
          titulo = input.nextLine();
          String bookInfo = biblioteca.buscarTitulo(titulo);
          if (bookInfo != null) {
            System.out.print("\033[H\033[2J");
            System.out.println("\nLibro encontrado!\n");
            System.out.println(bookInfo);
            System.out.println(("\nPresione enter para continuar."));
            input.nextLine();
          }
          break;

        case 4: // Quitar libro
          System.out.print("\033[H\033[2J");
          System.out.println("Ingresar Titulo a Eliminar:");
          // String titulo = input.nextLine();
          // Book book = books.eliminarTitulo(titulo);
          break;
        case 5: // Agregar o quitar seccion
          System.out.print("\033[H\033[2J");
          System.out.println("Eliga una de las siguientes opciones:\n");
          System.out.println("\n[1] Agregar seccion.");
          System.out.println("[2] Quitar seccion.");
          System.out.print("\nOpcion:  ");
          opcion_submenu = input.nextInt();
          switch (opcion_submenu) {
            case 1:
              // Methods.agregarSeccion(etc)
              String line2 = input.nextLine();
              String[] user_add2 = Methods.splitLine(line2);
              biblioteca.addSeccion(user_add2);
              break;

            case 2:
              // Methods.quitarSeccion(etc)
              String line3 = input.nextLine();
              String[] user_add3 = Methods.splitLine(line3);
              biblioteca.delSeccion(user_add3);
              break;
          }
          break;
        case 6: // Agregar o quitar estante
          System.out.print("\033[H\033[2J");
          System.out.println("Eliga una de las siguientes opciones:\n");
          System.out.println("\n[1] Agregar estante.");
          System.out.println("[2] Quitar estante.");
          System.out.print("\nOpcion:  ");
          opcion_submenu = input.nextInt();
          switch (opcion_submenu) {
            case 1:
              // Methods.agregarEstante(etc)
              String line2 = input.nextLine();
              String[] user_add2 = Methods.splitLine(line2);
              biblioteca.addRack(user_add2);
              break;

            case 2:
              // Methods.quitarEstante(etc)
              String line3 = input.nextLine();
              String[] user_add3 = Methods.splitLine(line3);
              biblioteca.delRack(user_add3);
              break;
          }

          break;
        case 7: // Agregar o quitar piso
          System.out.print("\033[H\033[2J");
          System.out.println("Eliga una de las siguientes opciones:\n");
          System.out.println("\n[1] Agregar piso.");
          System.out.println("[2] Quitar piso.");
          System.out.print("\nOpcion:  ");
          opcion_submenu = input.nextInt();
          switch (opcion_submenu) {
            case 1:
              // Methods.agregarPiso()
              String line2 = input.nextLine();
              String[] user_add2 = Methods.splitLine(line2);
              biblioteca.addPiso(user_add2);
              break;

            case 2:
              // Methods.quitarPiso()
              String line3 = input.nextLine();
              String[] user_add3 = Methods.splitLine(line3);
              biblioteca.delPiso(user_add3);
              break;
          }

          break;
        case 8: // Agregar o quitar edificio
          System.out.print("\033[H\033[2J");
          System.out.println("Eliga una de las siguientes opciones:\n");
          System.out.println("\nI[1] Agregar edificio.");
          System.out.println("[2] Quitar quitar piso.");
          System.out.print("\nOpcion:  ");
          opcion_submenu = input.nextInt();
          switch (opcion_submenu) {
            case 1:
              // Methods.agregarEdificio();
              break;

            case 2:
              // Methods.quitarEdificio();
              break;
          }

          break;
        case 9: // Agregar o quitar sede
          System.out.print("\033[H\033[2J");
          System.out.println("Eliga una de las siguientes opciones:\n");
          System.out.println("\n[1] Agregar sede.");
          System.out.println("[2] Quitar sede.");
          System.out.print("\nOpcion:  ");
          opcion_submenu = input.nextInt();
          switch (opcion_submenu) {
            case 1:
              // Methods.agregarSede();
              break;

            case 2:
              // Methods.quitarSede();
              break;
          }

          break;
        case 0: // Salir
          System.out.print("\033[H\033[2J");
          System.out.println("Guardando y saliendo...\n");
          // Sistema de guardado //
          Methods.writeCSV(biblioteca);
          salir = true;
          break;
      }
    }
    input.close();
  }
}
