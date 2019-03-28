package Ejercicio02;

import java.util.ArrayList;
import java.util.Scanner;

public class Ahorcado {
    int intentos=0, correcto=0;
    char intento;

    private static void imprimir(char[] respuestas, int intentos){
        System.out.println("Intentos: "+intentos);
        for (int i = 0; i < respuestas.length; i++) {
            System.out.print("["+respuestas[i]+"]");
        }
        System.out.println("\n");
    }


    public void jugar (String palabra){
        Scanner dato= new Scanner(System.in);
        char[] respuestas = new char[palabra.length()];



        for (int i = 0; i < palabra.length(); i++) {
            respuestas[i] = '_'; }
        System.out.println ("Bienvenido a ahorcado!!");
        imprimir(respuestas,intentos);

        while(correcto!=palabra.length()){
            System.out.println("Ingresa tu letra: ");
            intento=dato.next().toLowerCase().charAt(0);dato.nextLine();
            for(int i=0; i<palabra.length();i++){
                if(intento==palabra.charAt(i)){
                    respuestas[i]=palabra.charAt(i);
                    correcto++;
                }
            }
            intentos++;
            imprimir(respuestas,intentos);

        }
        System.out.println("Correcto, la palabra era ["+palabra+"] \n\rAcertaste en "+intentos+" intentos");





    }

}
