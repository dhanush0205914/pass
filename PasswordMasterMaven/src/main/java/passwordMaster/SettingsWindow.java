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

import Other.Login;
import Other.Settings;
import java.awt.Dimension;
import java.awt.Toolkit;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;
import java.io.File;
import java.io.FileOutputStream;
import java.util.logging.Logger;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.SwingUtilities;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;
import javax.swing.event.DocumentEvent;
import javax.swing.event.DocumentListener;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import mslinks.ShellLink;

/**
 * @see
 * <a href="https://tips4java.wordpress.com/2008/10/20/table-select-all-editor/">RXTable</a>
 * @author Nikos
 */
public class SettingsWindow extends javax.swing.JFrame {

    private static final Logger LOG = Logger.getLogger(SettingsWindow.class.getName());
    
    private MainWindow mw;

    private String directory;
    private String theme;
    private Dimension size;
    private int inactiveSeconds;
    private boolean hideWebsites, hideUsernames, hideOthers, minimizeToSystemTray;

    /**
     * Creates new form SettingsWindow
     *
     * @param mw
     */
    public SettingsWindow(MainWindow mw) {
        this.mw = mw;
        initComponents();
        initThemes();
        initWindowSettings();
        initIdleSeconds();
        loadSettings();
        setIconImage(Toolkit.getDefaultToolkit().getImage(getClass().getClassLoader().getResource("ic_launcher.png")));
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        minimizeButtonGroup = new javax.swing.ButtonGroup();
        jPanel1 = new javax.swing.JPanel();
        themeComboBox = new javax.swing.JComboBox<>();
        jLabel1 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        selectDirectoryButton = new javax.swing.JButton();
        directoryTF = new javax.swing.JTextField();
        defaultDirectoryButton = new javax.swing.JButton();
        alwaysDefaultDir = new javax.swing.JCheckBox();
        jPanel3 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        idleSecondsTextField = new javax.swing.JTextField();
        jPanel4 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        hideWebsitesCheckBox = new javax.swing.JCheckBox();
        hideUsernamesCheckBox = new javax.swing.JCheckBox();
        hideOthersCheckBox = new javax.swing.JCheckBox();
        jPanel6 = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        taskbarMinRadioButton = new javax.swing.JRadioButton();
        systrayMinRadioButton = new javax.swing.JRadioButton();
        jPanel7 = new javax.swing.JPanel();
        createShortcutButton = new javax.swing.JButton();
        createDesktopShortcutButton = new javax.swing.JButton();
        changeEncKeyButton = new javax.swing.JButton();
        defaultWindowSizeButton = new javax.swing.JButton();
        cancelButton = new javax.swing.JButton();
        applyCloseButton = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DO_NOTHING_ON_CLOSE);

        jPanel1.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        themeComboBox.setBorder(null);

        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Theme Chooser");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(themeComboBox, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(themeComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        jPanel2.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("Select Directory:");

        selectDirectoryButton.setText("Select Directory");
        selectDirectoryButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                selectDirectoryButtonActionPerformed(evt);
            }
        });

        directoryTF.setEditable(false);
        directoryTF.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        directoryTF.setText("user.dir");
        directoryTF.setBorder(null);

        defaultDirectoryButton.setText("Restore Default Directory");
        defaultDirectoryButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                defaultDirectoryButtonActionPerformed(evt);
            }
        });

        alwaysDefaultDir.setText("Always Default Directory");
        alwaysDefaultDir.setToolTipText("<html><p>This is useful to enable when Password Master is placed in a folder that doesn't have a standard path(flash drive).<br>\nIf this is enabled, Password Master will always start looking for files either on startup or when launching a file chooser in the directory the executable is placed.</p></html>");
        alwaysDefaultDir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                alwaysDefaultDirActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(12, 12, 12)
                        .addComponent(directoryTF, javax.swing.GroupLayout.PREFERRED_SIZE, 273, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 85, Short.MAX_VALUE)
                        .addComponent(selectDirectoryButton))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(alwaysDefaultDir, javax.swing.GroupLayout.PREFERRED_SIZE, 173, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(defaultDirectoryButton)))
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(directoryTF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(selectDirectoryButton))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(defaultDirectoryButton)
                    .addComponent(alwaysDefaultDir))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel3.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("Hide passwords after seconds of inactivity(0 to disable):");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(idleSecondsTextField)
                    .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(idleSecondsTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 10, Short.MAX_VALUE))
        );

        jPanel4.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setText("What columns to hide when 'Show Hidden' is not selected.");
        jLabel4.setToolTipText("Passwords are always hidden.");

        hideWebsitesCheckBox.setText("Websites");

        hideUsernamesCheckBox.setText("Usernames");

        hideOthersCheckBox.setText("Others");

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addComponent(hideWebsitesCheckBox, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(hideUsernamesCheckBox)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(hideOthersCheckBox)))
                .addContainerGap())
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(hideWebsitesCheckBox)
                    .addComponent(hideUsernamesCheckBox)
                    .addComponent(hideOthersCheckBox))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel6.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel6.setText("Default Minimize action:");

        taskbarMinRadioButton.setText("Minimize to taskbar");
        taskbarMinRadioButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                taskbarMinRadioButtonActionPerformed(evt);
            }
        });

        systrayMinRadioButton.setText("Minimize to System tray");
        systrayMinRadioButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                systrayMinRadioButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addComponent(taskbarMinRadioButton)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(systrayMinRadioButton)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel6)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(taskbarMinRadioButton)
                    .addComponent(systrayMinRadioButton))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel7.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        createShortcutButton.setText("Create Shortcut");
        createShortcutButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                createShortcutButtonActionPerformed(evt);
            }
        });

        createDesktopShortcutButton.setText("Create Desktop Shortcut");
        createDesktopShortcutButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                createDesktopShortcutButtonActionPerformed(evt);
            }
        });

        changeEncKeyButton.setText("Change Encryption Key");
        changeEncKeyButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                changeEncKeyButtonActionPerformed(evt);
            }
        });

        defaultWindowSizeButton.setText("Default Main Window Size");
        defaultWindowSizeButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                defaultWindowSizeButtonActionPerformed(evt);
            }
        });

        cancelButton.setText("Cancel");
        cancelButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cancelButtonActionPerformed(evt);
            }
        });

        applyCloseButton.setText("Apply & Close");
        applyCloseButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                applyCloseButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel7Layout = new javax.swing.GroupLayout(jPanel7);
        jPanel7.setLayout(jPanel7Layout);
        jPanel7Layout.setHorizontalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel7Layout.createSequentialGroup()
                        .addComponent(createShortcutButton)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(createDesktopShortcutButton)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel7Layout.createSequentialGroup()
                        .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(changeEncKeyButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(jPanel7Layout.createSequentialGroup()
                                .addComponent(defaultWindowSizeButton)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(cancelButton)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(applyCloseButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                        .addContainerGap())))
        );
        jPanel7Layout.setVerticalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(createShortcutButton)
                    .addComponent(createDesktopShortcutButton))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(changeEncKeyButton)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(defaultWindowSizeButton)
                    .addComponent(cancelButton)
                    .addComponent(applyCloseButton)))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel6, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void changeEncKeyButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_changeEncKeyButtonActionPerformed
        if(!mw.showHidden){
            
        } else {
            mw.changeEncryptionKey();
        }
    }//GEN-LAST:event_changeEncKeyButtonActionPerformed

    private void selectDirectoryButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_selectDirectoryButtonActionPerformed
        if(!mw.showHidden){
            
        } else {
            selectDirectory();
        }
    }//GEN-LAST:event_selectDirectoryButtonActionPerformed

    private void applyCloseButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_applyCloseButtonActionPerformed
        if(!mw.showHidden){
            JOptionPane.showMessageDialog(null, "Cannot save settings while 'Hide Information' is selected.\n"
                    + "Press cancel, then click on 'Hide Information' and try again.\n", "Unauthorised access.", JOptionPane.WARNING_MESSAGE);
        } else {
            setSettings();
            loadSettings();
            setVisible(false);
        }
    }//GEN-LAST:event_applyCloseButtonActionPerformed

    private void defaultDirectoryButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_defaultDirectoryButtonActionPerformed
        if(!mw.showHidden){
            
        } else {
            getDirectory(Settings.DEFAULT_DIR);
        }
    }//GEN-LAST:event_defaultDirectoryButtonActionPerformed

    private void defaultWindowSizeButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_defaultWindowSizeButtonActionPerformed
        size = Settings.DEFAULT_SIZE;
        setWindowSize(size);
    }//GEN-LAST:event_defaultWindowSizeButtonActionPerformed

    private void cancelButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cancelButtonActionPerformed
        setVisible(false);
    }//GEN-LAST:event_cancelButtonActionPerformed

    private void alwaysDefaultDirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_alwaysDefaultDirActionPerformed
        Settings.alwaysDefaultDir = alwaysDefaultDir.isSelected();
        if(Settings.alwaysDefaultDir){
            defaultDirectoryButton.setEnabled(false);
            selectDirectoryButton.setEnabled(false);
        } else {
            defaultDirectoryButton.setEnabled(true);
            selectDirectoryButton.setEnabled(true);
        }
    }//GEN-LAST:event_alwaysDefaultDirActionPerformed

    private void createShortcutButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_createShortcutButtonActionPerformed
        createShortcut(false);
    }//GEN-LAST:event_createShortcutButtonActionPerformed

    private void createDesktopShortcutButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_createDesktopShortcutButtonActionPerformed
        createShortcut(true);
    }//GEN-LAST:event_createDesktopShortcutButtonActionPerformed

    private void taskbarMinRadioButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_taskbarMinRadioButtonActionPerformed
        Settings.minimizeToSystemTray = false;
    }//GEN-LAST:event_taskbarMinRadioButtonActionPerformed

    private void systrayMinRadioButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_systrayMinRadioButtonActionPerformed
        Settings.minimizeToSystemTray = false;
    }//GEN-LAST:event_systrayMinRadioButtonActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JCheckBox alwaysDefaultDir;
    private javax.swing.JButton applyCloseButton;
    private javax.swing.JButton cancelButton;
    private javax.swing.JButton changeEncKeyButton;
    private javax.swing.JButton createDesktopShortcutButton;
    private javax.swing.JButton createShortcutButton;
    private javax.swing.JButton defaultDirectoryButton;
    private javax.swing.JButton defaultWindowSizeButton;
    private javax.swing.JTextField directoryTF;
    private javax.swing.JCheckBox hideOthersCheckBox;
    private javax.swing.JCheckBox hideUsernamesCheckBox;
    private javax.swing.JCheckBox hideWebsitesCheckBox;
    private javax.swing.JTextField idleSecondsTextField;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.ButtonGroup minimizeButtonGroup;
    private javax.swing.JButton selectDirectoryButton;
    private javax.swing.JRadioButton systrayMinRadioButton;
    private javax.swing.JRadioButton taskbarMinRadioButton;
    private javax.swing.JComboBox<String> themeComboBox;
    // End of variables declaration//GEN-END:variables

    boolean themeChanging = false;

    private void initThemes() {
        themeChanging = false;
        themeComboBox.removeAllItems();
        for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
            themeComboBox.addItem(info.getName());
            if (UIManager.getSystemLookAndFeelClassName().equals(info.getClassName())) {
                Settings.setTheme(info.getName());
            }
        }

        themeComboBox.setSelectedItem(Settings.getTheme());
        themeComboBox.addItemListener(new ItemListener() {
            @Override
            public void itemStateChanged(ItemEvent e) {
                if (!themeChanging) {
                    theme = themeComboBox.getItemAt(themeComboBox.getSelectedIndex());
                    setTheme(theme);
                }
            }
        });
    }

    private void initWindowSettings() {
        setTitle(Settings.APP_NAME + " v" + Settings.APP_VERSION + " - " + Settings.SETTINGS_NAME);
        setLocationRelativeTo(null);
        setResizable(false);
        addListeners();
    }
    
    private void addListeners(){
        WindowListener exitListener = new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent e) {
                setVisible(false);
            }
        };
        addWindowListener(exitListener);
        hideWebsitesCheckBox.addChangeListener(new ChangeListener() {
            @Override
            public void stateChanged(ChangeEvent e) {
                hideWebsites = hideWebsitesCheckBox.isSelected();
            }
        });
        hideUsernamesCheckBox.addChangeListener(new ChangeListener() {
            @Override
            public void stateChanged(ChangeEvent e) {
                hideUsernames = hideUsernamesCheckBox.isSelected();
            }
        });
        hideOthersCheckBox.addChangeListener(new ChangeListener() {
            @Override
            public void stateChanged(ChangeEvent e) {
                hideOthers = hideOthersCheckBox.isSelected();
            }
        });
        minimizeButtonGroup.add(taskbarMinRadioButton);
        minimizeButtonGroup.add(systrayMinRadioButton);
    }

    private void initIdleSeconds() {
        idleSecondsTextField.getDocument().addDocumentListener(new DocumentListener() {
            public void changedUpdate(DocumentEvent e) {
                setInactiveSeconds();
            }

            public void removeUpdate(DocumentEvent e) {
                setInactiveSeconds();
            }

            public void insertUpdate(DocumentEvent e) {
                setInactiveSeconds();
            }
        });
    }

    private void setSettings() {
        Settings.setTheme(theme);
        Settings.setUserSize(size);
        Settings.setDirectory(directory);
        Settings.setUserIdleSeconds(inactiveSeconds);
        if(inactiveSeconds <= 0){
            MainWindow.idleTimer = false;
            MainWindow.startStaticIdleTimer();
        } else {
            MainWindow.idleTimer = true;
            MainWindow.startStaticIdleTimer();
        }
        Login.setHideWebsite(hideWebsites);
        Login.setHideUsername(hideUsernames);
        Login.setHideOther(hideOthers);
        mw.updateTable();
        Settings.minimizeToSystemTray = systrayMinRadioButton.isSelected();
    }
    
    private void loadSettings() {
        setTheme(Settings.getTheme());
        applyWindowSize(Settings.getUserSize());
        applyWindowState(Settings.getWindowState());
        createShortcutButton.setEnabled(System.getProperty("os.name").contains("Windows"));
        createDesktopShortcutButton.setEnabled(System.getProperty("os.name").contains("Windows"));
        systrayMinRadioButton.setSelected(Settings.minimizeToSystemTray);
        taskbarMinRadioButton.setSelected(!Settings.minimizeToSystemTray);
    }

    private void applyWindowSize(Dimension userSize) {
        mw.setPreferredSize(userSize);
        mw.setSize(userSize);
        mw.setLocationRelativeTo(null);
        try {
            Thread.sleep(10);
        } catch (InterruptedException ex) {
            MainWindow.showError(ex, "Could not pause running thread.");
        }
    }

    private void applyWindowState(int windowState) {
        mw.pack();
        mw.setExtendedState(mw.getExtendedState() | windowState); 
    }

    private void selectDirectory() {
        JFileChooser jfc = new JFileChooser();
        jfc.setCurrentDirectory(new File(Settings.getDirectory()));
        jfc.setMultiSelectionEnabled(false);
        jfc.setFileSelectionMode(JFileChooser.DIRECTORIES_ONLY);

        int returnVal = jfc.showOpenDialog(null);
        if (returnVal == JFileChooser.APPROVE_OPTION) {
            File file = jfc.getSelectedFile();
            if (!file.exists()) {
                file.mkdir();
            }
            directory = file.getPath();
        }
    }

    void showWindow() {
        setVisible(true);
        getTheme();
        getDirectory(Settings.getDirectory());
        getUserSize();
        getInactiveSeconds();
        getLoginPreferences();
    }

    private void getTheme() {
        themeChanging = true;
        theme = Settings.getTheme();
        themeComboBox.setSelectedItem(theme);
        themeChanging = false;
    }
    
    private void setTheme(String theme) {
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if (theme.equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    SwingUtilities.updateComponentTreeUI(SettingsWindow.this);
                    pack();

                    SwingUtilities.updateComponentTreeUI(mw);
                    mw.setExtendedState(Settings.getWindowState());
                    mw.pack();

                    SwingUtilities.updateComponentTreeUI(mw.ew);
                    mw.ew.setResizable(false);
                    mw.ew.setEnabled(false);
                    mw.ew.setVisible(false);
                    mw.ew.pack();
                    
                    themeChanging = true;
                    themeComboBox.setSelectedItem(theme);
                    themeChanging = false;
                    break;
                }
            }
        } catch (ClassNotFoundException | InstantiationException | IllegalAccessException | UnsupportedLookAndFeelException ex) {
            MainWindow.showError(ex, "Could not set theme.");
        }
    }

    private void getDirectory(String directory) {
        this.directory = directory;
        directoryTF.setText(directory);
        alwaysDefaultDir.setSelected(Settings.alwaysDefaultDir);
        if(Settings.alwaysDefaultDir){
            defaultDirectoryButton.setEnabled(false);
            selectDirectoryButton.setEnabled(false);
        }
    }

    private void getUserSize() {
        size = mw.getSize();
    }

    private void setWindowSize(Dimension size) {
        mw.setPreferredSize(size);
        mw.setSize(size);
        mw.pack();
        mw.setLocationRelativeTo(null);
    }

    private void getInactiveSeconds() {
        inactiveSeconds = Settings.getUserIdleSeconds();
        idleSecondsTextField.setText(inactiveSeconds + "");
    }

    private void setInactiveSeconds() {
        try {
            String idleSecondsSTR = idleSecondsTextField.getText();
            inactiveSeconds = new Integer(idleSecondsSTR);
        } catch (NumberFormatException ex) {
            inactiveSeconds = -1;
        }
    }

    private void getLoginPreferences() {
        hideWebsites = Login.isHideWebsite();
        hideWebsitesCheckBox.setSelected(hideWebsites);
        hideUsernames = Login.isHideUsername();
        hideUsernamesCheckBox.setSelected(hideUsernames);
        hideOthers = Login.isHideOther();
        hideOthersCheckBox.setSelected(hideOthers);
    }

    private void createShortcut(boolean toDesktop) {
        try {
            File jarFile = new File(SettingsWindow.class.getProtectionDomain().getCodeSource().getLocation().toURI().getPath());
            File shortcutFile = null;
            if(!toDesktop){
                shortcutFile = new File(jarFile.getParentFile() + File.separator + "Password Master.lnk");
            } else {
                shortcutFile = new File(System.getProperty("user.home") + File.separator + "Desktop" + File.separator + "Password Master.lnk");
            }
            
            File iconFile = copyIcon(jarFile);
            if(iconFile!=null){
                ShellLink sl = new ShellLink();
                sl.setCMDArgs(" -jar \"" + jarFile.getPath() + "\"");
                sl.setTarget(System.getProperty("java.home") + File.separator + "bin" + File.separator + "javaw.exe");
                sl.setWorkingDir(jarFile.getParent());
                sl.setIconLocation(iconFile.getPath());
                sl.saveTo(shortcutFile.getPath());
            } else {
                MainWindow.showError(null, "Could not create shortcut.");
            }
            MainWindow.showStatus("Shortcut created in: " + shortcutFile.getParent());
        } catch (Exception ex) {
            MainWindow.showError(ex, "Could not create shortcut.");
        }
    }

    private File copyIcon(File jarFile) {
        String ico = "/ic_launcher.ico";
        InputStream is = null;
        OutputStream os = null;
        File jarFolder = jarFile.getParentFile();
        File icoFile = new File(jarFolder + File.separator + ico);
        if(icoFile.exists()){
            return icoFile;
        }
        try {
            is = SettingsWindow.class.getResourceAsStream(ico);
            if(is == null){
                throw new Exception("Cannot get resource " + ico + " from Jar file.");
            }
            
            int readBytes;
            byte[] buffer = new byte[4096];
            os = new FileOutputStream(icoFile);
            while ((readBytes = is.read(buffer)) > 0) {
                os.write(buffer, 0, readBytes);
            }
        } catch (Exception ex) {
            MainWindow.showError(ex, "Could not copy icon.");
            return null;
        } finally {
            try {
                os.close();
                is.close();
            } catch (IOException ex) {
                MainWindow.showError(ex, "Could not close read & write streams.");
            }
        }
        return icoFile;
    }
}