/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package Kalkulator;

/**
 *
 * @author User
 */
public class kalkulator extends javax.swing.JFrame {

    /**
     * Creates new form kalkulator
     */
    public kalkulator() {
        initComponents();
        setLocationRelativeTo(null);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">                          
    private void initComponents() {

        jButton21 = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        layarTF = new javax.swing.JTextField();
        jPanel2 = new javax.swing.JPanel();
        jButton1 = new javax.swing.JButton();
        divide = new javax.swing.JButton();
        clear = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        btn1 = new javax.swing.JButton();
        btn2 = new javax.swing.JButton();
        btn3 = new javax.swing.JButton();
        plus = new javax.swing.JButton();
        btn4 = new javax.swing.JButton();
        btn5 = new javax.swing.JButton();
        btn6 = new javax.swing.JButton();
        minus = new javax.swing.JButton();
        btn7 = new javax.swing.JButton();
        btn8 = new javax.swing.JButton();
        btn9 = new javax.swing.JButton();
        times = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        btn0 = new javax.swing.JButton();
        jButton7 = new javax.swing.JButton();
        equal = new javax.swing.JButton();

        jButton21.setText("jButton21");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(204, 204, 204));

        layarTF.setEditable(false);
        layarTF.setFont(new java.awt.Font("Segoe UI", 0, 36)); // NOI18N
        layarTF.setHorizontalAlignment(javax.swing.JTextField.RIGHT);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(layarTF, javax.swing.GroupLayout.DEFAULT_SIZE, 423, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(layarTF, javax.swing.GroupLayout.DEFAULT_SIZE, 88, Short.MAX_VALUE)
                .addContainerGap())
        );

        getContentPane().add(jPanel1, java.awt.BorderLayout.PAGE_START);

        jPanel2.setLayout(new java.awt.GridLayout(5, 4));

        jButton1.setBackground(new java.awt.Color(51, 51, 51));
        jButton1.setFont(new java.awt.Font("Segoe UI", 0, 22)); // NOI18N
        jButton1.setForeground(new java.awt.Color(255, 255, 0));
        jButton1.setText("+/-");
        jButton1.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jButton1.setMargin(new java.awt.Insets(30, 14, 30, 14));
        jPanel2.add(jButton1);

        divide.setBackground(new java.awt.Color(51, 51, 51));
        divide.setFont(new java.awt.Font("Segoe UI", 0, 22)); // NOI18N
        divide.setForeground(new java.awt.Color(255, 255, 0));
        divide.setText("÷");
        divide.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        divide.setMargin(new java.awt.Insets(30, 14, 30, 14));
        divide.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                divideActionPerformed(evt);
            }
        });
        jPanel2.add(divide);

        clear.setBackground(new java.awt.Color(51, 51, 51));
        clear.setFont(new java.awt.Font("Segoe UI", 0, 22)); // NOI18N
        clear.setForeground(new java.awt.Color(255, 0, 0));
        clear.setText("C");
        clear.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        clear.setMargin(new java.awt.Insets(30, 14, 30, 14));
        clear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                clearActionPerformed(evt);
            }
        });
        jPanel2.add(clear);

        jButton2.setBackground(new java.awt.Color(51, 51, 51));
        jButton2.setFont(new java.awt.Font("Segoe UI", 0, 22)); // NOI18N
        jButton2.setForeground(new java.awt.Color(255, 255, 0));
        jButton2.setText("←");
        jButton2.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jButton2.setMargin(new java.awt.Insets(30, 14, 30, 14));
        jPanel2.add(jButton2);

        btn1.setBackground(new java.awt.Color(51, 51, 51));
        btn1.setFont(new java.awt.Font("Segoe UI", 0, 22)); // NOI18N
        btn1.setForeground(new java.awt.Color(242, 242, 242));
        btn1.setText("1");
        btn1.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btn1.setMargin(new java.awt.Insets(30, 14, 30, 14));
        btn1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn1ActionPerformed(evt);
            }
        });
        jPanel2.add(btn1);

        btn2.setBackground(new java.awt.Color(51, 51, 51));
        btn2.setFont(new java.awt.Font("Segoe UI", 0, 22)); // NOI18N
        btn2.setForeground(new java.awt.Color(242, 242, 242));
        btn2.setText("2");
        btn2.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btn2.setMargin(new java.awt.Insets(30, 14, 30, 14));
        btn2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn2ActionPerformed(evt);
            }
        });
        jPanel2.add(btn2);

        btn3.setBackground(new java.awt.Color(51, 51, 51));
        btn3.setFont(new java.awt.Font("Segoe UI", 0, 22)); // NOI18N
        btn3.setForeground(new java.awt.Color(242, 242, 242));
        btn3.setText("3");
        btn3.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btn3.setMargin(new java.awt.Insets(30, 14, 30, 14));
        btn3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn3ActionPerformed(evt);
            }
        });
        jPanel2.add(btn3);

        plus.setBackground(new java.awt.Color(51, 51, 51));
        plus.setFont(new java.awt.Font("Segoe UI", 0, 22)); // NOI18N
        plus.setForeground(new java.awt.Color(255, 255, 0));
        plus.setText("+");
        plus.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        plus.setMargin(new java.awt.Insets(30, 14, 30, 14));
        plus.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                plusActionPerformed(evt);
            }
        });
        jPanel2.add(plus);

        btn4.setBackground(new java.awt.Color(51, 51, 51));
        btn4.setFont(new java.awt.Font("Segoe UI", 0, 22)); // NOI18N
        btn4.setForeground(new java.awt.Color(242, 242, 242));
        btn4.setText("4");
        btn4.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btn4.setMargin(new java.awt.Insets(30, 14, 30, 14));
        btn4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn4ActionPerformed(evt);
            }
        });
        jPanel2.add(btn4);

        btn5.setBackground(new java.awt.Color(51, 51, 51));
        btn5.setFont(new java.awt.Font("Segoe UI", 0, 22)); // NOI18N
        btn5.setForeground(new java.awt.Color(242, 242, 242));
        btn5.setText("5");
        btn5.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btn5.setMargin(new java.awt.Insets(30, 14, 30, 14));
        btn5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn5ActionPerformed(evt);
            }
        });
        jPanel2.add(btn5);

        btn6.setBackground(new java.awt.Color(51, 51, 51));
        btn6.setFont(new java.awt.Font("Segoe UI", 0, 22)); // NOI18N
        btn6.setForeground(new java.awt.Color(242, 242, 242));
        btn6.setText("6");
        btn6.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btn6.setMargin(new java.awt.Insets(30, 14, 30, 14));
        btn6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn6ActionPerformed(evt);
            }
        });
        jPanel2.add(btn6);

        minus.setBackground(new java.awt.Color(51, 51, 51));
        minus.setFont(new java.awt.Font("Segoe UI", 0, 22)); // NOI18N
        minus.setForeground(new java.awt.Color(255, 255, 0));
        minus.setText("-");
        minus.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        minus.setMargin(new java.awt.Insets(30, 14, 30, 14));
        minus.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                minusActionPerformed(evt);
            }
        });
        jPanel2.add(minus);

        btn7.setBackground(new java.awt.Color(51, 51, 51));
        btn7.setFont(new java.awt.Font("Segoe UI", 0, 22)); // NOI18N
        btn7.setForeground(new java.awt.Color(242, 242, 242));
        btn7.setText("7");
        btn7.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btn7.setMargin(new java.awt.Insets(30, 14, 30, 14));
        btn7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn7ActionPerformed(evt);
            }
        });
        jPanel2.add(btn7);

        btn8.setBackground(new java.awt.Color(51, 51, 51));
        btn8.setFont(new java.awt.Font("Segoe UI", 0, 22)); // NOI18N
        btn8.setForeground(new java.awt.Color(242, 242, 242));
        btn8.setText("8");
        btn8.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btn8.setMargin(new java.awt.Insets(30, 14, 30, 14));
        btn8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn8ActionPerformed(evt);
            }
        });
        jPanel2.add(btn8);

        btn9.setBackground(new java.awt.Color(51, 51, 51));
        btn9.setFont(new java.awt.Font("Segoe UI", 0, 22)); // NOI18N
        btn9.setForeground(new java.awt.Color(242, 242, 242));
        btn9.setText("9");
        btn9.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btn9.setMargin(new java.awt.Insets(30, 14, 30, 14));
        btn9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn9ActionPerformed(evt);
            }
        });
        jPanel2.add(btn9);

        times.setBackground(new java.awt.Color(51, 51, 51));
        times.setFont(new java.awt.Font("Segoe UI", 0, 22)); // NOI18N
        times.setForeground(new java.awt.Color(255, 255, 0));
        times.setText("x");
        times.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        times.setMargin(new java.awt.Insets(30, 14, 30, 14));
        times.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                timesActionPerformed(evt);
            }
        });
        jPanel2.add(times);

        jButton5.setBackground(new java.awt.Color(51, 51, 51));
        jButton5.setFont(new java.awt.Font("Segoe UI", 0, 22)); // NOI18N
        jButton5.setForeground(new java.awt.Color(242, 242, 242));
        jButton5.setText("%");
        jButton5.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jButton5.setMargin(new java.awt.Insets(30, 14, 30, 14));
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });
        jPanel2.add(jButton5);

        btn0.setBackground(new java.awt.Color(51, 51, 51));
        btn0.setFont(new java.awt.Font("Segoe UI", 0, 22)); // NOI18N
        btn0.setForeground(new java.awt.Color(242, 242, 242));
        btn0.setText("0");
        btn0.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btn0.setMargin(new java.awt.Insets(30, 14, 30, 14));
        btn0.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn0ActionPerformed(evt);
            }
        });
        jPanel2.add(btn0);

        jButton7.setBackground(new java.awt.Color(51, 51, 51));
        jButton7.setFont(new java.awt.Font("Segoe UI", 0, 22)); // NOI18N
        jButton7.setForeground(new java.awt.Color(242, 242, 242));
        jButton7.setText(".");
        jButton7.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jButton7.setMargin(new java.awt.Insets(30, 14, 30, 14));
        jPanel2.add(jButton7);

        equal.setBackground(new java.awt.Color(255, 204, 102));
        equal.setFont(new java.awt.Font("Segoe UI", 0, 22)); // NOI18N
        equal.setText("=");
        equal.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        equal.setMargin(new java.awt.Insets(30, 14, 30, 14));
        equal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                equalActionPerformed(evt);
            }
        });
        jPanel2.add(equal);

        getContentPane().add(jPanel2, java.awt.BorderLayout.CENTER);

        pack();
    }// </editor-fold>                        

    String operand="";
    int operandSatu;
    int hasil;
    int pilih;
    private void btn1ActionPerformed(java.awt.event.ActionEvent evt) {                                     
        operand += 1;
        layarTF.setText(operand);
    }                                    

    private void btn4ActionPerformed(java.awt.event.ActionEvent evt) {                                     
        operand += 4;
        layarTF.setText(operand);
    }                                    

    private void btn8ActionPerformed(java.awt.event.ActionEvent evt) {                                     
        operand += 8;
        layarTF.setText(operand);
    }                                    

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {                                         
        // TODO add your handling code here:
    }                                        

    private void btn2ActionPerformed(java.awt.event.ActionEvent evt) {                                     
        operand += 2;
        layarTF.setText(operand);
    }                                    

    private void btn3ActionPerformed(java.awt.event.ActionEvent evt) {                                     
        operand += 3;
        layarTF.setText(operand);
    }                                    

    private void btn5ActionPerformed(java.awt.event.ActionEvent evt) {                                     
        operand += 5;
        layarTF.setText(operand);
    }                                    

    private void btn6ActionPerformed(java.awt.event.ActionEvent evt) {                                     
        operand += 6;
        layarTF.setText(operand);
    }                                    

    private void btn7ActionPerformed(java.awt.event.ActionEvent evt) {                                     
        operand += 7;
        layarTF.setText(operand);
    }                                    

    private void btn9ActionPerformed(java.awt.event.ActionEvent evt) {                                     
        operand += 9;
        layarTF.setText(operand);
    }                                    

    private void btn0ActionPerformed(java.awt.event.ActionEvent evt) {                                     
        operand += 0;
        layarTF.setText(operand);
    }                                    

    private void equalActionPerformed(java.awt.event.ActionEvent evt) {                                      
        if(pilih == 1){
            hasil = operandSatu + Integer.parseInt(operand);
            layarTF.setText(""+hasil);
        } else if(pilih == 2){
            hasil = operandSatu - Integer.parseInt(operand);
            layarTF.setText(""+hasil);
        }
        else if(pilih == 3){
            hasil = operandSatu * Integer.parseInt(operand);
            layarTF.setText(""+hasil);
        }
        else if(pilih == 4){
            hasil = operandSatu / Integer.parseInt(operand);
            layarTF.setText(""+hasil);
        }
    }                                     

    private void plusActionPerformed(java.awt.event.ActionEvent evt) {                                     
        operandSatu = Integer.parseInt(operand);
        layarTF.setText("+");
        operand = "";
        pilih = 1;
    }                                    

    private void clearActionPerformed(java.awt.event.ActionEvent evt) {                                      
        hasil = 0;
        operand = "";
        operandSatu = 0;
        layarTF.setText("");
    }                                     

    private void minusActionPerformed(java.awt.event.ActionEvent evt) {                                      
        operandSatu = Integer.parseInt(operand);
        layarTF.setText("-");
        operand = "";
        pilih = 2;
    }                                     

    private void timesActionPerformed(java.awt.event.ActionEvent evt) {                                      
        // TODO add your handling code here:
        operandSatu = Integer.parseInt(operand);
        layarTF.setText("x");
        operand = "";
        pilih = 3;
    }                                     

    private void divideActionPerformed(java.awt.event.ActionEvent evt) {                                       
        // TODO add your handling code here:
        operandSatu = Integer.parseInt(operand);
        layarTF.setText("÷");
        operand = "";
        pilih = 4;
    }                                      

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
            java.util.logging.Logger.getLogger(kalkulator.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(kalkulator.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(kalkulator.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(kalkulator.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new kalkulator().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify                     
    private javax.swing.JButton btn0;
    private javax.swing.JButton btn1;
    private javax.swing.JButton btn2;
    private javax.swing.JButton btn3;
    private javax.swing.JButton btn4;
    private javax.swing.JButton btn5;
    private javax.swing.JButton btn6;
    private javax.swing.JButton btn7;
    private javax.swing.JButton btn8;
    private javax.swing.JButton btn9;
    private javax.swing.JButton clear;
    private javax.swing.JButton divide;
    private javax.swing.JButton equal;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton21;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JTextField layarTF;
    private javax.swing.JButton minus;
    private javax.swing.JButton plus;
    private javax.swing.JButton times;
    // End of variables declaration                   
}
