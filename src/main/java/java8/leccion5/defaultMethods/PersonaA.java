package java8.leccion5.defaultMethods;

/**
 * @author Jorge Luis Pérez Canto
 */

public interface PersonaA {
    public void caminar();

    default public void hablar() {
        System.out.println("Saludos Coders - Persona A!!!");
    }

}
