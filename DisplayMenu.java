import java.util.Scanner;

public class DisplayMenu {

  public static void dispMenu(Books books, Shelves shelves, Sedes sedes) {
    Scanner scan = new Scanner(System.in);
    int opcion_menu, opcion_submenu;
    boolean salir = false;
    while(salir== false) {
      System.out.println("Ingrese 1 para agregar libro.");
      System.out.println("Ingrese 2 para editar libro.");
      System.out.println("Ingrese 3 para buscar libro.");
      System.out.println("Ingrese 4 para quitar libro.");
      System.out.println("Ingrese 5 para agregar o quitar seccion.");
      System.out.println("Ingrese 6 para agregar o quitar estante.");
      System.out.println("Ingrese 7 para agregar o quitar piso.");
      System.out.println("Ingrese 8 para agregar o quitar edificio.");
      System.out.println("Ingrese 9 para agregar o quitar sede.");
      System.out.println("Ingrese 0 para salir.");

      opcion_menu = scan.nextInt();
      


      switch(opcion_menu) {
        case 1: // Agregar libro
        // Methods.agregarLibro(etc);
          break;


    
        case 2: // Editar libro
        System.out.println("Ingrese 1 para cambiar titulo.");
        System.out.println("Ingrese 2 para cambiar autor.");
        System.out.println("Ingrese 3 para cambiar anio.");
        System.out.println("Ingrese 4 para cambiar estante.");
        System.out.println("Ingrese 5 para cambiar seccion.");
        System.out.println("Ingrese 6 para cambiar piso.");
        System.out.println("Ingrese 7 para cambiar edifico.");
        System.out.println("Ingrese 8 para cambiar sede.");
        opcion_submenu = scan.nextInt();
        switch(opcion_submenu) {
          case 1: //    Cambiar titulo
          // method.cambiarTitulo(etc)
            break;

          case 2: //    Cambiar autor
          // method.cambiarAutor(etc)
            break;

          case 3: //    Cambiar anio
          // method.cambiarAnio(etc)
            break;

          case 4: //    Cambiar estante_numero
          // method.cambiarEstante(etc)
            break;

          case 5: //    Cambiar estante_seccion
          // method.cambiarSeccion(etc)
            break;

          case 6:  //    Cambiar Piso
          // method.cambiarPiso(etc)
            break;

          case 7: //    Cambiar Edificio
          // method.cambiarEdificio(etc)
            break;

          case 8: //    Cambiar Sede
          // method.cambiarSede(etc)
            break;
        }
          break;



        case 3: // Buscar libro
        // input.nextLine(); // Eliminar esta linea si no es necesaria
        System.out.print("\033[H\033[2J");
        System.out.println("Ingresar Titulo a buscar:");
        String titulo = input.nextLine();
        Book book = books.buscarTitulo(titulo);
        System.out.println(book.toString());
          break;



        case 4: // Eliminar libro
        System.out.print("\033[H\033[2J");
        System.out.println("Ingresar Titulo a Eliminar:");
        String titulo = input.nextLine();
        Book book = books.eliminarTitulo(titulo);
          break;



        case 5: // Agregar o quitar seccion
        System.out.println("Ingrese 1 para agregar seccion.");
        System.out.println("Ingrese 2 para quitar seccion.");
        opcion_submenu = scan.nextInt();
        switch(opcion_submenu) {
          case 1:
            // Methods.agregarSeccion(etc)
            break;

          case 2:
            // Methods.quitarSeccion(etc)
            break;
        }
          break;



        case 6: // Agregar o quitar estante
        System.out.println("Ingrese 1 para agregar estante.");
        System.out.println("Ingrese 2 para quitar estante.");
        opcion_submenu = scan.nextInt();
        switch(opcion_submenu) {
          case 1:
            // Methods.agregarEstante(etc)
            break;

          case 2:
            // Methods.quitarEstante(etc)
            break;
        }
          break;



        case 7: // Agregar o quitar piso
        System.out.println("Ingrese 1 para agregar piso.");
        System.out.println("Ingrese 2 para quitar piso.");          
        opcion_submenu = scan.nextInt();
        switch(opcion_submenu) {
          case 1:
            //Methods.agregarPiso()
            break;

          case 2:
            // Methods.quitarPiso()
            break;
        }
          break;



        case 8: // Agregar o quitar edificio
        System.out.println("Ingrese 1 para agregar edificio.");
        System.out.println("Ingrese 2 para quitar quitar piso.");         
        opcion_submenu = scan.nextInt();
        switch(opcion_submenu) {
          case 1:
            // Methods.agregarEdificio();
            break;

          case 2:
            // Methods.quitarEdificio();
            break;
        }
          break;



        case 9: // Agregar o quitar sede
        System.out.println("Ingrese 1 para agregar sede.");
        System.out.println("Ingrese 2 para quitar sede.");  
        opcion_submenu = scan.nextInt();
        switch(opcion_submenu) {
          case 1:
            // Methods.agregarSede();
            break;

          case 2:
            // Methods.quitarSede();
            break;
        }
          break;



        case 0: // Salir con o sin guardar
        System.out.println("Ingrese 1 para salir y no guardar .");
        System.out.println("Ingrese 2 para salir y guardar .");         
        opcion_submenu = scan.nextInt();
        switch(opcion_submenu) {
          case 1:
            // Methods.salirSinGuardar()
            break;

          case 2:
            // Methods.salirYguardar()
            break;
        }
          break; 
      }
    }
    scan.close();
  }
}
