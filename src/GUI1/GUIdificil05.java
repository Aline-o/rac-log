/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GUI1;

/**
 *
 * @author ALINE
 */
public class GUIdificil05 extends javax.swing.JPanel {

    /**
     * Creates new form GUIdificil1
     */
    public GUIdificil05() {
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

        bgOpcoes = new javax.swing.ButtonGroup();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();
        jrbOpcaoA = new javax.swing.JRadioButton();
        jrbOpcaoB = new javax.swing.JRadioButton();
        jrbOpcaoC = new javax.swing.JRadioButton();
        jrbOpcaoD = new javax.swing.JRadioButton();
        jrbOpcaoE = new javax.swing.JRadioButton();
        jbOkResp = new javax.swing.JButton();
        jbSalvar = new javax.swing.JButton();
        jbDesistir = new javax.swing.JButton();

        jTextArea1.setEditable(false);
        jTextArea1.setColumns(20);
        jTextArea1.setRows(5);
        jTextArea1.setText("Em uma empresa de móveis, um cliente encomenda um guarda-roupa \nnas dimensões 220 cm de altura, 120 cm de largura e 50 cm de \nprofundidade. Alguns dias depois, o projetista, com o desenho elaborado \nna escala 1 : 8, entra em contato com o cliente para fazer sua \napresentação. No momento da impressão, o profissional percebe que \no desenho não caberia na folha de papel que costumava usar. \nPara resolver o problema, configurou a impressora para que a figura \nfosse reduzida em 20%. A altura, a largura e a profundidade do desenho \nimpresso para a apresentação serão, respectivamente: ");
        jScrollPane1.setViewportView(jTextArea1);

        bgOpcoes.add(jrbOpcaoA);
        jrbOpcaoA.setText("a) 22,00 cm, 12,00 cm e 5,00 cm.");
        jrbOpcaoA.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jrbOpcaoAActionPerformed(evt);
            }
        });

        bgOpcoes.add(jrbOpcaoB);
        jrbOpcaoB.setText("b) 27,50 cm, 15,00 cm e 6,25 cm.");
        jrbOpcaoB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jrbOpcaoBActionPerformed(evt);
            }
        });

        bgOpcoes.add(jrbOpcaoC);
        jrbOpcaoC.setText("c) 34,37 cm, 18,75 cm e 7,81 cm.");
        jrbOpcaoC.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jrbOpcaoCActionPerformed(evt);
            }
        });

        bgOpcoes.add(jrbOpcaoD);
        jrbOpcaoD.setText("d) 35,20 cm, 19,20 cm e 8,00 cm.");
        jrbOpcaoD.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jrbOpcaoDActionPerformed(evt);
            }
        });

        bgOpcoes.add(jrbOpcaoE);
        jrbOpcaoE.setText("e) 44,00 cm, 24,00 cm e 10,00 cm.");
        jrbOpcaoE.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jrbOpcaoEActionPerformed(evt);
            }
        });

        jbOkResp.setText("OK");
        jbOkResp.setEnabled(false);
        jbOkResp.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbOkRespActionPerformed(evt);
            }
        });

        jbSalvar.setText("Salvar");

        jbDesistir.setText("Desistir");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(485, Short.MAX_VALUE)
                .addComponent(jbOkResp, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jbSalvar)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jbDesistir)
                .addContainerGap())
            .addComponent(jScrollPane1)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jrbOpcaoE)
                    .addComponent(jrbOpcaoC)
                    .addComponent(jrbOpcaoB)
                    .addComponent(jrbOpcaoA)
                    .addComponent(jrbOpcaoD))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 400, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jrbOpcaoA)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jrbOpcaoB)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jrbOpcaoC)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jrbOpcaoD)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jrbOpcaoE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jbOkResp)
                    .addComponent(jbSalvar)
                    .addComponent(jbDesistir)))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void jbOkRespActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbOkRespActionPerformed
        // TODO add your handling code here:
        //jrbOpcaoA
    }//GEN-LAST:event_jbOkRespActionPerformed

    private void jrbOpcaoAActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jrbOpcaoAActionPerformed
        // TODO add your handling code here:
        jbOkResp.setEnabled(true);
    }//GEN-LAST:event_jrbOpcaoAActionPerformed

    private void jrbOpcaoBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jrbOpcaoBActionPerformed
        // TODO add your handling code here:
        jbOkResp.setEnabled(true);
    }//GEN-LAST:event_jrbOpcaoBActionPerformed

    private void jrbOpcaoCActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jrbOpcaoCActionPerformed
        // TODO add your handling code here:
        jbOkResp.setEnabled(true);
    }//GEN-LAST:event_jrbOpcaoCActionPerformed

    private void jrbOpcaoDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jrbOpcaoDActionPerformed
        // TODO add your handling code here:
        jbOkResp.setEnabled(true);
    }//GEN-LAST:event_jrbOpcaoDActionPerformed

    private void jrbOpcaoEActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jrbOpcaoEActionPerformed
        // TODO add your handling code here:
        jbOkResp.setEnabled(true);
    }//GEN-LAST:event_jrbOpcaoEActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup bgOpcoes;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextArea jTextArea1;
    private javax.swing.JButton jbDesistir;
    private javax.swing.JButton jbOkResp;
    private javax.swing.JButton jbSalvar;
    private javax.swing.JRadioButton jrbOpcaoA;
    private javax.swing.JRadioButton jrbOpcaoB;
    private javax.swing.JRadioButton jrbOpcaoC;
    private javax.swing.JRadioButton jrbOpcaoD;
    private javax.swing.JRadioButton jrbOpcaoE;
    // End of variables declaration//GEN-END:variables
}
