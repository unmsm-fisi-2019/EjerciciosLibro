
package tarea1libro;

import java.util.Scanner;

public class Ejercicio9 {
    
    public static int nuevaPob(int años){
        final int segPorDia = 85400;
        int nuevaPob = 0;
        int nuevoNacim = 7, nuevaMuerte = 13, nuevoInmig = 45;
        //cada variable representa cada cuantos seg hay nuevo nacimiento/muerte/inmigrante.
        int nacimientoPorAño = segPorDia / nuevoNacim * 365;
        int muertePorAño = segPorDia / nuevaMuerte * 365;
        int InmigPorAño = segPorDia / nuevoInmig * 365; 
        
        for (int i = 0; i <= años; i++){
            nuevaPob += nacimientoPorAño + muertePorAño + InmigPorAño;
        }
        return nuevaPob;
    }
    public static void main(String[] args) {
    Scanner entrada = new Scanner(System.in);
    int poblacionAct = 312032486;
    int años,pobTotal;
        System.out.println("Ingrese la cantidad de años: ");
        años = entrada.nextInt();
        pobTotal = poblacionAct + nuevaPob(años);
        System.out.println("La nueva poblacion dentro de " + años + " años será : " + pobTotal);
    
    }
    
}
