package hilos.clase;

import hilos.vista.VentanaAuto;

public class ProcesoF implements Runnable {

    @Override
    public void run() {
        javax.swing.SwingUtilities.invokeLater(() -> { //invoca la ventana en el hilo
            VentanaAuto ventana = new VentanaAuto();
            ventana.setVisible(true);
        });
    }
}
