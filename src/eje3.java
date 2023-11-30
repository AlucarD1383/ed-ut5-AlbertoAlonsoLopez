/*
Ejercicio 3
Pide por teclado un número n y dibuja un triángulo rectángulo de n elementos de lado, utilizando
para ello asteriscos (*). Por ejemplo, para n = 5:
 */

import java.sql.SQLOutput;
import java.util.Scanner;
public class eje3 {
    public static void main(String[] args)
    {
        //Declaramos variables
        Scanner sc = new Scanner(System.in);
        int n;
        //Solicitamos la introducción de los datos

        do //Siguiendo el Ejemplo resuelto del enunciado usamos el bucle do While para evitar que se introduzca un numero negativo o 0
        {
        System.out.print("Introduce un número: ");
        n=sc.nextInt();
        } while(n<1);

        //Bucle FOR anidado:
        for(int i=0; i<=n; i++)//1ªBuble recorre hasta que i sea igual o menor a n
        {
            for(int j=0;j<i;j++)//2ºBucle pinta de " *" en cada fila mientras el valor sea menor i del bucle anterior.
            {
                System.out.print("*");
            }

        //Hacemos el Salto de linea dentro del primer bucle una vez se ha pintado el asterisco del segundo bucle.
        System.out.println();
        }

        // añado comentario para imprimir por pantalla
        System.out.print("Hacer una piramide con dos bucles for puede resultar dificil en un inicio.");
    }
}
