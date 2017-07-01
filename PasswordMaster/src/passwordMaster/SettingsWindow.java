/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package passwordMaster;

import Other.Settings;
import java.awt.Dimension;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;
import java.io.File;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFileChooser;
import javax.swing.JFrame;
import javax.swing.SwingUtilities;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;
import javax.swing.event.DocumentEvent;
import javax.swing.event.DocumentListener;

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
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        changeEncKeyButton = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        themeComboBox = new javax.swing.JComboBox<>();
        jLabel1 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        selectDirectoryButton = new javax.swing.JButton();
        directoryTF = new javax.swing.JTextField();
        defaultDirectoryButton = new javax.swing.JButton();
        applyCloseButton = new javax.swing.JButton();
        defaultWindowSizeButton = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        idleSecondsTextField = new javax.swing.JTextField();
        cancelButton = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DO_NOTHING_ON_CLOSE);

        changeEncKeyButton.setText("Change Encryption Key");
        changeEncKeyButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                changeEncKeyButtonActionPerformed(evt);
            }
        });

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

        defaultDirectoryButton.setText("Set Default Directory");
        defaultDirectoryButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                defaultDirectoryButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(12, 12, 12)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(defaultDirectoryButton)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(selectDirectoryButton))
                            .addComponent(directoryTF))))
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(directoryTF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(selectDirectoryButton)
                    .addComponent(defaultDirectoryButton))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        applyCloseButton.setText("Apply & Close");
        applyCloseButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                applyCloseButtonActionPerformed(evt);
            }
        });

        defaultWindowSizeButton.setText("Default Main Window Size");
        defaultWindowSizeButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                defaultWindowSizeButtonActionPerformed(evt);
            }
        });

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
                    .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, 418, Short.MAX_VALUE)
                    .addComponent(idleSecondsTextField))
                .addContainerGap())
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(idleSecondsTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 10, Short.MAX_VALUE))
        );

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
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(changeEncKeyButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(defaultWindowSizeButton)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(cancelButton)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(applyCloseButton))
                    .addComponent(jPanel2, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
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
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(changeEncKeyButton)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(applyCloseButton)
                    .addComponent(defaultWindowSizeButton)
                    .addComponent(cancelButton))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void changeEncKeyButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_changeEncKeyButtonActionPerformed
        mw.changeEncryptionKey();
    }//GEN-LAST:event_changeEncKeyButtonActionPerformed

    private void selectDirectoryButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_selectDirectoryButtonActionPerformed
        selectDirectory();
    }//GEN-LAST:event_selectDirectoryButtonActionPerformed

    private void applyCloseButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_applyCloseButtonActionPerformed
        setSettings();
        loadSettings();
        setVisible(false);
    }//GEN-LAST:event_applyCloseButtonActionPerformed

    private void defaultDirectoryButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_defaultDirectoryButtonActionPerformed
        getDirectory(Settings.defaultDir);
    }//GEN-LAST:event_defaultDirectoryButtonActionPerformed

    private void defaultWindowSizeButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_defaultWindowSizeButtonActionPerformed
        size = Settings.defaultSize;
        setWindowSize(size);
    }//GEN-LAST:event_defaultWindowSizeButtonActionPerformed

    private void cancelButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cancelButtonActionPerformed
        setVisible(false);
    }//GEN-LAST:event_cancelButtonActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton applyCloseButton;
    private javax.swing.JButton cancelButton;
    private javax.swing.JButton changeEncKeyButton;
    private javax.swing.JButton defaultDirectoryButton;
    private javax.swing.JButton defaultWindowSizeButton;
    private javax.swing.JTextField directoryTF;
    private javax.swing.JTextField idleSecondsTextField;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JButton selectDirectoryButton;
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
        setTitle(Settings.app_name + " v" + Settings.version + " - " + Settings.settings_name);
        setLocationRelativeTo(null);
        setResizable(false);
        WindowListener exitListener = new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent e) {
                setVisible(false);
            }
        };
        addWindowListener(exitListener);
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
    }
    
    private void loadSettings() {
        setTheme(Settings.getTheme());
        applyWindowSize(Settings.getUserSize());
        applyWindowState(Settings.getWindowState());
    }

    private void applyWindowSize(Dimension userSize) {
        mw.setPreferredSize(userSize);
        mw.setSize(userSize);
        mw.setLocationRelativeTo(null);
        try {
            Thread.sleep(10);
        } catch (InterruptedException ex) {
            LOG.log(Level.SEVERE, null, ex);
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

    void setVisible() {
        setVisible(true);
        getTheme();
        getDirectory(Settings.getDirectory());
        getUserSize();
        getInactiveSeconds();
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
            LOG.log(Level.SEVERE, null, ex);
        }
    }

    private void getDirectory(String directory) {
        this.directory = directory;
        directoryTF.setText(directory);
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
}
