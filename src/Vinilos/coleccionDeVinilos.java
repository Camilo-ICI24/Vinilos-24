package Vinilos;

import java.util.Scanner;

class coleccionDeVinilos {
    public static void main(String[] args) {
        Scanner usuario = new Scanner(System.in);
        String[][] informacion = new String[100][3];
        agregarDisco(informacion);

        System.out.println("Espacio máximo de la colección: " +informacion.length);

        System.out.print("Ingrese el nombre de un autor para buscar un disco: ");
        String nombre = usuario.nextLine();
        buscarVinilo(informacion, nombre);

        contarColeccion(informacion);
        contarDisponible(informacion);

        usuario.close();
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
                    System.out.print("Se ha añadido la información con éxito");
                    System.out.println(" ");
                    break;
                }
            }
            if (!filaLibre) {
                System.out.println("Lo siento, no hay más espacio disponible.");
                break;
            }
        }
        info.close();
    }

    public static void buscarVinilo(String[][] m, String busca) {
        System.out.print("Buscando......"); // Esto solo es para avisar al usuario que el código funciona y busca el disco solicitado
        boolean existe = false;
        for (int fila = 0; fila < m.length; fila++) {
            if (m[fila][1].equalsIgnoreCase(busca)) {
                System.out.print("Disco: " + m[fila][0]);
                System.out.println(m[fila][1]);
                System.out.println(m[fila][2]);
                existe = true;
                break;
            }
        }
        if (!existe) {
            System.out.print("El disco ingresado no se encuentra en el catálogo");
        }
    }

    public static void contarColeccion(String[][] m) {
        int discosRegistrados = 0;
        for (int fila = 0; fila < m.length; fila++) {
            if (m[fila][0] != null) {
                discosRegistrados += 1;
            }
        }
        System.out.print("La cantidad de discos en la colección son: " + discosRegistrados);
    }

    public static void contarDisponible(String[][] m) {
        int estaVacio = 0;
        for (int fila = 0; fila < m.length; fila++) {
            if (m[fila][0] == null) {
                estaVacio += 1;
            }
        }
        System.out.print("Espacio disponible de almacenamiento: " +estaVacio);
    }
}
