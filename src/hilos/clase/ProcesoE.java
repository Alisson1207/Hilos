package hilos.clase;

import javax.swing.*;

public class ProcesoE implements Runnable{
    private String saludar;
    public ProcesoE(String saludar){
        this.saludar=saludar;

    }
    public void saludo(String saludar){
        JOptionPane.showMessageDialog(null,"Hola "+saludar);

    }
    @Override
    public void run(){
        saludo(saludar);
    }
}
