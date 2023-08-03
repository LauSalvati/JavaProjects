package Ejercicios_Examenv4.Ejercicio9;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Calculos {
        /*
     * Este ejercicio fue realizado como practica para los examenes finales de la
     * facultad para la materia Tecnicas de Programación.
     * La consigna establece: 
     *     Cree un programa en java que permita ingresar dos enteros y que muestre por pantalla
     *     la suma, la diferencia, el producto y el cociente de los enteros ingresados. 
     */

     /*Método para calcular la suma */
    public static int suma (int A, int B){
        int totalSuma;
        totalSuma= A+B;
        return totalSuma;
    }

    /*Método para calcular la resta */
    public static int resta (int A, int B){
        int totalResta;
        totalResta= A-B;
        return totalResta;
    }

    /*Método para calcular la multiplicación */
    public static int multi (int A, int B){
        int totalMulti;
        totalMulti= A*B;
        return totalMulti;
    }

    /*Método para calcular la División */
    public static void div (int A, int B){
        float totaldiv;
        if (B==0) { //Es un control para evitar que el sistema intente dividir por o y arroje un error.
            System.out.println("No es posible dividir por 0");
        } else {
            totaldiv= (float) A/B;
            System.out.println("El resultado de la división es: "+totaldiv);
        }
        
        
    }

    /*Método principal */
    public static void main(String[] args) throws IOException{
        BufferedReader e = new BufferedReader(new InputStreamReader(System.in));
        
        int n1,n2;

        System.out.print("Ingrese un entero: ");
        n1=Integer.parseInt(e.readLine());
        System.out.print("Ingrese un entero: ");
        n2=Integer.parseInt(e.readLine());

        System.out.println("La suma de los números es "+suma(n1,n2));
        System.out.println("La resta de los números es "+resta(n1,n2));
        System.out.println("La multi de los números es "+multi(n1,n2));
        div (n1,n2);
    }

}
