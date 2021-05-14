import java.util.Scanner;
import java.io.*;

public class DisplayMenu {

<<<<<<< Updated upstream
  public static void dispMenu(Biblioteca biblioteca) throws IOException {
=======
  public static void dispMenu(Sede sedes) {
>>>>>>> Stashed changes
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
      System.out.println("[6]] Agregar o quitar estante.");
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
<<<<<<< Updated upstream
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
=======
          System.out.print("\033[H\033[2J");
          System.out.println("Ingresar Titulo a editar:");
          String titulo = input.nextLine();
          books.editBook(input);
>>>>>>> Stashed changes
          break;

        case 3: // Buscar libro
          input.nextLine();
          System.out.print("\033[H\033[2J");
          System.out.println("Ingresar Titulo a buscar:");
<<<<<<< Updated upstream
          titulo = input.nextLine();
          String bookInfo = biblioteca.buscarTitulo(titulo);
          if (bookInfo != null) {
            System.out.print("\033[H\033[2J");
            System.out.println("\nLibro encontrado!\n");
            System.out.println(bookInfo);
            System.out.println(("\nPresione enter para continuar."));
            input.nextLine();
          }
=======
          String titulo = input.nextLine();
          Book book = books.buscarTitulo(titulo);
          System.out.println(book.toString());
>>>>>>> Stashed changes
          break;

        case 4: // Quitar libro
          // Methods.quitarLibro(etc)
          break;

        case 5: // Agregar o quitar seccion

          // funcion;

          /*
           * System.out.println("Ingrese 1 para agregar seccion.");
           * System.out.println("Ingrese 2 para quitar seccion."); opcion_submenu =
           * input.nextInt();
           */

          break;

        case 6: // Agregar o quitar estante

          // funcion;

          /*
           * System.out.println("Ingrese 1 para agregar estante.");
           * System.out.println("Ingrese 2 para quitar estante.");
           * 
           * opcion_submenu = input.nextInt();
           * 
           * switch (opcion_submenu) { case 1: // Methods.agregarEstante(etc) break;
           * 
           * case 2: // Methods.quitarEstante(etc) break; }
           */

          break;

        case 7: // Agregar o quitar piso

          // funcion;

          /*
           * System.out.println("Ingrese 1 para agregar piso.");
           * System.out.println("Ingrese 2 para quitar piso.");
           * 
           * opcion_submenu = input.nextInt();
           * 
           * switch (opcion_submenu) { case 1: Methods.agregarPiso() break;
           * 
           * case 2: Methods.quitarPiso() break; }
           */

          break;

        case 8: // Agregar o quitar edificio

          // funcion;

          /*
           * System.out.println("Ingrese 1 para agregar edificio.");
           * System.out.println("Ingrese 2 para quitar quitar piso.");
           * 
           * opcion_submenu = input.nextInt();
           * 
           * switch (opcion_submenu) { case 1: Methods.agregarEdificio(); break;
           * 
           * case 2: Methods.quitarEdificio(); break; }
           */

          break;

        case 9: // Agregar o quitar sede
          // funcion;

          /*
           * System.out.println("Ingrese 1 para agregar sede.");
           * System.out.println("Ingrese 2 para quitar sede.");
           * 
           * opcion_submenu = input.nextInt();
           * 
           * switch (opcion_submenu) { case 1: Methods.agregarSede(); break;
           * 
           * case 2: Methods.quitarSede(); break; }
           */

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

  }
}
