/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package calculator;

/**
 *
 * @author muhammadfiqri
 */
public class calculatornew extends javax.swing.JFrame {

    String angka;
    int pilih;
    double angka1, angka2, jumlah;

    /**
     * Creates new form calculatornew
     */
    public calculatornew() {
        initComponents();
        angka = "";

        ON.setEnabled(false); //ON button disable
    }

    void angka1() {
        angka += "1";
        jTextField1.setText(angka);
    }

    void angka2() {
        angka += "2";
        jTextField1.setText(angka);
    }

    void angka3() {
        angka += "3";
        jTextField1.setText(angka);
    }

    void angka4() {
        angka += "4";
        jTextField1.setText(angka);
    }

    void angka5() {
        angka += "5";
        jTextField1.setText(angka);
    }

    void angka6() {
        angka += "6";
        jTextField1.setText(angka);
    }

    void angka7() {
        angka += "7";
        jTextField1.setText(angka);
    }

    void angka8() {
        angka += "8";
        jTextField1.setText(angka);
    }

    void angka9() {
        angka += "9";
        jTextField1.setText(angka);
    }

    void angka0() {
        angka += "0";
        jTextField1.setText(angka);
    }

    void angka00() {
        angka += "00";
        jTextField1.setText(angka);
    }

    void koma() {
        angka += ".";
        jTextField1.setText(angka);
    }
    void hasil() {
        switch (pilih) {
            case 1:
                angka2 = Double.parseDouble(angka);
                jumlah = angka1 + angka2;
                angka = Double.toString(jumlah);
                jTextField1.setText(angka);
                break;
            case 2:
                angka2 = Double.parseDouble(angka);
                jumlah = angka1 - angka2;
                angka = Double.toString(jumlah);
                jTextField1.setText(angka);
                break;
            case 3:
                angka2 = Double.parseDouble(angka);
                jumlah = angka1 * angka2;
                angka = Double.toString(jumlah);
                jTextField1.setText(angka);
                break;
            case 4:
                angka2 = Double.parseDouble(angka);
                jumlah = angka1 / angka2;
                angka = Double.toString(jumlah);
                jTextField1.setText(angka);
                break;
        }
    }
    void tambah() {
        angka1 = Double.parseDouble(angka);
        jTextField1.setText("+");
        angka = "";
        pilih = 1;
    }
    void kurang() {
        angka1 = Double.parseDouble(angka);
        jTextField1.setText("-");
        angka = "";
        pilih = 2;
    }
    void kali() {
        angka1 = Double.parseDouble(angka);
        jTextField1.setText("*");
        angka = "";
        pilih = 3;
    }
    void bagi() {
        angka1 = Double.parseDouble(angka);
        jTextField1.setText("/");
        angka = "";
        pilih = 4;
    }
    public void enable() {
        jTextField1.setEnabled(true);

        ON.setEnabled(false); //ON button Disable
        OFF.setEnabled(true); //OFF button Enable

        jButtonSatu.setEnabled(true);
        jButtonDua.setEnabled(true);
        jButtonTiga.setEnabled(true);
        jButtonEmpat.setEnabled(true);
        jButtonLima.setEnabled(true);
        jButtonEnam.setEnabled(true);
        jButtonTujuh.setEnabled(true);
        jButtonDelapan.setEnabled(true);
        jButtonSembilan.setEnabled(true);
        jButtonNol.setEnabled(true);
        jButtonKoma.setEnabled(true);
        jButtonNolNol.setEnabled(true);
        jButtonTambah.setEnabled(true);
        jButtonKurang.setEnabled(true);
        jButtonKali.setEnabled(true);
        jButtonBagi.setEnabled(true);
        jButtonAllClear.setEnabled(true);
        jButtonHitung.setEnabled(true);
    }

    public void disable() {
        jTextField1.setEnabled(false);

        ON.setEnabled(true); //ON button Enable
        OFF.setEnabled(false); //OFF button Disable

        jButtonSatu.setEnabled(false);
        jButtonDua.setEnabled(false);
        jButtonTiga.setEnabled(false);
        jButtonEmpat.setEnabled(false);
        jButtonLima.setEnabled(false);
        jButtonEnam.setEnabled(false);
        jButtonTujuh.setEnabled(false);
        jButtonDelapan.setEnabled(false);
        jButtonSembilan.setEnabled(false);
        jButtonNol.setEnabled(false);
        jButtonKoma.setEnabled(false);
        jButtonNolNol.setEnabled(false);
        jButtonTambah.setEnabled(false);
        jButtonKurang.setEnabled(false);
        jButtonKali.setEnabled(false);
        jButtonBagi.setEnabled(false);
        jButtonAllClear.setEnabled(false);
        jButtonHitung.setEnabled(false);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        jTextField1 = new javax.swing.JTextField();
        ON = new javax.swing.JRadioButton();
        jButtonAllClear = new javax.swing.JButton();
        jButtonKurang = new javax.swing.JButton();
        jButtonTambah = new javax.swing.JButton();
        jButtonBagi = new javax.swing.JButton();
        jButtonKali = new javax.swing.JButton();
        jButtonEmpat = new javax.swing.JButton();
        jButtonDelapan = new javax.swing.JButton();
        jButtonSatu = new javax.swing.JButton();
        jButtonKoma = new javax.swing.JButton();
        jButtonLima = new javax.swing.JButton();
        jButtonTujuh = new javax.swing.JButton();
        jButtonDua = new javax.swing.JButton();
        jButtonNol = new javax.swing.JButton();
        jButtonEnam = new javax.swing.JButton();
        jButtonTiga = new javax.swing.JButton();
        jButtonHitung = new javax.swing.JButton();
        jButtonSembilan = new javax.swing.JButton();
        OFF = new javax.swing.JRadioButton();
        jButtonNolNol = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Calculator");
        setType(java.awt.Window.Type.UTILITY);

        jTextField1.setFont(new java.awt.Font("Arial", 1, 22)); // NOI18N
        jTextField1.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        jTextField1.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));

        buttonGroup1.add(ON);
        ON.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        ON.setText("ON");
        ON.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ONActionPerformed(evt);
            }
        });

        jButtonAllClear.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jButtonAllClear.setText("AC");
        jButtonAllClear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonAllClearActionPerformed(evt);
            }
        });

        jButtonKurang.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jButtonKurang.setText("-");
        jButtonKurang.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonKurangActionPerformed(evt);
            }
        });

        jButtonTambah.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jButtonTambah.setText("+");
        jButtonTambah.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonTambahActionPerformed(evt);
            }
        });

        jButtonBagi.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jButtonBagi.setText("/");
        jButtonBagi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonBagiActionPerformed(evt);
            }
        });

        jButtonKali.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jButtonKali.setText("*");
        jButtonKali.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonKaliActionPerformed(evt);
            }
        });

        jButtonEmpat.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jButtonEmpat.setText("4");
        jButtonEmpat.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonEmpatActionPerformed(evt);
            }
        });

        jButtonDelapan.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jButtonDelapan.setText("8");
        jButtonDelapan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonDelapanActionPerformed(evt);
            }
        });

        jButtonSatu.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jButtonSatu.setText("1");
        jButtonSatu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonSatuActionPerformed(evt);
            }
        });

        jButtonKoma.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jButtonKoma.setText(".");
        jButtonKoma.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonKomaActionPerformed(evt);
            }
        });

        jButtonLima.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jButtonLima.setText("5");
        jButtonLima.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonLimaActionPerformed(evt);
            }
        });

        jButtonTujuh.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jButtonTujuh.setText("7");
        jButtonTujuh.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonTujuhActionPerformed(evt);
            }
        });

        jButtonDua.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jButtonDua.setText("2");
        jButtonDua.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonDuaActionPerformed(evt);
            }
        });

        jButtonNol.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jButtonNol.setText("0");
        jButtonNol.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonNolActionPerformed(evt);
            }
        });

        jButtonEnam.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jButtonEnam.setText("6");
        jButtonEnam.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonEnamActionPerformed(evt);
            }
        });

        jButtonTiga.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jButtonTiga.setText("3");
        jButtonTiga.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonTigaActionPerformed(evt);
            }
        });

        jButtonHitung.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jButtonHitung.setText("=");
        jButtonHitung.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonHitungActionPerformed(evt);
            }
        });

        jButtonSembilan.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jButtonSembilan.setText("9");
        jButtonSembilan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonSembilanActionPerformed(evt);
            }
        });

        buttonGroup1.add(OFF);
        OFF.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        OFF.setText("OFF");
        OFF.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                OFFActionPerformed(evt);
            }
        });

        jButtonNolNol.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jButtonNolNol.setText("00");
        jButtonNolNol.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonNolNolActionPerformed(evt);
            }
        });

        jLabel1.setBackground(new java.awt.Color(255, 51, 51));
        jLabel1.setFont(new java.awt.Font("Tahoma", 3, 11)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(102, 0, 102));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setLabelFor(this);
        jLabel1.setText("Dibuat oleh : MuhammadFiqri");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(jTextField1, javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(ON)
                                .addGroup(layout.createSequentialGroup()
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                            .addComponent(jButtonEmpat, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                            .addComponent(jButtonLima, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                            .addComponent(jButtonSatu, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                            .addComponent(jButtonDua, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGroup(layout.createSequentialGroup()
                                            .addComponent(jButtonTujuh, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                            .addComponent(jButtonDelapan, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGroup(layout.createSequentialGroup()
                                            .addComponent(jButtonNol, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                            .addComponent(jButtonKoma, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jButtonEnam, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(jButtonTiga, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(jButtonSembilan, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addComponent(jButtonNolNol))
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(layout.createSequentialGroup()
                                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addComponent(jButtonBagi, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addComponent(jButtonKali, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE))
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                            .addComponent(jButtonHitung, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGroup(layout.createSequentialGroup()
                                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addComponent(jButtonKurang, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addComponent(jButtonTambah, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE))
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addComponent(OFF)
                                                .addComponent(jButtonAllClear, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE))))))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(43, 43, 43)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 186, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(ON)
                    .addComponent(OFF))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jButtonDua)
                            .addComponent(jButtonSatu)
                            .addComponent(jButtonTiga)
                            .addComponent(jButtonTambah))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jButtonLima)
                            .addComponent(jButtonEmpat)
                            .addComponent(jButtonEnam)
                            .addComponent(jButtonKurang)))
                    .addComponent(jButtonAllClear, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jButtonTujuh)
                            .addComponent(jButtonDelapan)
                            .addComponent(jButtonSembilan)
                            .addComponent(jButtonKali))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jButtonNol)
                            .addComponent(jButtonKoma)
                            .addComponent(jButtonNolNol)
                            .addComponent(jButtonBagi)))
                    .addComponent(jButtonHitung, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, 24, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonTambahActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonTambahActionPerformed
        // TODO add your handling code here:
        tambah();
    }//GEN-LAST:event_jButtonTambahActionPerformed

    private void jButtonSatuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonSatuActionPerformed
        // TODO add your handling code here:
        angka1();
    }//GEN-LAST:event_jButtonSatuActionPerformed

    private void jButtonNolActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonNolActionPerformed
        // TODO add your handling code here:
        angka0();
    }//GEN-LAST:event_jButtonNolActionPerformed

    private void jButtonDuaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonDuaActionPerformed
        // TODO add your handling code here:
        angka2();
    }//GEN-LAST:event_jButtonDuaActionPerformed

    private void jButtonTigaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonTigaActionPerformed
        // TODO add your handling code here:
        angka3();
    }//GEN-LAST:event_jButtonTigaActionPerformed

    private void jButtonEmpatActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonEmpatActionPerformed
        // TODO add your handling code here:
        angka4();
    }//GEN-LAST:event_jButtonEmpatActionPerformed

    private void jButtonLimaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonLimaActionPerformed
        // TODO add your handling code here:
        angka5();
    }//GEN-LAST:event_jButtonLimaActionPerformed

    private void jButtonEnamActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonEnamActionPerformed
        // TODO add your handling code here:
        angka6();
    }//GEN-LAST:event_jButtonEnamActionPerformed

    private void jButtonTujuhActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonTujuhActionPerformed
        // TODO add your handling code here:
        angka7();
    }//GEN-LAST:event_jButtonTujuhActionPerformed

    private void jButtonDelapanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonDelapanActionPerformed
        // TODO add your handling code here:
        angka8();
    }//GEN-LAST:event_jButtonDelapanActionPerformed

    private void jButtonSembilanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonSembilanActionPerformed
        // TODO add your handling code here:
        angka9();
    }//GEN-LAST:event_jButtonSembilanActionPerformed

    private void jButtonKomaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonKomaActionPerformed
        // TODO add your handling code here:
        koma();
    }//GEN-LAST:event_jButtonKomaActionPerformed

    private void jButtonKurangActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonKurangActionPerformed
        // TODO add your handling code here:
        kurang();
    }//GEN-LAST:event_jButtonKurangActionPerformed

    private void jButtonKaliActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonKaliActionPerformed
        // TODO add your handling code here:
        kali();
    }//GEN-LAST:event_jButtonKaliActionPerformed

    private void jButtonBagiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonBagiActionPerformed
        // TODO add your handling code here:
        bagi();
    }//GEN-LAST:event_jButtonBagiActionPerformed

    private void jButtonAllClearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonAllClearActionPerformed
        // TODO add your handling code here:
        jTextField1.setText("");
        angka1 = (int) 0.0;
        angka2 = (int) 0.0;
        jumlah = (int) 0.0;
        angka = "";
    }//GEN-LAST:event_jButtonAllClearActionPerformed

    private void OFFActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_OFFActionPerformed
        // TODO add your handling code here:
        disable(); //call disable method
    }//GEN-LAST:event_OFFActionPerformed

    private void ONActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ONActionPerformed
        // TODO add your handling code here:
        enable(); //call enable method
    }//GEN-LAST:event_ONActionPerformed

    private void jButtonHitungActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonHitungActionPerformed
        // TODO add your handling code here:
        hasil();
    }//GEN-LAST:event_jButtonHitungActionPerformed

    private void jButtonNolNolActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonNolNolActionPerformed
        // TODO add your handling code here:
        angka00();
    }//GEN-LAST:event_jButtonNolNolActionPerformed

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
            java.util.logging.Logger.getLogger(calculatornew.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(calculatornew.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(calculatornew.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(calculatornew.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new calculatornew().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JRadioButton OFF;
    private javax.swing.JRadioButton ON;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JButton jButtonAllClear;
    private javax.swing.JButton jButtonBagi;
    private javax.swing.JButton jButtonDelapan;
    private javax.swing.JButton jButtonDua;
    private javax.swing.JButton jButtonEmpat;
    private javax.swing.JButton jButtonEnam;
    private javax.swing.JButton jButtonHitung;
    private javax.swing.JButton jButtonKali;
    private javax.swing.JButton jButtonKoma;
    private javax.swing.JButton jButtonKurang;
    private javax.swing.JButton jButtonLima;
    private javax.swing.JButton jButtonNol;
    private javax.swing.JButton jButtonNolNol;
    private javax.swing.JButton jButtonSatu;
    private javax.swing.JButton jButtonSembilan;
    private javax.swing.JButton jButtonTambah;
    private javax.swing.JButton jButtonTiga;
    private javax.swing.JButton jButtonTujuh;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JTextField jTextField1;
    // End of variables declaration//GEN-END:variables
}
