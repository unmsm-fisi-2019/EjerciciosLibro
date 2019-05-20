package tarea1libro;
import java.util.Scanner;

public class Ejercicio6 {
    public static double perimetro(double radio, double pi){
        return radio*pi*2;
    }
    public static double area(double radio, double pi){
        return pi*Math.pow(radio, 2);
    }
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        final double pi = 3.1416;
        double radio;
        System.out.println("Ingrese el valor de el radio");
        radio = entrada.nextDouble();
        System.out.println("El perimetro es: " + perimetro(radio,pi));
        System.out.println("El area es: " + perimetro(radio,pi));
    }
}
