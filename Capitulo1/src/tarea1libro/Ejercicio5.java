
package tarea1libro;
public class Ejercicio5 {
    public static double Pi(int n){
        double result = 0;
        for(int i = 1 ; i<=n ; i++){
            if(i % 2 == 0){
                result = result - (1.0) / (2*i-1);
            }else  {
                result = result + (1.0)/ (2*i-1);
            }
            
        }
        return result;
    }
    
    public static void main(String[] args) {
       System.out.println("El primer resultado es: " + Pi(6));
       System.out.println("El segundo resultado es: " + Pi(8));
    }
}
