package Manejadores;

public class Dispensarbilletes {
    private ManejadorBase manejador;

    public Dispensarbilletes() {
        chainofresponsability();
    }

    private void chainofresponsability() {
        ManejadorBase manejador100000 = new Manejador100k();
        manejador = manejador100000;

    }

    public void retirar(int cantidad) {
        if (cantidad <= 0) {
            System.out.println("la cantidad a retirar debe ser mayor a 0");
            return;
        }
        manejador.manejarSolicitud(cantidad);
    }
}
