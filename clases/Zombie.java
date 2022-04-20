package clases;

public class Zombie {
    private String nombre;
    private String fecha_nac;
    private String tipo_sang;

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
