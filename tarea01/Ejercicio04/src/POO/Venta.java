package POO;

import java.util.Scanner;

public class Venta {
    String nombre;
    Double precio=0.0;
    int numero=1;

    public void comprar(){
        Scanner Elemento = new Scanner(System.in);
        System.out.println("Ingrese nombre");
        //dato=Elemento.nextLine();
        nombre=Elemento.nextLine();
        System.out.println("Ingrese precio");
        precio= Elemento.nextDouble();Elemento.nextLine();
        System.out.println("Ingrese cantidad");
        numero= Elemento.nextInt();Elemento.nextLine();
    }
}
