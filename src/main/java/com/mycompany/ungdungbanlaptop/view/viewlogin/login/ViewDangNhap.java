/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package com.mycompany.ungdungbanlaptop.view.viewlogin.login;

import com.mycompany.ungdungbanlaptop.model.response.NhanVienResponse;
import com.mycompany.ungdungbanlaptop.service.LoginService;
import com.mycompany.ungdungbanlaptop.service.impl.LoginServiceImpl;
import javax.swing.ButtonGroup;
import javax.swing.JOptionPane;

/**
 *
 * @author vinhnv
 */
public class ViewDangNhap extends javax.swing.JFrame {

    /**
     * Creates new form ViewDangNhap
     */
    private LoginService loginService = new LoginServiceImpl();
    private ButtonGroup buttonGroup = new ButtonGroup();

    public ViewDangNhap() {
        initComponents();
        this.setLocationRelativeTo(null);
        radio();
    }

    private void radio() {
        buttonGroup.add(rd_nu);
        buttonGroup.add(rd_nam);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        btn_dangKy = new com.mycompany.ungdungbanlaptop.view.viewlogin.swing.Button();
        txt_date = new com.mycompany.ungdungbanlaptop.view.viewlogin.swing.TextField();
        txt_diaChi = new com.mycompany.ungdungbanlaptop.view.viewlogin.swing.TextField();
        txt_email = new com.mycompany.ungdungbanlaptop.view.viewlogin.swing.TextField();
        txt_sdt = new com.mycompany.ungdungbanlaptop.view.viewlogin.swing.TextField();
        txt_password = new com.mycompany.ungdungbanlaptop.view.viewlogin.swing.Password();
        txt_errorHoten = new javax.swing.JLabel();
        txt_errorDate = new javax.swing.JLabel();
        txt_errorGioiTinh = new javax.swing.JLabel();
        txt_errorDiaChi = new javax.swing.JLabel();
        txt_errorSDT = new javax.swing.JLabel();
        txt_errorEmail = new javax.swing.JLabel();
        txt_errorPassword = new javax.swing.JLabel();
        txt_hoTen = new com.mycompany.ungdungbanlaptop.view.viewlogin.swing.TextField();
        rd_nam = new javax.swing.JRadioButton();
        rd_nu = new javax.swing.JRadioButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        jLabel1.setBackground(new java.awt.Color(242, 242, 242));
        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 20)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("SIGN UP");

        btn_dangKy.setBackground(new java.awt.Color(0, 0, 255));
        btn_dangKy.setForeground(new java.awt.Color(255, 255, 255));
        btn_dangKy.setText("SING UP");
        btn_dangKy.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        btn_dangKy.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_dangKyActionPerformed(evt);
            }
        });

        txt_date.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        txt_date.setHint("DATE");

        txt_diaChi.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        txt_diaChi.setHint("ADDRESS");

        txt_email.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        txt_email.setHint("EMAIL");

        txt_sdt.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        txt_sdt.setHint("PHONE NUMBER");

        txt_password.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        txt_password.setHint("PASSWORD");

        txt_errorHoten.setForeground(new java.awt.Color(255, 0, 0));

        txt_errorDate.setForeground(new java.awt.Color(255, 0, 0));

        txt_errorGioiTinh.setForeground(new java.awt.Color(255, 0, 0));

        txt_errorDiaChi.setForeground(new java.awt.Color(255, 0, 0));

        txt_errorSDT.setForeground(new java.awt.Color(255, 0, 0));

        txt_errorEmail.setForeground(new java.awt.Color(255, 0, 0));

        txt_errorPassword.setForeground(new java.awt.Color(255, 0, 0));

        txt_hoTen.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        txt_hoTen.setHint("FULL NAME");

        rd_nam.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        rd_nam.setText("Nam");

        rd_nu.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        rd_nu.setText("Nữ");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(52, 52, 52)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(rd_nam)
                        .addGap(47, 47, 47)
                        .addComponent(rd_nu))
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(txt_hoTen, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(txt_errorPassword, javax.swing.GroupLayout.PREFERRED_SIZE, 212, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(txt_errorEmail, javax.swing.GroupLayout.PREFERRED_SIZE, 212, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(txt_errorSDT, javax.swing.GroupLayout.PREFERRED_SIZE, 212, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(txt_errorDiaChi, javax.swing.GroupLayout.PREFERRED_SIZE, 212, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(txt_errorGioiTinh, javax.swing.GroupLayout.PREFERRED_SIZE, 212, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(txt_errorDate, javax.swing.GroupLayout.PREFERRED_SIZE, 212, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(txt_email, javax.swing.GroupLayout.DEFAULT_SIZE, 223, Short.MAX_VALUE)
                        .addComponent(txt_diaChi, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btn_dangKy, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(txt_date, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(txt_sdt, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(txt_password, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(txt_errorHoten, javax.swing.GroupLayout.PREFERRED_SIZE, 212, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(56, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(38, 38, 38)
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addComponent(txt_hoTen, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txt_errorHoten, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txt_date, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(6, 6, 6)
                .addComponent(txt_errorDate, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(10, 10, 10)
                .addComponent(txt_diaChi, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txt_errorDiaChi, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txt_sdt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(6, 6, 6)
                .addComponent(txt_errorSDT, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txt_email, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txt_errorEmail, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txt_password, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(2, 2, 2)
                .addComponent(txt_errorPassword, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(rd_nam)
                    .addComponent(rd_nu))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(txt_errorGioiTinh, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btn_dangKy, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btn_dangKyActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_dangKyActionPerformed
        // TODO add your handling code here:
        String hoten = txt_hoTen.getText().trim();
        String ngaySinh = txt_date.getText().trim();
        String sdt = txt_sdt.getText().trim();
        String password = txt_password.getText().trim();
        String diaChi = txt_diaChi.getText().trim();
        String gioiTinh = "";
        String email = txt_email.getText().trim();
        if (!rd_nam.isSelected() && !rd_nu.isSelected()) {
            txt_errorGioiTinh.setText("Không để trống giới tính");
        } else {
            txt_errorGioiTinh.setText("");
        }
        if(rd_nam.isSelected()){
            gioiTinh = "Nam";
        }else{
            gioiTinh = "Nữ";
        }
        NhanVienResponse response = new NhanVienResponse(hoten, gioiTinh, ngaySinh, sdt, email, password, diaChi);
        int ktra = loginService.dangKy(response);
        if (hoten.isEmpty()) {
            txt_errorHoten.setText("Không để trống Họ tên");
        } else {
            txt_errorHoten.setText("");
        }
        if (ngaySinh.isEmpty()) {
            txt_errorDate.setText("Không để trống Date");
        } else if (ktra == 4) {
            txt_errorDate.setText("Date sai định dạng \n VD : 2000/01/21");
        } else {
            txt_errorDate.setText("");
        }
        if (sdt.isEmpty()) {
            txt_errorSDT.setText("Không để trống SDT");
        } else if (ktra == 3) {
            txt_errorSDT.setText("SDT sai định dạng");
        } else {
            txt_errorSDT.setText("");
        }
        if (email.isEmpty()) {
            txt_errorEmail.setText("Không để trống email");
        } else if (ktra == 2) {
            txt_errorEmail.setText("Email sai định dạng ");
        } else if (ktra == 5) {
            txt_errorEmail.setText("Email đã tồn tại");
        } else {
            txt_errorEmail.setText("");
        }
        if (password.isEmpty()) {
            txt_errorPassword.setText("Không để trống password");
        } else if (ktra == 6) {
            txt_errorPassword.setText("Password phải dài hơn hoặc bằng 8 kí tự");
        } else {
            txt_errorPassword.setText("");
        }       
        if (diaChi.isEmpty()) {
            txt_errorDiaChi.setText("Không để trống địa chỉ");
        } else {
            txt_errorDiaChi.setText("");
        }

//        JOptionPane.showMessageDialog(this, ktra);
    }//GEN-LAST:event_btn_dangKyActionPerformed

    /**
     * @param args the command line arguments
     */
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
            java.util.logging.Logger.getLogger(ViewDangNhap.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ViewDangNhap.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ViewDangNhap.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ViewDangNhap.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ViewDangNhap().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private com.mycompany.ungdungbanlaptop.view.viewlogin.swing.Button btn_dangKy;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JRadioButton rd_nam;
    private javax.swing.JRadioButton rd_nu;
    private com.mycompany.ungdungbanlaptop.view.viewlogin.swing.TextField txt_date;
    private com.mycompany.ungdungbanlaptop.view.viewlogin.swing.TextField txt_diaChi;
    private com.mycompany.ungdungbanlaptop.view.viewlogin.swing.TextField txt_email;
    private javax.swing.JLabel txt_errorDate;
    private javax.swing.JLabel txt_errorDiaChi;
    private javax.swing.JLabel txt_errorEmail;
    private javax.swing.JLabel txt_errorGioiTinh;
    private javax.swing.JLabel txt_errorHoten;
    private javax.swing.JLabel txt_errorPassword;
    private javax.swing.JLabel txt_errorSDT;
    private com.mycompany.ungdungbanlaptop.view.viewlogin.swing.TextField txt_hoTen;
    private com.mycompany.ungdungbanlaptop.view.viewlogin.swing.Password txt_password;
    private com.mycompany.ungdungbanlaptop.view.viewlogin.swing.TextField txt_sdt;
    // End of variables declaration//GEN-END:variables

}
