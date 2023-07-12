/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package urnaeletronica2077;

import javax.swing.JOptionPane;
import javax.swing.ImageIcon;
import java.util.ArrayList;
import Classes.*;

/**
 *
 * @author Altair, Amanda, Cláudio e Rodrigo 
 */
public class Eleicoes2077DeputadoFede extends javax.swing.JFrame {

    /**
     * Creates new form Eleicoes2077
     */
    public Eleicoes2077DeputadoFede() {
        initComponents();
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        TelaResultado2 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        foto = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        txt1 = new javax.swing.JTextField();
        txt2 = new javax.swing.JTextField();
        txt3 = new javax.swing.JTextField();
        txt4 = new javax.swing.JTextField();
        nomedep = new javax.swing.JTextField();
        partdep = new javax.swing.JTextField();
        jPanel3 = new javax.swing.JPanel();
        bot1 = new javax.swing.JButton();
        bot4 = new javax.swing.JButton();
        botbranco = new javax.swing.JButton();
        botcorrige = new javax.swing.JButton();
        botconfirma = new javax.swing.JButton();
        bot7 = new javax.swing.JButton();
        bot2 = new javax.swing.JButton();
        bot5 = new javax.swing.JButton();
        bot0 = new javax.swing.JButton();
        bot9 = new javax.swing.JButton();
        bot6 = new javax.swing.JButton();
        bot3 = new javax.swing.JButton();
        bot8 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        TelaResultado2.setBackground(new java.awt.Color(204, 204, 204));
        TelaResultado2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 153, 153), 2));

        jLabel2.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jLabel2.setText("SEU VOTO PARA:");

        jLabel3.setFont(new java.awt.Font("Arial Black", 1, 24)); // NOI18N
        jLabel3.setText("DEPUTADO FEDERAL");

        jLabel6.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel6.setText("Partido:");

        jLabel7.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel7.setText("Nome:");

        jLabel9.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jLabel9.setText("Aperte a tecla:");

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(foto, javax.swing.GroupLayout.DEFAULT_SIZE, 180, Short.MAX_VALUE)
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(foto, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        jLabel11.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jLabel11.setText("VERMELHO para CORRIGIR");

        jLabel12.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jLabel12.setText("VERDE para CONFIRMAR");

        txt1.setBackground(new java.awt.Color(204, 204, 204));
        txt1.setFont(new java.awt.Font("Arial Black", 1, 36)); // NOI18N
        txt1.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txt1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));
        txt1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt1ActionPerformed(evt);
            }
        });

        txt2.setBackground(new java.awt.Color(204, 204, 204));
        txt2.setFont(new java.awt.Font("Arial Black", 1, 36)); // NOI18N
        txt2.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txt2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));

        txt3.setBackground(new java.awt.Color(204, 204, 204));
        txt3.setFont(new java.awt.Font("Arial Black", 1, 36)); // NOI18N
        txt3.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txt3.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));

        txt4.setBackground(new java.awt.Color(204, 204, 204));
        txt4.setFont(new java.awt.Font("Arial Black", 1, 36)); // NOI18N
        txt4.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txt4.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));

        nomedep.setBackground(new java.awt.Color(204, 204, 204));
        nomedep.setFont(new java.awt.Font("Arial Black", 1, 24)); // NOI18N
        nomedep.setBorder(null);

        partdep.setBackground(new java.awt.Color(204, 204, 204));
        partdep.setFont(new java.awt.Font("Arial Black", 1, 24)); // NOI18N
        partdep.setBorder(null);
        partdep.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                partdepActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout TelaResultado2Layout = new javax.swing.GroupLayout(TelaResultado2);
        TelaResultado2.setLayout(TelaResultado2Layout);
        TelaResultado2Layout.setHorizontalGroup(
            TelaResultado2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(TelaResultado2Layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addGroup(TelaResultado2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(TelaResultado2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(TelaResultado2Layout.createSequentialGroup()
                            .addGroup(TelaResultado2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 344, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 344, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 344, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGap(0, 0, Short.MAX_VALUE))
                        .addGroup(TelaResultado2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(TelaResultado2Layout.createSequentialGroup()
                                .addGroup(TelaResultado2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jLabel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jLabel6, javax.swing.GroupLayout.DEFAULT_SIZE, 56, Short.MAX_VALUE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(partdep, javax.swing.GroupLayout.PREFERRED_SIZE, 259, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGroup(TelaResultado2Layout.createSequentialGroup()
                                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 240, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                    .addGroup(TelaResultado2Layout.createSequentialGroup()
                        .addGap(54, 54, 54)
                        .addGroup(TelaResultado2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(TelaResultado2Layout.createSequentialGroup()
                                .addGap(1, 1, 1)
                                .addGroup(TelaResultado2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(TelaResultado2Layout.createSequentialGroup()
                                        .addComponent(txt1, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(txt2, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(txt3, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(txt4, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(jLabel3)))
                            .addComponent(nomedep, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 313, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(28, 28, 28)
                        .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(46, 46, 46))))
        );
        TelaResultado2Layout.setVerticalGroup(
            TelaResultado2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(TelaResultado2Layout.createSequentialGroup()
                .addGroup(TelaResultado2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(TelaResultado2Layout.createSequentialGroup()
                        .addGap(41, 41, 41)
                        .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(TelaResultado2Layout.createSequentialGroup()
                        .addGap(25, 25, 25)
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(12, 12, 12)
                        .addGroup(TelaResultado2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txt1, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txt2, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txt3, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txt4, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 58, Short.MAX_VALUE)))
                .addGap(14, 14, 14)
                .addGroup(TelaResultado2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(nomedep, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(2, 2, 2)
                .addGroup(TelaResultado2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(partdep, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        jPanel3.setBackground(new java.awt.Color(0, 0, 0));

        bot1.setBackground(new java.awt.Color(0, 0, 0));
        bot1.setFont(new java.awt.Font("Arial Black", 1, 36)); // NOI18N
        bot1.setForeground(new java.awt.Color(255, 255, 255));
        bot1.setText("1");
        bot1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255), 2));
        bot1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bot1ActionPerformed(evt);
            }
        });

        bot4.setBackground(new java.awt.Color(0, 0, 0));
        bot4.setFont(new java.awt.Font("Arial Black", 1, 36)); // NOI18N
        bot4.setForeground(new java.awt.Color(255, 255, 255));
        bot4.setText("4");
        bot4.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255), 2));
        bot4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bot4ActionPerformed(evt);
            }
        });

        botbranco.setFont(new java.awt.Font("Arial Black", 1, 18)); // NOI18N
        botbranco.setText("BRANCO");
        botbranco.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255), 2));
        botbranco.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botbrancoActionPerformed(evt);
            }
        });

        botcorrige.setBackground(new java.awt.Color(255, 0, 0));
        botcorrige.setFont(new java.awt.Font("Arial Black", 1, 18)); // NOI18N
        botcorrige.setText("CORRIGE");
        botcorrige.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255), 2));
        botcorrige.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botcorrigeActionPerformed(evt);
            }
        });

        botconfirma.setBackground(new java.awt.Color(0, 204, 0));
        botconfirma.setFont(new java.awt.Font("Arial Black", 1, 18)); // NOI18N
        botconfirma.setText("CONFIRMA");
        botconfirma.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255), 2));
        botconfirma.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botconfirmaActionPerformed(evt);
            }
        });

        bot7.setBackground(new java.awt.Color(0, 0, 0));
        bot7.setFont(new java.awt.Font("Arial Black", 1, 36)); // NOI18N
        bot7.setForeground(new java.awt.Color(255, 255, 255));
        bot7.setText("7");
        bot7.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255), 2));
        bot7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bot7ActionPerformed(evt);
            }
        });

        bot2.setBackground(new java.awt.Color(0, 0, 0));
        bot2.setFont(new java.awt.Font("Arial Black", 1, 36)); // NOI18N
        bot2.setForeground(new java.awt.Color(255, 255, 255));
        bot2.setText("2");
        bot2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255), 2));
        bot2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bot2ActionPerformed(evt);
            }
        });

        bot5.setBackground(new java.awt.Color(0, 0, 0));
        bot5.setFont(new java.awt.Font("Arial Black", 1, 36)); // NOI18N
        bot5.setForeground(new java.awt.Color(255, 255, 255));
        bot5.setText("5");
        bot5.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255), 2));
        bot5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bot5ActionPerformed(evt);
            }
        });

        bot0.setBackground(new java.awt.Color(0, 0, 0));
        bot0.setFont(new java.awt.Font("Arial Black", 1, 36)); // NOI18N
        bot0.setForeground(new java.awt.Color(255, 255, 255));
        bot0.setText("0");
        bot0.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255), 2));
        bot0.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bot0ActionPerformed(evt);
            }
        });

        bot9.setBackground(new java.awt.Color(0, 0, 0));
        bot9.setFont(new java.awt.Font("Arial Black", 1, 36)); // NOI18N
        bot9.setForeground(new java.awt.Color(255, 255, 255));
        bot9.setText("9");
        bot9.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255), 2));
        bot9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bot9ActionPerformed(evt);
            }
        });

        bot6.setBackground(new java.awt.Color(0, 0, 0));
        bot6.setFont(new java.awt.Font("Arial Black", 1, 36)); // NOI18N
        bot6.setForeground(new java.awt.Color(255, 255, 255));
        bot6.setText("6");
        bot6.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255), 2));
        bot6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bot6ActionPerformed(evt);
            }
        });

        bot3.setBackground(new java.awt.Color(0, 0, 0));
        bot3.setFont(new java.awt.Font("Arial Black", 1, 36)); // NOI18N
        bot3.setForeground(new java.awt.Color(255, 255, 255));
        bot3.setText("3");
        bot3.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255), 2));
        bot3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bot3ActionPerformed(evt);
            }
        });

        bot8.setBackground(new java.awt.Color(0, 0, 0));
        bot8.setFont(new java.awt.Font("Arial Black", 1, 36)); // NOI18N
        bot8.setForeground(new java.awt.Color(255, 255, 255));
        bot8.setText("8");
        bot8.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255), 2));
        bot8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bot8ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(53, 53, 53)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(bot7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(bot4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(bot1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(botbranco, javax.swing.GroupLayout.DEFAULT_SIZE, 125, Short.MAX_VALUE))
                .addGap(31, 31, 31)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(bot5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(bot2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(bot0, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(bot8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(botcorrige, javax.swing.GroupLayout.DEFAULT_SIZE, 125, Short.MAX_VALUE))
                .addGap(31, 31, 31)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(bot6, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(bot3, javax.swing.GroupLayout.PREFERRED_SIZE, 124, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(bot9, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(botconfirma, javax.swing.GroupLayout.PREFERRED_SIZE, 166, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(31, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(bot1, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(bot2, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(bot3, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(21, 21, 21)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(bot5, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(bot6, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(bot4, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(22, 22, 22)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(bot8, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(bot9, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(bot7, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(bot0, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(28, 28, 28)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(botcorrige, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(botbranco, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(botconfirma, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(14, Short.MAX_VALUE))
        );

        jLabel1.setFont(new java.awt.Font("Arial Black", 1, 24)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Urna Eleitoral");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap(44, Short.MAX_VALUE)
                .addComponent(TelaResultado2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(32, 32, 32)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(44, 44, 44))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(30, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(TelaResultado2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(30, 30, 30))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
 
    int contador;
    ControlaEleicao ct = new ControlaEleicao();
    public ResultadoEleicao resultado;
    
    ArrayList<Candidatos> eleicao = new ArrayList<>();//criei essa arraylist para criar os candidatos
    
    public void voto(){
    //criei esses 5 objetos, que são os 5 candidatos
    Candidatos candidato1 = new Candidatos ("EDITICY","BRX");
    Candidatos candidato2 = new Candidatos ("MIRELA","CRX");
    Candidatos candidato3 = new Candidatos ("ISIDORIO","DRX");
    Candidatos candidato4 = new Candidatos ("MARINHO","FRX");
    Candidatos candidato5 = new Candidatos ("TAMARA","GRX");
    Candidatos branco = new Candidatos ("VOTO BRANCO","VOTO BRANCO");
    Candidatos nulo = new Candidatos ("VOTO NULO","VOTO NULO");
    
    
    String cx1 = txt1.getText();
    String cx2 = txt2.getText();
    String cx3 = txt3.getText();
    String cx4 = txt4.getText();
    
    if("0".equals(cx1) && "2".equals(cx2) && "0".equals(cx3) && "0".equals(cx4)){
        nomedep.setText("VOTO BRANCO");
        partdep.setText("VOTO BRANCO");
        Candidatos.add(branco);
    }if("1".equals(cx1) && "0".equals(cx2) && "0".equals(cx3) && "1".equals(cx4)){
        nomedep.setText("EDICITY");
        partdep.setText("BRX");
        foto1();
        Candidatos.add(candidato1);//estou adicionando esse candidato na lista
    }if("2".equals(cx1) && "0".equals(cx2) && "0".equals(cx3) && "2".equals(cx4)){
        nomedep.setText("MIRELA");
        partdep.setText("CRX");
        foto2();
        Candidatos.add(candidato2);
    }if("3".equals(cx1) && "0".equals(cx2) && "0".equals(cx3) && "3".equals(cx4)){
        nomedep.setText("ISIDORIO");
        partdep.setText("DRX");
        foto3();
        Candidatos.add(candidato3);
    }if("4".equals(cx1) && "0".equals(cx2) && "0".equals(cx3) && "4".equals(cx4)){
        nomedep.setText("MARINHO");
        partdep.setText("FRX");
        foto4();
        Candidatos.add(candidato4);
    }if("5".equals(cx1) && "0".equals(cx2) && "0".equals(cx3) && "5".equals(cx4)){
        nomedep.setText("TAMARA");
        partdep.setText("CRX");
        foto5();
        Candidatos.add(candidato5);
    }if("9".equals(cx1) && "2".equals(cx2) && "9".equals(cx3) && "9".equals(cx4)){
        nomedep.setText("VOTO NULO");
        partdep.setText("VOTO NULO");
        Candidatos.add(nulo);
    }
    }
    
    public void resultadoDaEleicao(){
      String cx1 = txt1.getText();
      String cx2 = txt2.getText();
      String cx3 = txt3.getText();
      String cx4 = txt4.getText();
        
      if("1".equals(cx1) && "0".equals(cx2) && "0".equals(cx3) && "1".equals(cx4)){
      String nome = nomedep.getText();
      String partido = partdep.getText();
      
      Candidatos c = new Candidatos(nome, partido);  
      
      ct.CadastraVoto(c);
      JOptionPane.showMessageDialog (null, "Seu voto foi para: " + c);
      System.out.println(c);
      
      }if ("2".equals(cx1) && "0".equals(cx2) && "0".equals(cx3) && "2".equals(cx4)){
      String nome = nomedep.getText();
      String partido = partdep.getText();
      
      Candidatos c = new Candidatos(nome, partido); 
      
      ct.CadastraVoto2(c); 
      JOptionPane.showMessageDialog (null, "Seu voto foi para: " + c);
      System.out.println(c);
              
      }if ("3".equals(cx1) && "0".equals(cx2) && "0".equals(cx3) && "3".equals(cx4)){
      String nome = nomedep.getText();
      String partido = partdep.getText();
      
      Candidatos c = new Candidatos(nome, partido); 
      
      ct.CadastraVoto3(c); 
      JOptionPane.showMessageDialog (null, "Seu voto foi para: " + c);
      System.out.println(c);
      
      }if ("4".equals(cx1) && "0".equals(cx2) && "0".equals(cx3) && "4".equals(cx4)){
      String nome = nomedep.getText();
      String partido = partdep.getText();
      
      Candidatos c = new Candidatos(nome, partido); 
      
      ct.CadastraVoto4(c); 
      JOptionPane.showMessageDialog (null, "Seu voto foi para: " + c);
      System.out.println(c);
      
      }if ("5".equals(cx1) && "0".equals(cx2) && "0".equals(cx3) && "5".equals(cx4)){
      String nome = nomedep.getText();
      String partido = partdep.getText();
      
      Candidatos c = new Candidatos(nome, partido); 
      
      ct.CadastraVoto5(c); 
      JOptionPane.showMessageDialog (null, "Seu voto foi para: " + c);
      System.out.println(c);
      
      }if ("0".equals(cx1) && "2".equals(cx2) && "0".equals(cx3) && "0".equals(cx4)){
      String nome = nomedep.getText();
      String partido = partdep.getText();
      
      Candidatos c = new Candidatos(nome, partido); 
      
      ct.CadastraVotoB(c); 
      JOptionPane.showMessageDialog (null, "Seu voto foi para: " + c);
      System.out.println(c);
      
      }if ("9".equals(cx1) && "2".equals(cx2) && "9".equals(cx3) && "9".equals(cx4)){
      String nome = nomedep.getText();
      String partido = partdep.getText();
      
      Candidatos c = new Candidatos(nome, partido); 
      
      ct.CadastraVotoN(c); 
      JOptionPane.showMessageDialog (null, "Seu voto foi para: " + c);
      System.out.println(c);
      }
      }
    
    public void foto1(){
        ImageIcon ftcandidato = new ImageIcon(getClass().getResource("zedicity.jpeg"));
        ftcandidato.setImage(ftcandidato.getImage().getScaledInstance(foto.getWidth(),foto.getHeight(),1));
        foto.setIcon(ftcandidato);       
    }
    
     public void foto2(){
        ImageIcon ftcandidato = new ImageIcon(getClass().getResource("zMirela.jpg"));
        ftcandidato.setImage(ftcandidato.getImage().getScaledInstance(foto.getWidth(),foto.getHeight(),1));
        foto.setIcon(ftcandidato);       
    }
    
     public void foto3(){
        ImageIcon ftcandidato = new ImageIcon(getClass().getResource("zisidorio.jpg"));
        ftcandidato.setImage(ftcandidato.getImage().getScaledInstance(foto.getWidth(),foto.getHeight(),1));
        foto.setIcon(ftcandidato);       
    }
    
     public void foto4(){
        ImageIcon ftcandidato = new ImageIcon(getClass().getResource("zmarinho.jpg"));
        ftcandidato.setImage(ftcandidato.getImage().getScaledInstance(foto.getWidth(),foto.getHeight(),1));
        foto.setIcon(ftcandidato);       
    }
    
     public void foto5(){
        ImageIcon ftcandidato = new ImageIcon(getClass().getResource("ztamara.jpg"));
        ftcandidato.setImage(ftcandidato.getImage().getScaledInstance(foto.getWidth(),foto.getHeight(),1));
        foto.setIcon(ftcandidato);       
    }
     
    public ArrayList<Candidatos> retornarTodos () {
        return eleicao;
    }   
    
    private void bot7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bot7ActionPerformed
        // TODO add your handling code here:
       contador = contador + 1;
        
       if(contador==1){
           txt1.setText("7");
       }else if(contador==2){
           txt2.setText("7");
       }else if(contador==3){
           txt3.setText("7");
       }else if(contador==4){
           txt4.setText("7");}
             
    }//GEN-LAST:event_bot7ActionPerformed

    private void bot6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bot6ActionPerformed
        // TODO add your handling code here:
        contador = contador + 1;
        if(contador==1){
           txt1.setText("6");
       }else if(contador==2){
           txt2.setText("6");
       }else if(contador==3){
           txt3.setText("6");
       }else if(contador==4){
           txt4.setText("6");
       }
        voto();
    }//GEN-LAST:event_bot6ActionPerformed

    private void botconfirmaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botconfirmaActionPerformed
    resultadoDaEleicao();   
     
    Eleicoes2077DeputadoEsta obj1voto = new Eleicoes2077DeputadoEsta();
    obj1voto.setVisible(true);
    this.dispose();
    }//GEN-LAST:event_botconfirmaActionPerformed

    private void bot1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bot1ActionPerformed
        // TODO add your handling code here:
         contador = contador + 1;
        if(contador==1){
           txt1.setText("1");
       }else if(contador==2){
           txt2.setText("1");
       }else if(contador==3){
           txt3.setText("1");
       }else if(contador==4){
           txt4.setText("1");
       }  
        voto();
    }//GEN-LAST:event_bot1ActionPerformed

    private void bot2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bot2ActionPerformed
        // TODO add your handling code here:
         contador = contador + 1;
        if(contador==1){
           txt1.setText("2");
       }else if(contador==2){
           txt2.setText("2");
       }else if(contador==3){
           txt3.setText("2");
       }else if(contador==4){
           txt4.setText("2");
       }
        voto();
    }//GEN-LAST:event_bot2ActionPerformed

    private void bot3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bot3ActionPerformed
        // TODO add your handling code here:
         contador = contador + 1;
        if(contador==1){
           txt1.setText("3");
       }else if(contador==2){
           txt2.setText("3");
       }else if(contador==3){
           txt3.setText("3");
       }else if(contador==4){
           txt4.setText("3");
       } 
        voto();
    }//GEN-LAST:event_bot3ActionPerformed

    private void bot4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bot4ActionPerformed
        // TODO add your handling code here:
         contador = contador + 1;
        if(contador==1){
           txt1.setText("4");
       }else if(contador==2){
           txt2.setText("4");
       }else if(contador==3){
           txt3.setText("4");
       }else if(contador==4){
           txt4.setText("4");
       }
        voto();
    }//GEN-LAST:event_bot4ActionPerformed

    private void bot5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bot5ActionPerformed
        // TODO add your handling code here:
         contador = contador + 1;
        if(contador==1){
           txt1.setText("5");
       }else if(contador==2){
           txt2.setText("5");
       }else if(contador==3){
           txt3.setText("5");
       }else if(contador==4){
           txt4.setText("5");
       }
        voto();
    }//GEN-LAST:event_bot5ActionPerformed

    private void bot8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bot8ActionPerformed
        // TODO add your handling code here:
         contador = contador + 1;
        if(contador==1){
           txt1.setText("8");
       }else if(contador==2){
           txt2.setText("8");
       }else if(contador==3){
           txt3.setText("8");
       }else if(contador==4){
           txt4.setText("8");
       }
        voto();
    }//GEN-LAST:event_bot8ActionPerformed

    private void bot9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bot9ActionPerformed
        // TODO add your handling code here:
         contador = contador + 1;
        if(contador==1){
           txt1.setText("9");
       }else if(contador==2){
           txt2.setText("9");
       }else if(contador==3){
           txt3.setText("9");
       }else if(contador==4){
           txt4.setText("9");
       }
        voto();
    }//GEN-LAST:event_bot9ActionPerformed

    private void bot0ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bot0ActionPerformed
        // TODO add your handling code here:
         contador = contador + 1;
        if(contador==1){
           txt1.setText("0");
       }else if(contador==2){
           txt2.setText("0");
       }else if(contador==3){
           txt3.setText("0");
       }else if(contador==4){
           txt4.setText("0");
       }
        voto();
    }//GEN-LAST:event_bot0ActionPerformed

    private void botcorrigeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botcorrigeActionPerformed
        // TODO add your handling code here:
         txt1.setText(null);
         txt2.setText(null);
         txt3.setText(null);
         txt4.setText(null);
         foto.setIcon(null);
         nomedep.setText(null);
         partdep.setText(null);
         contador = 0;       
    }//GEN-LAST:event_botcorrigeActionPerformed

    private void partdepActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_partdepActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_partdepActionPerformed

    private void botbrancoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botbrancoActionPerformed
        // TODO add your handling code here:
        txt1.setText("0");
        txt2.setText("0");
        txt3.setText("0");
        txt4.setText("0"); 
        foto.setIcon(null);
        voto();
    }//GEN-LAST:event_botbrancoActionPerformed

    private void txt1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt1ActionPerformed
        // TODO add your handling code here:

    }//GEN-LAST:event_txt1ActionPerformed

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
            java.util.logging.Logger.getLogger(Eleicoes2077DeputadoFede.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Eleicoes2077DeputadoFede.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Eleicoes2077DeputadoFede.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Eleicoes2077DeputadoFede.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Eleicoes2077DeputadoFede().setVisible(true);
                
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel TelaResultado2;
    private javax.swing.JButton bot0;
    private javax.swing.JButton bot1;
    private javax.swing.JButton bot2;
    private javax.swing.JButton bot3;
    private javax.swing.JButton bot4;
    private javax.swing.JButton bot5;
    private javax.swing.JButton bot6;
    private javax.swing.JButton bot7;
    private javax.swing.JButton bot8;
    private javax.swing.JButton bot9;
    private javax.swing.JButton botbranco;
    private javax.swing.JButton botconfirma;
    private javax.swing.JButton botcorrige;
    private javax.swing.JLabel foto;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JTextField nomedep;
    private javax.swing.JTextField partdep;
    private javax.swing.JTextField txt1;
    private javax.swing.JTextField txt2;
    private javax.swing.JTextField txt3;
    private javax.swing.JTextField txt4;
    // End of variables declaration//GEN-END:variables
}
