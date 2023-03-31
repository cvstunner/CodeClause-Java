/**
 @author cvstunner
**/

package com.sc;

import javax.swing.UIManager;
import com.formdev.flatlaf.FlatDarkLaf;
import java.lang.Math;
import com.algorithm.Dijkstra;
import java.awt.event.KeyEvent;
import java.awt.geom.RoundRectangle2D;

public class Main extends javax.swing.JFrame {

    public Main() {
        initComponents();
        setShape(new RoundRectangle2D.Double(0, 0, getWidth(), getHeight(), 40, 40));
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel6 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jPanel7 = new javax.swing.JPanel();
        btn_close = new javax.swing.JButton();
        jPanel5 = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        display = new javax.swing.JTextField();
        jPanel2 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        sqrtBtn = new javax.swing.JButton();
        powBtn = new javax.swing.JButton();
        piBtn = new javax.swing.JButton();
        eBtn = new javax.swing.JButton();
        logBtn = new javax.swing.JButton();
        lnBtn = new javax.swing.JButton();
        sinBtn = new javax.swing.JButton();
        asinBtn = new javax.swing.JButton();
        cosBtn = new javax.swing.JButton();
        acosBtn = new javax.swing.JButton();
        tanBtn = new javax.swing.JButton();
        atanBtn = new javax.swing.JButton();
        jPanel4 = new javax.swing.JPanel();
        Btn7 = new javax.swing.JButton();
        Btn8 = new javax.swing.JButton();
        Btn9 = new javax.swing.JButton();
        mulBtn = new javax.swing.JButton();
        divBtn = new javax.swing.JButton();
        Btn4 = new javax.swing.JButton();
        Btn5 = new javax.swing.JButton();
        Btn6 = new javax.swing.JButton();
        subBtn = new javax.swing.JButton();
        sumBtn = new javax.swing.JButton();
        Btn1 = new javax.swing.JButton();
        Btn2 = new javax.swing.JButton();
        Btn3 = new javax.swing.JButton();
        openBracBtn = new javax.swing.JButton();
        closeBracBtn = new javax.swing.JButton();
        Btn0 = new javax.swing.JButton();
        dotBtn = new javax.swing.JButton();
        equalBtn = new javax.swing.JButton();
        delBtn = new javax.swing.JButton();
        ACBtn = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Scientific Calculator");
        setBackground(new java.awt.Color(35, 37, 45));
        setFont(new java.awt.Font("JetBrains Mono", 0, 18)); // NOI18N
        setMinimumSize(new java.awt.Dimension(600, 550));
        setUndecorated(true);
        setResizable(false);
        setSize(new java.awt.Dimension(600, 550));
        getContentPane().setLayout(new javax.swing.BoxLayout(getContentPane(), javax.swing.BoxLayout.Y_AXIS));

        jPanel6.setBackground(new java.awt.Color(30, 31, 38));
        jPanel6.setMaximumSize(new java.awt.Dimension(600, 50));
        jPanel6.setMinimumSize(new java.awt.Dimension(600, 50));
        jPanel6.setPreferredSize(new java.awt.Dimension(600, 50));
        jPanel6.setRequestFocusEnabled(false);
        jPanel6.setLayout(new javax.swing.BoxLayout(jPanel6, javax.swing.BoxLayout.X_AXIS));

        jLabel1.setBackground(new java.awt.Color(30, 31, 38));
        jLabel1.setFont(new java.awt.Font("Verdana", 0, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(154, 171, 179));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Calculator");
        jLabel1.setToolTipText("");
        jLabel1.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jLabel1.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jLabel1.setMaximumSize(new java.awt.Dimension(125, 50));
        jLabel1.setMinimumSize(new java.awt.Dimension(125, 50));
        jLabel1.setPreferredSize(new java.awt.Dimension(125, 50));
        jLabel1.setRequestFocusEnabled(false);
        jPanel6.add(jLabel1);

        jPanel7.setBackground(new java.awt.Color(30, 31, 38));
        jPanel7.setForeground(new java.awt.Color(30, 31, 38));
        jPanel7.setLayout(new java.awt.FlowLayout(java.awt.FlowLayout.RIGHT));

        btn_close.setBackground(new java.awt.Color(30, 31, 38));
        btn_close.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        btn_close.setForeground(new java.awt.Color(154, 171, 179));
        btn_close.setText("X");
        btn_close.setBorder(null);
        btn_close.setBorderPainted(false);
        btn_close.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btn_close.setFocusable(false);
        btn_close.setMaximumSize(new java.awt.Dimension(40, 40));
        btn_close.setMinimumSize(new java.awt.Dimension(40, 40));
        btn_close.setPreferredSize(new java.awt.Dimension(40, 40));
        btn_close.setRequestFocusEnabled(false);
        btn_close.setRolloverEnabled(false);
        btn_close.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btn_closeMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btn_closeMouseExited(evt);
            }
        });
        btn_close.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_closeActionPerformed(evt);
            }
        });
        jPanel7.add(btn_close);

        jPanel6.add(jPanel7);

        jPanel1.setBorder(new javax.swing.border.EmptyBorder(10, 10, 0, 10));

        getContentPane().add(jPanel6);

        jPanel5.setBackground(new java.awt.Color(34, 37, 45));
        jPanel5.setMaximumSize(new java.awt.Dimension(600, 500));
        jPanel5.setMinimumSize(new java.awt.Dimension(600, 500));
        jPanel5.setPreferredSize(new java.awt.Dimension(600, 500));
        jPanel5.setRequestFocusEnabled(false);
        jPanel5.setLayout(new javax.swing.BoxLayout(jPanel5, javax.swing.BoxLayout.Y_AXIS));

        jPanel1.setBackground(new java.awt.Color(30, 31, 38));
        jPanel1.setMaximumSize(new java.awt.Dimension(600, 125));
        jPanel1.setMinimumSize(new java.awt.Dimension(600, 125));
        jPanel1.setPreferredSize(new java.awt.Dimension(600, 125));
        jPanel1.setLayout(new java.awt.GridLayout(1, 0));

        display.setBackground(new java.awt.Color(30, 31, 38));
        display.setFont(new java.awt.Font("Yu Gothic UI Semibold", 0, 40)); // NOI18N
        display.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        display.setText("0");
        display.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 10, 1, 20, new java.awt.Color(30, 31, 38)));
        display.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        display.setDisabledTextColor(new java.awt.Color(187, 187, 187));
        display.setFocusable(false);
        display.setHighlighter(null);
        jPanel1.add(display);

        jPanel1.setBorder(new javax.swing.border.EmptyBorder(10, 10, 0, 10));

        jPanel5.add(jPanel1);

        jPanel2.setBackground(new java.awt.Color(35, 37, 45));
        jPanel2.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 10, 0, 10, new java.awt.Color(255, 153, 0)));
        jPanel2.setMaximumSize(new java.awt.Dimension(600, 375));
        jPanel2.setMinimumSize(new java.awt.Dimension(600, 375));
        jPanel2.setPreferredSize(new java.awt.Dimension(600, 375));
        jPanel2.setRequestFocusEnabled(false);
        jPanel2.setLayout(new javax.swing.BoxLayout(jPanel2, javax.swing.BoxLayout.LINE_AXIS));

        jPanel3.setBackground(new java.awt.Color(35, 37, 45));
        jPanel3.setMaximumSize(new java.awt.Dimension(150, 325));
        jPanel3.setMinimumSize(new java.awt.Dimension(150, 325));
        jPanel3.setName(""); // NOI18N
        jPanel3.setPreferredSize(new java.awt.Dimension(150, 325));
        jPanel3.setLayout(new java.awt.GridLayout(6, 2, 10, 10));

        sqrtBtn.setBackground(new java.awt.Color(35, 37, 45));
        sqrtBtn.setFont(new java.awt.Font("Dubai", 0, 16)); // NOI18N
        sqrtBtn.setForeground(new java.awt.Color(147, 147, 147));
        sqrtBtn.setText("√");
        sqrtBtn.setBorderPainted(false);
        sqrtBtn.setFocusable(false);
        sqrtBtn.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        sqrtBtn.setMargin(new java.awt.Insets(0, -3, 0, 0));
        sqrtBtn.setMaximumSize(new java.awt.Dimension(35, 30));
        sqrtBtn.setMinimumSize(new java.awt.Dimension(35, 30));
        sqrtBtn.setPreferredSize(new java.awt.Dimension(35, 30));
        sqrtBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sqrtBtnActionPerformed(evt);
            }
        });
        jPanel3.add(sqrtBtn);

        powBtn.setBackground(new java.awt.Color(35, 37, 45));
        powBtn.setFont(new java.awt.Font("Dubai", 0, 18)); // NOI18N
        powBtn.setForeground(new java.awt.Color(147, 147, 147));
        powBtn.setText("^");
        powBtn.setBorderPainted(false);
        powBtn.setFocusable(false);
        powBtn.setMargin(new java.awt.Insets(0, 0, 0, 0));
        powBtn.setMaximumSize(new java.awt.Dimension(35, 30));
        powBtn.setMinimumSize(new java.awt.Dimension(35, 30));
        powBtn.setPreferredSize(new java.awt.Dimension(35, 30));
        powBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                powBtnActionPerformed(evt);
            }
        });
        jPanel3.add(powBtn);

        piBtn.setBackground(new java.awt.Color(35, 37, 45));
        piBtn.setFont(new java.awt.Font("Dubai", 0, 18)); // NOI18N
        piBtn.setForeground(new java.awt.Color(147, 147, 147));
        piBtn.setText("π");
        piBtn.setBorderPainted(false);
        piBtn.setFocusable(false);
        piBtn.setMargin(new java.awt.Insets(0, 0, 0, 0));
        piBtn.setMaximumSize(new java.awt.Dimension(35, 30));
        piBtn.setMinimumSize(new java.awt.Dimension(35, 30));
        piBtn.setPreferredSize(new java.awt.Dimension(35, 30));
        piBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                piBtnActionPerformed(evt);
            }
        });
        jPanel3.add(piBtn);

        eBtn.setBackground(new java.awt.Color(35, 37, 45));
        eBtn.setFont(new java.awt.Font("Dubai", 0, 18)); // NOI18N
        eBtn.setForeground(new java.awt.Color(147, 147, 147));
        eBtn.setText("e");
        eBtn.setBorderPainted(false);
        eBtn.setFocusable(false);
        eBtn.setMargin(new java.awt.Insets(0, 0, 0, 0));
        eBtn.setMaximumSize(new java.awt.Dimension(35, 30));
        eBtn.setMinimumSize(new java.awt.Dimension(35, 30));
        eBtn.setPreferredSize(new java.awt.Dimension(35, 30));
        eBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                eBtnActionPerformed(evt);
            }
        });
        jPanel3.add(eBtn);

        logBtn.setBackground(new java.awt.Color(35, 37, 45));
        logBtn.setFont(new java.awt.Font("Dubai", 0, 16)); // NOI18N
        logBtn.setForeground(new java.awt.Color(147, 147, 147));
        logBtn.setText("log");
        logBtn.setBorderPainted(false);
        logBtn.setFocusable(false);
        logBtn.setMargin(new java.awt.Insets(0, 0, 0, 0));
        logBtn.setMaximumSize(new java.awt.Dimension(35, 30));
        logBtn.setMinimumSize(new java.awt.Dimension(35, 30));
        logBtn.setPreferredSize(new java.awt.Dimension(35, 30));
        logBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                logBtnActionPerformed(evt);
            }
        });
        jPanel3.add(logBtn);

        lnBtn.setBackground(new java.awt.Color(35, 37, 45));
        lnBtn.setFont(new java.awt.Font("Dubai", 0, 16)); // NOI18N
        lnBtn.setForeground(new java.awt.Color(147, 147, 147));
        lnBtn.setText("ln");
        lnBtn.setBorderPainted(false);
        lnBtn.setFocusable(false);
        lnBtn.setMargin(new java.awt.Insets(0, 0, 0, 0));
        lnBtn.setMaximumSize(new java.awt.Dimension(35, 30));
        lnBtn.setMinimumSize(new java.awt.Dimension(35, 30));
        lnBtn.setPreferredSize(new java.awt.Dimension(35, 30));
        lnBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                lnBtnActionPerformed(evt);
            }
        });
        jPanel3.add(lnBtn);

        sinBtn.setBackground(new java.awt.Color(35, 37, 45));
        sinBtn.setFont(new java.awt.Font("Dubai", 0, 16)); // NOI18N
        sinBtn.setForeground(new java.awt.Color(147, 147, 147));
        sinBtn.setText("sin");
        sinBtn.setBorderPainted(false);
        sinBtn.setFocusable(false);
        sinBtn.setIconTextGap(0);
        sinBtn.setMargin(new java.awt.Insets(0, 0, 0, 0));
        sinBtn.setMaximumSize(new java.awt.Dimension(35, 30));
        sinBtn.setMinimumSize(new java.awt.Dimension(35, 30));
        sinBtn.setPreferredSize(new java.awt.Dimension(35, 30));
        sinBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sinBtnActionPerformed(evt);
            }
        });
        jPanel3.add(sinBtn);

        asinBtn.setBackground(new java.awt.Color(35, 37, 45));
        asinBtn.setFont(new java.awt.Font("Dubai", 0, 16)); // NOI18N
        asinBtn.setForeground(new java.awt.Color(147, 147, 147));
        asinBtn.setText("sin-1");
        asinBtn.setBorderPainted(false);
        asinBtn.setFocusable(false);
        asinBtn.setMargin(new java.awt.Insets(0, 0, 0, 0));
        asinBtn.setMaximumSize(new java.awt.Dimension(35, 30));
        asinBtn.setMinimumSize(new java.awt.Dimension(35, 30));
        asinBtn.setPreferredSize(new java.awt.Dimension(35, 30));
        asinBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                asinBtnActionPerformed(evt);
            }
        });
        jPanel3.add(asinBtn);

        cosBtn.setBackground(new java.awt.Color(35, 37, 45));
        cosBtn.setFont(new java.awt.Font("Dubai", 0, 16)); // NOI18N
        cosBtn.setForeground(new java.awt.Color(147, 147, 147));
        cosBtn.setText("cos");
        cosBtn.setBorderPainted(false);
        cosBtn.setFocusable(false);
        cosBtn.setMargin(new java.awt.Insets(0, 0, 0, 0));
        cosBtn.setMaximumSize(new java.awt.Dimension(35, 30));
        cosBtn.setMinimumSize(new java.awt.Dimension(35, 30));
        cosBtn.setPreferredSize(new java.awt.Dimension(35, 30));
        cosBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cosBtnActionPerformed(evt);
            }
        });
        jPanel3.add(cosBtn);

        acosBtn.setBackground(new java.awt.Color(35, 37, 45));
        acosBtn.setFont(new java.awt.Font("Dubai", 0, 16)); // NOI18N
        acosBtn.setForeground(new java.awt.Color(147, 147, 147));
        acosBtn.setText("cos-1");
        acosBtn.setBorderPainted(false);
        acosBtn.setFocusable(false);
        acosBtn.setMargin(new java.awt.Insets(0, 0, 0, 0));
        acosBtn.setMaximumSize(new java.awt.Dimension(35, 30));
        acosBtn.setMinimumSize(new java.awt.Dimension(35, 30));
        acosBtn.setPreferredSize(new java.awt.Dimension(35, 30));
        acosBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                acosBtnActionPerformed(evt);
            }
        });
        jPanel3.add(acosBtn);

        tanBtn.setBackground(new java.awt.Color(35, 37, 45));
        tanBtn.setFont(new java.awt.Font("Dubai", 0, 16)); // NOI18N
        tanBtn.setForeground(new java.awt.Color(147, 147, 147));
        tanBtn.setText("tan");
        tanBtn.setBorderPainted(false);
        tanBtn.setFocusable(false);
        tanBtn.setMargin(new java.awt.Insets(0, 0, 0, 0));
        tanBtn.setMaximumSize(new java.awt.Dimension(35, 30));
        tanBtn.setMinimumSize(new java.awt.Dimension(35, 30));
        tanBtn.setPreferredSize(new java.awt.Dimension(35, 30));
        tanBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tanBtnActionPerformed(evt);
            }
        });
        jPanel3.add(tanBtn);

        atanBtn.setBackground(new java.awt.Color(35, 37, 45));
        atanBtn.setFont(new java.awt.Font("Dubai", 0, 16)); // NOI18N
        atanBtn.setForeground(new java.awt.Color(147, 147, 147));
        atanBtn.setText("tan-1");
        atanBtn.setBorderPainted(false);
        atanBtn.setFocusable(false);
        atanBtn.setMargin(new java.awt.Insets(0, 0, 0, 0));
        atanBtn.setMaximumSize(new java.awt.Dimension(35, 30));
        atanBtn.setMinimumSize(new java.awt.Dimension(35, 30));
        atanBtn.setPreferredSize(new java.awt.Dimension(35, 30));
        atanBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                atanBtnActionPerformed(evt);
            }
        });
        jPanel3.add(atanBtn);

        jPanel3.setBorder(new javax.swing.border.EmptyBorder(10, 10, 10, 10));

        jPanel2.add(jPanel3);

        jPanel4.setBackground(new java.awt.Color(35, 37, 45));
        jPanel4.setAlignmentX(1.0F);
        jPanel4.setMaximumSize(new java.awt.Dimension(430, 375));
        jPanel4.setMinimumSize(new java.awt.Dimension(430, 375));
        jPanel4.setPreferredSize(new java.awt.Dimension(430, 375));
        jPanel4.setRequestFocusEnabled(false);
        jPanel4.setLayout(new java.awt.GridLayout(4, 5, 10, 10));

        Btn7.setBackground(new java.awt.Color(35, 37, 45));
        Btn7.setFont(new java.awt.Font("Century Gothic", 1, 28)); // NOI18N
        Btn7.setText("7");
        Btn7.setAlignmentY(0.0F);
        Btn7.setBorderPainted(false);
        Btn7.setFocusable(false);
        Btn7.setMargin(new java.awt.Insets(0, 0, 0, 0));
        Btn7.setMaximumSize(new java.awt.Dimension(30, 30));
        Btn7.setMinimumSize(new java.awt.Dimension(30, 30));
        Btn7.setPreferredSize(new java.awt.Dimension(30, 30));
        Btn7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Btn7ActionPerformed(evt);
            }
        });
        jPanel4.add(Btn7);

        Btn8.setBackground(new java.awt.Color(35, 37, 45));
        Btn8.setFont(new java.awt.Font("Century Gothic", 1, 28)); // NOI18N
        Btn8.setText("8");
        Btn8.setAlignmentY(0.0F);
        Btn8.setBorderPainted(false);
        Btn8.setFocusable(false);
        Btn8.setMargin(new java.awt.Insets(0, 0, 0, 0));
        Btn8.setMaximumSize(new java.awt.Dimension(30, 30));
        Btn8.setMinimumSize(new java.awt.Dimension(30, 30));
        Btn8.setPreferredSize(new java.awt.Dimension(30, 30));
        Btn8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Btn8ActionPerformed(evt);
            }
        });
        jPanel4.add(Btn8);

        Btn9.setBackground(new java.awt.Color(35, 37, 45));
        Btn9.setFont(new java.awt.Font("Century Gothic", 1, 28)); // NOI18N
        Btn9.setText("9");
        Btn9.setAlignmentY(0.0F);
        Btn9.setBorderPainted(false);
        Btn9.setFocusable(false);
        Btn9.setMargin(new java.awt.Insets(0, 0, 0, 0));
        Btn9.setMaximumSize(new java.awt.Dimension(30, 30));
        Btn9.setMinimumSize(new java.awt.Dimension(30, 30));
        Btn9.setPreferredSize(new java.awt.Dimension(30, 30));
        Btn9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Btn9ActionPerformed(evt);
            }
        });
        jPanel4.add(Btn9);

        mulBtn.setBackground(new java.awt.Color(35, 37, 45));
        mulBtn.setFont(new java.awt.Font("Century Gothic", 0, 26)); // NOI18N
        mulBtn.setForeground(new java.awt.Color(147, 147, 147));
        mulBtn.setText("x");
        mulBtn.setAlignmentY(0.0F);
        mulBtn.setBorder(javax.swing.BorderFactory.createMatteBorder(10, 0, 10, 0, new java.awt.Color(35, 37, 45)));
        mulBtn.setBorderPainted(false);
        mulBtn.setFocusable(false);
        mulBtn.setMargin(new java.awt.Insets(0, 0, 0, 0));
        mulBtn.setMaximumSize(new java.awt.Dimension(30, 30));
        mulBtn.setMinimumSize(new java.awt.Dimension(30, 30));
        mulBtn.setPreferredSize(new java.awt.Dimension(30, 30));
        mulBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mulBtnActionPerformed(evt);
            }
        });
        jPanel4.add(mulBtn);

        divBtn.setBackground(new java.awt.Color(35, 37, 45));
        divBtn.setFont(new java.awt.Font("Century Gothic", 0, 28)); // NOI18N
        divBtn.setForeground(new java.awt.Color(147, 147, 147));
        divBtn.setText("÷");
        divBtn.setAlignmentY(0.0F);
        divBtn.setBorder(javax.swing.BorderFactory.createMatteBorder(10, 0, 10, 0, new java.awt.Color(35, 37, 45)));
        divBtn.setBorderPainted(false);
        divBtn.setFocusable(false);
        divBtn.setMargin(new java.awt.Insets(0, 0, 0, 0));
        divBtn.setMaximumSize(new java.awt.Dimension(30, 30));
        divBtn.setMinimumSize(new java.awt.Dimension(30, 30));
        divBtn.setPreferredSize(new java.awt.Dimension(30, 30));
        divBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                divBtnActionPerformed(evt);
            }
        });
        jPanel4.add(divBtn);

        Btn4.setBackground(new java.awt.Color(35, 37, 45));
        Btn4.setFont(new java.awt.Font("Century Gothic", 1, 28)); // NOI18N
        Btn4.setText("4");
        Btn4.setAlignmentY(0.0F);
        Btn4.setBorderPainted(false);
        Btn4.setFocusable(false);
        Btn4.setMargin(new java.awt.Insets(0, 0, 0, 0));
        Btn4.setMaximumSize(new java.awt.Dimension(30, 30));
        Btn4.setMinimumSize(new java.awt.Dimension(30, 30));
        Btn4.setPreferredSize(new java.awt.Dimension(30, 30));
        Btn4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Btn4ActionPerformed(evt);
            }
        });
        jPanel4.add(Btn4);

        Btn5.setBackground(new java.awt.Color(35, 37, 45));
        Btn5.setFont(new java.awt.Font("Century Gothic", 1, 28)); // NOI18N
        Btn5.setText("5");
        Btn5.setAlignmentY(0.0F);
        Btn5.setBorderPainted(false);
        Btn5.setFocusable(false);
        Btn5.setMargin(new java.awt.Insets(0, 0, 0, 0));
        Btn5.setMaximumSize(new java.awt.Dimension(30, 30));
        Btn5.setMinimumSize(new java.awt.Dimension(30, 30));
        Btn5.setPreferredSize(new java.awt.Dimension(30, 30));
        Btn5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Btn5ActionPerformed(evt);
            }
        });
        jPanel4.add(Btn5);

        Btn6.setBackground(new java.awt.Color(35, 37, 45));
        Btn6.setFont(new java.awt.Font("Century Gothic", 1, 28)); // NOI18N
        Btn6.setText("6");
        Btn6.setAlignmentY(0.0F);
        Btn6.setBorderPainted(false);
        Btn6.setFocusable(false);
        Btn6.setMargin(new java.awt.Insets(0, 0, 0, 0));
        Btn6.setMaximumSize(new java.awt.Dimension(30, 30));
        Btn6.setMinimumSize(new java.awt.Dimension(30, 30));
        Btn6.setPreferredSize(new java.awt.Dimension(30, 30));
        Btn6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Btn6ActionPerformed(evt);
            }
        });
        jPanel4.add(Btn6);

        subBtn.setBackground(new java.awt.Color(35, 37, 45));
        subBtn.setFont(new java.awt.Font("Century Gothic", 0, 28)); // NOI18N
        subBtn.setForeground(new java.awt.Color(147, 147, 147));
        subBtn.setText("-");
        subBtn.setAlignmentY(0.0F);
        subBtn.setBorder(javax.swing.BorderFactory.createMatteBorder(10, 0, 10, 0, new java.awt.Color(35, 37, 45)));
        subBtn.setBorderPainted(false);
        subBtn.setFocusable(false);
        subBtn.setMargin(new java.awt.Insets(0, 0, 0, 0));
        subBtn.setMaximumSize(new java.awt.Dimension(30, 30));
        subBtn.setMinimumSize(new java.awt.Dimension(30, 30));
        subBtn.setPreferredSize(new java.awt.Dimension(30, 30));
        subBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                subBtnActionPerformed(evt);
            }
        });
        jPanel4.add(subBtn);

        sumBtn.setBackground(new java.awt.Color(35, 37, 45));
        sumBtn.setFont(new java.awt.Font("Century Gothic", 0, 28)); // NOI18N
        sumBtn.setForeground(new java.awt.Color(147, 147, 147));
        sumBtn.setText("+");
        sumBtn.setAlignmentY(0.0F);
        sumBtn.setBorder(javax.swing.BorderFactory.createMatteBorder(10, 0, 10, 0, new java.awt.Color(35, 37, 45)));
        sumBtn.setBorderPainted(false);
        sumBtn.setFocusable(false);
        sumBtn.setMargin(new java.awt.Insets(0, 0, 0, 0));
        sumBtn.setMaximumSize(new java.awt.Dimension(30, 30));
        sumBtn.setMinimumSize(new java.awt.Dimension(30, 30));
        sumBtn.setPreferredSize(new java.awt.Dimension(30, 30));
        sumBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sumBtnActionPerformed(evt);
            }
        });
        jPanel4.add(sumBtn);

        Btn1.setBackground(new java.awt.Color(35, 37, 45));
        Btn1.setFont(new java.awt.Font("Century Gothic", 1, 28)); // NOI18N
        Btn1.setText("1");
        Btn1.setAlignmentY(0.0F);
        Btn1.setBorderPainted(false);
        Btn1.setFocusable(false);
        Btn1.setMargin(new java.awt.Insets(0, 0, 0, 0));
        Btn1.setMaximumSize(new java.awt.Dimension(30, 30));
        Btn1.setMinimumSize(new java.awt.Dimension(30, 30));
        Btn1.setPreferredSize(new java.awt.Dimension(30, 30));
        Btn1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Btn1ActionPerformed(evt);
            }
        });
        jPanel4.add(Btn1);

        Btn2.setBackground(new java.awt.Color(35, 37, 45));
        Btn2.setFont(new java.awt.Font("Century Gothic", 1, 28)); // NOI18N
        Btn2.setText("2");
        Btn2.setAlignmentY(0.0F);
        Btn2.setBorderPainted(false);
        Btn2.setFocusable(false);
        Btn2.setMargin(new java.awt.Insets(0, 0, 0, 0));
        Btn2.setMaximumSize(new java.awt.Dimension(30, 30));
        Btn2.setMinimumSize(new java.awt.Dimension(30, 30));
        Btn2.setPreferredSize(new java.awt.Dimension(30, 30));
        Btn2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Btn2ActionPerformed(evt);
            }
        });
        jPanel4.add(Btn2);

        Btn3.setBackground(new java.awt.Color(35, 37, 45));
        Btn3.setFont(new java.awt.Font("Century Gothic", 1, 28)); // NOI18N
        Btn3.setText("3");
        Btn3.setAlignmentY(0.0F);
        Btn3.setBorderPainted(false);
        Btn3.setFocusable(false);
        Btn3.setMargin(new java.awt.Insets(0, 0, 0, 0));
        Btn3.setMaximumSize(new java.awt.Dimension(30, 30));
        Btn3.setMinimumSize(new java.awt.Dimension(30, 30));
        Btn3.setPreferredSize(new java.awt.Dimension(30, 30));
        Btn3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Btn3ActionPerformed(evt);
            }
        });
        jPanel4.add(Btn3);

        openBracBtn.setBackground(new java.awt.Color(35, 37, 45));
        openBracBtn.setFont(new java.awt.Font("Century Gothic", 0, 28)); // NOI18N
        openBracBtn.setForeground(new java.awt.Color(147, 147, 147));
        openBracBtn.setText("(");
        openBracBtn.setAlignmentY(0.0F);
        openBracBtn.setBorder(javax.swing.BorderFactory.createMatteBorder(10, 0, 10, 0, new java.awt.Color(35, 37, 45)));
        openBracBtn.setBorderPainted(false);
        openBracBtn.setFocusable(false);
        openBracBtn.setMargin(new java.awt.Insets(0, 0, 0, 0));
        openBracBtn.setMaximumSize(new java.awt.Dimension(30, 30));
        openBracBtn.setMinimumSize(new java.awt.Dimension(30, 30));
        openBracBtn.setPreferredSize(new java.awt.Dimension(30, 30));
        openBracBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                openBracBtnActionPerformed(evt);
            }
        });
        jPanel4.add(openBracBtn);

        closeBracBtn.setBackground(new java.awt.Color(35, 37, 45));
        closeBracBtn.setFont(new java.awt.Font("Century Gothic", 0, 28)); // NOI18N
        closeBracBtn.setForeground(new java.awt.Color(147, 147, 147));
        closeBracBtn.setText(")");
        closeBracBtn.setAlignmentY(0.0F);
        closeBracBtn.setBorder(javax.swing.BorderFactory.createMatteBorder(10, 0, 10, 0, new java.awt.Color(35, 37, 45)));
        closeBracBtn.setBorderPainted(false);
        closeBracBtn.setFocusable(false);
        closeBracBtn.setMargin(new java.awt.Insets(0, 0, 0, 0));
        closeBracBtn.setMaximumSize(new java.awt.Dimension(30, 30));
        closeBracBtn.setMinimumSize(new java.awt.Dimension(30, 30));
        closeBracBtn.setPreferredSize(new java.awt.Dimension(30, 30));
        closeBracBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                closeBracBtnActionPerformed(evt);
            }
        });
        jPanel4.add(closeBracBtn);

        Btn0.setBackground(new java.awt.Color(35, 37, 45));
        Btn0.setFont(new java.awt.Font("Century Gothic", 1, 28)); // NOI18N
        Btn0.setText("0");
        Btn0.setAlignmentY(0.0F);
        Btn0.setBorderPainted(false);
        Btn0.setFocusable(false);
        Btn0.setMargin(new java.awt.Insets(0, 0, 0, 0));
        Btn0.setMaximumSize(new java.awt.Dimension(30, 30));
        Btn0.setMinimumSize(new java.awt.Dimension(30, 30));
        Btn0.setPreferredSize(new java.awt.Dimension(30, 30));
        Btn0.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Btn0ActionPerformed(evt);
            }
        });
        jPanel4.add(Btn0);

        dotBtn.setBackground(new java.awt.Color(35, 37, 45));
        dotBtn.setFont(new java.awt.Font("Century Gothic", 1, 28)); // NOI18N
        dotBtn.setText(".");
        dotBtn.setAlignmentY(0.0F);
        dotBtn.setBorderPainted(false);
        dotBtn.setFocusable(false);
        dotBtn.setMargin(new java.awt.Insets(0, 0, 0, 0));
        dotBtn.setMaximumSize(new java.awt.Dimension(30, 30));
        dotBtn.setMinimumSize(new java.awt.Dimension(30, 30));
        dotBtn.setPreferredSize(new java.awt.Dimension(30, 30));
        dotBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                dotBtnActionPerformed(evt);
            }
        });
        jPanel4.add(dotBtn);

        equalBtn.setBackground(new java.awt.Color(35, 37, 45));
        equalBtn.setFont(new java.awt.Font("Century Gothic", 1, 32)); // NOI18N
        equalBtn.setText("=");
        equalBtn.setAlignmentY(0.0F);
        equalBtn.setBorder(javax.swing.BorderFactory.createMatteBorder(10, 0, 10, 0, new java.awt.Color(35, 37, 45)));
        equalBtn.setFocusable(false);
        equalBtn.setMargin(new java.awt.Insets(0, 0, 0, 0));
        equalBtn.setMaximumSize(new java.awt.Dimension(30, 30));
        equalBtn.setMinimumSize(new java.awt.Dimension(30, 30));
        equalBtn.setPreferredSize(new java.awt.Dimension(30, 30));
        equalBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                equalBtnActionPerformed(evt);
            }
        });
        jPanel4.add(equalBtn);

        delBtn.setBackground(new java.awt.Color(35, 37, 45));
        delBtn.setFont(new java.awt.Font("Century Gothic", 0, 24)); // NOI18N
        delBtn.setForeground(new java.awt.Color(147, 147, 147));
        delBtn.setText("DEL");
        delBtn.setAlignmentY(0.0F);
        delBtn.setBorder(javax.swing.BorderFactory.createMatteBorder(10, 0, 10, 0, new java.awt.Color(35, 37, 45)));
        delBtn.setBorderPainted(false);
        delBtn.setFocusable(false);
        delBtn.setMargin(new java.awt.Insets(0, 0, 0, 0));
        delBtn.setMaximumSize(new java.awt.Dimension(30, 30));
        delBtn.setMinimumSize(new java.awt.Dimension(30, 30));
        delBtn.setPreferredSize(new java.awt.Dimension(30, 30));
        delBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                delBtnActionPerformed(evt);
            }
        });
        jPanel4.add(delBtn);

        ACBtn.setBackground(new java.awt.Color(35, 37, 45));
        ACBtn.setFont(new java.awt.Font("Century Gothic", 0, 24)); // NOI18N
        ACBtn.setForeground(new java.awt.Color(147, 147, 147));
        ACBtn.setText("AC");
        ACBtn.setAlignmentY(0.0F);
        ACBtn.setBorder(javax.swing.BorderFactory.createMatteBorder(10, 0, 10, 0, new java.awt.Color(35, 37, 45)));
        ACBtn.setBorderPainted(false);
        ACBtn.setFocusable(false);
        ACBtn.setMargin(new java.awt.Insets(0, 0, 0, 0));
        ACBtn.setMaximumSize(new java.awt.Dimension(30, 30));
        ACBtn.setMinimumSize(new java.awt.Dimension(30, 30));
        ACBtn.setPreferredSize(new java.awt.Dimension(30, 30));
        ACBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ACBtnActionPerformed(evt);
            }
        });
        jPanel4.add(ACBtn);

        jPanel4.setBorder(new javax.swing.border.EmptyBorder(20, 10, 20, 10));

        jPanel2.add(jPanel4);

        jPanel5.add(jPanel2);

        getContentPane().add(jPanel5);

        getAccessibleContext().setAccessibleDescription("");

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    // Instance of Dijkstra class
    Dijkstra djk = new Dijkstra(100);
    String exp = "0";
    
    private void ACBtnActionPerformed(java.awt.event.ActionEvent evt) {                                                                       
        if(exp.equals("0")){
           display.setText("0");
           exp = "0";
        }
        else{
           display.setText("0");
           exp = "0";
        }
    }     

    private void btn_closeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_closeActionPerformed
        // TODO add your handling code here:
        System.exit(0);
    }//GEN-LAST:event_btn_closeActionPerformed

    private void btn_closeMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_closeMouseEntered
        // TODO add your handling code here:
        btn_close.setForeground(new java.awt.Color(204, 221, 229));
    }//GEN-LAST:event_btn_closeMouseEntered

    private void btn_closeMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_closeMouseExited
        // TODO add your handling code here:
        btn_close.setForeground(new java.awt.Color(154, 171, 179));
    }//GEN-LAST:event_btn_closeMouseExited

    private void atanBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_atanBtnActionPerformed
        createExp("atan(", "atan(");
    }//GEN-LAST:event_atanBtnActionPerformed

    private void tanBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tanBtnActionPerformed
        createExp("tan(", "tan(");
    }//GEN-LAST:event_tanBtnActionPerformed

    private void acosBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_acosBtnActionPerformed
        createExp("acos(", "acos(");
    }//GEN-LAST:event_acosBtnActionPerformed

    private void cosBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cosBtnActionPerformed
        createExp("cos(", "cos(");
    }//GEN-LAST:event_cosBtnActionPerformed

    private void asinBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_asinBtnActionPerformed
        createExp("asin(", "asin(");
    }//GEN-LAST:event_asinBtnActionPerformed

    private void sinBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sinBtnActionPerformed
        createExp("sin(", "sin(");
    }//GEN-LAST:event_sinBtnActionPerformed

    private void lnBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_lnBtnActionPerformed
        createExp("ln(", "ln(");
    }//GEN-LAST:event_lnBtnActionPerformed

    private void logBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_logBtnActionPerformed
        createExp("log(", "log(");
    }//GEN-LAST:event_logBtnActionPerformed

    private void eBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_eBtnActionPerformed
        ifConstantRepeated("e", "e");
    }//GEN-LAST:event_eBtnActionPerformed

    private void piBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_piBtnActionPerformed
        ifConstantRepeated("π", "pi");
    }//GEN-LAST:event_piBtnActionPerformed

    private void powBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_powBtnActionPerformed
        createExp("^", "^");
    }//GEN-LAST:event_powBtnActionPerformed

    private void sqrtBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sqrtBtnActionPerformed
        createExp("√(", "sqrt(");
    }//GEN-LAST:event_sqrtBtnActionPerformed

    private void ACBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ACBtnActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ACBtnActionPerformed

    private void delBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_delBtnActionPerformed
        if(display.getText().equals("0") || display.getText().length() == 1){
            display.setText("0");
            exp = "0";
        }
        else{
            display.setText(display.getText().substring(0, display.getText().length()-1));
            exp = exp.substring(0, exp.length()-1);
        }
        System.out.println(exp);
    }//GEN-LAST:event_delBtnActionPerformed

    // method to evaluate the generated algebraic expression
    private void equalBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_equalBtnActionPerformed
        String calc = djk.calculate(exp);
        display.setText(calc);
        exp = calc;
    }//GEN-LAST:event_equalBtnActionPerformed

    private void dotBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_dotBtnActionPerformed
        ifOperatorRepeated(".", ".");
    }//GEN-LAST:event_dotBtnActionPerformed

    // Event Handlers    
    private void Btn0ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Btn0ActionPerformed
        createExp("0", "0");
    }//GEN-LAST:event_Btn0ActionPerformed

    private void closeBracBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_closeBracBtnActionPerformed
        createExp(")", ")");
    }//GEN-LAST:event_closeBracBtnActionPerformed

    private void openBracBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_openBracBtnActionPerformed
        createExp("(", "(");
    }//GEN-LAST:event_openBracBtnActionPerformed

    private void Btn3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Btn3ActionPerformed
        createExp("3", "3");
    }//GEN-LAST:event_Btn3ActionPerformed

    private void Btn2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Btn2ActionPerformed
        createExp("2", "2");
    }//GEN-LAST:event_Btn2ActionPerformed

    private void Btn1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Btn1ActionPerformed
        createExp("1", "1");
    }//GEN-LAST:event_Btn1ActionPerformed

    private void sumBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sumBtnActionPerformed
        ifOperatorRepeated("+", "+");
    }//GEN-LAST:event_sumBtnActionPerformed

    private void subBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_subBtnActionPerformed
        ifOperatorRepeated("-", "-");
    }//GEN-LAST:event_subBtnActionPerformed

    private void Btn6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Btn6ActionPerformed
        createExp("6", "6");
    }//GEN-LAST:event_Btn6ActionPerformed

    private void Btn5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Btn5ActionPerformed
        createExp("5", "5");
    }//GEN-LAST:event_Btn5ActionPerformed

    private void Btn4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Btn4ActionPerformed
        createExp("4", "4");
    }//GEN-LAST:event_Btn4ActionPerformed

    private void divBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_divBtnActionPerformed
        ifOperatorRepeated("÷", "/");
    }//GEN-LAST:event_divBtnActionPerformed

    private void mulBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mulBtnActionPerformed
        ifOperatorRepeated("×", "*");
    }//GEN-LAST:event_mulBtnActionPerformed

    private void Btn9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Btn9ActionPerformed
        createExp("9", "9");
    }//GEN-LAST:event_Btn9ActionPerformed

    private void Btn8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Btn8ActionPerformed
        createExp("8", "8");
    }//GEN-LAST:event_Btn8ActionPerformed

    private void Btn7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Btn7ActionPerformed
        createExp("7", "7");
    }//GEN-LAST:event_Btn7ActionPerformed

    // Method to create Algebraic expression on user input
    public void createExp(String displayData, String expData){
        if(exp.equals("0") || exp.equals("pi") || exp.equals("e")){
            display.setText(displayData);
            exp = expData;
        }
        else{
            display.replaceSelection(displayData);
            exp += expData;
        }
        System.out.println(exp);
    }

    public void ifOperatorRepeated(String displayData, String expData){
        if(!(exp.endsWith(expData))){
            display.replaceSelection(displayData);
            exp += expData;
        }
        else{
            return;
        }
        System.out.println(exp);
    }

    public void ifConstantRepeated(String displayData, String expData){
        if(exp.equals("0") || exp.equals("pi") || exp.equals("e") || isNum(exp)){
            if (expData.equals("pi")) {
                display.setText("π");
                exp = "pi";
            }
            else if (expData.equals("e")){  
                display.setText("e"); 
                exp = "e"; 
            }
        }
        else{
            if(!(exp.endsWith(expData))){
                display.replaceSelection(displayData);
                exp += expData;
            }
            else{
                return;
            }
        }
        System.out.println(exp);
    }

    // method to check if passed parameter is Number or not 
    public boolean isNum(String str){
        if (str == String.valueOf('\0') || str == ""){
            return false;
        }
        try{
            Double.parseDouble(String.valueOf(str));
        }
        catch (NumberFormatException ex) {
            return false;
        }
        return true;
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        try {
            UIManager.setLookAndFeel(new FlatDarkLaf());
        } 
        catch(Exception ex) {
            System.err.println("Failed to initialize LaF");
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Main().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton ACBtn;
    private javax.swing.JButton Btn0;
    private javax.swing.JButton Btn1;
    private javax.swing.JButton Btn2;
    private javax.swing.JButton Btn3;
    private javax.swing.JButton Btn4;
    private javax.swing.JButton Btn5;
    private javax.swing.JButton Btn6;
    private javax.swing.JButton Btn7;
    private javax.swing.JButton Btn8;
    private javax.swing.JButton Btn9;
    private javax.swing.JButton acosBtn;
    private javax.swing.JButton asinBtn;
    private javax.swing.JButton atanBtn;
    private javax.swing.JButton btn_close;
    private javax.swing.JButton closeBracBtn;
    private javax.swing.JButton cosBtn;
    private javax.swing.JButton delBtn;
    private javax.swing.JTextField display;
    private javax.swing.JButton divBtn;
    private javax.swing.JButton dotBtn;
    private javax.swing.JButton eBtn;
    private javax.swing.JButton equalBtn;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JButton lnBtn;
    private javax.swing.JButton logBtn;
    private javax.swing.JButton mulBtn;
    private javax.swing.JButton openBracBtn;
    private javax.swing.JButton piBtn;
    private javax.swing.JButton powBtn;
    private javax.swing.JButton sinBtn;
    private javax.swing.JButton sqrtBtn;
    private javax.swing.JButton subBtn;
    private javax.swing.JButton sumBtn;
    private javax.swing.JButton tanBtn;
    // End of variables declaration//GEN-END:variables
}