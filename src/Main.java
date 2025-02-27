import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    static ArrayList<Heroe> listaHeroe = new ArrayList<>();
    static ArrayList<Arma> armaEspecial = new ArrayList<>();

    public static void main(String[] args) {
        System.out.println("Bienvenido a Heroes 1J");
        play();
    }


    public static void printMenu() {
        System.out.println("Menú:\n" +
                "1. Añadir un nuevo héroe\n" +
                "2. Añadir un arma nueva al arsenal\n" +
                "3. Eliminar un héroe por su nombre\n" +
                "4. Buscar un héroe y mostrar sus detalles\n" +
                "5. Listar todos los héroes registrados en el gremio\n" +
                "6. Salir del programa");
    }

    public static void play() {
        listaHeroe.add(new Guerrero("Super Man", 3, 5, new Arma("Puño", 5), 2));
        listaHeroe.add(new Mago("Harry Potter", 2, 0, new Arma("Barita", 7), 5));
        listaHeroe.add(new Arquero("Spider Man", 6, 2, new Arma("Arco", 4), 3));
        listaHeroe.add(new Asesino("Peter Pan", 7, 4, new Arma("Pistola", 5), 2));
        listaHeroe.add(new Heroe("Batman", 4, 5, new Arma("Laser", 40)));

        Scanner scanner = new Scanner(System.in);
        int opcion;
        do {
            printMenu();
            System.out.println("Introduce la opción que desee");
            opcion = scanner.nextInt();
            scanner.nextLine();
            switch (opcion) {
                case 1:
                    System.out.println("AÑADIR NUEVO HÉROE");
                    Heroe.addNewHeroe(listaHeroe, armaEspecial);
                    break;
                case 2:
                    System.out.println("AÑADIR ARMA");
                    Arma.addNewArma(armaEspecial);
                    break;
                case 3:
                    System.out.println("ELIMINAR HEROE");
                    System.out.println("Introduce el nombre del héroe");
                    String nombre= scanner.nextLine();
                    Heroe.eliminaHeroe(listaHeroe,nombre);
                    break;
                case 4:
                    System.out.println("BUSCAR HÉROE Y MOSTRAR DETALLES");
                    System.out.println("Introduce el nombre del héroe");
                    String nombre2=scanner.nextLine();
                    Heroe heroeEncontrado=Heroe.buscarHeroe(listaHeroe,nombre2);
                    if (heroeEncontrado!=null){
                        System.out.println("Héroe encontrado:");
                        System.out.println("Nombre: " + heroeEncontrado.getNombre());
                        System.out.println("Nivel: " + heroeEncontrado.getNivel());
                        System.out.println("Puntos de Vida: " + heroeEncontrado.getPuntosVida());
                        System.out.println("Arma Especial: " + heroeEncontrado.getArmaEspecial().getNombre());
                    } else {
                       System.out.println("Héroe no encontrado.");
                    }
                break;
                case 5:
                    System.out.println("LISTAR HÉROES");
                    Heroe.listarHeroe(listaHeroe);
                    break;
                case 6:
                Heroe.salir();
                break;
                default:
                    System.out.println("ERROR");
            }

        } while (opcion != 6);

        }
    }


