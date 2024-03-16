package Manejadores;

class Manejador100k extends ManejadorBase {
    private static final int Denominacion = 100000;

    @Override
    public void manejarSolicitud(int cantidad) {

        int Cantbilletes = cantidad / Denominacion;
        if (Cantbilletes > 0) {
            String b = "billete", b2 = "billetes", d;

            if (Cantbilletes > 1) {
                d = b2;
            } else {
                d = b;
            }

            System.out.println("Dispensando " + Cantbilletes + " " + d + " de " + Denominacion + "\n");
        }

        cantidad -= Cantbilletes * Denominacion;

        if (cantidad > 0) {
            ManejadorBase manejador50000 = new Manejador50k();
            manejador50000.manejarSolicitud(cantidad);

        }
    }

}
