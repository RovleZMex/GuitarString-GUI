/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package com.robles.pruebagui;

/**
 *
 * @author Santy
 */
public class CenterPanel extends javax.swing.JPanel {

    private int selectedOctave = 4;
    public ControlPanel controlPanel;

    /**
     * Creates new form CenterPanel
     */
    public CenterPanel() {
        initComponents();
        listOctaves.setSelectedIndex(3);
    }

    public void setControlPanel(ControlPanel p) {
        controlPanel = p;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        cbDo = new javax.swing.JCheckBox();
        cbRe = new javax.swing.JCheckBox();
        cbMi = new javax.swing.JCheckBox();
        cbFa = new javax.swing.JCheckBox();
        cbSo = new javax.swing.JCheckBox();
        jScrollPane1 = new javax.swing.JScrollPane();
        listOctaves = new javax.swing.JList<>();
        cbLa = new javax.swing.JCheckBox();
        cbSi = new javax.swing.JCheckBox();

        cbDo.setText("Do");
        cbDo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbDoActionPerformed(evt);
            }
        });

        cbRe.setText("Re");
        cbRe.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbReActionPerformed(evt);
            }
        });

        cbMi.setText("Mi");
        cbMi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbMiActionPerformed(evt);
            }
        });

        cbFa.setText("Fa");
        cbFa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbFaActionPerformed(evt);
            }
        });

        cbSo.setText("So");
        cbSo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbSoActionPerformed(evt);
            }
        });

        listOctaves.setModel(new javax.swing.AbstractListModel<String>() {
            String[] strings = { "Octave 1", "Octave 2", "Octave 3", "Octave 4", "Octave 5", "Octave 6", "Octave 7", "Octave 8" };
            public int getSize() { return strings.length; }
            public String getElementAt(int i) { return strings[i]; }
        });
        listOctaves.addListSelectionListener(new javax.swing.event.ListSelectionListener() {
            public void valueChanged(javax.swing.event.ListSelectionEvent evt) {
                listOctavesValueChanged(evt);
            }
        });
        jScrollPane1.setViewportView(listOctaves);

        cbLa.setText("La");
        cbLa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbLaActionPerformed(evt);
            }
        });

        cbSi.setText("Si");
        cbSi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbSiActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(43, 43, 43)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 47, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(cbSi)
                    .addComponent(cbDo)
                    .addComponent(cbRe)
                    .addComponent(cbMi)
                    .addComponent(cbFa)
                    .addComponent(cbSo)
                    .addComponent(cbLa))
                .addGap(39, 39, 39))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(cbDo)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(cbRe)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(cbMi)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(cbFa)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(cbSo)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(cbLa)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(cbSi)
                .addContainerGap(118, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void listOctavesValueChanged(javax.swing.event.ListSelectionEvent evt) {//GEN-FIRST:event_listOctavesValueChanged
        // TODO add your handling code here:
        if (!evt.getValueIsAdjusting()) {//This line prevents double events
            selectedOctave = listOctaves.getSelectedIndex() + 1;
        }

    }//GEN-LAST:event_listOctavesValueChanged

    private void cbDoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbDoActionPerformed
        // TODO add your handling code here:
        double note = 16.35 * Math.pow(2, selectedOctave);
        GuitarString string = new GuitarString(note);
        if (cbDo.isSelected()) {
            controlPanel.list1.add(string);
            controlPanel.lStatus.setText("Added " + note + " Hz string");

        } else {
            GuitarString deleteString = null;
            for (GuitarString checkString : controlPanel.list1) {
                if (checkString.frequency == note) {
                    deleteString = checkString;
                    break;
                }
            }
            controlPanel.list1.remove(deleteString);
            controlPanel.lStatus.setText("Removed " + note + " Hz string");
        }
    }//GEN-LAST:event_cbDoActionPerformed

    private void cbReActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbReActionPerformed
        // TODO add your handling code here:
        double note = 18.35 * Math.pow(2, selectedOctave);
        GuitarString string = new GuitarString(note);
        if (cbRe.isSelected()) {
            controlPanel.list1.add(string);
            controlPanel.lStatus.setText("Added " + note + " Hz string");

        } else {
            GuitarString deleteString = null;
            for (GuitarString checkString : controlPanel.list1) {
                if (checkString.frequency == note) {
                    deleteString = checkString;
                    break;
                }
            }
            controlPanel.list1.remove(deleteString);
            controlPanel.lStatus.setText("Removed " + note + " Hz string");
        }
    }//GEN-LAST:event_cbReActionPerformed

    private void cbMiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbMiActionPerformed
        // TODO add your handling code here:
        double note = 20.6 * Math.pow(2, selectedOctave);
        GuitarString string = new GuitarString(note);
        if (cbMi.isSelected()) {
            controlPanel.list1.add(string);
            controlPanel.lStatus.setText("Added " + note + " Hz string");

        } else {
            GuitarString deleteString = null;
            for (GuitarString checkString : controlPanel.list1) {
                if (checkString.frequency == note) {
                    deleteString = checkString;
                    break;
                }
            }
            controlPanel.list1.remove(deleteString);
            controlPanel.lStatus.setText("Removed " + note + " Hz string");
        }
    }//GEN-LAST:event_cbMiActionPerformed

    private void cbFaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbFaActionPerformed
        // TODO add your handling code here:
        double note = 21.83 * Math.pow(2, selectedOctave);
        GuitarString string = new GuitarString(note);
        if (cbFa.isSelected()) {
            controlPanel.list1.add(string);
            controlPanel.lStatus.setText("Added " + note + " Hz string");

        } else {
            GuitarString deleteString = null;
            for (GuitarString checkString : controlPanel.list1) {
                if (checkString.frequency == note) {
                    deleteString = checkString;
                    break;
                }
            }
            controlPanel.list1.remove(deleteString);
            controlPanel.lStatus.setText("Removed " + note + " Hz string");
        }
    }//GEN-LAST:event_cbFaActionPerformed

    private void cbSoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbSoActionPerformed
        // TODO add your handling code here:
        double note = 24.5 * Math.pow(2, selectedOctave);
        GuitarString string = new GuitarString(note);
        if (cbSo.isSelected()) {
            controlPanel.list1.add(string);
            controlPanel.lStatus.setText("Added " + note + " Hz string");

        } else {
            GuitarString deleteString = null;
            for (GuitarString checkString : controlPanel.list1) {
                if (checkString.frequency == note) {
                    deleteString = checkString;
                    break;
                }
            }
            controlPanel.list1.remove(deleteString);
            controlPanel.lStatus.setText("Removed " + note + " Hz string");
        }
    }//GEN-LAST:event_cbSoActionPerformed

    private void cbLaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbLaActionPerformed
        // TODO add your handling code here:
        double note = 27.5 * Math.pow(2, selectedOctave);
        GuitarString string = new GuitarString(note);
        if (cbLa.isSelected()) {
            controlPanel.list1.add(string);
            controlPanel.lStatus.setText("Added " + note + " Hz string");

        } else {
            GuitarString deleteString = null;
            for (GuitarString checkString : controlPanel.list1) {
                if (checkString.frequency == note) {
                    deleteString = checkString;
                    break;
                }
            }
            controlPanel.list1.remove(deleteString);
            controlPanel.lStatus.setText("Removed " + note + " Hz string");
        }
    }//GEN-LAST:event_cbLaActionPerformed

    private void cbSiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbSiActionPerformed
        // TODO add your handling code here:
        double note = 30.87 * Math.pow(2, selectedOctave);
        GuitarString string = new GuitarString(note);
        if (cbSi.isSelected()) {
            controlPanel.list1.add(string);
            controlPanel.lStatus.setText("Added " + note + " Hz string");

        } else {
            GuitarString deleteString = null;
            for (GuitarString checkString : controlPanel.list1) {
                if (checkString.frequency == note) {
                    deleteString = checkString;
                    break;
                }
            }
            controlPanel.list1.remove(deleteString);
            controlPanel.lStatus.setText("Removed " + note + " Hz string");
        }
    }//GEN-LAST:event_cbSiActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    public javax.swing.JCheckBox cbDo;
    public javax.swing.JCheckBox cbFa;
    public javax.swing.JCheckBox cbLa;
    public javax.swing.JCheckBox cbMi;
    public javax.swing.JCheckBox cbRe;
    public javax.swing.JCheckBox cbSi;
    public javax.swing.JCheckBox cbSo;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JList<String> listOctaves;
    // End of variables declaration//GEN-END:variables
}
