package java8.leccion04.scopes;

/**
 * @author Jorge Luis Pérez Canto
 */

public class Scopes {
    private static double atributo1;
    private double atributo2;
    public double probarLocalVariable() {
        double n3 = 3;
        /*
        Operacion op = new Operacion() {
            @Override
            public double calcular(double n1, double n2) {
                return n1+n2+n3;
            }
        };

         */

        Operacion op = (x,y) -> {
            return x+y+n3;
        };

        return op.calcular(1,1);
    }

    public double probarAtributosStaticVariables() {
        Operacion op = (x,y) -> {
            atributo1 = x + y;
            atributo2 = atributo1;
            return atributo2;
        };

        return op.calcular(3, 2);
    }

    public static void main(String[] args) {
        Scopes app = new Scopes();
        //System.out.println(app.probarLocalVariable());
        System.out.println(app.probarAtributosStaticVariables());
    }
}
