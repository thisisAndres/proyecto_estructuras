package Interfaz;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */

/**
 *
 * @author josep
 */
public class Sistemas extends javax.swing.JFrame {
Logica cambiar=new Logica();
    /**
     * Creates new form Sistemas
     */
    public Sistemas() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        FilaFlorencia = new javax.swing.JLabel();
        PilasDeFlorencia = new javax.swing.JLabel();
        FilaVenicia = new javax.swing.JLabel();
        PilasDeVenice = new javax.swing.JLabel();
        FilaMilan = new javax.swing.JLabel();
        PilasDeMilan = new javax.swing.JLabel();
        FilaNapoles = new javax.swing.JLabel();
        PilasDeNaples = new javax.swing.JLabel();
        FilaRoma = new javax.swing.JLabel();
        PilasDeRoma = new javax.swing.JLabel();
        TrenDisponibleNaples = new javax.swing.JLabel();
        TrenesDisponibles = new javax.swing.JLabel();
        TrenDisponibleMilan = new javax.swing.JLabel();
        TrenDisponibleVenice = new javax.swing.JLabel();
        TrenDisponibleFlorencia = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        FilaFlorencia.setBackground(new java.awt.Color(0, 0, 0));
        FilaFlorencia.setFont(new java.awt.Font("Segoe UI", 2, 12)); // NOI18N
        FilaFlorencia.setForeground(new java.awt.Color(0, 0, 0));
        FilaFlorencia.setText("0");
        getContentPane().add(FilaFlorencia, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 360, 40, 30));

        PilasDeFlorencia.setBackground(new java.awt.Color(0, 0, 0));
        PilasDeFlorencia.setFont(new java.awt.Font("Segoe UI", 2, 12)); // NOI18N
        PilasDeFlorencia.setForeground(new java.awt.Color(0, 0, 0));
        PilasDeFlorencia.setText("0");
        getContentPane().add(PilasDeFlorencia, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 340, 40, 30));

        FilaVenicia.setBackground(new java.awt.Color(0, 0, 0));
        FilaVenicia.setFont(new java.awt.Font("Segoe UI", 2, 12)); // NOI18N
        FilaVenicia.setForeground(new java.awt.Color(0, 0, 0));
        FilaVenicia.setText("0");
        getContentPane().add(FilaVenicia, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 260, 40, 30));

        PilasDeVenice.setBackground(new java.awt.Color(0, 0, 0));
        PilasDeVenice.setFont(new java.awt.Font("Segoe UI", 2, 12)); // NOI18N
        PilasDeVenice.setForeground(new java.awt.Color(0, 0, 0));
        PilasDeVenice.setText("0");
        getContentPane().add(PilasDeVenice, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 240, 40, 30));

        FilaMilan.setBackground(new java.awt.Color(0, 0, 0));
        FilaMilan.setFont(new java.awt.Font("Segoe UI", 2, 12)); // NOI18N
        FilaMilan.setForeground(new java.awt.Color(0, 0, 0));
        FilaMilan.setText("0");
        getContentPane().add(FilaMilan, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 190, 40, 30));

        PilasDeMilan.setBackground(new java.awt.Color(0, 0, 0));
        PilasDeMilan.setFont(new java.awt.Font("Segoe UI", 2, 12)); // NOI18N
        PilasDeMilan.setForeground(new java.awt.Color(0, 0, 0));
        PilasDeMilan.setText("0");
        getContentPane().add(PilasDeMilan, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 170, 40, 30));

        FilaNapoles.setBackground(new java.awt.Color(0, 0, 0));
        FilaNapoles.setFont(new java.awt.Font("Segoe UI", 2, 12)); // NOI18N
        FilaNapoles.setForeground(new java.awt.Color(0, 0, 0));
        FilaNapoles.setText("0");
        getContentPane().add(FilaNapoles, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 120, 40, 30));

        PilasDeNaples.setBackground(new java.awt.Color(0, 0, 0));
        PilasDeNaples.setFont(new java.awt.Font("Segoe UI", 2, 12)); // NOI18N
        PilasDeNaples.setForeground(new java.awt.Color(0, 0, 0));
        PilasDeNaples.setText("0");
        getContentPane().add(PilasDeNaples, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 100, 40, 30));

        FilaRoma.setBackground(new java.awt.Color(0, 0, 0));
        FilaRoma.setFont(new java.awt.Font("Segoe UI", 2, 12)); // NOI18N
        FilaRoma.setForeground(new java.awt.Color(0, 0, 0));
        FilaRoma.setText("0");
        getContentPane().add(FilaRoma, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 40, 80, 20));

        PilasDeRoma.setBackground(new java.awt.Color(0, 0, 0));
        PilasDeRoma.setFont(new java.awt.Font("Segoe UI", 2, 12)); // NOI18N
        PilasDeRoma.setForeground(new java.awt.Color(0, 0, 0));
        PilasDeRoma.setText("0");
        getContentPane().add(PilasDeRoma, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 20, 60, 20));

        TrenDisponibleNaples.setFont(new java.awt.Font("Segoe UI", 3, 12)); // NOI18N
        TrenDisponibleNaples.setForeground(new java.awt.Color(0, 0, 0));
        TrenDisponibleNaples.setText("0");
        getContentPane().add(TrenDisponibleNaples, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 90, 100, -1));

        TrenesDisponibles.setFont(new java.awt.Font("Segoe UI", 2, 12)); // NOI18N
        TrenesDisponibles.setForeground(new java.awt.Color(0, 0, 0));
        TrenesDisponibles.setText("0");
        getContentPane().add(TrenesDisponibles, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 10, 90, -1));

        TrenDisponibleMilan.setFont(new java.awt.Font("Segoe UI", 3, 12)); // NOI18N
        TrenDisponibleMilan.setForeground(new java.awt.Color(0, 0, 0));
        TrenDisponibleMilan.setText("0");
        getContentPane().add(TrenDisponibleMilan, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 160, 100, -1));

        TrenDisponibleVenice.setFont(new java.awt.Font("Segoe UI", 2, 12)); // NOI18N
        TrenDisponibleVenice.setForeground(new java.awt.Color(0, 0, 0));
        TrenDisponibleVenice.setText("0");
        getContentPane().add(TrenDisponibleVenice, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 226, 100, 20));

        TrenDisponibleFlorencia.setFont(new java.awt.Font("Segoe UI", 2, 12)); // NOI18N
        TrenDisponibleFlorencia.setForeground(new java.awt.Color(0, 0, 0));
        TrenDisponibleFlorencia.setText("0");
        getContentPane().add(TrenDisponibleFlorencia, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 330, 100, -1));

        jButton1.setBackground(new java.awt.Color(255, 51, 51));
        jButton1.setText("Movimiento");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 350, -1, -1));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Interfaz.png"))); // NOI18N
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 650, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        Arranque();
    }//GEN-LAST:event_jButton1ActionPerformed

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
            java.util.logging.Logger.getLogger(Sistemas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Sistemas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Sistemas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Sistemas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Sistemas().setVisible(true);
            }
        });
    }
    public void CambiarEtiqueta(String NombreDeEtiqueta,int valor){
     String dato=String.valueOf(valor);
     
      switch(NombreDeEtiqueta){
          case "Roma" -> {
              FilaRoma.setText(dato);
            }
          case "PilaMilan"-> {
              PilasDeMilan.setText(dato);
          }
         
      }
      this.repaint();
    }
    public void Arranque(){
      cambiar.EjecutarTrenes();
       int guardarFilaRoma; 
       int GuardarPilaMilan;
       guardarFilaRoma=cambiar.ContarPersonas(2);
       GuardarPilaMilan=cambiar.ContarPilas(2);
       CambiarEtiqueta("Roma",guardarFilaRoma);
       CambiarEtiqueta("PilaMilan",GuardarPilaMilan);
    }
           

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel FilaFlorencia;
    private javax.swing.JLabel FilaMilan;
    private javax.swing.JLabel FilaNapoles;
    private javax.swing.JLabel FilaRoma;
    private javax.swing.JLabel FilaVenicia;
    private javax.swing.JLabel PilasDeFlorencia;
    private javax.swing.JLabel PilasDeMilan;
    private javax.swing.JLabel PilasDeNaples;
    private javax.swing.JLabel PilasDeRoma;
    private javax.swing.JLabel PilasDeVenice;
    private javax.swing.JLabel TrenDisponibleFlorencia;
    private javax.swing.JLabel TrenDisponibleMilan;
    private javax.swing.JLabel TrenDisponibleNaples;
    private javax.swing.JLabel TrenDisponibleVenice;
    private javax.swing.JLabel TrenesDisponibles;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    // End of variables declaration//GEN-END:variables
}
