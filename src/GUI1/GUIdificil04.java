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
public class GUIdificil04 extends javax.swing.JPanel {

    /**
     * Creates new form GUIdificil1
     */
    public GUIdificil04() {
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
        jTextArea1.setText("Diante da hipótese do comprometimento da qualidade da \nágua retirada do volume morto de alguns sistemas hídricos, \nos técnicos de um laboratório decidiram testar cinco tipos de filtros \nde água. Dentre esses, os quatro com melhor desempenho serão \nescolhidos para futura comercialização. Nos testes, \nforam medidas as massas de agentes conta- minantes, em miligrama, \nque não são capturados por cada filtro em diferentes períodos, em dia, \ncomo segue: \n• Filtro 1 (F1): 18 mg em 6 dias; \n• Filtro 2 (F2): 15 mg em 3 dias; \n• Filtro 3 (F3): 18 mg em 4 dias; \n• Filtro 4 (F4): 6 mg em 3 dias; \n• Filtro 5 (F5): 3 mg em 2 dias. \nAo final, descarta-se o filtro com a maior razão entre a medida \nda massa de contaminantes não capturados e o número de dias, \no que corresponde ao de pior desempenho. \nO filtro descartado é o ");
        jScrollPane1.setViewportView(jTextArea1);

        bgOpcoes.add(jrbOpcaoA);
        jrbOpcaoA.setText("a) F1.");
        jrbOpcaoA.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jrbOpcaoAActionPerformed(evt);
            }
        });

        bgOpcoes.add(jrbOpcaoB);
        jrbOpcaoB.setText("b) F2.");
        jrbOpcaoB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jrbOpcaoBActionPerformed(evt);
            }
        });

        bgOpcoes.add(jrbOpcaoC);
        jrbOpcaoC.setText("c) F3.");
        jrbOpcaoC.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jrbOpcaoCActionPerformed(evt);
            }
        });

        bgOpcoes.add(jrbOpcaoD);
        jrbOpcaoD.setText("d) F4.");
        jrbOpcaoD.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jrbOpcaoDActionPerformed(evt);
            }
        });

        bgOpcoes.add(jrbOpcaoE);
        jrbOpcaoE.setText("e) F5.");
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
        //jrbOpcaoB
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
