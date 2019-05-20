
package tarea1libro;

public class Ejercicio8 {
    public static double conversionMillas (double distanciaKm){
        double distanciaMill;
        distanciaMill = distanciaKm/1.6;
        return distanciaMill;
    }
    public static double velocidadMpH(double distanciaMill , double tiempoEnMin){
        double velocidadResult;
        velocidadResult = 60.0*distanciaMill/tiempoEnMin; // EL 60.0 transforma los min a Horas
        return velocidadResult;
    }
    public static void main(String[] args) {
        double distanciaKm = 14.0;
        double tiempoEnMin = 45.5;
        double velocidad;
        velocidad = velocidadMpH(conversionMillas(distanciaKm) , tiempoEnMin);
        System.out.println("La velocidad es: " + velocidad + " Mill/H");
        
        
        
    }
}
