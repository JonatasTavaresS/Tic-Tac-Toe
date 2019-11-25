package telas;

import javax.swing.JOptionPane;
import modelo.Central;

public class EditarSenha extends javax.swing.JDialog {

    public EditarSenha(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        l_imagem = new javax.swing.JLabel();
        l_senhaAtual = new javax.swing.JLabel();
        l_nsenha = new javax.swing.JLabel();
        nsenhatxt = new javax.swing.JPasswordField();
        l_repitansenha = new javax.swing.JLabel();
        repitansenhatxt = new javax.swing.JPasswordField();
        b_concluido = new javax.swing.JButton();
        senhaAtualtxt = new javax.swing.JPasswordField();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setResizable(false);

        jPanel1.setMaximumSize(new java.awt.Dimension(360, 360));
        jPanel1.setMinimumSize(new java.awt.Dimension(360, 360));
        jPanel1.setPreferredSize(new java.awt.Dimension(360, 360));

        l_imagem.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/TicTacToe.png"))); // NOI18N

        l_senhaAtual.setText("Senha atual");

        l_nsenha.setText("Nova senha");

        nsenhatxt.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                nsenhatxtKeyPressed(evt);
            }
        });

        l_repitansenha.setText("Repita a nova senha");

        repitansenhatxt.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                repitansenhatxtKeyPressed(evt);
            }
        });

        b_concluido.setText("Concluído");
        b_concluido.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b_concluidoActionPerformed(evt);
            }
        });
        b_concluido.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                b_concluidoKeyPressed(evt);
            }
        });

        senhaAtualtxt.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                senhaAtualtxtKeyPressed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(83, Short.MAX_VALUE)
                .addComponent(l_imagem)
                .addGap(77, 77, 77))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(55, 55, 55)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(b_concluido)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(l_senhaAtual)
                        .addComponent(l_nsenha)
                        .addComponent(nsenhatxt, javax.swing.GroupLayout.DEFAULT_SIZE, 251, Short.MAX_VALUE)
                        .addComponent(l_repitansenha)
                        .addComponent(repitansenhatxt)
                        .addComponent(senhaAtualtxt)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(l_imagem)
                .addGap(18, 18, 18)
                .addComponent(l_senhaAtual)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(senhaAtualtxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(l_nsenha)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(nsenhatxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(l_repitansenha)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(repitansenhatxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(b_concluido)
                .addContainerGap(51, Short.MAX_VALUE))
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

        setSize(new java.awt.Dimension(376, 398));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void nsenhatxtKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_nsenhatxtKeyPressed
        if (evt.getKeyCode() == evt.VK_ENTER) {
            repitansenhatxt.requestFocus();
        }
    }//GEN-LAST:event_nsenhatxtKeyPressed

    private void repitansenhatxtKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_repitansenhatxtKeyPressed
        if (evt.getKeyCode() == evt.VK_ENTER) {
            String senhaAtual = senhaAtualtxt.getText();
            String senhavar = nsenhatxt.getText();
            String confirmar = repitansenhatxt.getText();
            int editar = Central.editarSenha(senhaAtual, senhavar, confirmar);
            if (senhaAtual.equals("") || senhavar.equals("") || confirmar.equals("")) {
                JOptionPane.showMessageDialog(null, "Campo(s) não preenchido(s).");
            } else if (editar == 1) {
                JOptionPane.showMessageDialog(null, "Sua senha atual foi inserida incorretamente.\nTente novamente.");
                senhaAtualtxt.setText("");
                senhaAtualtxt.requestFocus();
            } else if (editar == 2) {
                JOptionPane.showMessageDialog(null, "A senha deve ter no mínimo 6 caracteres.");
            } else if (editar == 3) {
                JOptionPane.showMessageDialog(null, "Senha editada com sucesso!");
                this.dispose();
            } else if (editar == 0) {
                JOptionPane.showMessageDialog(null, "Senhas não correspondem.");
                nsenhatxt.requestFocus();
            }
        }
    }//GEN-LAST:event_repitansenhatxtKeyPressed

    private void b_concluidoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b_concluidoActionPerformed
        String senhaAtual = senhaAtualtxt.getText();
        String senhavar = nsenhatxt.getText();
        String confirmar = repitansenhatxt.getText();
        int editar = Central.editarSenha(senhaAtual, senhavar, confirmar);
        if (senhaAtual.equals("") || senhavar.equals("") || confirmar.equals("")) {
            JOptionPane.showMessageDialog(null, "Campo(s) não preenchido(s).");
        } else if (editar == 1) {
            JOptionPane.showMessageDialog(null, "Sua senha atual foi inserida incorretamente.\nTente novamente.");
            senhaAtualtxt.setText("");
            senhaAtualtxt.requestFocus();
        } else if (editar == 2) {
            JOptionPane.showMessageDialog(null, "A senha deve ter no mínimo 6 caracteres.");
        } else if (editar == 3) {
            JOptionPane.showMessageDialog(null, "Senha editada com sucesso!");
            this.dispose();
        } else if (editar == 0) {
            JOptionPane.showMessageDialog(null, "Senhas não correspondem.");
            nsenhatxt.requestFocus();
        }
    }//GEN-LAST:event_b_concluidoActionPerformed

    private void b_concluidoKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_b_concluidoKeyPressed
        if (evt.getKeyCode() == evt.VK_ENTER) {
            String senhaAtual = senhaAtualtxt.getText();
            String senhavar = nsenhatxt.getText();
            String confirmar = repitansenhatxt.getText();
            int editar = Central.editarSenha(senhaAtual, senhavar, confirmar);
            if (senhaAtual.equals("") || senhavar.equals("") || confirmar.equals("")) {
                JOptionPane.showMessageDialog(null, "Campo(s) não preenchido(s).");
            } else if (editar == 1) {
                JOptionPane.showMessageDialog(null, "Sua senha atual foi inserida incorretamente.\nTente novamente.");
                senhaAtualtxt.setText("");
                senhaAtualtxt.requestFocus();
            } else if (editar == 2) {
                JOptionPane.showMessageDialog(null, "A senha deve ter no mínimo 6 caracteres.");
            } else if (editar == 3) {
                JOptionPane.showMessageDialog(null, "Senha editada com sucesso!");
                this.dispose();
            } else if (editar == 0) {
                JOptionPane.showMessageDialog(null, "Senhas não correspondem.");
                nsenhatxt.requestFocus();
            }
        }
    }//GEN-LAST:event_b_concluidoKeyPressed

    private void senhaAtualtxtKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_senhaAtualtxtKeyPressed
        if (evt.getKeyCode() == evt.VK_ENTER) {
            nsenhatxt.requestFocus();
        }
    }//GEN-LAST:event_senhaAtualtxtKeyPressed

    public static void main(String args[]) {
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(EditarSenha.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(EditarSenha.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(EditarSenha.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(EditarSenha.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                EditarSenha dialog = new EditarSenha(new javax.swing.JFrame(), true);
                dialog.addWindowListener(new java.awt.event.WindowAdapter() {
                    @Override
                    public void windowClosing(java.awt.event.WindowEvent e) {
                        System.exit(0);
                    }
                });
                dialog.setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton b_concluido;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel l_imagem;
    private javax.swing.JLabel l_nsenha;
    private javax.swing.JLabel l_repitansenha;
    private javax.swing.JLabel l_senhaAtual;
    private javax.swing.JPasswordField nsenhatxt;
    private javax.swing.JPasswordField repitansenhatxt;
    private javax.swing.JPasswordField senhaAtualtxt;
    // End of variables declaration//GEN-END:variables
}
