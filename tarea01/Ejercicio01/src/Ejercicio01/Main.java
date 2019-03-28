package Ejercicio01;

import javax.swing.JOptionPane;

public class Main {

    public static void main(String[] args) {
        // write your code here
        String dato;
        Arreglo novo_arreglo = new Arreglo();
        dato= JOptionPane.showInputDialog("Ingrese un numero");
        novo_arreglo.capacidad=Integer.parseInt(dato);
        System.out.println(novo_arreglo.capacidad);
        novo_arreglo.crear(novo_arreglo.capacidad);
        novo_arreglo.llenar();
        novo_arreglo.sumar();

    }
}