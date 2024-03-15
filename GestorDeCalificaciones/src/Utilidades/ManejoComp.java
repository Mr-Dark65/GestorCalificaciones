package Utilidades;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JPasswordField;
import javax.swing.JToggleButton;

public class ManejoComp {

    public static void crearVerPassword(JPasswordField pas, JToggleButton btn) {
        btn.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JToggleButton btn = (JToggleButton) e.getSource();
                if (btn.isSelected()) {
                    pas.setEchoChar((char) 0);
                } else {
                    pas.setEchoChar('\u2022');
                }
            }
        });
        pas.setEchoChar('\u2022');
    }
}
