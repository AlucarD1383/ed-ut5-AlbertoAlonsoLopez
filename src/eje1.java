/*
Ejercicio 1
Escribe un programa que permita al usuario acertar un número entre 1 y 100 (generado
aleatoriamente). El proceso termina cuando el usuario acierta o cuando se rinde (introduciendo
un -1). Cada vez que el usuario falle se mostrará un mensaje advirtiendo si el número a adivinar es
mayor o menor que el introducido. La siguiente instrucción guarda en la variable secreto un
número aleatorio entre 1 y 100.
 */

import java.util.Scanner;
public class eje1 {
    public static void main(String[] args) {
        //Declaramos las variables
        Scanner sc = new Scanner(System.in);
        int num,ale;
        boolean salir=false;

        //Asignamos el valor random a la variable con la funcion random.
        ale= 1 + (int) (Math.random()*100);

        System.out.println("ADIVINA EL NÚMERO\n");//Titulo del programa con salto de linea adicional
        //Iniciamos bucle para adivinar el numero asignado anteriormente

        do
        {
            System.out.print("introduce un número entre 1 y 100: ");
            num=sc.nextInt();//Solicitamos número al usuario y lo guardamos en la variable num

                //con los if comprobamos si el numero es mayor, menor, si ha acertado el número secreto o si se rinde
                if(num==ale)
                {
                    System.out.println("Enhorabuena. El numero secreto era "+ale);
                    salir=true; // Cambiamos el valor de la variable booleana si a acertado
                }
                else if (num<ale)
                {
                    System.out.println("El número secreto es mayor al introducido");
                }
                else
                {
                    System.out.println("El número secreto es menor al introducido");
                }
                if(num==-1)
                {
                    System.out.println("Mala suerte. No has acertado el número secreto");
                    salir=true;//Cambiamos el valor de la variable si se ha rendido
                }
        }while(!salir);//Salimos del bucle cuando el valor sea true.

        sc.close();//Limpiamos Buffer
    }
}
