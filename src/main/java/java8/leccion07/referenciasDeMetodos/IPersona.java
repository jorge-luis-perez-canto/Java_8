package java8.leccion07.referenciasDeMetodos;

/**
 * @author Jorge Luis Pérez Canto
 */

@FunctionalInterface
public interface IPersona {
     Persona crear(int id, String nombre);

}
