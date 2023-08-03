package Ejercicios_Examenv4.Ejercicio7y14;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class CompraEntradas {

    /*
     * Este ejercicio fue realizado como practica para los examenes finales de la
     * facultad.
     * La consigna establece: 
     *      Determine el pago a realizar por la entrada a un espectáculo
     *      donde se pueden comprar sólo hasta cuatro entrada, donde al costo de dos
     *      entradas se les descuenta el 10%, al
     *      de tres entrada el 15% y a la compra de cuatro tickets se le descuenta el 20%.
     */

    public static void main(String[] args) throws IOException {
        BufferedReader e = new BufferedReader(new InputStreamReader(System.in));
        int qE, pE; //qE es la cantidad de entradas a comprar, se ingresa por teclado. pE es el precio a pagar por c/ entrada, se ingresa por teclado
        float totalaP; //Es el total a pagar por el total de las entradas.

        System.out.println("Ingrese el precio de las entradas");
        pE = Integer.parseInt(e.readLine());
        System.out.println("Ingrese la cantidad de entradas a comprar (no mas de 4)");
        qE = Integer.parseInt(e.readLine());

        while (qE > 4 || qE == 0) { //Este control se asegura que el número ingresado sea dentro de las opciones disponibles
            System.out.println("La cantidad de entradas no puede ser 0 ni mayor a 4, reintente");
            System.out.println("Ingrese la cantidad de entradas a comprar (no mas de 4)");
            qE = Integer.parseInt(e.readLine());
        }

        switch (qE) {
            case 1:
                totalaP = (float) qE * pE;
                break;
            case 2:
                totalaP = (float) qE * pE * 90 / 100;
                break;
            case 3:
                totalaP = (float) qE * pE * 85 / 100;
                break;
            case 4:
                totalaP = (float) qE * pE * 80 / 100;
                break;
            default:
                totalaP = 0;
                break;
        }

        System.out.println("El total a pagar por " + qE + " entradas es " + totalaP);
    }
}