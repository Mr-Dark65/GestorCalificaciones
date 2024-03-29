/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package Vista;

import Clases.Almacen;
import Clases.Controles;
import Clases.Docente;
import Clases.Estudiante;
import Clases.Materia;
import java.util.ArrayList;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JOptionPane;

/**
 *
 * @author thexe
 */
public class JFrameEstudiantes extends javax.swing.JFrame {

    /**
     * Creates new form JFrameEstudiantes
     */
    public Controles control = new Controles();
//    public Estudiante estudiante = new Estudiante();

    public JFrameEstudiantes() {
        initComponents();
        this.setLocationRelativeTo(null);

        cargarMaterias();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        BarraSuperior = new javax.swing.JPanel();
        jLabel11 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        lbMateria = new javax.swing.JLabel();
        cbMateria = new javax.swing.JComboBox<>();
        lbNombre = new javax.swing.JLabel();
        lbApellido = new javax.swing.JLabel();
        lbCedula = new javax.swing.JLabel();
        btnAgregar = new javax.swing.JButton();
        btnCancelar = new javax.swing.JButton();
        jtxtCedula = new javax.swing.JTextField();
        jtxtNombre = new javax.swing.JTextField();
        jtxtApellido = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        BarraSuperior.setBackground(new java.awt.Color(176, 16, 37));

        jLabel11.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/logofisei.png"))); // NOI18N

        jLabel1.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Estudiantes");

        javax.swing.GroupLayout BarraSuperiorLayout = new javax.swing.GroupLayout(BarraSuperior);
        BarraSuperior.setLayout(BarraSuperiorLayout);
        BarraSuperiorLayout.setHorizontalGroup(
            BarraSuperiorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(BarraSuperiorLayout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 153, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(101, 101, 101)
                .addComponent(jLabel1)
                .addContainerGap(144, Short.MAX_VALUE))
        );
        BarraSuperiorLayout.setVerticalGroup(
            BarraSuperiorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(BarraSuperiorLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(BarraSuperiorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(BarraSuperiorLayout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(jLabel11, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );

        jPanel1.add(BarraSuperior, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 550, 50));

        lbMateria.setText("Materia:");
        jPanel1.add(lbMateria, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 115, -1, -1));

        jPanel1.add(cbMateria, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 110, 150, -1));

        lbNombre.setText("Nombre:");
        jPanel1.add(lbNombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 180, -1, -1));

        lbApellido.setText("Apellido:");
        jPanel1.add(lbApellido, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 230, -1, -1));

        lbCedula.setText("Cedula:");
        jPanel1.add(lbCedula, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 270, -1, -1));

        btnAgregar.setText("Agregar");
        btnAgregar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAgregarActionPerformed(evt);
            }
        });
        jPanel1.add(btnAgregar, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 320, -1, -1));

        btnCancelar.setText("Regresar");
        btnCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelarActionPerformed(evt);
            }
        });
        jPanel1.add(btnCancelar, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 320, -1, -1));

        jtxtCedula.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jtxtCedula.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jtxtCedulaKeyTyped(evt);
            }
        });
        jPanel1.add(jtxtCedula, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 260, 160, 25));

        jtxtNombre.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel1.add(jtxtNombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 180, 160, 25));

        jtxtApellido.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel1.add(jtxtApellido, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 220, 160, 25));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 544, 471));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnAgregarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAgregarActionPerformed
        // TODO add your handling code here:

        String materia = this.cbMateria.getSelectedItem().toString();
        String nombre = this.jtxtNombre.getText().toUpperCase();
        String apellido = this.jtxtApellido.getText().toUpperCase();
        String cedula = this.jtxtCedula.getText();

        if (!control.validarCamposEstudiante(nombre, apellido, cedula, materia)) {
            JOptionPane.showMessageDialog(this, "Por favor, complete todos los campos.", "Error", JOptionPane.ERROR_MESSAGE);
        } else if (control.verificarCedulaDocente(cedula)) {
            // Mostrar mensaje de error si el docente ya está registrado con la misma materia
            JOptionPane.showMessageDialog(this, "La cedula pertenece a un Docente", "Error", JOptionPane.ERROR_MESSAGE);
        } else if (!control.verificarCedula(cedula)) {
            JOptionPane.showMessageDialog(this, "La cédula ingresada no es válida.", "Error", JOptionPane.ERROR_MESSAGE);
        } else if (control.verificarEstudianteMateria(cedula, materia)) {
            JOptionPane.showMessageDialog(this, "El estudiante ya está matriculado en la misma materia.", "Error", JOptionPane.ERROR_MESSAGE);
        } else {
            boolean aux = comprobarExisteEstudiante(cedula, materia);
            Materia mate = obtenerMateriaPorNombre(materia);
            if (aux == false) {
                Estudiante estudiante = new Estudiante();
                estudiante.setNombre(nombre);
                estudiante.setApellido(apellido);
                estudiante.setCedula(cedula);
                mate.setEstudiante(estudiante);
                JOptionPane.showMessageDialog(this, "Estudiante agregado correctamente a la materia.", "Éxito", JOptionPane.INFORMATION_MESSAGE);
                limpiarCamposEstudiante();
            } else {
                JOptionPane.showMessageDialog(this, "El Estudiante ya se encuentra agregado  a la materia.", "Falla", JOptionPane.INFORMATION_MESSAGE);

            }
//            estudiante.agregarMateria(materia);
//            estudiante.setNombre(nombre);
//            estudiante.setApellido(apellido);
//            estudiante.setCedula(cedula);
//
//            Almacen.getInstance().estudiantes.add(estudiante);
//            this.cbMateria.removeItem(materia);
        }


    }//GEN-LAST:event_btnAgregarActionPerformed

    private void btnCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelarActionPerformed
        // TODO add your handling code here:
        JFramePrincipal principal = new JFramePrincipal();
        principal.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnCancelarActionPerformed

    private void jtxtCedulaKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jtxtCedulaKeyTyped
        control.txtOnlyNumbers(evt);
        if (jtxtCedula.getText().length() >= 10) {
            evt.consume();

        }
    }//GEN-LAST:event_jtxtCedulaKeyTyped

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(JFrameEstudiantes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(JFrameEstudiantes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(JFrameEstudiantes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(JFrameEstudiantes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new JFrameEstudiantes().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel BarraSuperior;
    private javax.swing.JButton btnAgregar;
    private javax.swing.JButton btnCancelar;
    private javax.swing.JComboBox<String> cbMateria;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField jtxtApellido;
    private javax.swing.JTextField jtxtCedula;
    private javax.swing.JTextField jtxtNombre;
    private javax.swing.JLabel lbApellido;
    private javax.swing.JLabel lbCedula;
    private javax.swing.JLabel lbMateria;
    private javax.swing.JLabel lbNombre;
    // End of variables declaration//GEN-END:variables

    private void cargarMaterias() {
        System.out.println("MATERIAS DISPONIBLES" + Almacen.getInstance().materias.size());
        for (Docente doce : Almacen.getInstance().informacion) {
            ArrayList<Materia> materias = doce.getMaterias();
            for (Materia materia : materias) {
                cbMateria.addItem(materia.getNombre());
            }
        }
    }

    private boolean comprobarExisteEstudiante(String cedula, String materia) {
        for (Docente doc : Almacen.getInstance().informacion) {
            for (Materia materias : doc.getMaterias()) {
                if (materias.getNombre().equals(materia)) {
                    for (Estudiante estud : materias.getEstudiante()) {
                        if (estud.getCedula().equals(cedula)) {
                            return true;
                        }
                    }
                }

            }
        }
        return false;
    }

    private Materia obtenerMateriaPorNombre(String nombreMateria) {
        for (Docente docente : Almacen.getInstance().informacion) {
            for (Materia materia : docente.getMaterias()) {
                if (materia.getNombre().equalsIgnoreCase(nombreMateria)) {
                    return materia;
                }
            }
        }
        return null; // Retornar null si no se encuentra la materia
    }

    private void limpiarCamposEstudiante() {
        jtxtNombre.setText("");
        jtxtApellido.setText("");
        jtxtCedula.setText("");
    }

}
