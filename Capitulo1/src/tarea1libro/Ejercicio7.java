
package tarea1libro;
import java.util.Scanner;

public class Ejercicio7 {
    public static double area(double base, double altura){
    return base*altura;
    }
    public static void main(String[] args) {
        double base,altura;
        Scanner entrada = new Scanner(System.in);
        System.out.println("Ingrese la base: ");
        base = entrada.nextInt();
        System.out.println("Ingrese la altura: ");
        altura = entrada.nextDouble();
        System.out.println("El valor del area es: " + area(base , altura));
    }
}
