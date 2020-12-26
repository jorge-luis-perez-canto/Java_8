package java8.leccion07.referenciasDeMetodos;

/**
 * @author Jorge Luis Pérez Canto
 */

public class Persona {
    private int id;
    private String nombre;

    public Persona() {
    }

    public Persona(int id, String nombre) {
        this.id = id;
        this.nombre = nombre;
    }

    public int getId() {
        return id;
    }

    public Persona setId(int id) {
        this.id = id;
        return this;
    }

    public String getNombre() {
        return nombre;
    }

    public Persona setNombre(String nombre) {
        this.nombre = nombre;
        return this;
    }
}
