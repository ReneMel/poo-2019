package Ejercicio02;

import java.util.ArrayList;
import java.util.concurrent.ThreadLocalRandom;


public class Main {

    public static void main(String[] args) {
	// write your code here
        ArrayList<String> unarreglo = new ArrayList<>(3);
        int palabra= ThreadLocalRandom.current().nextInt(0,2+1);
        System.out.println(palabra);
        unarreglo.add("hola");
        unarreglo.add("vida");
        unarreglo.add("naruto");

        Ahorcado juego = new Ahorcado();
        juego.jugar(unarreglo.get(palabra));


    }
}
