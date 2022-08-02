package calculator;

import java.text.DecimalFormat;

public class Orange extends javax.swing.JFrame {
    
    Calculator calculator = new Calculator();
    
    String valorX;
    
    DecimalFormat df = new DecimalFormat("#");
    
    public Orange() {
        initComponents();  
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel = new javax.swing.JPanel();
        mainLabel = new javax.swing.JLabel();
        igualButton = new javax.swing.JButton();
        vezesButton = new javax.swing.JButton();
        dividirButton = new javax.swing.JButton();
        menosButton = new javax.swing.JButton();
        maisButton = new javax.swing.JButton();
        xButton = new javax.swing.JButton();
        gitButton = new javax.swing.JButton();
        figmaButton = new javax.swing.JButton();
        linkedButton = new javax.swing.JButton();
        cButton = new javax.swing.JButton();
        ceButton = new javax.swing.JButton();
        porcentagemButton = new javax.swing.JButton();
        xquadradoButton = new javax.swing.JButton();
        raizButton = new javax.swing.JButton();
        piButton = new javax.swing.JButton();
        noveButton = new javax.swing.JButton();
        oitoButton = new javax.swing.JButton();
        seteButton = new javax.swing.JButton();
        seisButton = new javax.swing.JButton();
        cincoButton = new javax.swing.JButton();
        quatroButton = new javax.swing.JButton();
        tresButton = new javax.swing.JButton();
        doisButton = new javax.swing.JButton();
        umButton = new javax.swing.JButton();
        zeroButton = new javax.swing.JButton();
        virgulaButton = new javax.swing.JButton();
        pontoButton = new javax.swing.JButton();
        switchButton = new javax.swing.JButton();
        bg = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Calculator Orange");
        setBackground(new java.awt.Color(255, 252, 242));
        setResizable(false);

        jPanel.setBackground(new java.awt.Color(255, 252, 242));
        jPanel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        mainLabel.setFont(new java.awt.Font("JetBrains Mono", 0, 50)); // NOI18N
        mainLabel.setForeground(new java.awt.Color(37, 36, 34));
        mainLabel.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        mainLabel.setText("0");
        jPanel.add(mainLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 92, 400, -1));

        igualButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/calculator/mainOrange/=Button.png"))); // NOI18N
        igualButton.setBorder(null);
        igualButton.setBorderPainted(false);
        igualButton.setContentAreaFilled(false);
        igualButton.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/calculator/mainOrange/=ButtonPressed.png"))); // NOI18N
        igualButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                igualButtonActionPerformed(evt);
            }
        });
        jPanel.add(igualButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(302, 494, -1, -1));

        vezesButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/calculator/mainOrange/vezesButton.png"))); // NOI18N
        vezesButton.setBorder(null);
        vezesButton.setBorderPainted(false);
        vezesButton.setContentAreaFilled(false);
        vezesButton.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/calculator/mainOrange/vezesButtonPressed.png"))); // NOI18N
        jPanel.add(vezesButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(302, 431, -1, -1));

        dividirButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/calculator/mainOrange/%Button.png"))); // NOI18N
        dividirButton.setBorder(null);
        dividirButton.setBorderPainted(false);
        dividirButton.setContentAreaFilled(false);
        dividirButton.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/calculator/mainOrange/%ButtonPressed.png"))); // NOI18N
        jPanel.add(dividirButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(302, 368, -1, -1));

        menosButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/calculator/mainOrange/-Button.png"))); // NOI18N
        menosButton.setBorder(null);
        menosButton.setBorderPainted(false);
        menosButton.setContentAreaFilled(false);
        menosButton.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/calculator/mainOrange/-ButtonPressed.png"))); // NOI18N
        jPanel.add(menosButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(302, 305, -1, -1));

        maisButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/calculator/mainOrange/+Button.png"))); // NOI18N
        maisButton.setBorder(null);
        maisButton.setBorderPainted(false);
        maisButton.setContentAreaFilled(false);
        maisButton.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/calculator/mainOrange/+ButtonPressed.png"))); // NOI18N
        maisButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                maisButtonActionPerformed(evt);
            }
        });
        jPanel.add(maisButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(302, 242, -1, -1));

        xButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/calculator/mainOrange/xButton.png"))); // NOI18N
        xButton.setBorder(null);
        xButton.setBorderPainted(false);
        xButton.setContentAreaFilled(false);
        xButton.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/calculator/mainOrange/xButtonPressed.png"))); // NOI18N
        jPanel.add(xButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(302, 179, -1, -1));

        gitButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/calculator/mainOrange/Github.png"))); // NOI18N
        gitButton.setBorder(null);
        gitButton.setBorderPainted(false);
        gitButton.setContentAreaFilled(false);
        gitButton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jPanel.add(gitButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(186, 568, -1, -1));

        figmaButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/calculator/mainOrange/Figma.png"))); // NOI18N
        figmaButton.setBorder(null);
        figmaButton.setBorderPainted(false);
        figmaButton.setContentAreaFilled(false);
        figmaButton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jPanel.add(figmaButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(312, 568, -1, -1));

        linkedButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/calculator/mainOrange/LinkedIN.png"))); // NOI18N
        linkedButton.setBorder(null);
        linkedButton.setBorderPainted(false);
        linkedButton.setContentAreaFilled(false);
        linkedButton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jPanel.add(linkedButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 568, -1, -1));

        cButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/calculator/mainOrange/cButton.png"))); // NOI18N
        cButton.setBorder(null);
        cButton.setBorderPainted(false);
        cButton.setContentAreaFilled(false);
        cButton.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/calculator/mainOrange/cButtonPressed.png"))); // NOI18N
        cButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cButtonActionPerformed(evt);
            }
        });
        jPanel.add(cButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(202, 179, -1, -1));

        ceButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/calculator/mainOrange/ceButton.png"))); // NOI18N
        ceButton.setBorder(null);
        ceButton.setBorderPainted(false);
        ceButton.setContentAreaFilled(false);
        ceButton.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/calculator/mainOrange/ceButtonPressed.png"))); // NOI18N
        ceButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ceButtonActionPerformed(evt);
            }
        });
        jPanel.add(ceButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(102, 179, -1, -1));

        porcentagemButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/calculator/mainOrange/%Button.png"))); // NOI18N
        porcentagemButton.setBorder(null);
        porcentagemButton.setBorderPainted(false);
        porcentagemButton.setContentAreaFilled(false);
        porcentagemButton.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/calculator/mainOrange/%ButtonPressed.png"))); // NOI18N
        jPanel.add(porcentagemButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(2, 179, -1, -1));

        xquadradoButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/calculator/mainOrange/xQuadrado.png"))); // NOI18N
        xquadradoButton.setBorder(null);
        xquadradoButton.setBorderPainted(false);
        xquadradoButton.setContentAreaFilled(false);
        xquadradoButton.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/calculator/mainOrange/xQuadradoPressed.png"))); // NOI18N
        jPanel.add(xquadradoButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(202, 242, -1, -1));

        raizButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/calculator/mainOrange/raizButton.png"))); // NOI18N
        raizButton.setBorder(null);
        raizButton.setBorderPainted(false);
        raizButton.setContentAreaFilled(false);
        raizButton.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/calculator/mainOrange/raizButtonPressed.png"))); // NOI18N
        jPanel.add(raizButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(102, 242, -1, -1));

        piButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/calculator/mainOrange/piButton.png"))); // NOI18N
        piButton.setBorder(null);
        piButton.setBorderPainted(false);
        piButton.setContentAreaFilled(false);
        piButton.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/calculator/mainOrange/piButtonPressed.png"))); // NOI18N
        jPanel.add(piButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(2, 242, -1, -1));

        noveButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/calculator/mainOrange/9Button.png"))); // NOI18N
        noveButton.setBorder(null);
        noveButton.setBorderPainted(false);
        noveButton.setContentAreaFilled(false);
        noveButton.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/calculator/mainOrange/9ButtonPressed.png"))); // NOI18N
        noveButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                noveButtonActionPerformed(evt);
            }
        });
        jPanel.add(noveButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(202, 305, -1, -1));

        oitoButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/calculator/mainOrange/8Button.png"))); // NOI18N
        oitoButton.setBorder(null);
        oitoButton.setBorderPainted(false);
        oitoButton.setContentAreaFilled(false);
        oitoButton.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/calculator/mainOrange/8ButtonPressed.png"))); // NOI18N
        oitoButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                oitoButtonActionPerformed(evt);
            }
        });
        jPanel.add(oitoButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(102, 305, -1, -1));

        seteButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/calculator/mainOrange/7Button.png"))); // NOI18N
        seteButton.setBorder(null);
        seteButton.setBorderPainted(false);
        seteButton.setContentAreaFilled(false);
        seteButton.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/calculator/mainOrange/7ButtonPressed.png"))); // NOI18N
        seteButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                seteButtonActionPerformed(evt);
            }
        });
        jPanel.add(seteButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(2, 305, -1, -1));

        seisButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/calculator/mainOrange/6Button.png"))); // NOI18N
        seisButton.setBorder(null);
        seisButton.setBorderPainted(false);
        seisButton.setContentAreaFilled(false);
        seisButton.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/calculator/mainOrange/6ButtonPressed.png"))); // NOI18N
        seisButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                seisButtonActionPerformed(evt);
            }
        });
        jPanel.add(seisButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(202, 368, -1, -1));

        cincoButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/calculator/mainOrange/5Button.png"))); // NOI18N
        cincoButton.setBorder(null);
        cincoButton.setBorderPainted(false);
        cincoButton.setContentAreaFilled(false);
        cincoButton.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/calculator/mainOrange/5ButtonPressed.png"))); // NOI18N
        cincoButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cincoButtonActionPerformed(evt);
            }
        });
        jPanel.add(cincoButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(102, 368, -1, -1));

        quatroButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/calculator/mainOrange/4Button.png"))); // NOI18N
        quatroButton.setBorder(null);
        quatroButton.setBorderPainted(false);
        quatroButton.setContentAreaFilled(false);
        quatroButton.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/calculator/mainOrange/4ButtonPressed.png"))); // NOI18N
        quatroButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                quatroButtonActionPerformed(evt);
            }
        });
        jPanel.add(quatroButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(2, 368, -1, -1));

        tresButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/calculator/mainOrange/3Button.png"))); // NOI18N
        tresButton.setBorder(null);
        tresButton.setBorderPainted(false);
        tresButton.setContentAreaFilled(false);
        tresButton.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/calculator/mainOrange/3ButtonPressed.png"))); // NOI18N
        tresButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tresButtonActionPerformed(evt);
            }
        });
        jPanel.add(tresButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(202, 431, -1, -1));

        doisButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/calculator/mainOrange/2Button.png"))); // NOI18N
        doisButton.setBorder(null);
        doisButton.setBorderPainted(false);
        doisButton.setContentAreaFilled(false);
        doisButton.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/calculator/mainOrange/2ButtonPressed.png"))); // NOI18N
        doisButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                doisButtonActionPerformed(evt);
            }
        });
        jPanel.add(doisButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(102, 431, -1, -1));

        umButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/calculator/mainOrange/1Button.png"))); // NOI18N
        umButton.setBorder(null);
        umButton.setBorderPainted(false);
        umButton.setContentAreaFilled(false);
        umButton.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/calculator/mainOrange/1ButtonPressed.png"))); // NOI18N
        umButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                umButtonActionPerformed(evt);
            }
        });
        jPanel.add(umButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(2, 431, -1, -1));

        zeroButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/calculator/mainOrange/0Button.png"))); // NOI18N
        zeroButton.setBorder(null);
        zeroButton.setBorderPainted(false);
        zeroButton.setContentAreaFilled(false);
        zeroButton.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/calculator/mainOrange/0ButtonPressed.png"))); // NOI18N
        zeroButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                zeroButtonActionPerformed(evt);
            }
        });
        jPanel.add(zeroButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(102, 494, -1, -1));

        virgulaButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/calculator/mainOrange/,Button.png"))); // NOI18N
        virgulaButton.setBorder(null);
        virgulaButton.setBorderPainted(false);
        virgulaButton.setContentAreaFilled(false);
        virgulaButton.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/calculator/mainOrange/,ButtonPressed.png"))); // NOI18N
        jPanel.add(virgulaButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(202, 494, -1, -1));

        pontoButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/calculator/mainOrange/Button.png"))); // NOI18N
        pontoButton.setBorder(null);
        pontoButton.setBorderPainted(false);
        pontoButton.setContentAreaFilled(false);
        pontoButton.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/calculator/mainOrange/ButtonPressed.png"))); // NOI18N
        jPanel.add(pontoButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(2, 494, -1, -1));

        switchButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/calculator/mainOrange/switch.png"))); // NOI18N
        switchButton.setBorder(null);
        switchButton.setBorderPainted(false);
        switchButton.setContentAreaFilled(false);
        switchButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                switchButtonActionPerformed(evt);
            }
        });
        jPanel.add(switchButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(181, 9, -1, -1));

        bg.setIcon(new javax.swing.ImageIcon(getClass().getResource("/calculator/mainOrange/bg.png"))); // NOI18N
        jPanel.add(bg, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void switchButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_switchButtonActionPerformed

        String orangeIcon = "file:/C:/Users/Joao/Desktop/Java/Calculator/Calculator/build/classes/calculator/mainOrange/switch.png";

        if (switchButton.getIcon().toString().equals(orangeIcon)) {

            switchButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/calculator/mainGreen/switch.png")));

        } else {
            switchButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/calculator/mainOrange/switch.png")));
        }
        
    }//GEN-LAST:event_switchButtonActionPerformed

    private void noveButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_noveButtonActionPerformed
        calculator.buttonPress(mainLabel, "9");
    }//GEN-LAST:event_noveButtonActionPerformed

    private void oitoButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_oitoButtonActionPerformed
        calculator.buttonPress(mainLabel, "8");
    }//GEN-LAST:event_oitoButtonActionPerformed

    private void seteButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_seteButtonActionPerformed
        calculator.buttonPress(mainLabel, "7");
    }//GEN-LAST:event_seteButtonActionPerformed

    private void seisButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_seisButtonActionPerformed
        calculator.buttonPress(mainLabel, "6");
    }//GEN-LAST:event_seisButtonActionPerformed

    private void cincoButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cincoButtonActionPerformed
        calculator.buttonPress(mainLabel, "5");
    }//GEN-LAST:event_cincoButtonActionPerformed

    private void quatroButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_quatroButtonActionPerformed
        calculator.buttonPress(mainLabel, "4");
    }//GEN-LAST:event_quatroButtonActionPerformed

    private void tresButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tresButtonActionPerformed
        calculator.buttonPress(mainLabel, "3");
    }//GEN-LAST:event_tresButtonActionPerformed

    private void doisButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_doisButtonActionPerformed
        calculator.buttonPress(mainLabel, "2");
    }//GEN-LAST:event_doisButtonActionPerformed

    private void umButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_umButtonActionPerformed
        calculator.buttonPress(mainLabel, "1");
    }//GEN-LAST:event_umButtonActionPerformed

    private void zeroButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_zeroButtonActionPerformed
        calculator.buttonPress(mainLabel, "0");
    }//GEN-LAST:event_zeroButtonActionPerformed

    private void ceButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ceButtonActionPerformed
        mainLabel.setText("0");
    }//GEN-LAST:event_ceButtonActionPerformed

    private void cButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cButtonActionPerformed
        mainLabel.setText("0"); 
    }//GEN-LAST:event_cButtonActionPerformed

    private void maisButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_maisButtonActionPerformed
        valorX = mainLabel.getText();
        
        mainLabel.setText("0");
        
    }//GEN-LAST:event_maisButtonActionPerformed

    private void igualButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_igualButtonActionPerformed
        
        float valor1 = Float.parseFloat(valorX);
        float valor2 = Float.parseFloat(mainLabel.getText());
        
        String resultado = String.valueOf(df.format(valor1 + valor2));
        
        if(mainLabel.getText().equals("0")){
   
        mainLabel.setText(valorX);
        
        } else {
            mainLabel.setText(resultado);
        }
        
    }//GEN-LAST:event_igualButtonActionPerformed

    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                Orange orange = new Orange();
                orange.setVisible(true);
                orange.setLocationRelativeTo(null);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel bg;
    private javax.swing.JButton cButton;
    private javax.swing.JButton ceButton;
    private javax.swing.JButton cincoButton;
    private javax.swing.JButton dividirButton;
    private javax.swing.JButton doisButton;
    private javax.swing.JButton figmaButton;
    private javax.swing.JButton gitButton;
    private javax.swing.JButton igualButton;
    private javax.swing.JPanel jPanel;
    private javax.swing.JButton linkedButton;
    private javax.swing.JLabel mainLabel;
    private javax.swing.JButton maisButton;
    private javax.swing.JButton menosButton;
    private javax.swing.JButton noveButton;
    private javax.swing.JButton oitoButton;
    private javax.swing.JButton piButton;
    private javax.swing.JButton pontoButton;
    private javax.swing.JButton porcentagemButton;
    private javax.swing.JButton quatroButton;
    private javax.swing.JButton raizButton;
    private javax.swing.JButton seisButton;
    private javax.swing.JButton seteButton;
    private javax.swing.JButton switchButton;
    private javax.swing.JButton tresButton;
    private javax.swing.JButton umButton;
    private javax.swing.JButton vezesButton;
    private javax.swing.JButton virgulaButton;
    private javax.swing.JButton xButton;
    private javax.swing.JButton xquadradoButton;
    private javax.swing.JButton zeroButton;
    // End of variables declaration//GEN-END:variables
}
