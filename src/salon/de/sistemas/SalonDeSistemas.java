package salon.de.sistemas;

import java.util.Date;

public class SalonDeSistemas {

    private int numerodesillas;
    private int numerodepuertas;
    private String modelo;
    private boolean tieneaire;
    private int numerodeteclados;

    public void comprarPuertas() {
        this.numerodepuertas += 1;

    }

    public void comprarPuertas(int nuevonumerodepuertas) {
        if (nuevonumerodepuertas <= this.numerodepuertas) {
            System.out.println("El Salon no tiene puertas");
        } else {
            this.numerodepuertas = nuevonumerodepuertas;
            System.out.println("Nuevas puertas: "
                    + String.valueOf(nuevonumerodepuertas) + " madera");
        }
        

    }

   

}