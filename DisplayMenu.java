import java.util.Scanner;
import java.io.*;

public class DisplayMenu {

  public static void dispMenu(Biblioteca biblioteca) throws IOException {
    Scanner input = new Scanner(System.in);
    boolean salir = false;
    int opcion_menu, opcion_submenu, SEDE = 0, PISO = 1, SECCION = 2;
    Book book;
    String line, aux = "";
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
          System.out.println("Ingrese la información del nuevo libro en formato CSV:\n");

          line = input.nextLine();
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

            case 4: // Cambiar seccion
              input.nextLine();
              book = biblioteca.getBook(titulo);
              aux = "";
              aux = biblioteca.getUbicacion(titulo);
              ubicacion = Methods.splitLine(aux);
              System.out.println(("\nIngrese la informacion de la nueva ubicacion en el siguiente formato: "));
              System.out.println("(Numero del estante, nombre de la seccion)\n");
              line = input.nextLine();
              line += ", " + ubicacion[2] + ubicacion[3] + ", " + ubicacion[4];
              String[] newSeccion = Methods.splitLine(line);
              biblioteca.moveBook(newSeccion, book);
              break;

            case 5: // Cambiar Piso
              input.nextLine();
              book = biblioteca.getBook(titulo);
              aux = "";
              aux = biblioteca.getUbicacion(titulo);
              ubicacion = Methods.splitLine(aux);
              System.out.println(("\nIngrese la informacion de la nueva ubicacion en el siguiente formato: "));
              System.out.println("(Numero del estante, nombre de la seccion, Piso)\n");
              line = input.nextLine();
              line += ", " + ubicacion[3] + ", " + ubicacion[4];
              String[] newPiso = Methods.splitLine(line);
              biblioteca.moveBook(newPiso, book);
              break;

            case 6: // Cambiar Sede
              input.nextLine();
              System.out.println(("\nIngrese la informacion de la nueva ubicacion en el siguiente formato: "));
              System.out.println("(Numero del estante, nombre de la seccion, Piso, edificio, sede)\n");
              line = input.nextLine();
              String[] newSede = Methods.splitLine(line);
              book = biblioteca.getBook(titulo);
              biblioteca.moveBook(newSede, book);
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
              line = input.nextLine();
              String[] newRack = Methods.splitLine(line);
              biblioteca.addSeccion(newRack);
              break;

            case 2:
              // Methods.quitarSeccion(etc)
              input.nextLine();
              System.out.println(("\nIngrese la informacion de la seccion a eliminar en el siguiente formato: "));
              System.out.println("(numero del estate, nombre de la seccion, Piso, edificio, sede)\n");
              line = input.nextLine();
              String[] delRack = Methods.splitLine(line);
              int i = biblioteca.delete(delRack, SECCION);
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
              int i = biblioteca.delete(delFloor, PISO);
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
          System.out.print("\033[H\033[2J");
          System.out.println("Eliga una de las siguientes opciones:\n");
          System.out.println("\n[1] Agregar sede.");
          System.out.println("[2] Quitar sede.");
          System.out.print("\nOpcion:  ");
          opcion_submenu = input.nextInt();
          switch (opcion_submenu) {
            case 1: // Agregar sede
              System.out.println("\033[H\033[2J");
              System.out.println("\nIngrese el nombre de la sede que desea agregar.");
              System.out.print("\nNueva sede:  ");
              Sede newSede = new Sede(input.nextLine());
              biblioteca.addSede(newSede);
              break;

            case 2: // Quitar sede
              System.out.print("\033[H\033[2J");
              System.out.print("\nIngrese el nombre de la sede que desea quitar.");
              System.out.print("\nSede a quitar:  ");
              line = input.nextLine();
              String[] delSede = Methods.splitLine(line);
              int i = biblioteca.delete(delSede, SEDE);
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
          Methods.writeCSV(biblioteca);
          salir = true;
          break;
      }
    }
    input.close();
  }
}
