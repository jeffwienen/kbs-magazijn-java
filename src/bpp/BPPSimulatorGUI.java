/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bpp;

import java.awt.event.MouseEvent;
import java.util.ArrayList;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Hugo
 */
public class BPPSimulatorGUI extends javax.swing.JFrame {

    private Depository depository;
    private BoxDepository boxd;
    private ArrayList<Product> producten;
    private ArrayList<Box> arrayBox;
    private Product product;
    private String name;
    private int idProduct;
    private int box;
    private int size;
    private boolean check;
    private String StringBox;
    private Box bBox;
    private int sizet;
    private int boxnr;
    private int bnr;
    private Box aBox;
    private Box cBox;
//    private int sizet;

    /**
     * Creates new form BPPSimulatorGUI
     */
    public BPPSimulatorGUI() {
        initComponents();
    }

    public void setBoxDepository(BoxDepository b) {
        boxd = b;
        arrayBox = boxd.getList();
        int a = arrayBox.size();
        if (a > 2) {
            System.out.println("Let op er zijn te veel dozen!!");
        }

    }

    public void setDepository(Depository b) {
        this.depository = b;
        producten = depository.getList();
    }

    public Depository getDepository() {
        return this.depository;
    }

    public void setProducten(ArrayList<Product> p) {
        this.producten = p;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")


    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        bPPSimulatorBoxPanel2 = new bpp.BPPSimulatorBoxPanel();
        jLabel2 = new javax.swing.JLabel();
        algorithmLabel = new javax.swing.JLabel();
        algorithmPicker = new javax.swing.JComboBox();
        jScrollPane1 = new javax.swing.JScrollPane();
        productTable = new javax.swing.JTable();
        jProgressBar1 = new javax.swing.JProgressBar();
        progressLabel = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        packingData = new javax.swing.JTextArea();
        forceStop = new javax.swing.JButton();
        Boxa = new javax.swing.JPanel();
        Boxb = new javax.swing.JPanel();
        Boxc = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jScrollPane3 = new javax.swing.JScrollPane();
        BoxTable = new javax.swing.JTable();

        javax.swing.GroupLayout bPPSimulatorBoxPanel2Layout = new javax.swing.GroupLayout(bPPSimulatorBoxPanel2);
        bPPSimulatorBoxPanel2.setLayout(bPPSimulatorBoxPanel2Layout);
        bPPSimulatorBoxPanel2Layout.setHorizontalGroup(
            bPPSimulatorBoxPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 489, Short.MAX_VALUE)
        );
        bPPSimulatorBoxPanel2Layout.setVerticalGroup(
            bPPSimulatorBoxPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 200, Short.MAX_VALUE)
        );

        jLabel2.setText("Box A");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("BPP-simulator");
        setResizable(false);

        algorithmLabel.setText("Algorithms");

        algorithmPicker.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Complete Enumeration", "Simple Greedy", "Max rects" }));
        algorithmPicker.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                algorithmPickerActionPerformed(evt);
            }
        });

        productTable.setAutoCreateRowSorter(true);
        productTable.setFont(new java.awt.Font("Calibri", 0, 12));
        productTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Name", "Nr.", "Size", "Check", "Box"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(productTable);

        progressLabel.setText("Progress");

        packingData.setEditable(false);
        packingData.setColumns(20);
        packingData.setFont(new java.awt.Font("Calibri", 0, 14)); // NOI18N
        packingData.setRows(5);
        packingData.setText("Packing width:\nPacking height:\nArea covered:");
        jScrollPane2.setViewportView(packingData);

        forceStop.setBackground(new java.awt.Color(204, 0, 0));
        forceStop.setFont(new java.awt.Font("Calibri", 1, 14)); // NOI18N
        forceStop.setForeground(new java.awt.Color(255, 255, 255));
        forceStop.setText("STOP THE PROCESS");

        Boxa.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        Boxa.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                Boxa(evt);
            }
        });
        Boxa.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                BoxaMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout BoxaLayout = new javax.swing.GroupLayout(Boxa);
        Boxa.setLayout(BoxaLayout);
        BoxaLayout.setHorizontalGroup(
            BoxaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        BoxaLayout.setVerticalGroup(
            BoxaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        Boxb.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        Boxb.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                Boxb(evt);
            }
        });

        javax.swing.GroupLayout BoxbLayout = new javax.swing.GroupLayout(Boxb);
        Boxb.setLayout(BoxbLayout);
        BoxbLayout.setHorizontalGroup(
            BoxbLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        BoxbLayout.setVerticalGroup(
            BoxbLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        Boxc.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        Boxc.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                BoxC(evt);
            }
        });

        javax.swing.GroupLayout BoxcLayout = new javax.swing.GroupLayout(Boxc);
        Boxc.setLayout(BoxcLayout);
        BoxcLayout.setHorizontalGroup(
            BoxcLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        BoxcLayout.setVerticalGroup(
            BoxcLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        jLabel1.setText("Box A");

        jLabel3.setText("Box B");

        jLabel4.setText("Box C");

        BoxTable.setAutoCreateRowSorter(true);
        BoxTable.setFont(new java.awt.Font("Calibri", 0, 12));
        BoxTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Name", "Nr.", "Size"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane3.setViewportView(BoxTable);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(73, 73, 73)
                        .addComponent(Boxa, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(34, 34, 34)
                        .addComponent(Boxb, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(34, 34, 34)
                        .addComponent(Boxc, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(105, 105, 105)
                        .addComponent(jLabel1)
                        .addGap(110, 110, 110)
                        .addComponent(jLabel3)
                        .addGap(112, 112, 112)
                        .addComponent(jLabel4)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jScrollPane3)
                        .addContainerGap())
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(algorithmLabel)
                            .addComponent(algorithmPicker, 0, 239, Short.MAX_VALUE)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(19, 19, 19)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(progressLabel)
                                        .addGap(0, 0, Short.MAX_VALUE))
                                    .addComponent(jProgressBar1, javax.swing.GroupLayout.DEFAULT_SIZE, 249, Short.MAX_VALUE)))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(forceStop, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(0, 0, Short.MAX_VALUE)))))
                        .addGap(0, 10, Short.MAX_VALUE))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(algorithmLabel)
                    .addComponent(progressLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jProgressBar1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(algorithmPicker))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 114, Short.MAX_VALUE)
                        .addGap(18, 18, 18)
                        .addComponent(forceStop, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                .addGap(41, 41, 41)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(Boxa, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Boxb, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Boxc, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1)
                    .addComponent(jLabel3)
                    .addComponent(jLabel4))
                .addGap(34, 34, 34)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.DEFAULT_SIZE, 156, Short.MAX_VALUE)
                .addGap(24, 24, 24))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void algorithmPickerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_algorithmPickerActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_algorithmPickerActionPerformed

    private void jPanel2MouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel2MouseMoved

    }//GEN-LAST:event_jPanel2MouseMoved

    private void jPanel3MouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel3MouseMoved

    }//GEN-LAST:event_jPanel3MouseMoved

    private void jPanel7MouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel7MouseMoved

    }//GEN-LAST:event_jPanel7MouseMoved

    private void Boxa(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Boxa
        try {
            bBox = arrayBox.get(0);
            StringBox = bBox.toString();
            packingData.setText(StringBox);
            

        } catch (Exception e) {
            packingData.setText("Box is empty");
        }
         try {
           bBox = arrayBox.get(0);
            // tabel invullen
            bnr = bBox.getIdBox();
            SetTableBox(bnr);
            } catch (Exception e) {
            packingData.setText("Box is empty");
            }
    }//GEN-LAST:event_Boxa

    private void Boxb(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Boxb
        try {
            bBox = arrayBox.get(1);
            StringBox = bBox.toString();
            packingData.setText(StringBox);
            
        } catch (Exception e) {
            packingData.setText("Box is empty");
        }
      try {
         bBox = arrayBox.get(1);
            // tabel invullen
            bnr = bBox.getIdBox();
            SetTableBox(bnr);
            } catch (Exception e) {
            packingData.setText("Box is empty");
            }
    }//GEN-LAST:event_Boxb

    private void BoxC(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BoxC
        try {
            bBox = arrayBox.get(2);
            StringBox = bBox.toString();
            packingData.setText(StringBox);
            
        } catch (Exception e) {
            packingData.setText("Box is empty");
        }
         try {
         bBox = arrayBox.get(2);
            // tabel invullen
            bnr = bBox.getIdBox();
            SetTableBox(bnr);
            } catch (Exception e) {
            packingData.setText("Box is empty");
            }
    }//GEN-LAST:event_BoxC

    private void BoxaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BoxaMouseClicked
            aBox = arrayBox.get(0);
            // tabel invullen
            bnr = aBox.getIdBox();
            SetTableBox(bnr);
    }//GEN-LAST:event_BoxaMouseClicked

      private void BoxbMouseClicked(java.awt.event.MouseEvent evt) {  
            bBox = arrayBox.get(1);
            // tabel invullen
            bnr = bBox.getIdBox();
            SetTableBox(bnr);
    }  
      
        private void BoxcMouseClicked(java.awt.event.MouseEvent evt) {  
            cBox = arrayBox.get(2);
            // tabel invullen
            bnr = cBox.getIdBox();
            SetTableBox(bnr);
    }  
    /**
     * @param args the command line arguments
     */
    public void SetTable() {
        sizet = producten.size();

        for (int i = 0; sizet > i; i++) {
            
            if (this.producten.get(i).GetBox()==0){
            
            String data1 = this.producten.get(i).Getname();
            int data2 = this.producten.get(i).GetidProduct();
            int data3 = this.producten.get(i).Getsize();
            boolean data4 = this.producten.get(i).Getcheck();
            int data5 = this.producten.get(i).GetBox();

            DefaultTableModel model = (DefaultTableModel) productTable.getModel();
            model.addRow(new Object[]{data1, data2, data3, data4, data5});
            }
        }
    }
  
 public void SetTableBox(int box) {
        sizet = producten.size();
        
        DefaultTableModel model = (DefaultTableModel) BoxTable.getModel();
        model.setRowCount(0);
        
        for (int i = 0; sizet > i; i++) {
            boxnr = this.producten.get(i).GetBox();
            
            if (boxnr == box){
            
            String data1 = this.producten.get(i).Getname();
            int data2 = this.producten.get(i).GetidProduct();
            int data3 = this.producten.get(i).Getsize();

            model.addRow(new Object[]{data1, data2, data3});         
            }
        }
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
            java.util.logging.Logger.getLogger(BPPSimulatorGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(BPPSimulatorGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(BPPSimulatorGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(BPPSimulatorGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new BPPSimulatorGUI().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTable BoxTable;
    private javax.swing.JPanel Boxa;
    private javax.swing.JPanel Boxb;
    private javax.swing.JPanel Boxc;
    private javax.swing.JLabel algorithmLabel;
    private javax.swing.JComboBox algorithmPicker;
    private bpp.BPPSimulatorBoxPanel bPPSimulatorBoxPanel2;
    private javax.swing.JButton forceStop;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JProgressBar jProgressBar1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JTextArea packingData;
    private javax.swing.JTable productTable;
    private javax.swing.JLabel progressLabel;
    // End of variables declaration//GEN-END:variables
}
