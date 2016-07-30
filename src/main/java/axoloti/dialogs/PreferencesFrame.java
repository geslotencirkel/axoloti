/**
 * Copyright (C) 2013, 2014 Johannes Taelman
 *
 * This file is part of Axoloti.
 *
 * Axoloti is free software: you can redistribute it and/or modify it under the
 * terms of the GNU General Public License as published by the Free Software
 * Foundation, either version 3 of the License, or (at your option) any later
 * version.
 *
 * Axoloti is distributed in the hope that it will be useful, but WITHOUT ANY
 * WARRANTY; without even the implied warranty of MERCHANTABILITY or FITNESS FOR
 * A PARTICULAR PURPOSE. See the GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License along with
 * Axoloti. If not, see <http://www.gnu.org/licenses/>.
 */
package axoloti.dialogs;

import axoloti.utils.Preferences;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFileChooser;

/**
 *
 * @author Johannes Taelman
 */
public class PreferencesFrame extends javax.swing.JFrame {

    final static String  MidiNone = "None";
    Preferences prefs;

    /**
     * Creates new form PreferencesFrame
     * @param prefs preferences to load/save
     */
    public PreferencesFrame(Preferences prefs) {
        initComponents();
        if (prefs == null) {
            throw new Error();
        }
        this.prefs = prefs;
        jTextFieldPollInterval.setText(Integer.toString(prefs.getPollInterval()));
        String p = "";
        for (String s : prefs.getObjectSearchPath()) {
            p += s + "\n";
        }
        jTextPanePath.setText(p);

        txtFavDir.setText(prefs.getFavouriteDir());
        txtFirmwareDir.setText(System.getProperty(axoloti.Axoloti.FIRMWARE_DIR));
        txtRuntimeDir.setText(System.getProperty(axoloti.Axoloti.RUNTIME_DIR));
        jControllerEnabled.setSelected(prefs.isControllerEnabled());
        jTextFieldController.setText(prefs.getControllerObject());
        jTextFieldController.setEnabled(prefs.isControllerEnabled());
    }

    void Apply() {
        prefs.setPollInterval(Integer.parseInt(jTextFieldPollInterval.getText()));
        prefs.setObjectSearchPath(jTextPanePath.getText().split("\n"));
        prefs.setMouseDialAngular(jComboBox1.getSelectedItem().equals("Angular"));
        prefs.setFavouriteDir(txtFavDir.getText());
        prefs.setControllerObject(jTextFieldController.getText());
        prefs.setControllerEnabled(jControllerEnabled.isSelected());
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jTextPanePath = new javax.swing.JTextPane();
        jTextFieldPollInterval = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jButtonSave = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jComboBox1 = new javax.swing.JComboBox();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        txtFirmwareDir = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        txtRuntimeDir = new javax.swing.JLabel();
        btnFirmwareDir = new javax.swing.JButton();
        btnRuntimeDir = new javax.swing.JButton();
        txtFavDir = new javax.swing.JLabel();
        btnFavDir = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        jTextFieldController = new javax.swing.JTextField();
        jControllerEnabled = new javax.swing.JCheckBox();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowActivated(java.awt.event.WindowEvent evt) {
                formWindowActivated(evt);
            }
        });

        jScrollPane1.setViewportView(jTextPanePath);

        jTextFieldPollInterval.setText("jTextField1");
        jTextFieldPollInterval.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));

        jLabel1.setText("Object search path");

        jLabel2.setText("PollInterval (milliseconds)");

        jButtonSave.setText("OK");
        jButtonSave.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonSaveActionPerformed(evt);
            }
        });

        jLabel3.setText("Dial mouse behavior");

        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Vertical", "Angular" }));
        jComboBox1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox1ActionPerformed(evt);
            }
        });

        jLabel4.setText("Favourite Dir");

        jLabel5.setText("Firmware Dir");

        txtFirmwareDir.setText("jLabel6");

        jLabel7.setText("Runtime Dir");

        txtRuntimeDir.setText("jLabel6");

        btnFirmwareDir.setText("Select");
        btnFirmwareDir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnFirmwareDirActionPerformed(evt);
            }
        });

        btnRuntimeDir.setText("Select");
        btnRuntimeDir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRuntimeDirActionPerformed(evt);
            }
        });

        txtFavDir.setText("jLabel6");

        btnFavDir.setText("Select");
        btnFavDir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnFavDirActionPerformed(evt);
            }
        });

        jLabel6.setText("Controller Object");

        jTextFieldController.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));

        jControllerEnabled.setText("Enabled");
        jControllerEnabled.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jControllerEnabledActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 222, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jTextFieldController, javax.swing.GroupLayout.PREFERRED_SIZE, 227, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(128, 128, 128)
                                .addComponent(jButtonSave, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGroup(layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jControllerEnabled)
                                .addGap(0, 0, Short.MAX_VALUE))))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel5)
                            .addComponent(jLabel7)
                            .addComponent(jLabel4))
                        .addGap(34, 34, 34)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(txtFavDir, javax.swing.GroupLayout.PREFERRED_SIZE, 380, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(btnFavDir, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(txtRuntimeDir, javax.swing.GroupLayout.PREFERRED_SIZE, 257, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(0, 182, Short.MAX_VALUE))
                                    .addComponent(txtFirmwareDir, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addGap(65, 65, 65)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(btnFirmwareDir, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(btnRuntimeDir, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addGap(6, 6, 6))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel3)
                                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 222, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jTextFieldPollInterval, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jComboBox1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addComponent(jLabel1))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(jScrollPane1))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnRuntimeDir)
                    .addComponent(txtRuntimeDir)
                    .addComponent(jLabel7))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel5)
                            .addComponent(txtFirmwareDir)
                            .addComponent(btnFirmwareDir))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnFavDir)
                            .addComponent(txtFavDir))
                        .addGap(27, 27, 27))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jLabel4)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel1)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(4, 4, 4)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jTextFieldPollInterval, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(6, 6, 6)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(jTextFieldController, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jControllerEnabled))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 8, Short.MAX_VALUE)
                .addComponent(jButtonSave)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonSaveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonSaveActionPerformed
        Apply();
        prefs.SavePrefs();
        setVisible(false);
    }//GEN-LAST:event_jButtonSaveActionPerformed

    private void jComboBox1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox1ActionPerformed
    }//GEN-LAST:event_jComboBox1ActionPerformed

    private void btnFirmwareDirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnFirmwareDirActionPerformed
        JFileChooser chooser = new JFileChooser(prefs.getCurrentFileDirectory()); 
        chooser.setFileSelectionMode(JFileChooser.DIRECTORIES_ONLY);
        chooser.setAcceptAllFileFilterUsed(false);
        if (chooser.showOpenDialog(this) == JFileChooser.APPROVE_OPTION) {
            String dir;
            try {
                dir = chooser.getSelectedFile().getCanonicalPath();
                prefs.SetFirmwareDir(dir);
                txtFirmwareDir.setText(dir);
            } catch (IOException ex) {
                Logger.getLogger(PreferencesFrame.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }//GEN-LAST:event_btnFirmwareDirActionPerformed

    private void btnRuntimeDirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRuntimeDirActionPerformed
        JFileChooser chooser = new JFileChooser(prefs.getCurrentFileDirectory()); 
        chooser.setFileSelectionMode(JFileChooser.DIRECTORIES_ONLY);
        chooser.setAcceptAllFileFilterUsed(false);
        if (chooser.showOpenDialog(this) == JFileChooser.APPROVE_OPTION) {
            String dir;
            try {
                dir = chooser.getSelectedFile().getCanonicalPath();
                prefs.SetRuntimeDir(dir);
                txtRuntimeDir.setText(dir);
            } catch (IOException ex) {
                Logger.getLogger(PreferencesFrame.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }//GEN-LAST:event_btnRuntimeDirActionPerformed

    private void formWindowActivated(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowActivated
        txtFirmwareDir.setText(System.getProperty(axoloti.Axoloti.FIRMWARE_DIR));
        txtRuntimeDir.setText(System.getProperty(axoloti.Axoloti.RUNTIME_DIR));
    }//GEN-LAST:event_formWindowActivated

    private void btnFavDirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnFavDirActionPerformed
        JFileChooser chooser = new JFileChooser(prefs.getCurrentFileDirectory());
        chooser.setFileSelectionMode(JFileChooser.DIRECTORIES_ONLY);
        chooser.setAcceptAllFileFilterUsed(false);
        if (chooser.showOpenDialog(this) == JFileChooser.APPROVE_OPTION) {
            String dir;
            try {
                dir = chooser.getSelectedFile().getCanonicalPath();
                prefs.setFavouriteDir(dir);
                txtFavDir.setText(dir);
            } catch (IOException ex) {
                Logger.getLogger(PreferencesFrame.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }//GEN-LAST:event_btnFavDirActionPerformed

    private void jControllerEnabledActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jControllerEnabledActionPerformed
        jTextFieldController.setEnabled(jControllerEnabled.isSelected());
    }//GEN-LAST:event_jControllerEnabledActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnFavDir;
    private javax.swing.JButton btnFirmwareDir;
    private javax.swing.JButton btnRuntimeDir;
    private javax.swing.JButton jButtonSave;
    private javax.swing.JComboBox jComboBox1;
    private javax.swing.JCheckBox jControllerEnabled;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField jTextFieldController;
    private javax.swing.JTextField jTextFieldPollInterval;
    private javax.swing.JTextPane jTextPanePath;
    private javax.swing.JLabel txtFavDir;
    private javax.swing.JLabel txtFirmwareDir;
    private javax.swing.JLabel txtRuntimeDir;
    // End of variables declaration//GEN-END:variables
}
