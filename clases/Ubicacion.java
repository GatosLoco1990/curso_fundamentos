package clases;

public class Ubicacion {
    private String nombre;
    private float distancia;
    private int cant;

    public String getNombre() {
        return nombre;
    }

    public int getCant() {
        return cant;
    }

    public void setCant(int cant) {
        this.cant = cant;
    }

    public float getDistancia() {
        return distancia;
    }

    public void setDistancia(float distancia) {
        this.distancia = distancia;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

}
