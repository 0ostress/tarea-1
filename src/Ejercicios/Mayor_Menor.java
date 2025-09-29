package Ejercicios;

/**
 *
 * @author emils
 */
public class Mayor_Menor {
    public static void main(String[] args) {
        int valor1 = 10;
        int valor2 = 5;
        
        if(valor1 > valor2){
            System.out.println("El numero mayor es: " + valor1);
            System.out.println("El numero menor es: " + valor2);
        } else {
            System.out.println("El numero mayor es: " + valor2);
            System.out.println("El numero menor es: " + valor1);
        }
    }
}
