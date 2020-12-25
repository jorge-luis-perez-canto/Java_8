package java8.leccion13.AnotacionDeRepeticion;

/**
 * @author Jorge Luis Pérez Canto
 */

public @interface AnotacionCustom {
    String nombre();
    boolean habilitado() default true;
}
