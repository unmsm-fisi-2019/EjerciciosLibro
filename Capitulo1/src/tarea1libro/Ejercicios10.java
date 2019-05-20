
package tarea1libro;

public class Ejercicios10 {
    public static double conversionKm (double distanciaMill){
        double distanciaKm;
        distanciaKm = distanciaMill*1.6;
        return distanciaKm;
    }
    public static double velocidadKMpH(double distanciaKm , double tiempoEnMin){
        double velocidadResult;
        velocidadResult = 60.0*distanciaKm/tiempoEnMin; // EL 60.0 transforma los min a Horas
        return velocidadResult;
    }
    public static void main(String[] args) {
        double distanciaMill = 24.0;
        double tiempoEnMin = 100;
        double velocidad;
        velocidad = velocidadKMpH(conversionKm(distanciaMill) , tiempoEnMin);
        System.out.println("La velocidad es: " + velocidad + " Km/h");
        
        
        
    }
}
