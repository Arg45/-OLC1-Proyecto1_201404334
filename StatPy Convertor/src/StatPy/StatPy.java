package StatPy;

public class StatPy extends javax.swing.JFrame {
    
    String analizador = "StatPy";

    public StatPy() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        txt_Entrada = new javax.swing.JTextArea();
        jScrollPane2 = new javax.swing.JScrollPane();
        txt_Salida = new javax.swing.JTextArea();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        lbl_Analizador = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        mn_Abrir = new javax.swing.JMenu();
        jMenuItem1 = new javax.swing.JMenuItem();
        mn_Guardar = new javax.swing.JMenuItem();
        mn_GuardarComo = new javax.swing.JMenuItem();
        mn_StatPy = new javax.swing.JMenu();
        jMenuItem4 = new javax.swing.JMenuItem();
        mn_JSON = new javax.swing.JMenuItem();
        mnEjecutar = new javax.swing.JMenu();
        jMenu4 = new javax.swing.JMenu();
        mn_Token = new javax.swing.JMenuItem();
        mn_Lexico = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        txt_Entrada.setColumns(20);
        txt_Entrada.setRows(5);
        jScrollPane1.setViewportView(txt_Entrada);

        txt_Salida.setColumns(20);
        txt_Salida.setRows(5);
        jScrollPane2.setViewportView(txt_Salida);

        jLabel1.setFont(new java.awt.Font("Dialog", 1, 11)); // NOI18N
        jLabel1.setText("Salida");

        jLabel2.setFont(new java.awt.Font("Dialog", 1, 11)); // NOI18N
        jLabel2.setText("Entrada");

        jLabel3.setFont(new java.awt.Font("Dialog", 1, 11)); // NOI18N
        jLabel3.setText("Analizador:");

        lbl_Analizador.setText("StatPy");

        mn_Abrir.setText("Archivo");

        jMenuItem1.setText("Abrir archivo");
        mn_Abrir.add(jMenuItem1);

        mn_Guardar.setText("Guardar");
        mn_Abrir.add(mn_Guardar);

        mn_GuardarComo.setText("Guardar como");
        mn_Abrir.add(mn_GuardarComo);

        jMenuBar1.add(mn_Abrir);

        mn_StatPy.setText("Analizador");

        jMenuItem4.setText("StatPy");
        jMenuItem4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem4ActionPerformed(evt);
            }
        });
        mn_StatPy.add(jMenuItem4);

        mn_JSON.setText("JSON");
        mn_JSON.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mn_JSONActionPerformed(evt);
            }
        });
        mn_StatPy.add(mn_JSON);

        jMenuBar1.add(mn_StatPy);

        mnEjecutar.setText("Ejecutar");
        jMenuBar1.add(mnEjecutar);

        jMenu4.setText("Reporte");

        mn_Token.setText("Tokens");
        jMenu4.add(mn_Token);

        mn_Lexico.setText("Errores léxicos");
        jMenu4.add(mn_Lexico);

        jMenuBar1.add(jMenu4);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 325, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel2))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1)
                            .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 325, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel3)
                        .addGap(18, 18, 18)
                        .addComponent(lbl_Analizador)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(lbl_Analizador))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jLabel1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 297, Short.MAX_VALUE)
                    .addComponent(jScrollPane1))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jMenuItem4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem4ActionPerformed
        analizador = "StatPy";
        lbl_Analizador.setText(analizador);
    }//GEN-LAST:event_jMenuItem4ActionPerformed

    private void mn_JSONActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mn_JSONActionPerformed
        analizador = "JSON";
        lbl_Analizador.setText(analizador);
    }//GEN-LAST:event_mn_JSONActionPerformed

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
            java.util.logging.Logger.getLogger(StatPy.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(StatPy.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(StatPy.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(StatPy.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new StatPy().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JMenu jMenu4;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuItem4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JLabel lbl_Analizador;
    private javax.swing.JMenu mnEjecutar;
    private javax.swing.JMenu mn_Abrir;
    private javax.swing.JMenuItem mn_Guardar;
    private javax.swing.JMenuItem mn_GuardarComo;
    private javax.swing.JMenuItem mn_JSON;
    private javax.swing.JMenuItem mn_Lexico;
    private javax.swing.JMenu mn_StatPy;
    private javax.swing.JMenuItem mn_Token;
    private javax.swing.JTextArea txt_Entrada;
    private javax.swing.JTextArea txt_Salida;
    // End of variables declaration//GEN-END:variables
}
