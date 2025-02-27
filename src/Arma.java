import java.util.ArrayList;
import java.util.Scanner;

public class Arma {
    String nombre;
    int daño;
    ArrayList<Arma> armaEspecial = new ArrayList<>();

    public Arma(String nombre, int daño) {
        this.nombre = nombre;
        this.daño = daño;

    }

    public String getNombre() {
        return nombre;
    }

    public int getDaño() {
        return daño;
    }

    public static void MenuArma() {
        System.out.println("Elige un arma para el héroe\n" +
                "1. Bastón Arcano (Daño: 50)\n" +
                "2. Orbe Místico (Daño: 60)\n ");

    }

    public static void crearArmas(ArrayList<Arma> armaEspecial) {
        armaEspecial.add(new Arma("Bastón Arcano", 50));
        armaEspecial.add(new Arma("Orbe Místico", 60));
    }

    public Arma elegirArma() {
        Scanner scanner = new Scanner(System.in);
        Arma armaSeleccionada = null;

        while (armaSeleccionada == null) { // Ciclo para asegurar una selección válida
            MenuArma();
            System.out.print("Introduce la subopción: ");
            int subopcion = scanner.nextInt();
            scanner.nextLine();

            switch (subopcion) {
                case 1:
                    armaSeleccionada = new Arma("Bastón Arcano", 50);
                    break;
                case 2:
                    armaSeleccionada = new Arma("Orbe Místico", 60);
                    break;
                default:
                    System.out.println("Opción no válida. Intenta de nuevo.");
            }
        }
     return armaSeleccionada;
    }

    public static void addNewArma(ArrayList <Arma> armaEspecial){
        Scanner scanner=new Scanner(System.in);

        System.out.println("Introduce el nombre del arma");
        String nombre=scanner.nextLine();

        System.out.println("Introduce el daño del arma");
        int daño=scanner.nextInt();
        scanner.nextLine();
        armaEspecial.add(new Arma(nombre,daño));
        System.out.println("Se ha añadido el arma: "+nombre);
    }
}
