/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package Vista;

import java.awt.Color;

/**
 *
 * @author thexe
 */
public class JFramePrincipal extends javax.swing.JFrame {

    /**
     * Creates new form NewJFrame
     */
    public JFramePrincipal() {
        initComponents();
        this.setLocationRelativeTo(null);
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
        Panel_Profesor = new javax.swing.JPanel();
        IconProfesor = new javax.swing.JLabel();
        lbProfesor = new javax.swing.JLabel();
        Panel_Estudiantes = new javax.swing.JPanel();
        IconEstudiantes = new javax.swing.JLabel();
        lbEstudiante = new javax.swing.JLabel();
        Panel_Calificaciones = new javax.swing.JPanel();
        IconCalificacion = new javax.swing.JLabel();
        lbCalificacion = new javax.swing.JLabel();
        Panel_Registro = new javax.swing.JPanel();
        IconRegistro = new javax.swing.JLabel();
        lbRegistro = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        BarraSuperior.setBackground(new java.awt.Color(176, 16, 37));

        jLabel11.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/logofisei.png"))); // NOI18N

        jLabel1.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Gestor de Calificaciones");

        javax.swing.GroupLayout BarraSuperiorLayout = new javax.swing.GroupLayout(BarraSuperior);
        BarraSuperior.setLayout(BarraSuperiorLayout);
        BarraSuperiorLayout.setHorizontalGroup(
            BarraSuperiorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(BarraSuperiorLayout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 153, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(42, 42, 42)
                .addComponent(jLabel1)
                .addContainerGap(59, Short.MAX_VALUE))
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

        Panel_Profesor.setBackground(new java.awt.Color(255, 255, 255));
        Panel_Profesor.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        Panel_Profesor.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        Panel_Profesor.setPreferredSize(new java.awt.Dimension(140, 136));
        Panel_Profesor.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                Panel_ProfesorMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                Panel_ProfesorMouseExited(evt);
            }
        });

        IconProfesor.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/profesor (2).png"))); // NOI18N
        IconProfesor.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                IconProfesorMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                IconProfesorMouseEntered(evt);
            }
        });

        lbProfesor.setForeground(new java.awt.Color(51, 51, 51));
        lbProfesor.setText("Agregar Profesor");

        javax.swing.GroupLayout Panel_ProfesorLayout = new javax.swing.GroupLayout(Panel_Profesor);
        Panel_Profesor.setLayout(Panel_ProfesorLayout);
        Panel_ProfesorLayout.setHorizontalGroup(
            Panel_ProfesorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Panel_ProfesorLayout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addGroup(Panel_ProfesorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lbProfesor)
                    .addComponent(IconProfesor))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        Panel_ProfesorLayout.setVerticalGroup(
            Panel_ProfesorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Panel_ProfesorLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(IconProfesor)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lbProfesor)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel1.add(Panel_Profesor, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 97, -1, -1));

        Panel_Estudiantes.setBackground(new java.awt.Color(255, 255, 255));
        Panel_Estudiantes.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        Panel_Estudiantes.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        Panel_Estudiantes.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Panel_EstudiantesMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                Panel_EstudiantesMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                Panel_EstudiantesMouseExited(evt);
            }
        });

        IconEstudiantes.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/estudiantes.png"))); // NOI18N
        IconEstudiantes.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                IconEstudiantesMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                IconEstudiantesMouseEntered(evt);
            }
        });

        lbEstudiante.setForeground(new java.awt.Color(51, 51, 51));
        lbEstudiante.setText("Agregar Estudiante");

        javax.swing.GroupLayout Panel_EstudiantesLayout = new javax.swing.GroupLayout(Panel_Estudiantes);
        Panel_Estudiantes.setLayout(Panel_EstudiantesLayout);
        Panel_EstudiantesLayout.setHorizontalGroup(
            Panel_EstudiantesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Panel_EstudiantesLayout.createSequentialGroup()
                .addGroup(Panel_EstudiantesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(Panel_EstudiantesLayout.createSequentialGroup()
                        .addGap(14, 14, 14)
                        .addComponent(lbEstudiante))
                    .addGroup(Panel_EstudiantesLayout.createSequentialGroup()
                        .addGap(30, 30, 30)
                        .addComponent(IconEstudiantes)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        Panel_EstudiantesLayout.setVerticalGroup(
            Panel_EstudiantesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Panel_EstudiantesLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(IconEstudiantes)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lbEstudiante)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel1.add(Panel_Estudiantes, new org.netbeans.lib.awtextra.AbsoluteConstraints(95, 97, 140, -1));

        Panel_Calificaciones.setBackground(new java.awt.Color(255, 255, 255));
        Panel_Calificaciones.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        Panel_Calificaciones.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        Panel_Calificaciones.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Panel_CalificacionesMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                Panel_CalificacionesMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                Panel_CalificacionesMouseExited(evt);
            }
        });

        IconCalificacion.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/notas.png"))); // NOI18N
        IconCalificacion.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                IconCalificacionMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                IconCalificacionMouseEntered(evt);
            }
        });

        lbCalificacion.setForeground(new java.awt.Color(51, 51, 51));
        lbCalificacion.setText("Agregar Calificaciones");

        javax.swing.GroupLayout Panel_CalificacionesLayout = new javax.swing.GroupLayout(Panel_Calificaciones);
        Panel_Calificaciones.setLayout(Panel_CalificacionesLayout);
        Panel_CalificacionesLayout.setHorizontalGroup(
            Panel_CalificacionesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Panel_CalificacionesLayout.createSequentialGroup()
                .addGroup(Panel_CalificacionesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(Panel_CalificacionesLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(lbCalificacion))
                    .addGroup(Panel_CalificacionesLayout.createSequentialGroup()
                        .addGap(22, 22, 22)
                        .addComponent(IconCalificacion)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        Panel_CalificacionesLayout.setVerticalGroup(
            Panel_CalificacionesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Panel_CalificacionesLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(IconCalificacion)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(lbCalificacion)
                .addContainerGap())
        );

        jPanel1.add(Panel_Calificaciones, new org.netbeans.lib.awtextra.AbsoluteConstraints(95, 270, 140, -1));

        Panel_Registro.setBackground(new java.awt.Color(255, 255, 255));
        Panel_Registro.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        Panel_Registro.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        Panel_Registro.setPreferredSize(new java.awt.Dimension(140, 136));
        Panel_Registro.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                Panel_RegistroMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                Panel_RegistroMouseExited(evt);
            }
        });

        IconRegistro.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/registro.png"))); // NOI18N
        IconRegistro.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                IconRegistroMouseEntered(evt);
            }
        });

        lbRegistro.setForeground(new java.awt.Color(51, 51, 51));
        lbRegistro.setText(" Registro");

        javax.swing.GroupLayout Panel_RegistroLayout = new javax.swing.GroupLayout(Panel_Registro);
        Panel_Registro.setLayout(Panel_RegistroLayout);
        Panel_RegistroLayout.setHorizontalGroup(
            Panel_RegistroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Panel_RegistroLayout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(Panel_RegistroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(IconRegistro)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, Panel_RegistroLayout.createSequentialGroup()
                        .addComponent(lbRegistro)
                        .addGap(17, 17, 17)))
                .addContainerGap(18, Short.MAX_VALUE))
        );
        Panel_RegistroLayout.setVerticalGroup(
            Panel_RegistroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Panel_RegistroLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(IconRegistro)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lbRegistro)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel1.add(Panel_Registro, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 270, -1, -1));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 550, 470));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void IconProfesorMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_IconProfesorMouseEntered
        // TODO add your handling code here:
        Panel_Profesor.setBackground(new Color(153,153,153));
    }//GEN-LAST:event_IconProfesorMouseEntered

    private void Panel_ProfesorMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Panel_ProfesorMouseEntered
        // TODO add your handling code here:
        Panel_Profesor.setBackground(new Color(153,153,153));
    }//GEN-LAST:event_Panel_ProfesorMouseEntered

    private void Panel_ProfesorMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Panel_ProfesorMouseExited
        // TODO add your handling code here:
        Panel_Profesor.setBackground(new Color(255,255,255));
    }//GEN-LAST:event_Panel_ProfesorMouseExited

    private void IconEstudiantesMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_IconEstudiantesMouseEntered
        // TODO add your handling code here:
        Panel_Estudiantes.setBackground(new Color(153,153,153));
    }//GEN-LAST:event_IconEstudiantesMouseEntered

    private void Panel_EstudiantesMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Panel_EstudiantesMouseEntered
        // TODO add your handling code here:
        Panel_Estudiantes.setBackground(new Color(153,153,153));
    }//GEN-LAST:event_Panel_EstudiantesMouseEntered

    private void Panel_EstudiantesMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Panel_EstudiantesMouseExited
        // TODO add your handling code here:
        Panel_Estudiantes.setBackground(new Color(255,255,255));
    }//GEN-LAST:event_Panel_EstudiantesMouseExited

    private void IconCalificacionMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_IconCalificacionMouseEntered
        // TODO add your handling code here:
        Panel_Calificaciones.setBackground(new Color(153,153,153));
        
    }//GEN-LAST:event_IconCalificacionMouseEntered

    private void Panel_CalificacionesMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Panel_CalificacionesMouseEntered
        // TODO add your handling code here:
        Panel_Calificaciones.setBackground(new Color(153,153,153));
        
    }//GEN-LAST:event_Panel_CalificacionesMouseEntered

    private void Panel_CalificacionesMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Panel_CalificacionesMouseExited
        // TODO add your handling code here:
        Panel_Calificaciones.setBackground(new Color(255,255,255));
    }//GEN-LAST:event_Panel_CalificacionesMouseExited

    private void IconRegistroMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_IconRegistroMouseEntered
        // TODO add your handling code here:
        Panel_Registro.setBackground(new Color(153,153,153));
    }//GEN-LAST:event_IconRegistroMouseEntered

    private void Panel_RegistroMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Panel_RegistroMouseEntered
        // TODO add your handling code here:
        Panel_Registro.setBackground(new Color(153,153,153));
    }//GEN-LAST:event_Panel_RegistroMouseEntered

    private void Panel_RegistroMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Panel_RegistroMouseExited
        // TODO add your handling code here:
        Panel_Registro.setBackground(new Color(255,255,255));
    }//GEN-LAST:event_Panel_RegistroMouseExited

//<<<<<<< HEAD
    private void Panel_EstudiantesMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Panel_EstudiantesMouseClicked
        // TODO add your handling code here:
        JFrameEstudiantes estudiantes = new JFrameEstudiantes();
        
        estudiantes.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_Panel_EstudiantesMouseClicked

    private void IconEstudiantesMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_IconEstudiantesMouseClicked
        // TODO add your handling code here:
        JFrameEstudiantes estudiantes = new JFrameEstudiantes();
        
        estudiantes.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_IconEstudiantesMouseClicked

    private void IconProfesorMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_IconProfesorMouseClicked
        // TODO add your handling code here:
        JFrameDocente docente = new JFrameDocente();
        docente.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_IconProfesorMouseClicked
//=======
    private void Panel_CalificacionesMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Panel_CalificacionesMouseClicked
     
    }//GEN-LAST:event_Panel_CalificacionesMouseClicked

    private void IconCalificacionMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_IconCalificacionMouseClicked
       frmRegProfesor reg = new frmRegProfesor();
        reg.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_IconCalificacionMouseClicked
//>>>>>>> Calificaciones

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
            java.util.logging.Logger.getLogger(JFramePrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(JFramePrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(JFramePrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(JFramePrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new JFramePrincipal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel BarraSuperior;
    private javax.swing.JLabel IconCalificacion;
    private javax.swing.JLabel IconEstudiantes;
    private javax.swing.JLabel IconProfesor;
    private javax.swing.JLabel IconRegistro;
    private javax.swing.JPanel Panel_Calificaciones;
    private javax.swing.JPanel Panel_Estudiantes;
    private javax.swing.JPanel Panel_Profesor;
    private javax.swing.JPanel Panel_Registro;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel lbCalificacion;
    private javax.swing.JLabel lbEstudiante;
    private javax.swing.JLabel lbProfesor;
    private javax.swing.JLabel lbRegistro;
    // End of variables declaration//GEN-END:variables
}
