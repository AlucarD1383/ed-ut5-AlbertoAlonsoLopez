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

//MODIFICO EL EJERCICIO 1 PARA QUE SE NOTE
        Scanner scanner = new Scanner(System.in);

//PEDIMOS 2 NUMEROS
        System.out.println("Introduce el primer número: ");
        int primerNumero = scanner.nextInt();

        System.out.println("Introduce el segundo número: ");
        int segundoNumero = scanner.nextInt();

        //MULTIPLICAMOS LOS NUMEROS Y MOSTRAMOS EL RESULTADO EN PANTALLA

        int resultado = primerNumero * segundoNumero;

        System.out.println("El resultado de la multiplicacion es: " + resultado);
    }
}

