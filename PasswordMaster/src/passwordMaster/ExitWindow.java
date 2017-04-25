/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package passwordMaster;

import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Nikos
 */
public class ExitWindow extends javax.swing.JFrame {

    MainWindow mw;
    
    private final Logger LOG = Logger.getLogger(ExitWindow.class.getName());
    /**
     * Creates new form ExitWindow
     * @param mw
     */
    public ExitWindow(MainWindow mw) {
        initComponents();
        this.mw = mw;
        setLocationRelativeTo(null);
        setResizable(false);
        setEnabled(false);
        setTitle("Exit Password Master?");
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        saveExitButton = new javax.swing.JButton();
        exitButton = new javax.swing.JButton();
        cancelButton = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        saveExitButton.setText("Save & Exit");
        saveExitButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                saveExitButtonActionPerformed(evt);
            }
        });

        exitButton.setText("Exit Without Saving");
        exitButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                exitButtonActionPerformed(evt);
            }
        });

        cancelButton.setText("Cancel");
        cancelButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cancelButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(saveExitButton)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(exitButton)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(cancelButton)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(saveExitButton)
                    .addComponent(exitButton)
                    .addComponent(cancelButton))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void saveExitButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_saveExitButtonActionPerformed
        mw.saveFile();
        try {
            Thread.sleep(100);
        } catch (InterruptedException ex) {
            LOG.log(Level.SEVERE, null, ex);
        }
        if (!mw.fileUnsaved) {
            mw.exitApp();
        }
    }//GEN-LAST:event_saveExitButtonActionPerformed

    private void exitButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_exitButtonActionPerformed
        mw.exitApp();
    }//GEN-LAST:event_exitButtonActionPerformed

    private void cancelButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cancelButtonActionPerformed
        visible(false);
    }//GEN-LAST:event_cancelButtonActionPerformed

    /**
     * This method toggles the visibility of the ExitWindow.
     * @param visibility The boolean variable that is used to toggle the ExitWindow visibility.
     */
    public void visible(boolean visibility) {
        if (visibility) {
            if (!mw.fileUnsaved) {
                mw.exitApp();
            }
        }
        mw.setEnabled(!visibility);
        setAlwaysOnTop(visibility);
        setVisible(visibility);
        setEnabled(visibility);
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton cancelButton;
    private javax.swing.JButton exitButton;
    private javax.swing.JButton saveExitButton;
    // End of variables declaration//GEN-END:variables
}
