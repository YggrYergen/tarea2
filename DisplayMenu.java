import java.util.Scanner;
import java.io.*;

public class DisplayMenu {

  public static void dispMenu(Biblioteca biblioteca) throws IOException {
    Scanner input = new Scanner(System.in);
    boolean salir = false;
    int opcion_menu, opcion_submenu;
    Book book, book2;
    String line = "", aux = "";
    String[] ubicacion;
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
      System.out.println("[7] Agregar o quitar sede.");
      System.out.println("[0] Salir.");
      System.out.print("\nOpcion:  ");
      opcion_menu = input.nextInt();
      switch (opcion_menu) {
        case 1: // Agregar libro
          input.nextLine();
          System.out.print("\033[H\033[2J");
          System.out.println("\n[Agregar Libro]\n");
          System.out.println("Ingrese la informacion del nuevo libro en formato CSV:\n");
          System.out.println("titulo,autor,anio,estante_numero,estante_seccion,piso,edificio,sede\n");
          line = input.nextLine();
          String[] user_add = Methods.splitLine(line);
          biblioteca.addBook(user_add);
          System.out.println("\nLibro agregado.");
          System.out.println(("\nPresione enter para continuar."));
          input.nextLine();

          //////////////////
          break;
        case 2: // Editar libro
          input.nextLine();
          System.out.print("\033[H\033[2J");
          System.out.println("\nIngresar titulo de libro a editar:");
          String titulo = input.nextLine();
          System.out.print("\033[H\033[2J");
          System.out.println("Eliga una de las siguientes opciones:\n");
          System.out.println("[1] cambiar titulo.");
          System.out.println("[2] cambiar autor.");
          System.out.println("[3] cambiar anio.");
          System.out.println("[4] cambiar seccion.");
          System.out.println("[5] cambiar piso.");
          System.out.println("[6] cambiar sede.");
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
              System.out.println("\nTitulo modificado.");
              System.out.println(("\nPresione enter para continuar."));
              input.nextLine();
              break;

            case 2: // Cambiar autor
              input.nextLine();
              book = biblioteca.getBook(titulo);
              System.out.println("\nAutor actual: " + book.getAutor());
              System.out.print("\nNuevo autor: ");
              String newAutor = input.nextLine();
              book.setAutor(newAutor);
              System.out.println("\nAutor modificado.");
              System.out.println(("\nPresione enter para continuar."));
              input.nextLine();
              break;

            case 3: // Cambiar anio
              input.nextLine();
              book = biblioteca.getBook(titulo);
              System.out.println("\nAnio actual: " + book.getAnio());
              System.out.print("\nNuevo anio: ");
              int newAnio = input.nextInt();
              book.setAnio(newAnio);
              System.out.println("\nAnio modificado.");
              System.out.println(("\nPresione enter para continuar."));
              input.nextLine();
              break;

            case 4: // Cambiar seccion
              input.nextLine();
              book = biblioteca.getBook(titulo);
              aux = "";
              aux = biblioteca.getUbicacion(titulo);
              ubicacion = Methods.splitLine(aux);
              book2 = book;
              biblioteca.deleteBook(biblioteca, titulo);
              System.out.println("\n   Ubicacion Actual\n");
              System.out.println("Piso: " + ubicacion[2] + "\nEdificio: " + ubicacion[3] + "\nSede: " + ubicacion[4]);
              System.out.println(("\nIngrese la informacion de la nueva ubicacion en el siguiente formato: "));
              System.out.println("(Numero del estante, nombre de la seccion) separados por coma y espacio \", \"\n");
              line = input.nextLine();
              line += ", " + ubicacion[2] + ", " + ubicacion[3] + ", " + ubicacion[4];
              String[] newSeccion = line.split(", ");
              biblioteca.moveBook(newSeccion, book2);
              System.out.println(("\n    El libro se ha movido exitosamente."));
              aux = biblioteca.getUbicacion(titulo);
              ubicacion = Methods.splitLine(aux);
              System.out.println("\n   Nueva Ubicacion\n");
              System.out.println("Piso: " + ubicacion[2] + "\nEdificio: " + ubicacion[3] + "\nSede: " + ubicacion[4]);
              System.out.println(("\nPresione enter para continuar."));
              input.nextLine();
              break;

            case 5: // Cambiar Piso
              input.nextLine();
              book = biblioteca.getBook(titulo);
              aux = "";
              aux = biblioteca.getUbicacion(titulo);
              ubicacion = Methods.splitLine(aux);
              book2 = book;
              biblioteca.deleteBook(biblioteca, titulo);
              System.out.println("\n   Ubicacion Actual\n");
              System.out.println("Piso: " + ubicacion[2] + "\nEdificio: " + ubicacion[3] + "\nSede: " + ubicacion[4]);
              System.out.println(("\nIngrese la informacion de la nueva ubicacion en el siguiente formato: "));
              System.out
                  .println("(Numero del estante, nombre de la seccion, Piso) separados por coma y espacio \", \"\n");
              line = input.nextLine();
              line += ", " + ubicacion[3] + ", " + ubicacion[4];
              String[] newPiso = line.split(", ");
              biblioteca.moveBook(newPiso, book2);
              System.out.println(("\n    El libro se ha movido exitosamente."));
              aux = biblioteca.getUbicacion(titulo);
              ubicacion = Methods.splitLine(aux);
              System.out.println("\n   Nueva Ubicacion\n");
              System.out.println("Piso: " + ubicacion[2] + "\nEdificio: " + ubicacion[3] + "\nSede: " + ubicacion[4]);
              System.out.println(("\nPresione enter para continuar."));
              input.nextLine();
              break;

            case 6: // Cambiar Sede
              input.nextLine();
              book = biblioteca.getBook(titulo);
              aux = "";
              aux = biblioteca.getUbicacion(titulo);
              ubicacion = Methods.splitLine(aux);
              book2 = book;
              biblioteca.deleteBook(biblioteca, titulo);
              System.out.println("\n   Ubicacion Actual\n");
              System.out.println("Piso: " + ubicacion[2] + "\nEdificio: " + ubicacion[3] + "\nSede: " + ubicacion[4]);
              System.out.println(("\nIngrese la informacion de la nueva ubicacion en el siguiente formato: "));
              System.out.println(
                  "(Numero del estante, nombre de la seccion, Piso, edificio, sede) separados por coma y espacio \", \"\n");
              line = input.nextLine();
              String[] newSede = Methods.splitLine(line);
              biblioteca.moveBook(newSede, book2);
              System.out.println(("\n    El libro se ha movido exitosamente."));
              aux = biblioteca.getUbicacion(titulo);
              ubicacion = Methods.splitLine(aux);
              System.out.println("\n   Nueva Ubicacion\n");
              System.out.println("Piso: " + ubicacion[2] + "\nEdificio: " + ubicacion[3] + "\nSede: " + ubicacion[4]);
              System.out.println(("\nPresione enter para continuar."));
              input.nextLine();
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
          } else {
            System.out.print("\033[H\033[2J");
            System.out.println("El libro \"" + titulo + "\" no se encuentra en la Biblioteca");
            System.out.println(("\nPresione enter para continuar."));
            input.nextLine();
          }
          break;

        case 4: // Quitar libro
          input.nextLine();
          System.out.print("\033[H\033[2J");
          System.out.println("Ingresar Titulo a Eliminar:");
          titulo = input.nextLine();
          biblioteca.deleteBook(biblioteca, titulo);
          System.out.println("\n    LIbro Eliminado Exitosamente.");
          System.out.println(("\nPresione enter para continuar."));
          input.nextLine();
          break;
        case 5: // Agregar o quitar seccion
          input.nextLine();
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
              System.out.print("\033[H\033[2J");
              System.out.println(("\nIngrese la informacion de la nueva seccion en el siguiente formato: "));
              System.out.println(
                  "(Numero del estante, nombre de la seccion, Piso, edificio, sede) separados por coma y espacio \", \"\n");
              line = input.nextLine();
              String[] newRack = line.split(", ");
              biblioteca.addSeccion(newRack);
              System.out.println("\nSeccion agregada.");
              System.out.println(("\nPresione enter para continuar."));
              input.nextLine();
              break;

            case 2:
              // Methods.quitarSeccion(etc)
              input.nextLine();
              System.out.print("\033[H\033[2J");
              System.out.println(("\nIngrese la informacion de la seccion a eliminar en el siguiente formato: "));
              System.out.println(
                  "(numero del estate, nombre de la seccion, Piso, edificio, sede) separados por coma y espacio \", \"\n");
              ;
              line = input.nextLine();
              String[] info_secc = line.split(", ");
              int i = biblioteca.deleteSecc(biblioteca, info_secc);
              if (i == 1) {
                System.out.println("\nAun existen libros en esta sección, por favor eliminelos.");
                System.out.println(("\nPresione enter para continuar."));
                input.nextLine();
              } else {
                System.out.println("\nSección eliminada exitosamente.");
                System.out.println(("\nPresione enter para continuar."));
                input.nextLine();
              }
              break;
          }
          break;

        case 6: // Agregar o quitar piso
          input.nextLine();
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
              System.out.print("\033[H\033[2J");
              System.out.println(("\nIngrese la informacion del nuevo piso en el siguiente formato: "));
              System.out.println("(Piso, edificio, sede) separados por coma y espacio \", \"\n");
              line = input.nextLine();
              String[] newFloor = line.split(", ");
              System.out.println(newFloor[0]);
              System.out.println(newFloor[1]);
              System.out.println(newFloor[2]);
              biblioteca.addPiso(newFloor);
              System.out.println("\nPiso agregado.");
              System.out.println(("\nPresione enter para continuar."));
              input.nextLine();
              break;

            case 2:
              // Methods.quitarPiso()
              input.nextLine();
              System.out.print("\033[H\033[2J");
              System.out.println(("\nIngrese la informacion del piso a eliminar en el siguiente formato: "));
              System.out.println("(Piso, edificio, sede) separados por coma y espacio \", \"\n");
              line = input.nextLine();
              String[] info_piso = line.split(", ");
              int i = biblioteca.deletePiso(biblioteca, info_piso);
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

        case 7: // Agregar o quitar sede
          input.nextLine();
          System.out.print("\033[H\033[2J");
          System.out.println("Eliga una de las siguientes opciones:\n");
          System.out.println("\n[1] Agregar sede.");
          System.out.println("[2] Quitar sede.");
          System.out.print("\nOpcion:  ");
          opcion_submenu = input.nextInt();
          switch (opcion_submenu) {
            case 1: // Agregar sede
              input.nextLine();
              System.out.println("\033[H\033[2J");
              System.out.println("\nIngrese el nombre de la sede que desea agregar.");
              System.out.print("\nNueva sede:  ");
              Sede newSede = new Sede(input.nextLine());
              biblioteca.addSede(newSede);
              System.out.println("\nSede agregada.");
              System.out.println(("\nPresione enter para continuar."));
              input.nextLine();
              break;

            case 2: // Quitar sede
              input.nextLine();
              System.out.print("\033[H\033[2J");
              System.out.print("\nIngrese el nombre de la sede que desea quitar.");
              System.out.print("\nSede a quitar:  ");
              String del_sede = input.nextLine();
              int i = biblioteca.deleteSede(biblioteca, del_sede);
              if (i == 1) {
                System.out.println("\nAun existen libros en esta Sede, por favor eliminelos.");
                System.out.println(("\nPresione enter para continuar."));
                input.nextLine();
              } else {
                System.out.println("\nSede eliminada exitosamente.");
                System.out.println(("\nPresione enter para continuar."));
                input.nextLine();
              }
          }

          break;
        case 0: // Salir
          System.out.print("\033[H\033[2J");
          System.out.println("Guardando y saliendo...\n");
          // Sistema de guardado //
          salir = true;
          break;
      }
    }
    input.close();
  }
}
