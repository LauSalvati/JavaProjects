package Ejercicios_Examenv4.Ejercicio13;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Estacionamiento {

    /*
     * Este ejercicio fue realizado como practica para los examenes finales de la
     * facultad para la materia Tecnicas de Programación.
     * La consigna establece: 
     *      Calcule el monto a pagar por el servicio de estacionamiento, 
     *      teniendo en cuenta que por la primera hora de estadía se tiene 
     *      una tarifa de $500 y las restantes tienen un costo de $400. 
     *      Se tiene como datos: hora de entrada, hora de salida (formato entero), 
     *      iniciada una hora se contabiliza como hora total.
     */

    public static void main(String[] args) throws IOException{
        BufferedReader e = new BufferedReader(new InputStreamReader(System.in));

        /* horaE            Es el horario de ingreso al estacionamiento
         * horaS            Es el horario de salida del estacionamiento
         * horaT            Es el total de horas que el auto permaneció en el estacionamiento
         * totalaPagar      Es el total a pagar por el cliente
         * Confirm          Es una variable de control. Para en caso de poner un horario de salida menor al del de entrada, tener la confirmación del usuario.
         */

        int horaE,horaS,horaT,totalaPagar,confirm;

        System.out.print("Ingrese la hora de entrada (Formato 24hs) ");
        horaE=Integer.parseInt(e.readLine());
        System.out.print("Ingrese la hora de salida (Formato 24hs) ");
        horaS=Integer.parseInt(e.readLine());
        confirm = 0;
           while (horaS<horaE && confirm !=1 ) { //Este control busca que no haya errores de tipeo en el orden de ingreso de los horarios de entrada y salida
            System.out.println("Presione 1 para confirmar que la salida haya sido luego de las 00, sino ingrese 0");
            confirm = Integer.parseInt(e.readLine());
                if (confirm !=1) {
                System.out.print("Ingrese la hora de entrada (Formato 24hs) ");
                horaE=Integer.parseInt(e.readLine());
                System.out.print("Ingrese la hora de salida (Formato 24hs) ");
                horaS=Integer.parseInt(e.readLine());  
                }
           
            }
            if (horaS<horaE) { //De esta forma se cubre la posibilidad de que el horario de salida sea al día siguiente en las primeras hs de la madrugada
                horaT=24+horaS-horaE;
            
        } else { 
            horaT=horaS-horaE;
        }
        totalaPagar=500+(horaT-1)*400;
        System.out.println("El total a pagar por "+horaT+" horas es: "+totalaPagar);
}}