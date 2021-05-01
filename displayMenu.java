import java.io.*;

public class displayMenu {

  public static void dispMenu() {
    int opcion_menu;
    int opcion_submenu;

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

    switch(opcion_menu) {
      case 1: // Agregar libro
        // Methods.agregarLibro(etc)
        break;

      case 2: // Editar libro - TODO

        // TODO: desplegar menu: editar libro

        switch(opcion_submenu) {
          case 1: //    Cambiar titulo
            System.out.println("Ingrese 1 para cambiar titulo.");
            // method.cambiarTitulo(etc)
            break;

          case 2: //    Cambiar autor
            System.out.println("Ingrese 2 para cambiar autor.");
            // method.cambiarTitulo(etc)
            break;

          case 3: //    Cambiar anio
            System.out.println("Ingrese 3 para cambiar anio.");
            // method.cambiarAnio(etc)
            break;

          case 4: //    Cambiar estante_numero
            System.out.println("Ingrese 4 para cambiar estante.");
            // method.cambiarEstante(etc)
            break;

          case 5: //    Cambiar estante_seccion
            System.out.println("Ingrese 3 para cambiar seccion.");
            // method.cambiarSeccion(etc)
            break;

          case 6:  //    Cambiar Piso
            System.out.println("Ingrese 3 para cambiar Piso.");
            // method.cambiarPiso(etc)
            break;

          case 7: //    Cambiar Edificio
            System.out.println("Ingrese 3 para cambiar Edificio.");
            // method.cambiarEdificio(etc)
            break;

          case 8: //    Cambiar Sede
            System.out.println("Ingrese 3 para cambiar Sede.");
            // method.cambiarSede(etc)
            break;
        }
        break;

      case 3: // Buscar libro
        // Methods.buscarLibro(etc)
        break;

      case 4: // Quitar libro
        // Methods.quitarLibro(etc)
        break;

      case 5: // Agregar o quitar seccion

        // Desplegar opciones agregar o quitar
          
        switch(opcion_submenu) {
          case 1:

            break;

          case 2:

            break;
        }
        break;

      case 6:
        // Agregar o quitar estante
        // Desplegar opciones agregar o quitar
          
        switch(opcion_submenu) {
          case 1:

            break;

          case 2:

            break;
        }
        break;

      case 7:
        // Agregar o quitar piso
        // Desplegar opciones agregar o quitar
          
        switch(opcion_submenu) {
          case 1:

            break;

          case 2:

            break;
        }
        break;

      case 8:
        // Agregar o quitar edificio
        // Desplegar opciones agregar o quitar
          
        switch(opcion_submenu) {
          case 1:

            break;

          case 2:

            break;
        }
        break;

      case 9:
        // Agregar o quitar sede
        // Desplegar opciones agregar o quitar
          
        switch(opcion_submenu) {
          case 1:

            break;

          case 2:

            break;
        }
        break;

      case 0:
        // Salir
        // Desplegar opciones guardar o no
          
        switch(opcion_submenu) {
          case 1:

            break;

          case 2:

            break;
        }
        break; 
    }
  }      
}

