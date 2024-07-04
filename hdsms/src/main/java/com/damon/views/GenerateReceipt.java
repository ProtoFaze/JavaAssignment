/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package com.damon.views;

import java.awt.Graphics2D;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import com.damon.models.Booking;
import javax.imageio.ImageIO;
import javax.swing.JOptionPane;

/**
 *
 * @author damonng
 */
public class GenerateReceipt extends javax.swing.JFrame {

    /**
     * Creates new form GenerateReceipt
     * @param dataSource
     */
    public GenerateReceipt(BookingSummary dataSource) {
        this.setLocationRelativeTo(dataSource);
        initComponents();
        RoomNumber.setText(dataSource.getRoomId());
        FloorNumber.setText(dataSource.getFloorNum());
        type.setText(dataSource.getRoomType());
        roomPrice.setText(dataSource.getRoomPrice());
        customerName.setText(dataSource.getCustomerName());
        startDate.setText(dataSource.getStartDate());
        endDate.setText(dataSource.getEndDate());
        daysOfStay.setText(dataSource.getDaysDiff());
        tourismTax.setText(Double.toString(Booking.TOURISMTAX)+" per day");
        serviceTax.setText(Double.toString(Booking.SERVICETAX));
        total.setText(dataSource.getTotal());
    }
    public GenerateReceipt(EditBooking dataSource) {
        this.setLocationRelativeTo(dataSource);
        initComponents();
        RoomNumber.setText(dataSource.getRoomId());
        FloorNumber.setText(dataSource.getFloorNum());
        type.setText(dataSource.getRoomType());
        roomPrice.setText(dataSource.getRoomPrice());
        customerName.setText(dataSource.getCustomerName());
        startDate.setText(dataSource.getStartDate());
        endDate.setText(dataSource.getEndDate());
        daysOfStay.setText(dataSource.getDaysDiff());
        tourismTax.setText(Double.toString(Booking.TOURISMTAX)+" per day");
        serviceTax.setText(Double.toString(Booking.SERVICETAX));
        total.setText(dataSource.getTotal());
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        pageTitle = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        lblRoomID = new javax.swing.JLabel();
        RoomNumber = new javax.swing.JLabel();
        lblType = new javax.swing.JLabel();
        type = new javax.swing.JLabel();
        lblRoomPrice = new javax.swing.JLabel();
        roomPrice = new javax.swing.JLabel();
        lblName = new javax.swing.JLabel();
        customerName = new javax.swing.JLabel();
        lblDateStart = new javax.swing.JLabel();
        startDate = new javax.swing.JLabel();
        lblDateEnd = new javax.swing.JLabel();
        endDate = new javax.swing.JLabel();
        lblDOS = new javax.swing.JLabel();
        daysOfStay = new javax.swing.JLabel();
        lblTourism = new javax.swing.JLabel();
        tourismTax = new javax.swing.JLabel();
        lblService = new javax.swing.JLabel();
        serviceTax = new javax.swing.JLabel();
        lblTotal = new javax.swing.JLabel();
        total = new javax.swing.JLabel();
        btnPrint = new javax.swing.JButton();
        lblFloorID = new javax.swing.JLabel();
        FloorNumber = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        pageTitle.setFont(new java.awt.Font("Rockwell", 0, 24)); // NOI18N
        pageTitle.setText("Receipt");
        pageTitle.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);

        lblRoomID.setFont(new java.awt.Font("Rockwell", 0, 12)); // NOI18N
        lblRoomID.setText("Room number:");

        RoomNumber.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);

        lblType.setFont(new java.awt.Font("Rockwell", 0, 12)); // NOI18N
        lblType.setText("Type:");

        type.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);

        lblRoomPrice.setText("Room Price:");

        roomPrice.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);

        lblName.setFont(new java.awt.Font("Rockwell", 0, 12)); // NOI18N
        lblName.setText("Customer Name:");

        customerName.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);

        lblDateStart.setText("Start Date:");

        startDate.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);

        lblDateEnd.setText("End Date:");

        endDate.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);

        lblDOS.setText("Days Of Stay");

        daysOfStay.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);

        lblTourism.setText("Tourism Tax");

        tourismTax.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);

        lblService.setText("Service Tax");

        serviceTax.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);

        lblTotal.setFont(new java.awt.Font("Rockwell", 0, 12)); // NOI18N
        lblTotal.setText("Total:");

        total.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);

        btnPrint.setText("Print");
        btnPrint.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPrintActionPerformed(evt);
            }
        });

        lblFloorID.setFont(new java.awt.Font("Rockwell", 0, 12)); // NOI18N
        lblFloorID.setText("Floor number:");

        FloorNumber.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(pageTitle)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addComponent(jSeparator1, javax.swing.GroupLayout.Alignment.TRAILING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblFloorID)
                    .addComponent(lblRoomID))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(RoomNumber, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(FloorNumber, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
            .addGroup(layout.createSequentialGroup()
                .addComponent(lblName)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 205, Short.MAX_VALUE)
                .addComponent(customerName, javax.swing.GroupLayout.DEFAULT_SIZE, 0, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addComponent(lblTourism)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(tourismTax, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addComponent(lblDateEnd)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(endDate, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addComponent(lblDOS)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(daysOfStay, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addComponent(lblType)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(type, javax.swing.GroupLayout.DEFAULT_SIZE, 0, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addComponent(lblService)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(serviceTax, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addComponent(lblTotal)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(total, javax.swing.GroupLayout.DEFAULT_SIZE, 1, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblDateStart)
                    .addComponent(lblRoomPrice))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(startDate, javax.swing.GroupLayout.DEFAULT_SIZE, 229, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(roomPrice, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(btnPrint))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(pageTitle, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lblRoomID))
                    .addComponent(RoomNumber, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(4, 4, 4)
                        .addComponent(lblFloorID))
                    .addComponent(FloorNumber, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(type, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(lblType, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(19, 19, 19)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(roomPrice, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(lblRoomPrice, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(customerName, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(lblName, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(startDate, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(lblDateStart, javax.swing.GroupLayout.DEFAULT_SIZE, 23, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(endDate, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(lblDateEnd, javax.swing.GroupLayout.DEFAULT_SIZE, 23, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(lblDOS, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(daysOfStay, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblTourism)
                    .addComponent(tourismTax, javax.swing.GroupLayout.PREFERRED_SIZE, 17, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(25, 25, 25)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(lblService, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(serviceTax, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblTotal)
                    .addComponent(total, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnPrint))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnPrintActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPrintActionPerformed
        // Create a BufferedImage to store the screenshot
        BufferedImage screenshot = new BufferedImage(this.getWidth(), this.getHeight(), BufferedImage.TYPE_INT_RGB);

        // Create a Graphics instance from the BufferedImage and the content pane
        Graphics2D g2d = screenshot.createGraphics();
        this.getContentPane().printAll(g2d);

        // Save the screenshot to a file
        String userHome = System.getProperty("user.home");
        String desktopDir = userHome + "/Desktop/Receipt.png";
        File output = new File(desktopDir);
        try {
            ImageIO.write(screenshot, "png", output);
        } catch (IOException ex) {
            Logger.getLogger(GenerateReceipt.class.getName()).log(Level.SEVERE, null, ex);
        }
        // Clean up the Graphics object
        g2d.dispose();
        JOptionPane.showMessageDialog(this, "Picture saved to desktop");
    }//GEN-LAST:event_btnPrintActionPerformed

    /**
     * @param args the command line arguments
     */
//    public static void main(String args[]) {
//        /* Set the Nimbus look and feel */
//        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
//        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
//         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
//         */
//        try {
//            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
//                if ("Nimbus".equals(info.getName())) {
//                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
//                    break;
//                }
//            }
//        } catch (ClassNotFoundException ex) {
//            java.util.logging.Logger.getLogger(GenerateReceipt.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (InstantiationException ex) {
//            java.util.logging.Logger.getLogger(GenerateReceipt.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (IllegalAccessException ex) {
//            java.util.logging.Logger.getLogger(GenerateReceipt.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
//            java.util.logging.Logger.getLogger(GenerateReceipt.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        }
//        //</editor-fold>
//
//        /* Create and display the form */
//        java.awt.EventQueue.invokeLater(new Runnable() {
//            public void run() {
//                new GenerateReceipt().setVisible(true);
//            }
//        });
//    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel FloorNumber;
    private javax.swing.JLabel RoomNumber;
    private javax.swing.JButton btnPrint;
    private javax.swing.JLabel customerName;
    private javax.swing.JLabel daysOfStay;
    private javax.swing.JLabel endDate;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JLabel lblDOS;
    private javax.swing.JLabel lblDateEnd;
    private javax.swing.JLabel lblDateStart;
    private javax.swing.JLabel lblFloorID;
    private javax.swing.JLabel lblName;
    private javax.swing.JLabel lblRoomID;
    private javax.swing.JLabel lblRoomPrice;
    private javax.swing.JLabel lblService;
    private javax.swing.JLabel lblTotal;
    private javax.swing.JLabel lblTourism;
    private javax.swing.JLabel lblType;
    private javax.swing.JLabel pageTitle;
    private javax.swing.JLabel roomPrice;
    private javax.swing.JLabel serviceTax;
    private javax.swing.JLabel startDate;
    private javax.swing.JLabel total;
    private javax.swing.JLabel tourismTax;
    private javax.swing.JLabel type;
    // End of variables declaration//GEN-END:variables
}