/*
Ejercicio 2
Realiza el programa paso a paso incorporando los requisitos de cada apartado solo cuando hayas
completado el anterior:

1. Escribe un programa que solicite 5 calificaciones de alumnos y muestre al final si hay algún suspenso. Utiliza la estructura for.
2. Modifica el programa para que nada más se introduzca un alumno suspenso, no continúe pidiendo las calificaciones del resto.
3. Modifica el programa para que mientras se introduzca una nota menor que 1 o mayor que 10, esta se vuelva a solicitar.
4. Modifica el programa para que cuando se introduzca una nota incorrecta se muestre un mensaje de advertencia.

En la siguiente ejecución todas las notas son aprobados por lo que solicitan las 5 notas.
 */

import java.util.Scanner;

public class eje2 {
    public static void main (String[] args)
    {
        //Declaración de variables
        Scanner sc=new Scanner(System.in);
        int nota;
        boolean sus=false;

        //Iniciamos bucle FOR
        for(int i=0;i<5 && !sus;i++) //2.Añadimos la condición (!sus) de parada cuando el alumno ha suspendido.
        {
            do //3.Anidamos bucle do While dentro del FOR para que se repita la introducción de datos sin no está dentro de los parametros.
            {
                System.out.print("Introduce una nota del 1 al 10: ");
                nota = sc.nextInt();

                    //4.Añadimos el if para mostrar el mensaje en caso de una nota incorrecta.
                    if(nota<1 || nota>10)
                    {
                        System.out.println("Nota incorrecta");
                    }
            }while (nota<1 || nota>10);//fin del bucle while para comprobar .

                if(nota<5) //validamos hay suspensos o no.
                {
                    sus=true;
                }
        }

        sc.close();//Limpiamos Buffer

        //Uso del if fuera del bucle con para mostrar mensajes de sí hay o no hay suspensos.
        if(sus)
        {
            System.out.println("Hay alumnos suspensos.");
        }
        else
        {
            System.out.println("No hay alumnos suspensos.");
        }
    }
}

