package Vista;

import Clases.Almacen;
import Clases.Docente;
import Clases.Estudiante;
import Clases.Materia;
import Utilidades.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

public class frmRegCalifi extends javax.swing.JFrame {

    public frmRegCalifi() {
    }

    public frmRegCalifi(String cedula) {
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
            java.util.logging.Logger.getLogger(frmRegCalifi.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);

        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(frmRegCalifi.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);

        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(frmRegCalifi.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);

        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(frmRegCalifi.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        initComponents();
        this.setLocationRelativeTo(this);
        cargarProfesor(cedula);
        cbMateriasDoce.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (cbMateriasDoce.getItemCount()>0) {
                    String materiSelec=cbMateriasDoce.getSelectedItem().toString();
                   ArrayList<Estudiante> estud= cargarEstudiantesPorMateria(materiSelec);
                   //elimino a los estudiantes y es como que ingresara denuevo todo
                   cbEstudiantes.removeAllItems();
                   
                   for(Estudiante estudiantesagg: estud){
                       cbEstudiantes.addItem(estudiantesagg.getNombre()+" "+estudiantesagg.getApellido());
                   }
                }
            }
         });

    }



    private void cbMateriasDoceActionPerformed(ActionEvent evt) {
        String materiaSeleccionada = cbMateriasDoce.getSelectedItem().toString();
          cargarEstudiantesPorMateria(materiaSeleccionada);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollBar1 = new javax.swing.JScrollBar();
        jPanel1 = new javax.swing.JPanel();
        BarraSuperior = new javax.swing.JPanel();
        jLabel11 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        IconCalificacion = new javax.swing.JLabel();
        jlRegresar = new javax.swing.JLabel();
        lbCalificacion1 = new javax.swing.JLabel();
        lbCalificacion2 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        lbNombre = new javax.swing.JLabel();
        cbEstudiantes = new javax.swing.JComboBox<>();
        jL2 = new javax.swing.JLabel();
        jL1 = new javax.swing.JLabel();
        jL = new javax.swing.JLabel();
        txNota = new javax.swing.JTextField();
        btAceptarAggCal = new javax.swing.JButton();
        cbMateriasDoce = new javax.swing.JComboBox<>();
        jTextField1 = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("LibHib | Iniciar Sesion");
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

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
                .addContainerGap(116, Short.MAX_VALUE))
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

        jPanel1.add(BarraSuperior, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 576, 50));

        IconCalificacion.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/notas.png"))); // NOI18N
        IconCalificacion.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                IconCalificacionMouseEntered(evt);
            }
        });
        jPanel1.add(IconCalificacion, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 64, -1, -1));

        jlRegresar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/flecha-pequena-izquierda.png"))); // NOI18N
        jlRegresar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jlRegresarMouseClicked(evt);
            }
        });
        jPanel1.add(jlRegresar, new org.netbeans.lib.awtextra.AbsoluteConstraints(16, 64, 32, 32));

        lbCalificacion1.setForeground(new java.awt.Color(51, 51, 51));
        lbCalificacion1.setText("Docente");
        jPanel1.add(lbCalificacion1, new org.netbeans.lib.awtextra.AbsoluteConstraints(64, 144, -1, 32));

        lbCalificacion2.setForeground(new java.awt.Color(51, 51, 51));
        lbCalificacion2.setText("Asignatura");
        jPanel1.add(lbCalificacion2, new org.netbeans.lib.awtextra.AbsoluteConstraints(64, 96, -1, 32));

        jSeparator1.setBackground(new java.awt.Color(176, 16, 37));
        jSeparator1.setForeground(new java.awt.Color(176, 16, 37));
        jPanel1.add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(64, 176, 416, 16));

        lbNombre.setForeground(new java.awt.Color(0, 0, 0));
        lbNombre.setText("jLabel3");
        jPanel1.add(lbNombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(146, 150, -1, -1));

        cbEstudiantes.setBackground(new java.awt.Color(255, 255, 255));
        cbEstudiantes.setForeground(new java.awt.Color(0, 0, 0));
        cbEstudiantes.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(176, 16, 37)));
        jPanel1.add(cbEstudiantes, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 192, 160, 32));

        jL2.setForeground(new java.awt.Color(0, 0, 0));
        jL2.setText("Fecha:");
        jPanel1.add(jL2, new org.netbeans.lib.awtextra.AbsoluteConstraints(64, 304, 80, -1));

        jL1.setForeground(new java.awt.Color(0, 0, 0));
        jL1.setText("Calificación:");
        jPanel1.add(jL1, new org.netbeans.lib.awtextra.AbsoluteConstraints(64, 256, 80, -1));

        jL.setForeground(new java.awt.Color(0, 0, 0));
        jL.setText("Estudiante:");
        jPanel1.add(jL, new org.netbeans.lib.awtextra.AbsoluteConstraints(64, 198, 80, -1));

        txNota.setBackground(new java.awt.Color(255, 255, 255));
        txNota.setForeground(new java.awt.Color(0, 0, 0));
        txNota.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txNota.setToolTipText("");
        txNota.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(176, 16, 37)));
        jPanel1.add(txNota, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 250, 96, 32));

        btAceptarAggCal.setBackground(new java.awt.Color(176, 16, 37));
        btAceptarAggCal.setForeground(new java.awt.Color(255, 255, 255));
        btAceptarAggCal.setText("Aceptar");
        jPanel1.add(btAceptarAggCal, new org.netbeans.lib.awtextra.AbsoluteConstraints(224, 352, 96, 32));

        cbMateriasDoce.setBackground(new java.awt.Color(255, 255, 255));
        cbMateriasDoce.setForeground(new java.awt.Color(0, 0, 0));
        jPanel1.add(cbMateriasDoce, new org.netbeans.lib.awtextra.AbsoluteConstraints(144, 96, 160, -1));

        jTextField1.setBackground(new java.awt.Color(255, 255, 255));
        jTextField1.setForeground(new java.awt.Color(0, 0, 0));
        jTextField1.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(176, 16, 37)));
        jPanel1.add(jTextField1, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 300, 96, 32));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 576, 480));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void IconCalificacionMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_IconCalificacionMouseEntered

    }//GEN-LAST:event_IconCalificacionMouseEntered

    private void jlRegresarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jlRegresarMouseClicked
        JFramePrincipal prin = new JFramePrincipal();
        prin.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jlRegresarMouseClicked

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel BarraSuperior;
    private javax.swing.JLabel IconCalificacion;
    private javax.swing.JButton btAceptarAggCal;
    public javax.swing.JComboBox<String> cbEstudiantes;
    private javax.swing.JComboBox<String> cbMateriasDoce;
    private javax.swing.JLabel jL;
    private javax.swing.JLabel jL1;
    private javax.swing.JLabel jL2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollBar jScrollBar1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JLabel jlRegresar;
    private javax.swing.JLabel lbCalificacion1;
    private javax.swing.JLabel lbCalificacion2;
    private javax.swing.JLabel lbNombre;
    private javax.swing.JTextField txNota;
    // End of variables declaration//GEN-END:variables

    private void cargarProfesor(String cedula) {
        for (int i = 0; i < Almacen.getInstance().informacion.size(); i++) {
            if (Almacen.getInstance().informacion.get(i).getCedula().equals(cedula)) {
                this.lbNombre.setText(Almacen.getInstance().informacion.get(i).getNombre() + " "
                        + Almacen.getInstance().informacion.get(i).getApellido());
                ArrayList<Materia> materias = Almacen.getInstance().informacion.get(i).getMaterias();
                for (Materia mate : materias) {
                    this.cbMateriasDoce.addItem(mate.getNombre());
                }
            }
        }
    }

//    private void imprimirMaterias(String cedula) {
//        for (int i = 0; i < Almacen.getInstance().informacion.size(); i++) {
//            if (Almacen.getInstance().informacion.get(i).getCedula().equals(cedula)) {
//                ArrayList<Materia> materias = Almacen.getInstance().informacion.get(i).getMaterias();
//                for (Materia mate : materias) {
//                    System.out.println("-"+mate.getNombre());  
//                }
//            }
//        }
//    }

    private ArrayList<Estudiante> cargarEstudiantesPorMateria(String materiaSeleccionada) {
        for(Docente doce: Almacen.getInstance().informacion){
           for(Materia mate: doce.getMaterias()){
               if (mate.getNombre().equals(materiaSeleccionada)) {
                    ArrayList<Estudiante> estud = mate.getEstudiante();
                    return estud;
               }
           }
        }
        return null;
    }
}
