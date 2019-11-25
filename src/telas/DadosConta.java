package telas;

import modelo.Central;

public class DadosConta extends javax.swing.JFrame {

    public DadosConta() {
        initComponents();
        String hiden = "";
        for (int i = 0; i < Central.getJogador1().getSenha().length(); i++) {
            hiden = hiden + "*";
        }
        dadosNome.setText(Central.getJogador1().getLogin());
        dadosSenha.setText(hiden);
        vitorias.setText(Central.getJogador1().getVitorias() + "");
        pontos.setText(Central.getJogador1().getPontos() + "");
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        b_concluido = new javax.swing.JButton();
        dadosNome = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        dadosSenha = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        vitorias = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        pontos = new javax.swing.JLabel();
        editarUsuario = new javax.swing.JLabel();
        editarSenha = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder("Dados da conta"));

        jLabel1.setText("Nome de usuário:");

        b_concluido.setText("Concluido");
        b_concluido.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b_concluidoActionPerformed(evt);
            }
        });

        dadosNome.setText("Nome de usuário");

        jLabel2.setText("Senha:");

        dadosSenha.setText("Senha");

        jLabel3.setText("Vitórias:");

        vitorias.setText("vit");

        jLabel4.setText("Pontos:");

        pontos.setText("ptns");

        editarUsuario.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/editar.png"))); // NOI18N
        editarUsuario.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                editarUsuarioMouseClicked(evt);
            }
        });

        editarSenha.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/editar.png"))); // NOI18N
        editarSenha.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                editarSenhaMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel1)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(dadosNome, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel3)
                                .addGap(18, 149, Short.MAX_VALUE)
                                .addComponent(b_concluido)))
                        .addGap(2, 2, 2)
                        .addComponent(editarUsuario))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(vitorias)
                            .addComponent(pontos))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(dadosSenha, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(editarSenha))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(editarUsuario, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(dadosNome))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(dadosSenha)
                    .addComponent(editarSenha))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(pontos))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(vitorias)
                    .addComponent(jLabel3))
                .addGap(13, 13, 13)
                .addComponent(b_concluido)
                .addContainerGap(24, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        setSize(new java.awt.Dimension(344, 232));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void b_concluidoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b_concluidoActionPerformed
        dispose();
    }//GEN-LAST:event_b_concluidoActionPerformed

    private void editarUsuarioMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_editarUsuarioMouseClicked
        EditarUsuario editarUsuario = new EditarUsuario(this, true);
        this.dispose();
        editarUsuario.setVisible(true);
    }//GEN-LAST:event_editarUsuarioMouseClicked

    private void editarSenhaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_editarSenhaMouseClicked
        EditarSenha editarSenha = new EditarSenha(this, true);
        this.dispose();
        editarSenha.setVisible(true);
    }//GEN-LAST:event_editarSenhaMouseClicked

    public static void main(String args[]) {
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(DadosConta.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(DadosConta.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(DadosConta.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(DadosConta.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new DadosConta().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton b_concluido;
    private javax.swing.JLabel dadosNome;
    private javax.swing.JLabel dadosSenha;
    private javax.swing.JLabel editarSenha;
    private javax.swing.JLabel editarUsuario;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel pontos;
    private javax.swing.JLabel vitorias;
    // End of variables declaration//GEN-END:variables
}
