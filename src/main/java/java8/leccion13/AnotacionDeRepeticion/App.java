package java8.leccion13.AnotacionDeRepeticion;

import java.lang.annotation.Repeatable;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

/**
 * @author Jorge Luis Pérez Canto
 */

public class App {

    @Retention(RetentionPolicy.RUNTIME)
    public @interface Lenguajes {
        Lenguaje[] value() default  {};
    }

    @Repeatable(value = Lenguajes.class)
    public @interface Lenguaje {
        String value();
        String nombreUsuario() default "Jorge";
    }

    //1.7
    /*
    @Lenguajes({
            @Lenguaje("Java"),
            @Lenguaje("Python")
    })
     */

    //1.8
    @Lenguaje("Java")
    @Lenguaje("Python")
    public interface LenguajeProgramacion {

    }

    public static void main(String[] args) {
        Lenguaje[] lenguajeArray = LenguajeProgramacion.class.getAnnotationsByType(Lenguaje.class);
        System.out.println("Se tiene " + lenguajeArray.length + " anotaciones en Lenguaje");

        Lenguajes len = LenguajeProgramacion.class.getAnnotation(Lenguajes.class);
        for (Lenguaje elemento : len.value()){
            System.out.println(elemento.value() );
        }

    }
}
