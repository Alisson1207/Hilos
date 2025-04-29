package clase.test;

import clase.impl.Operacioneslmpl;
import clase.interfaz.Operaciones;

import javax.swing.*;
import java.util.Scanner;

public class OperacionesTest {
    public static void main(String[]args){
        System.out.println("Hola mundo");
        double x = 0.0;
        double y = 0.0;

        Operaciones op = new Operacioneslmpl();
        Scanner entrada = new Scanner(System.in);
        /*System.out.println("Ingrese el primer número: ");
        x = entrada.nextDouble();
        System.out.println("Ingrese el segundo número: ");
        y = entrada.nextDouble();*/
        x=Double.parseDouble(JOptionPane.showInputDialog(null,"Ingrese el primer numero"));
        y=Double.parseDouble(JOptionPane.showInputDialog(null,"Ingrese el segundo numero"));
        JOptionPane.showMessageDialog(null,"La respuesta es: "+op.sumar(x,y));


        //System.out.println("La suma es: "+ op.sumar(x,y));
    }
}

