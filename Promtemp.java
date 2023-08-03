package Ejercicios_Examenv3.EJercicio2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Promtemp {

    /*
     * Este ejercicio fue realizado como practica para los examenes finales de la
     * facultad para la materia Tecnicas de Programación.
     * La consigna establece: 
     *    Calcule el promedio de 10 temperaturas ingresadas por teclado mayores a -20°C (Validar). 
     *    Al finalizar calcular y mostrar el promedio de las temperaturas ingresadas y la cantidad 
     *    de temperaturas mayores o iguales a 10°C.
     */


    public static void main(String[] args) throws IOException {
        /*Temp      Es la temperatura que ingresa el usuario por teclado
         *Qtemp20   Es el contador de las temperaturas mayores o iguales a -20°
         *Qtemp10   Es el contador de las temperaturas mayores o iguales a 10
         *Sumtemp20 Es la suma de las temperaturas mayores o iguales a -20°
         *Promtemp  Es el promedio de las temperaturas mayores o iguales a -20°
         */
        int Temp, Qtemp20, Qtemp10, Sumtemp20;
         float Promtemp;

         BufferedReader e = new BufferedReader(new InputStreamReader(System.in));
        Qtemp10 =0;
        Qtemp20= 0;
        Sumtemp20=0;

        /*  Se le pide al usuario que ingrese temperaturas
         *  El contador de Qtemp20 sólo suma en caso que la temperatura ingresada sea mayor o igual a -20°
         *  El límite para el while consiste en ingresar 10 temperaturas mayores o iguales a -20°
         */

        while (Qtemp20<10){; 
         System.out.print("Ingrese una temperatura: ");
         Temp = Integer.parseInt(e.readLine());
         if (Temp>=-20){
            Qtemp20++;
            Sumtemp20 = Sumtemp20+Temp;
            if (Temp>=10){ //En caso que la temperatura ingresada sea mayor o igual a 10° se suma una unidad al contador Qtemp10
                Qtemp10++;
            }
         }
        }
         Promtemp=(float)Sumtemp20/Qtemp20;
         //Se muestran los resultados por pantalla
         System.out.println("El promedio de las temperaturas ingresadas es "+Promtemp);
         System.out.println("La cantidad de las temperaturas ingresadas mayores a 10 es: "+Qtemp10);


    }
}
