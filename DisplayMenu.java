import java.util.Scanner;
import java.io.*;

public class DisplayMenu {

  public static void dispMenu(Biblioteca biblioteca) throws IOException {
    Scanner input = new Scanner(System.in);
    boolean salir = false;
    int opcion_menu, opcion_submenu;
    Book book;
    while (salir != true) {
      System.out.print("\033[H\033[2J");
      System.out.println("\n¡Bienvenido a la biblioteca UAI!\n");
      System.out.println("Eliga una de las siguientes opciones:\n");
      System.out.println("[1] Agregar libro.");
      System.out.println("[2] Editar libro.");
      System.out.println("[3] Buscar libro.");
      System.out.println("[4] Quitar libro.");
      System.out.println("[5] Agregar o quitar seccion.");
      System.out.println("[6] Agregar o quitar piso.");
      System.out.println("[7] Agregar o quitar edificio.");
      System.out.println("[8] Agregar o quitar sede.");
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
              input.nextLine();
              System.out.println(("\nIngrese la informacion de la nueva seccion en el siguiente formato: "));
              System.out.println("(Numero del estante, nombre de la seccion, Piso, edificio, sede)\n");
              String line2 = input.nextLine();
              String[] newRack = Methods.splitLine(line2);
              biblioteca.addSeccion(newRack);
              break;

            case 2:
              // Methods.quitarSeccion(etc)
              input.nextLine();
              System.out.println(("\nIngrese la informacion de la seccion a eliminar en el siguiente formato: "));
              System.out.println("(numero del estate, nombre de la seccion, Piso, edificio, sede)\n");
              String line3 = input.nextLine();
              String[] delRack = Methods.splitLine(line3);
              int i = biblioteca.delSeccion(delRack);
              if (i == 1) {
                System.out.println("\nAun existen libros en esta seccion, por favor eliminelos.");
                System.out.println(("\nPresione enter para continuar."));
                input.nextLine();
              } else {
                System.out.println("\nSeccion eliminada exitosamente.");
                System.out.println(("\nPresione enter para continuar."));
                input.nextLine();
              }
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
              input.nextLine();
              System.out.println(("\nIngrese la informacion del nuevo piso en el siguiente formato: "));
              System.out.println("(Piso, edificio, sede)\n");
              String line2 = input.nextLine();
              String[] newFloor = Methods.splitLine(line2);
              biblioteca.addPiso(newFloor);
              break;

            case 2:
              // Methods.quitarPiso()
              input.nextLine();
              System.out.println(("\nIngrese la informacion del piso a eliminar en el siguiente formato: "));
              System.out.println("(Piso, edificio, sede)\n");
              String line3 = input.nextLine();
              String[] delFloor = Methods.splitLine(line3);
              int i = biblioteca.delPiso(delFloor);
              if (i == 1) {
                System.out.println("\nAun existen libros en este piso, por favor eliminelos.");
                System.out.println(("\nPresione enter para continuar."));
                input.nextLine();
              } else {
                System.out.println("\nPiso eliminado exitosamente.");
                System.out.println(("\nPresione enter para continuar."));
                input.nextLine();
              }
              break;
          }

          break;
        case 7: // Agregar o quitar edificio
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
        case 8: // Agregar o quitar sede
          System.out.print("\033[H\033[2J");
          System.out.println("Eliga una de las siguientes opciones:\n");
          System.out.println("\n[1] Agregar sede.");
          System.out.println("[2] Quitar sede.");
          System.out.print("\nOpcion:  ");
          opcion_submenu = input.nextInt();
          switch (opcion_submenu) {
            case 1: // Agregar sede
              System.out.print("\033[H\033[2J");
              System.out.print("\nIngrese el nombre de la sede que desea agregar.");
              System.out.print("\nNueva sede:  ");
              Sede nuevaSede = new Sede(input.nextLine());
              biblioteca.addSede(nuevaSede);
              break;

            case 2: // Quitar sede
              System.out.print("\033[H\033[2J");
              System.out.print("\nIngrese el nombre de la sede que desea quitar.");
              System.out.print("\nSede a quitar:  ");
              Sede viejaSede = new Sede(input.nextLine());
              for (Sede sede : biblioteca.sedes) {
                if(sede.pure_toString() == viejaSede.pure_toString()) {
                  if(sede.edificios != null){
                    System.out.println("La sede que desea borrar no esta vacia!");
                    break;
                  } else {
                    sede = null;
                    System.out.println("Sede borrada.");
                    break;
                  }
                }
              }
              System.out.println("No hay una sede llamada: " + viejaSede.pure_toString());
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
