package clase.vista;

import clase.impl.Operacioneslmpl;
import clase.interfaz.Operaciones;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Calculadora1 extends JFrame {
    private JButton bt_suma;
    private JButton bt_mult;
    private JButton bt_resta;
    private JButton bt_dividir;
    private JTextArea ta_respuesta;
    private JTextArea ta_num1;
    private JTextArea ta_num2;
    private JLabel lb_Respuesta;
    private JPanel jpane;


    public Calculadora1() {
        setSize(500,500);
        setTitle("Calculadora");
        setContentPane(jpane);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        Operaciones op = new Operacioneslmpl();

        bt_suma.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String conv;
                conv = String.valueOf(op.sumar(Double.parseDouble(ta_num1.getText()), Double.parseDouble(ta_num2.getText())));
                ta_respuesta.setText(conv);
            }
        });
        bt_resta.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String conv;
                conv = String.valueOf(op.restar(Double.parseDouble(ta_num1.getText()), Double.parseDouble(ta_num2.getText())));
                ta_respuesta.setText(conv);
            }
        });
        bt_mult.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String conv;
                conv = String.valueOf(op.multiplicar(Double.parseDouble(ta_num1.getText()), Double.parseDouble(ta_num2.getText())));
                ta_respuesta.setText(conv);
            }
        });
        bt_dividir.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String conv;
                conv = String.valueOf(op.dividir(Double.parseDouble(ta_num1.getText()), Double.parseDouble(ta_num2.getText())));
                ta_respuesta.setText(conv);
            }
        });
    }

    public static void main(String[] args) {
        Calculadora1 c = new Calculadora1();
        c.setVisible(true);


    }

}
