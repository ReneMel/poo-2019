package Ejercicio02;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Arreglo unarreglo = new Arreglo();
        int dato;
        Scanner elemento = new Scanner(System.in);
        System.out.println("Cantidad de datos a ingresar: ");
        dato=elemento.nextInt();elemento.nextLine();
        unarreglo.crear(dato);

        System.out.println("La suma de los datos dentro del arreglo es de: "+ unarreglo.sumar());
        System.out.println("El promedio de los valores es de: "+ unarreglo.promediar());
        unarreglo.categorizar();

    }
}
