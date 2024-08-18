package Vinilos;

import java.util.Scanner;

class coleccionDeVinilos {
    public static void main(String[] args) {
        String[][] informacion = new String[100][3];
        agregarDisco(informacion);
    }

    public static void agregarDisco(String[][] m) {
        Scanner info = new Scanner(System.in);
        System.out.print("Ingrese la cantidad de discos que desea añadir: ");
        int cantidadASubir = info.nextInt();
        info.nextLine();
        for (int i = 0; i < cantidadASubir; i++) {
            boolean filaLibre = false;
            for (int fila = 0; fila < m.length; fila++) {
                if (m[fila][0] == null) {
                    System.out.print("Ingrese el grupo autor del disco: ");
                    m[fila][0] = info.nextLine();
                    System.out.print("Ingrese el nombre del disco: ");
                    m[fila][1] = info.nextLine();
                    System.out.print("Ingrese el año de lanzamiento del disco: ");
                    int salida = info.nextInt();
                    info.nextLine();
                    m[fila][2] = Integer.toString(salida);
                    filaLibre = true;
                    break;
                }
            }
            //
            if (!filaLibre) {
                System.out.println("Lo siento, no hay más espacio disponible.");
                break;
            }
        }
        info.close();
    }
}
