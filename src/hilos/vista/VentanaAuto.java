package hilos.vista;

import hilos.clase.Auto;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;
public class VentanaAuto extends JFrame {
    private JTextField tf_marca;
    private JTextField tf_modelo;
    private JTextField tf_precio;
    private JButton bt_procesar;
    public JPanel jpane;

    public VentanaAuto(){
        setTitle("Información Auto");
        setSize(300, 220);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);


        JPanel panelPrincipal = new JPanel();
        panelPrincipal.setLayout(new BoxLayout(panelPrincipal, BoxLayout.Y_AXIS));
        panelPrincipal.setBorder(BorderFactory.createEmptyBorder(15, 20, 15, 20));

        JPanel fila1 = new JPanel(new FlowLayout(FlowLayout.LEFT));
        JLabel lb_marca = new JLabel("Marca: ");
        tf_marca = new JTextField();
        tf_marca.setPreferredSize(new Dimension(150, 25));
        fila1.add(lb_marca);
        fila1.add(tf_marca);

        JPanel fila2 = new JPanel(new FlowLayout(FlowLayout.LEFT));
        JLabel lb_modelo = new JLabel("Modelo:");
        tf_modelo = new JTextField();
        tf_modelo.setPreferredSize(new Dimension(150, 25));
        fila2.add(lb_modelo);
        fila2.add(tf_modelo);

        JPanel fila3 = new JPanel(new FlowLayout(FlowLayout.LEFT));
        JLabel lb_precio = new JLabel("Precio: ");
        tf_precio = new JTextField();
        tf_precio.setPreferredSize(new Dimension(150, 25));
        fila3.add(lb_precio);
        fila3.add(tf_precio);


        JPanel filaBoton = new JPanel();
        bt_procesar = new JButton("Procesar");
        bt_procesar.setPreferredSize(new Dimension(120, 30));
        filaBoton.add(bt_procesar);

        Dimension labelSize = new Dimension(60, 25);
        lb_marca.setPreferredSize(labelSize);
        lb_modelo.setPreferredSize(labelSize);
        lb_precio.setPreferredSize(labelSize);

        panelPrincipal.add(fila1);
        panelPrincipal.add(fila2);
        panelPrincipal.add(fila3);
        panelPrincipal.add(filaBoton);

        setContentPane(panelPrincipal);



        bt_procesar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Auto auto = new Auto();
                auto.setMarca(tf_marca.getText());
                auto.setModelo(tf_modelo.getText());

                try {
                    auto.setPrecio(Double.parseDouble(tf_precio.getText()));
                } catch (NumberFormatException var4) {
                    JOptionPane.showMessageDialog(jpane, "El precio debe ser un número", "Error", 0);
                    return;
                }

                String var10000 = auto.getMarca();
                String mensaje = "Marca: " + var10000 + "\nModelo: " + auto.getModelo() + "\nPrecio: $" + auto.getPrecio();
                JOptionPane.showMessageDialog(jpane, mensaje, "Datos del Auto", 1);

            }
        });
    }



}
