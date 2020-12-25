package java8.leccion5.defaultMethods;

/**
 * @author Jorge Luis Pérez Canto
 */

public class DefaultMethod implements PersonaA, PersonaB {

    @Override
    public void caminar() {
        System.out.println("Hola Coders");

    }

    @Override
    public void hablar() {
        //PersonaB.super.hablar();
        System.out.println("Suscríbanse Coders!");
    }

    public static void main(String[] args) {
        DefaultMethod app = new DefaultMethod();
        //app.caminar();
        app.hablar();
    }

}
