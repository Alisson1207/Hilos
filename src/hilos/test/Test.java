package hilos.test;

import hilos.clase.*;

public class Test {
    public static void main(String[] args) {
        Persona p = new Persona();
        p.setNombre("Juan");
        p.setDireccion("Villaflora");
        p.setFechanacimiento("01 de enero del 2000");

        System.out.println("Nombre: "+ p.getNombre());
        System.out.println("Dirección: "+ p.getDireccion());
        System.out.println("Fecha: "+ p.getFechanacimiento());


        /*
        ProcesoA a = new ProcesoA("Luis");
        ProcesoB b = new ProcesoB(1000);
        ProcesoC c = new ProcesoC(5);
        Runnable x = new ProcesoD(50);
        Thread d = new Thread(x);
        Runnable y = new ProcesoE("Alisson");
        Thread e = new Thread(y);


        Invocar
        c.dividir(5);
        a.saludar("Luis");
        b.contar(10);


        c.start();
        a.start();
        b.start();
        d.start();
        e.start();
        */

    }
}
