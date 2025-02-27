public class Mago extends Heroe{
    int mana;

    public Mago(String nombre, int nivel, int puntosVida, Arma armaEspecial, int mana) {
        super(nombre, nivel, puntosVida, armaEspecial);
        this.mana = mana;
    }

    public int getMana() {
        return mana;
    }

    public void hechizo(){
        if(puntosVida>0){
            System.out.println("Puedes hechizar");
            int dañoTotal=(mana* armaEspecial2.daño);
            System.out.println("El daño producido es "+dañoTotal);
        }else{
            System.out.println("No puedes hechizar");
        }
    }
}
