package ejercicio2;

public class Polideportivo implements Edificio, IInstalacionDeportiva {

    private static final int tipoInstalacion = 1;
    private double superficie;
    private String nombre;

    Polideportivo() {
    }

    Polideportivo(double superficie, String nombre) {
        this.superficie = superficie;
        this.nombre = nombre;
    }

    @Override
    public int getTipoInstalación() {
        return tipoInstalacion;
    }

    @Override
    public double getSuperficieEdificio() {
        return superficie;
    }

    public void setSuperficie(double superficie) {
        this.superficie = superficie;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

}
