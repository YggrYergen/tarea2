import java.util.Scanner;

public class DisplayMenu {

  public static void dispMenu(Biblioteca biblioteca) {
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
      System.out.println("[6] Agregar o quitar piso."); 
      System.out.println("[7] Agregar o quitar sede."); 
      System.out.println("[0] Salir.");
      System.out.print("\nOpcion:  ");
      opcion_menu = input.nextInt();
      switch (opcion_menu) {
        case 1: // Agregar libro
          // Methods.agregarLibro(etc);
          break;
          
        case 2: // Editar libro
          System.out.println("Eliga una de las siguientes opciones:\n");
          System.out.println("[1] cambiar titulo.");
          System.out.println("[2] cambiar autor.");
          System.out.println("[3] cambiar anio.");
          System.out.println("[4] cambiar seccion.");
          System.out.println("[5] cambiar piso.");
          System.out.println("[6] cambiar sede.");
          opcion_submenu = input.nextInt();
          switch (opcion_submenu) {
            case 1: // Cambiar titulo
              // method.cambiarTitulo(etc)
              break;

            case 2: // Cambiar autor
              // method.cambiarAutor(etc)
              break;

            case 3: // Cambiar anio
              // method.cambiarAnio(etc)
              break;

            case 4: // Cambiar seccion
              // method.cambiarSeccion(etc)
              break;

            case 5: // Cambiar Piso
              // method.cambiarPiso(etc)
              break;

            case 6: // Cambiar Sede
              // method.cambiarSede(etc)
              break;
          }
          break;

        case 3: // Buscar libro
          input.nextLine();
          System.out.print("\033[H\033[2J");
          System.out.println("Ingresar Titulo a buscar:");
          String titulo = input.nextLine();
          // Book book = books.buscarTitulo(titulo);
          // System.out.println(book.toString());
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
              break;

            case 2:
              // Methods.quitarSeccion(etc)
              break;
          }
          break;
    
        case 6: // Agregar o quitar piso
          System.out.print("\033[H\033[2J");
          System.out.println("Eliga una de las siguientes opciones:\n");
          System.out.println("\n[1] Agregar piso.");
          System.out.println("[2] Quitar piso.");
          System.out.print("\nOpcion:  ");
          opcion_submenu = input.nextInt();
          switch (opcion_submenu) {
            case 1:
              // Methods.agregarPiso()
              break;

            case 2:
              // Methods.quitarPiso()
              break;
          }

          break;
        case 7: // Agregar o quitar sede - Pauta
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
          salir = true;
          break;
      }
    }
    input.close();
  }
}
