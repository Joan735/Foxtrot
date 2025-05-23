/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package view;

import javax.swing.JTextField;

/**
 *
 * @author Joan Ye
 */
public class Count extends javax.swing.JDialog {

    public Count(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
        jTxtCount.setEditable(false);
    }

    public JTextField getjTxtCount() {
        return jTxtCount;
    }
    
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jTxtCount = new javax.swing.JTextField();
        jLblCount = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Count - People v1.1.0");
        setLocation(new java.awt.Point(575, 300));

        jTxtCount.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jTxtCount.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        jLblCount.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        jLblCount.setText("COUNT PEOPLE");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(77, 77, 77)
                        .addComponent(jTxtCount, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(46, 46, 46)
                        .addComponent(jLblCount)))
                .addContainerGap(52, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(45, 45, 45)
                .addComponent(jLblCount)
                .addGap(18, 18, 18)
                .addComponent(jTxtCount, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(38, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLblCount;
    private javax.swing.JTextField jTxtCount;
    // End of variables declaration//GEN-END:variables
}
