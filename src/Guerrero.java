public class Guerrero extends Heroe {
    int fuerza;

    public Guerrero(String nombre, int nivel, int puntosVida, Arma armaEspecial, int fuerza) {
        super(nombre, nivel, puntosVida, armaEspecial);
        this.fuerza = fuerza;
    }

    public int getFuerza() {
        return fuerza;
    }

    @Override
    public String toString() {
        return "Guerrero{" +
                "fuerza=" + fuerza +
                ", nombre='" + nombre + '\'' +
                ", nivel=" + nivel +
                ", puntosVida=" + puntosVida +
                ", armaEspecial=" + armaEspecial2 +
                '}';
    }

    public void atacar() {
        if (puntosVida > 0) {
            System.out.println("Puedes atacar");
            int dañoTotal=(fuerza* armaEspecial2.daño);
            System.out.println("El daño producido es "+dañoTotal);
        }else{
            System.out.println("No puedes atacar");
        }


    }
}
