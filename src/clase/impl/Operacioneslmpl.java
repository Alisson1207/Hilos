package clase.impl;

import clase.interfaz.Operaciones;

public class Operacioneslmpl implements Operaciones {
    @Override
    public double dividir(double x, double y) {
        return x/y;
    }

    @Override
    public double multiplicar(double x, double y) {
        return x*y;
    }

    @Override
    public double restar(double x, double y) {
        return x-y;
    }

    @Override
    public double sumar(double x, double y) {
        return x+y;
    }
}
