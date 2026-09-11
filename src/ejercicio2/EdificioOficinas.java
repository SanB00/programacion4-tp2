package ejercicio2;

public class EdificioOficinas implements Edificio {
    private int cantOficinas;
    private double superficie;

    public EdificioOficinas() {
    }

    public EdificioOficinas(int cantOficinas, double superficie) {
        this.cantOficinas = cantOficinas;
        this.superficie = superficie;
    }

    public int getCantOficinas() {
        return cantOficinas;
    }

    public void setCantOficinas(int cantOficinas) {
        this.cantOficinas = cantOficinas;
    }

    @Override
    public double getSuperficieEdificio() {
        // TODO Auto-generated method stub
        return superficie;
    }

    @Override
    public String toString() {
        return "EdificioOficinas [cantOficinas=" + cantOficinas + ", superficie=" + superficie + "]";
    }

    public void setSuperficie(double superficie) {
        this.superficie = superficie;
    }
}
