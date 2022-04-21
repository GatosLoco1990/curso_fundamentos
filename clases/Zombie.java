package clases;

public class Zombie {
    private String nombre;
    private int salud;
    private String fecha_nac;
    private String tipo_sang;

    public Zombie(String nombre, int salud, String fenac, String sang) {
        this.nombre = nombre;
        this.salud = salud;
        this.fecha_nac = fenac;
        this.tipo_sang = sang;
    }

    public int getSalud() {
        return salud;
    }

    public void setSalud(int salud) {
        this.salud = salud;
    }

    public String getNombre() {
        return nombre;
    }

    public String getTipo_sang() {
        return tipo_sang;
    }

    public void setTipo_sang(String tipo_sang) {
        this.tipo_sang = tipo_sang;
    }

    public String getFecha_nac() {
        return fecha_nac;
    }

    public void setFecha_nac(String fecha_nac) {
        this.fecha_nac = fecha_nac;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
}
