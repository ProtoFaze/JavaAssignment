/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package javaassignment.views;

import java.awt.Color;
import java.text.SimpleDateFormat;
import javaassignment.verify;
import javaassignment.models.Customer;
import javax.swing.JOptionPane;

/**
 *
 * @author damonng
 */
public class NewCustomer extends javax.swing.JPanel {
    String dateRegex = "dd/MM/yyyy";
    private BookingSummary dest;
    private final SimpleDateFormat dateformat = new SimpleDateFormat(dateRegex);
    private mainPage parentFrame;
    /**
     * Creates new form NewCustomer
     */
    public NewCustomer(mainPage parent, BookingSummary dest) {
        this.dest = dest;
        parentFrame = parent;
        initComponents();  
    }
    public NewCustomer() {
        initComponents();
        
    }
    public NewCustomer(mainPage parent) {
        parentFrame = parent;
        initComponents();  
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        grpGender = new javax.swing.ButtonGroup();
        pageTitle = new javax.swing.JLabel();
        email = new javax.swing.JPanel();
        lblEmail = new javax.swing.JLabel();
        txtEmail = new javax.swing.JTextField();
        errEmail = new javax.swing.JLabel();
        divider = new javax.swing.JSeparator();
        PNum = new javax.swing.JPanel();
        errPNum = new javax.swing.JLabel();
        lblPNum = new javax.swing.JLabel();
        txtPNum = new javax.swing.JTextField();
        name = new javax.swing.JPanel();
        lblName = new javax.swing.JLabel();
        errName = new javax.swing.JLabel();
        txtName = new javax.swing.JTextField();
        IC = new javax.swing.JPanel();
        lblIC = new javax.swing.JLabel();
        txtIC = new javax.swing.JTextField();
        errIC = new javax.swing.JLabel();
        gender = new javax.swing.JPanel();
        lblGender = new javax.swing.JLabel();
        radMale = new javax.swing.JRadioButton();
        radFemale = new javax.swing.JRadioButton();
        errGender = new javax.swing.JLabel();
        date = new javax.swing.JPanel();
        lblDOB = new javax.swing.JLabel();
        dateInfo = new javax.swing.JPanel();
        txtDate = new com.toedter.calendar.JDateChooser();
        errDate = new javax.swing.JLabel();
        btnRegister = new javax.swing.JButton();
        btnRedirect = new javax.swing.JButton();
        btnBack = new javax.swing.JButton();

        pageTitle.setFont(new java.awt.Font("Rockwell", 0, 24)); // NOI18N
        pageTitle.setText("Customer registration");
        pageTitle.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);

        lblEmail.setFont(new java.awt.Font("Rockwell", 0, 12)); // NOI18N
        lblEmail.setText("Email:");

        txtEmail.setFont(new java.awt.Font("Rockwell", 0, 12)); // NOI18N
        txtEmail.setForeground(new java.awt.Color(204, 204, 204));
        txtEmail.setText("example@mail.my");
        txtEmail.setMinimumSize(new java.awt.Dimension(64, 26));
        txtEmail.setPreferredSize(new java.awt.Dimension(64, 26));
        txtEmail.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txtEmailFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtEmailFocusLost(evt);
            }
        });
        txtEmail.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtEmailActionPerformed(evt);
            }
        });

        errEmail.setForeground(new java.awt.Color(255, 102, 51));

        javax.swing.GroupLayout emailLayout = new javax.swing.GroupLayout(email);
        email.setLayout(emailLayout);
        emailLayout.setHorizontalGroup(
            emailLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, emailLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblEmail)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(emailLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(errEmail, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(txtEmail, javax.swing.GroupLayout.DEFAULT_SIZE, 250, Short.MAX_VALUE))
                .addContainerGap())
        );
        emailLayout.setVerticalGroup(
            emailLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(emailLayout.createSequentialGroup()
                .addGroup(emailLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(emailLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(lblEmail))
                    .addComponent(txtEmail, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(errEmail, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        errPNum.setForeground(new java.awt.Color(255, 102, 51));

        lblPNum.setFont(new java.awt.Font("Rockwell", 0, 12)); // NOI18N
        lblPNum.setText("Contact Number:");

        txtPNum.setFont(new java.awt.Font("Rockwell", 0, 12)); // NOI18N
        txtPNum.setForeground(new java.awt.Color(204, 204, 204));
        txtPNum.setText("###########");
        txtPNum.setMinimumSize(new java.awt.Dimension(64, 26));
        txtPNum.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txtPNumFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtPNumFocusLost(evt);
            }
        });

        javax.swing.GroupLayout PNumLayout = new javax.swing.GroupLayout(PNum);
        PNum.setLayout(PNumLayout);
        PNumLayout.setHorizontalGroup(
            PNumLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, PNumLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblPNum)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 59, Short.MAX_VALUE)
                .addGroup(PNumLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(errPNum, javax.swing.GroupLayout.DEFAULT_SIZE, 250, Short.MAX_VALUE)
                    .addComponent(txtPNum, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        PNumLayout.setVerticalGroup(
            PNumLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PNumLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(PNumLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblPNum)
                    .addComponent(txtPNum, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(3, 3, 3)
                .addComponent(errPNum, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        lblName.setFont(new java.awt.Font("Rockwell", 0, 12)); // NOI18N
        lblName.setText("Name:");

        errName.setForeground(new java.awt.Color(255, 102, 51));

        txtName.setFont(new java.awt.Font("Rockwell", 0, 12)); // NOI18N
        txtName.setForeground(new java.awt.Color(204, 204, 204));
        txtName.setText("Your name");
        txtName.setMinimumSize(new java.awt.Dimension(64, 26));
        txtName.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txtNameFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtNameFocusLost(evt);
            }
        });

        javax.swing.GroupLayout nameLayout = new javax.swing.GroupLayout(name);
        name.setLayout(nameLayout);
        nameLayout.setHorizontalGroup(
            nameLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, nameLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblName)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(nameLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(errName, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(txtName, javax.swing.GroupLayout.DEFAULT_SIZE, 250, Short.MAX_VALUE))
                .addContainerGap())
        );
        nameLayout.setVerticalGroup(
            nameLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(nameLayout.createSequentialGroup()
                .addGroup(nameLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(nameLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(lblName))
                    .addComponent(txtName, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(errName, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        lblIC.setFont(new java.awt.Font("Rockwell", 0, 12)); // NOI18N
        lblIC.setText("IC:");

        txtIC.setFont(new java.awt.Font("Rockwell", 0, 12)); // NOI18N
        txtIC.setForeground(new java.awt.Color(204, 204, 204));
        txtIC.setText("############");
        txtIC.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txtICFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtICFocusLost(evt);
            }
        });

        errIC.setForeground(new java.awt.Color(255, 102, 51));

        javax.swing.GroupLayout ICLayout = new javax.swing.GroupLayout(IC);
        IC.setLayout(ICLayout);
        ICLayout.setHorizontalGroup(
            ICLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, ICLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblIC)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(ICLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(errIC, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(txtIC, javax.swing.GroupLayout.DEFAULT_SIZE, 250, Short.MAX_VALUE))
                .addContainerGap())
        );
        ICLayout.setVerticalGroup(
            ICLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(ICLayout.createSequentialGroup()
                .addGroup(ICLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(ICLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(lblIC))
                    .addComponent(txtIC, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(errIC, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        lblGender.setFont(new java.awt.Font("Rockwell", 0, 12)); // NOI18N
        lblGender.setText("Gender:");

        grpGender.add(radMale);
        radMale.setFont(new java.awt.Font("Rockwell", 0, 12)); // NOI18N
        radMale.setText("Male");

        grpGender.add(radFemale);
        radFemale.setFont(new java.awt.Font("Rockwell", 0, 12)); // NOI18N
        radFemale.setText("Female");

        errGender.setForeground(new java.awt.Color(255, 102, 51));

        javax.swing.GroupLayout genderLayout = new javax.swing.GroupLayout(gender);
        gender.setLayout(genderLayout);
        genderLayout.setHorizontalGroup(
            genderLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, genderLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblGender)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(genderLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(errGender, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(genderLayout.createSequentialGroup()
                        .addComponent(radMale, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(144, 144, 144)
                        .addComponent(radFemale)))
                .addContainerGap())
        );
        genderLayout.setVerticalGroup(
            genderLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(genderLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(genderLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblGender)
                    .addComponent(radFemale)
                    .addComponent(radMale))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(errGender)
                .addContainerGap())
        );

        lblDOB.setFont(new java.awt.Font("Rockwell", 0, 12)); // NOI18N
        lblDOB.setText("DOB:");

        javax.swing.GroupLayout dateInfoLayout = new javax.swing.GroupLayout(dateInfo);
        dateInfo.setLayout(dateInfoLayout);
        dateInfoLayout.setHorizontalGroup(
            dateInfoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, dateInfoLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(txtDate, javax.swing.GroupLayout.DEFAULT_SIZE, 252, Short.MAX_VALUE)
                .addContainerGap())
        );
        dateInfoLayout.setVerticalGroup(
            dateInfoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(txtDate, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        errDate.setForeground(new java.awt.Color(255, 102, 51));

        javax.swing.GroupLayout dateLayout = new javax.swing.GroupLayout(date);
        date.setLayout(dateLayout);
        dateLayout.setHorizontalGroup(
            dateLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(dateLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblDOB)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 124, Short.MAX_VALUE)
                .addGroup(dateLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(dateInfo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(dateLayout.createSequentialGroup()
                        .addGap(6, 6, 6)
                        .addComponent(errDate, javax.swing.GroupLayout.PREFERRED_SIZE, 252, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(0, 0, 0))
        );
        dateLayout.setVerticalGroup(
            dateLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(dateLayout.createSequentialGroup()
                .addGroup(dateLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(dateLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(lblDOB))
                    .addComponent(dateInfo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(errDate, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        btnRegister.setFont(new java.awt.Font("Rockwell", 0, 12)); // NOI18N
        btnRegister.setText("Register");
        btnRegister.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnRegister.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btnRegister.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRegisterActionPerformed(evt);
            }
        });

        btnRedirect.setFont(new java.awt.Font("Rockwell", 0, 12)); // NOI18N
        btnRedirect.setText("Customer List");
        btnRedirect.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRedirectActionPerformed(evt);
            }
        });

        btnBack.setFont(new java.awt.Font("Rockwell", 0, 12)); // NOI18N
        btnBack.setText("Back");
        btnBack.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnBack.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btnBack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBackActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(divider, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(IC, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(PNum, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(name, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(date, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(email, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(pageTitle)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(gender, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(btnRedirect)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnBack)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnRegister)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(pageTitle, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(divider, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(IC, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(PNum, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(name, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(date, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(email, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(gender, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(btnRegister)
                    .addComponent(btnRedirect)
                    .addComponent(btnBack))
                .addContainerGap())
        );
    }// </editor-fold>//GEN-END:initComponents

    private void txtEmailFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtEmailFocusGained
        // TODO add your handling code here:
        if (txtEmail.getText().equals("example@mail.my")){
            txtEmail.setText("");
            txtEmail.setForeground(new Color (69,69,69));
        }
    }//GEN-LAST:event_txtEmailFocusGained

    private void txtEmailFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtEmailFocusLost
        // TODO add your handling code here:
        if (txtEmail.getText().equals("")){
            txtEmail.setText("example@mail.my");
            txtEmail.setForeground(new Color (204,204,204));
        }
    }//GEN-LAST:event_txtEmailFocusLost

    private void txtEmailActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtEmailActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtEmailActionPerformed

    private void txtNameFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtNameFocusGained
        // TODO add your handling code here:
        if (txtName.getText().equals("Your name")){
            txtName.setText("");
            txtName.setForeground(new Color (69,69,69));
        }
    }//GEN-LAST:event_txtNameFocusGained

    private void txtNameFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtNameFocusLost
        // TODO add your handling code here:
        if (txtName.getText().equals("")){
            txtName.setText("Your name");
            txtName.setForeground(new Color (204,204,204));
        }
    }//GEN-LAST:event_txtNameFocusLost

    private void txtICFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtICFocusGained
        // TODO add your handling code here:
        if (txtIC.getText().equals("############")){
            txtIC.setText("");
            txtIC.setForeground(new Color (69,69,69));
        }
    }//GEN-LAST:event_txtICFocusGained

    private void txtICFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtICFocusLost
        // TODO add your handling code here:
        if (txtIC.getText().equals("")){
            txtIC.setText("############");
            txtIC.setForeground(new Color (204,204,204));
        }
    }//GEN-LAST:event_txtICFocusLost

    private void txtPNumFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtPNumFocusGained
        if(txtPNum.getText().equals("###########")){
            txtPNum.setText("");
            txtPNum.setForeground(new Color (69,69,69));
        }
    }//GEN-LAST:event_txtPNumFocusGained

    private void txtPNumFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtPNumFocusLost
        if(txtPNum.getText().equals("")){
            txtPNum.setText("###########");
            txtPNum.setForeground(new Color (204,204,204));
        }
    }//GEN-LAST:event_txtPNumFocusLost

    private void btnRegisterActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegisterActionPerformed
        //declare variables
        String CustomerName, dob = null,IC,PNum,mail,
        validName,validIC,validEmail,validPNum,validDate,validGender;
        char gndr = 0;

        //assign values
        CustomerName=txtName.getText();
        if (txtDate.getDate()!=null){
            dob=dateformat.format(txtDate.getDate());
            validDate = verify.validateDate(dob,false);
        }else{
            validDate = "Please specify birthDate";
        }
        IC=txtIC.getText();
        PNum = txtPNum.getText();
        mail = txtEmail.getText();
        if (grpGender.getSelection() != null){
            if(radMale.isSelected())
            gndr=radMale.getText().charAt(0);
            else if (radFemale.isSelected())
            gndr=radFemale.getText().charAt(0);
            //run validation
            validGender = "";
        }else{
            validGender = "Gender not selected.";
        }
        validName = verify.validateString(CustomerName);
        validIC = verify.validateNum(IC);
        validEmail = verify.validateString(mail);
        validPNum = verify.validateNum(PNum);
        
        if(validName == null && validIC == null && validEmail == null && validPNum == null && validDate == null && "".equals(validGender)){
            Customer applicant = new Customer(CustomerName,mail,gndr,dob,IC,PNum);
            BookingSummary.setCustomerID(applicant.getID());
            BookingSummary.setCustomerName(applicant.getName());
            String res=applicant.writeToFile();
            if("Success".equals(res)){
                JOptionPane.showMessageDialog(null,"Registration completed.","Success",JOptionPane.INFORMATION_MESSAGE);

            }else{
                JOptionPane.showMessageDialog(null, "Could not write into file due to "+res,"Error",JOptionPane.ERROR_MESSAGE);
            }
            parentFrame.changePanel("bookingSummaryPanel"); 
            errName.setText("");
            errIC.setText("");
            errEmail.setText("");
            errPNum.setText("");
            errDate.setText("");
            errGender.setText("");
        }else{
            errName.setText(validName);
            errIC.setText(validIC);
            errEmail.setText(validEmail);
            errPNum.setText(validPNum);
            errDate.setText(validDate);
            errGender.setText(validGender);
        }

    }//GEN-LAST:event_btnRegisterActionPerformed

    private void btnRedirectActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRedirectActionPerformed
        parentFrame.changePanel("searchCustomerPanel");
    }//GEN-LAST:event_btnRedirectActionPerformed

    private void btnBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBackActionPerformed
        parentFrame.changePanel("availableRoomsPanel");
    }//GEN-LAST:event_btnBackActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel IC;
    private javax.swing.JPanel PNum;
    private javax.swing.JButton btnBack;
    private javax.swing.JButton btnRedirect;
    private javax.swing.JButton btnRegister;
    private javax.swing.JPanel date;
    private javax.swing.JPanel dateInfo;
    private javax.swing.JSeparator divider;
    private javax.swing.JPanel email;
    private javax.swing.JLabel errDate;
    private javax.swing.JLabel errEmail;
    private javax.swing.JLabel errGender;
    private javax.swing.JLabel errIC;
    private javax.swing.JLabel errName;
    private javax.swing.JLabel errPNum;
    private javax.swing.JPanel gender;
    private javax.swing.ButtonGroup grpGender;
    private javax.swing.JLabel lblDOB;
    private javax.swing.JLabel lblEmail;
    private javax.swing.JLabel lblGender;
    private javax.swing.JLabel lblIC;
    private javax.swing.JLabel lblName;
    private javax.swing.JLabel lblPNum;
    private javax.swing.JPanel name;
    private javax.swing.JLabel pageTitle;
    private javax.swing.JRadioButton radFemale;
    private javax.swing.JRadioButton radMale;
    private com.toedter.calendar.JDateChooser txtDate;
    private javax.swing.JTextField txtEmail;
    private javax.swing.JTextField txtIC;
    private javax.swing.JTextField txtName;
    private javax.swing.JTextField txtPNum;
    // End of variables declaration//GEN-END:variables
}
