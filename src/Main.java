public class Main {
    public static void main(String[] args) {
        suma(12, 15);

        Coche miCoche = new Coche();
        miCoche.agregarPuerta(1);
        System.out.println(miCoche.getPuertas());
    }

    public static int suma(int num1,  int num2) {
        return num1 + num2;
    }
}

class Coche {
    private int puertas = 4;

    public int agregarPuerta(int numeroPuertas) {
        return this.puertas + numeroPuertas;
    }

    public int getPuertas() {
        return puertas;
    }
}