package hilos.vista;

import javax.swing.*;

public class VentanaAuto extends JFrame {
    private JTextField tf_marca;
    private JTextField tf_modelo;
    private JTextField tf_precio;
    private JButton bt_procesar;
    public JPanel jpane;

    public VentanaAuto(){
        setSize(500,500);
        setTitle("Información Auto");
        setContentPane(jpane);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

    }



    public static void main(String[] args) {
        VentanaAuto c = new VentanaAuto();
        c.setVisible(true);
    }
}
