public class Arquero extends Heroe{
    int precision;

    public Arquero(String nombre, int nivel, int puntosVida, Arma armaEspecial, int precision) {
        super(nombre, nivel, puntosVida, armaEspecial);
        this.precision = precision;
    }

    public int getPrecision() {
        return precision;
    }

    public void arco(){
        if(puntosVida>0){
            System.out.println("Puedes disparar con el arco");
            int dañoTotal=(precision* armaEspecial2.daño);
            System.out.println("El daño producido es "+dañoTotal);
        }else{
            System.out.println("No se puede disparar");
        }
    }
}
