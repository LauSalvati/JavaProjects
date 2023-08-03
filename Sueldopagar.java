package Ejercicios_Examenv4.Ejercicio6;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Sueldopagar {

    /*
     * Este ejercicio fue realizado como practica para los examenes finales de la
     * facultad para la materia Tecnicas de Programación.
     * La consigna establece: 
     *    Determine el sueldo semanal de un trabajador con base en las horas trabajadas 
     *    y el pago por hora, considerando que después de las 40 horas cada hora se considera como
     *    excedente y se paga el doble.
     */


    public static void main(String[] args) throws IOException {

        BufferedReader e = new BufferedReader(new InputStreamReader(System.in));


        /*  horaT       Es el total de horas trabajadas por el empleado
         *  sueldoHs    Es el sueldo por hora del empleado. Se ingresa por teclado
         *  totalPagar  Es el total a pagar hacia ese empleado
         *  diasT       Es el total de días trabajados por el empleado. Se ingresa por teclado
         *  horaD       Es el total de horas trabajadas por el empleado en cada día de la semana
         */


        int horaT, sueldoHs, totalPagar, diasT, horaD;
        horaT = 0;
        
        System.out.print("Ingrese el sueldo por hora: ");
        sueldoHs = Integer.parseInt(e.readLine());
        
        System.out.print("Ingrese la cantidad de días el empelado trabajó en la semana: ");
        diasT = Integer.parseInt(e.readLine());
        while (diasT > 7) { //Es un control para cersiorarse que la cantidad de días ingresadas no sea mayor a la cantidad de días de la semana
            System.out.println("\nLa cantidad de días no puede ser mayor que 7");
            System.out.print("Ingrese la cantidad de días el empelado trabajó en la semana: ");
            diasT = Integer.parseInt(e.readLine());
        }

        for (int i = 0; i < diasT; i++) { //Con este ciclo se le pide al usuario que ingrese por cada día cuantas horas trabajó el empleado.
            System.out.print("Ingrese la cantidad de horas que el empelado trabajó en el día " + (i+1) + ": ");
            horaD = Integer.parseInt(e.readLine());
            while (horaD>24) { //Es un control para cersiorarse que la cantidad de horas ingresadas no sea mayor a la cantidad de horas de un día
                System.out.println("\nLa cantidad de horas no puede ser mayor que 24");
                System.out.print("Ingrese la cantidad de horas que el empelado trabajó en el día " + (i+1) + ": ");
                horaD = Integer.parseInt(e.readLine());
            }
            
            horaT = horaT + horaD;
        }
        
        //Según la cantidad de horas trabajadas se calcula el sueldo a pagar.
        if (horaT <= 40) {
            totalPagar = sueldoHs * horaT;
        } else {
            totalPagar = sueldoHs * horaT * 2;
        }

        System.out.println("\nEl monto a pagar por "+horaT+" horas trabajadas en la semana es: " + totalPagar);
    }
}
