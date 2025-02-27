public class Asesino extends Heroe{
    int sigilo;

    public Asesino(String nombre, int nivel, int puntosVida, Arma armaEspecial, int sigilo) {
        super(nombre, nivel, puntosVida, armaEspecial);
        this.sigilo = sigilo;
    }

    public int getSigilo() {
        return sigilo;
    }

    public void asesinar(){
        if(puntosVida>0){
            System.out.println("Puedes asesinar");
            int dañoTotal=(sigilo* armaEspecial2.daño);
            System.out.println("El daño producido es "+dañoTotal);
        }else{
            System.out.println("No puedes asesinar");
        }
    }
}
