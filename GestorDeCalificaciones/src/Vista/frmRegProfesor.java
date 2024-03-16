package Vista;

import Clases.Almacen;
import Utilidades.*;
import javax.swing.JOptionPane;

public class frmRegProfesor extends javax.swing.JFrame {
    public String cedula;
    
    public frmRegProfesor() {
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
            java.util.logging.Logger.getLogger(frmRegProfesor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(frmRegProfesor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(frmRegProfesor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(frmRegProfesor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        initComponents();
        this.setLocationRelativeTo(this);
        ManejoComp.crearVerPassword(jContra, btVer);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollBar1 = new javax.swing.JScrollBar();
        jPanel1 = new javax.swing.JPanel();
        lbCalificacion = new javax.swing.JLabel();
        BarraSuperior = new javax.swing.JPanel();
        jLabel11 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        IconCalificacion = new javax.swing.JLabel();
        lbCalificacion1 = new javax.swing.JLabel();
        jContra = new javax.swing.JPasswordField();
        btVer = new javax.swing.JToggleButton();
        btIngresar = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("LibHib | Iniciar Sesion");
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lbCalificacion.setForeground(new java.awt.Color(51, 51, 51));
        lbCalificacion.setText("Ingrese su número de cédula docente.");
        jPanel1.add(lbCalificacion, new org.netbeans.lib.awtextra.AbsoluteConstraints(144, 256, -1, 32));

        BarraSuperior.setBackground(new java.awt.Color(176, 16, 37));

        jLabel11.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/logofisei.png"))); // NOI18N

        jLabel1.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Agregar Calificaciones");

        javax.swing.GroupLayout BarraSuperiorLayout = new javax.swing.GroupLayout(BarraSuperior);
        BarraSuperior.setLayout(BarraSuperiorLayout);
        BarraSuperiorLayout.setHorizontalGroup(
            BarraSuperiorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(BarraSuperiorLayout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 153, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(32, 32, 32)
                .addComponent(jLabel1)
                .addContainerGap(90, Short.MAX_VALUE))
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

        IconCalificacion.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/notas.png"))); // NOI18N
        IconCalificacion.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                IconCalificacionMouseEntered(evt);
            }
        });
        jPanel1.add(IconCalificacion, new org.netbeans.lib.awtextra.AbsoluteConstraints(208, 64, -1, -1));

        lbCalificacion1.setForeground(new java.awt.Color(51, 51, 51));
        lbCalificacion1.setText("Agregar Calificaciones");
        jPanel1.add(lbCalificacion1, new org.netbeans.lib.awtextra.AbsoluteConstraints(176, 176, -1, 32));
        jPanel1.add(jContra, new org.netbeans.lib.awtextra.AbsoluteConstraints(144, 304, 224, 32));

        btVer.setText("Ver");
        jPanel1.add(btVer, new org.netbeans.lib.awtextra.AbsoluteConstraints(384, 304, -1, -1));

        btIngresar.setBackground(new java.awt.Color(176, 16, 37));
        btIngresar.setForeground(new java.awt.Color(255, 255, 255));
        btIngresar.setText("Ingresar");
        btIngresar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btIngresarActionPerformed(evt);
            }
        });
        jPanel1.add(btIngresar, new org.netbeans.lib.awtextra.AbsoluteConstraints(224, 368, -1, -1));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/flecha-pequena-izquierda.png"))); // NOI18N
        jLabel2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel2MouseClicked(evt);
            }
        });
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(16, 64, 32, 32));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 544, 480));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void IconCalificacionMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_IconCalificacionMouseEntered

    }//GEN-LAST:event_IconCalificacionMouseEntered

    private void jLabel2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel2MouseClicked
        JFramePrincipal prin = new JFramePrincipal();
        prin.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jLabel2MouseClicked

    private void btIngresarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btIngresarActionPerformed
        if (!(this.jContra.getText().equals(""))) {
            boolean aux = buscarCedual(this.jContra.getText());
            if (aux == true) {
                cedula=this.jContra.getText();
                JOptionPane.showMessageDialog(null, "Bienvenido");
                frmRegCalifi cali = new frmRegCalifi(cedula);
                cali.setVisible(true);
                this.dispose();
            } else {
                JOptionPane.showMessageDialog(null, "Cédula Incorrecta");

            }
        }
    }//GEN-LAST:event_btIngresarActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel BarraSuperior;
    private javax.swing.JLabel IconCalificacion;
    private javax.swing.JButton btIngresar;
    private javax.swing.JToggleButton btVer;
    private javax.swing.JPasswordField jContra;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollBar jScrollBar1;
    private javax.swing.JLabel lbCalificacion;
    private javax.swing.JLabel lbCalificacion1;
    // End of variables declaration//GEN-END:variables

    public boolean buscarCedual(String cedula) {
        System.out.println(cedula);
        for (int i = 0; i < Almacen.getInstance().informacion.size(); i++) {
            if (Almacen.getInstance().informacion.get(i).getCedula().equals(cedula)) {
                return true;
            }
        }
        return false;
    }
}
