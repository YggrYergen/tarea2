import java.util.Scanner;

public class DisplayMenu {

  public static void dispMenu(Books books, Shelves shelves, Sedes sedes) {
    Scanner input = new Scanner(System.in);
    boolean salir = false;
    int opcion_menu, opcion_submenu;
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
          // Methods.agregarLibro(etc);
          break;

        case 2: // Editar libro
          books.editBook(input);
          break;

        case 3: // Buscar libro
          books.buscarTitulo(input);
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
          salir = true;

          break;
      }

    }

  }
}
