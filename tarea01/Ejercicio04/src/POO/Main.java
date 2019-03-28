package POO;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {


    public static void main(String[] args) {
	// write your code here
        String dato;
        int num, opcion;
        Double price;
        Boolean continuar =true;
        ArrayList<Integer> cantidad= new ArrayList<>();
        ArrayList<String>  nombre= new ArrayList<>();
        ArrayList<Double> precio = new ArrayList<>();
        ArrayList<Venta> venta_total= new ArrayList<>();

        Scanner Elemento = new Scanner(System.in);


        while(continuar){
            System.out.println("Menu\n\r\t1.Ingreso de productos\n\r\t2.Listar productos\n\r\t3. Calcular total\n\r\t4. Salir");
            opcion=Elemento.nextInt();Elemento.nextLine();
            if (opcion>=1 && opcion<=4){
                 switch (opcion){
                     case 1:
                         Venta producto = new Venta();
                         producto.comprar();
                         venta_total.add(producto);
                         break;
                     case 2:
                         int i=1;
                         for (Venta s  : venta_total) {
                             System.out.println(i+". "+s.nombre);
                             i++;
                         }
                         break;
                     case 3:
                         int total=0;
                         for (Venta s : venta_total) {
                             total+= (s.precio*s.numero);
                         }
                         System.out.println("El total es de: $ "+total+"\n\r\t");
                         break;
                     case 4:
                         continuar= false;
                         break;


                 }
            }
            else {
                System.out.println("Ingrese un valor valido");
            }
        }

    }
}
