
package tarea1libro;
public class Ejercicio4 {
    public static int Resultado(int n){
        int Acum=0;
        for(int i = 0 ; i <= n ; i++){
            Acum += i;
        }
        return Acum;
    }
    
    public static void main(String[] args) {
        int n = 9;
        System.out.println("El resultado es: " + Resultado(n));
    }
}
