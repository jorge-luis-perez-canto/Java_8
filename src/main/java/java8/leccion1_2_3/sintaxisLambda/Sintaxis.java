package java8.leccion1_2_3.sintaxisLambda;

/**
 * @author Jorge Luis Pérez Canto
 */

public class Sintaxis {
    public double probarSintaxis() {
        //Operacion op = (double p1, double p2) -> (p1+p2)/2;

        //Operacion op = (double p1, double p2) -> {return (p1+p2)/2;};

        /*
        Operacion op = (double p1, double p2) -> {
            double a = 2.0;
            System.out.println(a);
            return (p1+p2)/2 + a;
        };
         */

        //Operacion op = (p1, p2) -> (p1+p2)/2;

        //return op.calcularPromedio(2, 3);




        //Operacion op = () -> 2;

        /*
        Operacion op = () -> {
            int x = 2;
            int y = 3;
            return x + y;
        };

        return op.calcularPromedio();
         */

        Operacion op = (p1, p2) -> {
            double a = 2.0;
            System.out.println(a);
            return (p1+p2)/2 + a;
        };

        return op.calcularPromedio(2, 3);
    }

    public static void main(String[] args) {
        Sintaxis app = new Sintaxis();
        System.out.println(app.probarSintaxis());
    }
}
