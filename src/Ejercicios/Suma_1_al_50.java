package Ejercicios;

/**
 *
 * @author emils
 */
public class Suma_1_al_50 {
    public static void main(String[] args) {
        int i = 1;
        int sum = 0;
        do{
            sum += i;
            i++;
        } while(i <= 50);
        System.out.println(sum);
    }
}