import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Scanner;

public class Heroe{
    String nombre;
    int nivel;
    int puntosVida;
    static Arma armaEspecial2;

    public Heroe(String nombre, int nivel, int puntosVida, Arma armaEspecial) {
        this.nombre = nombre;
        this.nivel = nivel;
        this.puntosVida = puntosVida;
        this.armaEspecial2 = armaEspecial;
    }

    public String getNombre() {
        return nombre;
    }

    public int getNivel() {
        return nivel;
    }

    public int getPuntosVida() {
        return puntosVida;
    }

    public Arma getArmaEspecial() {
        return armaEspecial2;
    }

    public void setArmaEspecial(Arma armaEspecial) {
        this.armaEspecial2 = armaEspecial;
    }

    public static void addNewHeroe(ArrayList<Heroe> listaHeroe, ArrayList<Arma> armaEspecial){
        Scanner scanner=new Scanner(System.in);
        System.out.println("Introduce el nombre del héroe:");
        String nombre = scanner.nextLine();

        System.out.println("Introduce el nivel:");
        int nivel = scanner.nextInt();

        System.out.println("Introduce los puntos de vida:");
        int puntosVida = scanner.nextInt();
        scanner.nextLine();



        System.out.println("Selecciona el tipo de héroe:");
        System.out.println("1. Guerrero");
        System.out.println("2. Mago");
        System.out.println("3. Arquero");
        System.out.println("4. Asesino");
        int subopcion = scanner.nextInt();
        scanner.nextLine();

        switch (subopcion) {
            case 1:
                System.out.println("Has elegido al Guerrero.");
                System.out.println("Introduce la fuerza del guerrero");
                int fuerza= scanner.nextInt();
                scanner.nextLine();
                Arma arma=armaEspecial2.elegirArma();
                Guerrero nuevoGuerrero = new Guerrero(nombre, nivel, puntosVida,arma,fuerza);
                listaHeroe.add(nuevoGuerrero);
                System.out.println("El héroe ha sido añadido con éxito.");
                break;
            case 2:
                System.out.println("Has elegido al Mago.");
                System.out.println("Introduce el maná");
                int mana= scanner.nextInt();
                Arma arma2=armaEspecial2.elegirArma();
                Mago nuevoMago = new Mago(nombre, nivel, puntosVida,arma2,mana);
                listaHeroe.add(nuevoMago);
                System.out.println("El héroe ha sido añadido con éxito.");
                scanner.nextLine();

                break;
            case 3:
                System.out.println("Has elegido al Arquero.");
                System.out.println("Introduce la precisión");
                int precision= scanner.nextInt();
                Arma arma3=armaEspecial2.elegirArma();
                Arquero nuevoArquero = new Arquero(nombre, nivel, puntosVida,arma3,precision);
                listaHeroe.add(nuevoArquero);
                System.out.println("El héroe ha sido añadido con éxito.");
                scanner.nextLine();
                break;
            case 4:
                System.out.println("Has elegido al Asesino.");
                System.out.println("Introduce el sigilo");
                int sigilo= scanner.nextInt();
                Arma arma4=armaEspecial2.elegirArma();
                Asesino nuevoAsesino = new Asesino(nombre, nivel, puntosVida,arma4,sigilo);
                listaHeroe.add(nuevoAsesino);
                System.out.println("El héroe ha sido añadido con éxito.");
                scanner.nextLine();
                break;
            default:
                System.out.println("Opción no válida.");
                break;
        }

    }

    public static boolean eliminaHeroe(ArrayList<Heroe> listaHeroe, String nombre) {
        for (Heroe heroe : listaHeroe) {
            if (heroe.getNombre().equalsIgnoreCase(nombre)) {
                System.out.println("Se puede eliminar el héroe");
                listaHeroe.remove(heroe);
                System.out.println("El héroe '" + nombre + "' ha sido eliminado.");
                return true;
            }
            }
            System.out.println("No se puede eliminar");
            return false;
        }

        public static Heroe buscarHeroe(ArrayList<Heroe> listaHeroe, String nombre){
        for(Heroe heroe:listaHeroe){
            if (heroe.getNombre().equalsIgnoreCase(nombre)) {
            return heroe;
            }
        }
        return null;
        }

        public static void listarHeroe(ArrayList<Heroe> listaHeroe){
            if (listaHeroe.isEmpty()) {
                System.out.println("No se pueden listar los héroes al estar vacío");
            } else {
                System.out.println("Lista de héroes registrados en el gremio");
                for (Heroe heroes : listaHeroe) {
                    System.out.println("- " + heroes.getNombre());

                }
            }
        }
        public static void salir(){
            System.out.println("Saliendo del programa...");
        }
    }


