/*
 * 	https://github.com/nikoskalai/Password-Master
 *
 * 	Copyright (c) 2018 Nikos Kalaitzian
 * 	Licensed under the WTFPL
 * 	You may obtain a copy of the License at
 *
 * 	http://www.wtfpl.net/about/
 *
 * 	Unless required by applicable law or agreed to in writing, software
 * 	distributed under the License is distributed on an "AS IS" BASIS,
 * 	WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 */
package passwordMaster;

import Other.Settings;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFrame;

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
        WindowListener windowListener = new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent e) {
                visible(false);
            }
        };
        addWindowListener(windowListener);
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
        minimizeToTaskbarButton = new javax.swing.JButton();
        minimizeToSysTrayButton = new javax.swing.JButton();
        dontAskMeAgainCheckBox = new javax.swing.JCheckBox();

        setDefaultCloseOperation(javax.swing.WindowConstants.DO_NOTHING_ON_CLOSE);

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

        minimizeToTaskbarButton.setText("Minimize to taskbar");
        minimizeToTaskbarButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                minimizeToTaskbarButtonActionPerformed(evt);
            }
        });

        minimizeToSysTrayButton.setText("Minimize to system tray");
        minimizeToSysTrayButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                minimizeToSysTrayButtonActionPerformed(evt);
            }
        });

        dontAskMeAgainCheckBox.setText("Don't ask me again");
        dontAskMeAgainCheckBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                dontAskMeAgainCheckBoxActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(dontAskMeAgainCheckBox)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(saveExitButton)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(exitButton)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(cancelButton))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(minimizeToTaskbarButton)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(minimizeToSysTrayButton)))
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
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(minimizeToTaskbarButton)
                    .addComponent(minimizeToSysTrayButton))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(dontAskMeAgainCheckBox)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void saveExitButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_saveExitButtonActionPerformed
        if(dontAskMeAgainCheckBox.isSelected()){
            Settings.bypassMode = Settings.bypassAndSaveExit;
        }
        new SaveAndExit().start();
    }//GEN-LAST:event_saveExitButtonActionPerformed

    private void exitButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_exitButtonActionPerformed
        if(dontAskMeAgainCheckBox.isSelected()){
            Settings.bypassMode = Settings.bypassAndExit;
        }
        mw.exitApp();
    }//GEN-LAST:event_exitButtonActionPerformed

    private void cancelButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cancelButtonActionPerformed
        visible(false);
    }//GEN-LAST:event_cancelButtonActionPerformed

    private void minimizeToTaskbarButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_minimizeToTaskbarButtonActionPerformed
        if(dontAskMeAgainCheckBox.isSelected()){
            Settings.bypassMode = Settings.bypassAndMinimize;
        }
        minimizeMainFrame();
        visible(false);
    }//GEN-LAST:event_minimizeToTaskbarButtonActionPerformed

    private void minimizeToSysTrayButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_minimizeToSysTrayButtonActionPerformed
        if(dontAskMeAgainCheckBox.isSelected()){
            Settings.bypassMode = Settings.bypassAndMinimizeToSysTray;
        }
        minimizeToSysTrayMainFrame();
        visible(false);
    }//GEN-LAST:event_minimizeToSysTrayButtonActionPerformed

    private void dontAskMeAgainCheckBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_dontAskMeAgainCheckBoxActionPerformed
        Settings.bypassExitWindow = dontAskMeAgainCheckBox.isSelected();
    }//GEN-LAST:event_dontAskMeAgainCheckBoxActionPerformed

    /**
     * This method toggles the visibility of the ExitWindow.
     * @param visibility The boolean variable that is used to toggle the ExitWindow visibility.
     */
    public void visible(boolean visibility) {
        dontAskMeAgainCheckBox.setSelected(Settings.bypassExitWindow);
        if (visibility) {
            if (Settings.bypassExitWindow) {
                switch (Settings.bypassMode) {
                    case Settings.bypassAndExit:
                        if(!mw.fileUnsaved){
                            mw.exitApp();
                        }
                        break;
                    case Settings.bypassAndSaveExit:
                        new SaveAndExit().start();
                        visibility = false;
                        break;
                    case Settings.bypassAndMinimize:
                        minimizeMainFrame();
                        visibility = false;
                        break;
                    case Settings.bypassAndMinimizeToSysTray:
                        visibility = false;
                        minimizeToSysTrayMainFrame();
                        break;
                    default:
                        break;
                }
            }
        }
        mw.setEnabled(!visibility);
        setAlwaysOnTop(visibility);
        setVisible(visibility);
        setEnabled(visibility);
    }

    private void minimizeMainFrame() {
        if (mw != null) {
            mw.setState(JFrame.ICONIFIED);
        }
    }

    private void minimizeToSysTrayMainFrame() {
        if (mw != null) {
            mw.setVisible(false);
        }
    }

    private class SaveAndExit extends Thread {

        @Override
        public void run() {
            if(mw.saveFile()){
                while (true) {
                    try {
                        Thread.sleep(300);
                    } catch (InterruptedException ex) {
                        MainWindow.showError(ex, "Could not pause running thread.");
                    }
                    if (!mw.fileUnsaved) {
                        break;
                    }
                }
                dispose();
                mw.exitApp();
            }
        }
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton cancelButton;
    private javax.swing.JCheckBox dontAskMeAgainCheckBox;
    private javax.swing.JButton exitButton;
    private javax.swing.JButton minimizeToSysTrayButton;
    private javax.swing.JButton minimizeToTaskbarButton;
    private javax.swing.JButton saveExitButton;
    // End of variables declaration//GEN-END:variables
}
