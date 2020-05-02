
package software_t4;

public class WinIntegracion extends javax.swing.JFrame {

    public WinIntegracion() {
        initComponents();
        this.setLocationRelativeTo(null);
        btntranparente();
    }
    
    public void btntranparente(){
        btnsalir.setOpaque(false);
        btnsalir.setContentAreaFilled(false);
        btnsalir.setBorderPainted(false);
    }

    @SuppressWarnings("unchecked")
    
    public int grado;
    double Resultado1,Resultado2,Resultado3,Resultado4;
    public ClsPolinomio q;
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 300, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
 private void BtnGradoMouseClicked(java.awt.event.MouseEvent evt) {                                      
        // TODO add your handling code here:
        grado=Integer.parseInt(TxtGrado.getText());
        q=new ClsPolinomio(grado+1);
        TxtGrado.setText(null);
        lblgrado.setText(" " + grado);
    }                                     

    private void TxtGradoActionPerformed(java.awt.event.ActionEvent evt) {                                         
        // TODO add your handling code here:
    }                                        

    private void BtnContadorMouseClicked(java.awt.event.MouseEvent evt) {                                         
        // TODO add your handling code here:
        if(grado>0)
        {
            q.a(grado, Float.parseFloat(TxtCoeficiente.getText()));
            TxtCoeficiente.setText(null);
            grado-=1;
            lblgrado.setText(""+grado+"");
            TxtCoeficiente.requestFocus();

        }
        else

        {
            q.a(grado, Float.parseFloat(TxtCoeficiente.getText()));
            TxtDisplay.setText(q.ver());
        }
    }                                        

    private void BtnIzquierdoMouseClicked(java.awt.event.MouseEvent evt) {                                          
        // TODO add your handling code here:
        Resultado1=q.izquierdo(Float.parseFloat(TxtInf.getText()), Float.parseFloat(TxtSup.getText()), Integer.parseInt(TxtPartes.getText()));
        TxtIzquierdo.setText(Double.toString(Resultado1));
    }                                         

    private void BtnSimpsonMouseClicked(java.awt.event.MouseEvent evt) {                                        
        // TODO add your handling code here:
        Resultado2=q.simpson(Float.parseFloat(TxtInf.getText()), Float.parseFloat(TxtSup.getText()), Integer.parseInt(TxtPartes.getText()));
        TxtSimpson.setText(Double.toString(Resultado2));
    }                                       

    private void BtnDerechoMouseClicked(java.awt.event.MouseEvent evt) {                                        
        // TODO add your handling code here:
        Resultado3=q.derecho(Float.parseFloat(TxtInf.getText()), Float.parseFloat(TxtSup.getText()), Integer.parseInt(TxtPartes.getText()));
        TxtDerecho.setText(Double.toString(Resultado3));
    }                                       

    private void BtnTrapecioMouseClicked(java.awt.event.MouseEvent evt) {                                         
        // TODO add your handling code here:
        Resultado4=q.trapecio(Float.parseFloat(TxtInf.getText()), Float.parseFloat(TxtSup.getText()), Integer.parseInt(TxtPartes.getText()));
        TxtTrapecio.setText(Double.toString(Resultado4));
    }                                        

    private void btnsalirActionPerformed(java.awt.event.ActionEvent evt) {                                         
        System.exit(0);
    }                                        

    private void BtnContadorActionPerformed(java.awt.event.ActionEvent evt) {                                            
        // TODO add your handling code here:
    }                                           

    private void btnnuevoActionPerformed(java.awt.event.ActionEvent evt) {                                         
        WinIntegracion nuevo=new WinIntegracion();
        nuevo.setVisible(true);
        dispose();//cierra la ventana anterior
    }                 
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
            java.util.logging.Logger.getLogger(WinIntegracion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(WinIntegracion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(WinIntegracion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(WinIntegracion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new WinIntegracion().setVisible(true);
            }
        });
    }
 private javax.swing.JButton BtnContador;
    private javax.swing.JButton BtnDerecho;
    private javax.swing.JButton BtnGrado;
    private javax.swing.JButton BtnIzquierdo;
    private javax.swing.JButton BtnSimpson;
    private javax.swing.JButton BtnTrapecio;
    private javax.swing.JTextField TxtCoeficiente;
    private javax.swing.JTextField TxtDerecho;
    private javax.swing.JTextField TxtDisplay;
    private javax.swing.JTextField TxtGrado;
    private javax.swing.JTextField TxtInf;
    private javax.swing.JTextField TxtIzquierdo;
    private javax.swing.JTextField TxtPartes;
    private javax.swing.JTextField TxtSimpson;
    private javax.swing.JTextField TxtSup;
    private javax.swing.JTextField TxtTrapecio;
    private javax.swing.JButton btnnuevo;
    private javax.swing.JButton btnsalir;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel lblgrado;
    private javax.swing.JLabel lblx;
    // Variables declaration - do not modify//GEN-BEGIN:variables
    // End of variables declaration//GEN-END:variables
}
