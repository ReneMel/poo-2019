package Ejercicio01;

import java.util.Random;

public class Arreglo {
    int capacidad;
    int[] arregloNum;

    public void crear(int numero) {
        arregloNum = new int[numero];
        System.out.println("ARREGLO CREADO\n\t");
    }

    public void llenar(){
        int i=0;
        while(i<capacidad){
            Random aleatorio = new Random();
            arregloNum[i]= aleatorio.nextInt(10);
            i++;
        }
    }

    public void sumar (){
        if (arregloNum.length%2==0){
            for (int i=0;i<capacidad/2;i++){
                int total=0;
                total+=arregloNum[capacidad-1-i]+arregloNum[i];
                System.out.println("El total del dato "+(capacidad-i)+" y  " +(i+1)+ " es :"+total);
            }
        }
        if (arregloNum.length%2!=0){
            for(int i =0; i<capacidad/2;i++){
                int total=0;
                total+=arregloNum[capacidad-1-i]+arregloNum[i];
                System.out.println("El total del dato "+(capacidad-i)+" y  " +(i+1)+ " es :"+total);
            }
            System.out.println("El total del dato "+(capacidad -(capacidad/2))+" y  " +(capacidad -(capacidad/2)+ " es :"+(arregloNum[capacidad -(capacidad/2)]*2)));
        }

    }
}