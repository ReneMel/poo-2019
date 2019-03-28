package Ejercicio02;

import java.util.ArrayList;
import java.util.Scanner;

public class Arreglo {

    ArrayList<Integer> lista_num = new ArrayList<>();

    public void crear(int dato){
        Scanner data = new Scanner(System.in);
        for(int i =0; i<dato;i++){
            System.out.println("ingrese dato:  ");
            lista_num.add(data.nextInt());data.nextLine();
        }
    }
    public int sumar(){
        int suma=0;
        for (Integer s:lista_num) {
            suma+=s;
        }
        return suma;
    }
    public Double promediar(){
        Double suma=0.0;
        for (Integer s:lista_num) {
            suma+=s;
        }
        suma= (suma)/lista_num.size();
        return suma;
    }
    public void categorizar(){
        int par=0, impar=0;
        for (Integer s :lista_num) {
            if (s%2==0){
                par++;
            }
            else {
                impar++;
            }
        }
        System.out.println("El arreglo tiene "+par+" números pares y "+impar+" números impares");

    }
}