package telas;

import javax.swing.JOptionPane;
import modelo.Central;

public class EditarUsuario extends javax.swing.JDialog {

    public EditarUsuario(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        l_nusuario = new javax.swing.JLabel();
        nUsuariotxt = new javax.swing.JTextField();
        b_concluido = new javax.swing.JButton();
        l_imagem = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setResizable(false);

        jPanel1.setMaximumSize(new java.awt.Dimension(360, 261));
        jPanel1.setMinimumSize(new java.awt.Dimension(360, 261));
        jPanel1.setPreferredSize(new java.awt.Dimension(360, 261));

        l_nusuario.setText("Novo nome de usuário");

        nUsuariotxt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nUsuariotxtActionPerformed(evt);
            }
        });
        nUsuariotxt.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                nUsuariotxtKeyPressed(evt);
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

        l_imagem.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/TicTacToe.png"))); // NOI18N

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(80, 80, 80)
                .addComponent(l_imagem)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(55, 55, 55)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(b_concluido)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(l_nusuario)
                        .addGap(144, 144, 144))
                    .addComponent(nUsuariotxt))
                .addContainerGap(54, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(l_imagem)
                .addGap(18, 18, 18)
                .addComponent(l_nusuario)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(nUsuariotxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(b_concluido)
                .addContainerGap(49, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        setSize(new java.awt.Dimension(376, 299));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void nUsuariotxtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nUsuariotxtActionPerformed
        String nusuario = nUsuariotxt.getText();
        int editar = Central.editarUsuario(nusuario);
        if (editar == 1) {
            JOptionPane.showMessageDialog(null, "Nome de usuário editado com sucesso!");
            this.dispose();
        } else if (editar == 2) {
            JOptionPane.showMessageDialog(null, "Nome de usuário indisponível.");
            nUsuariotxt.setText("");
            nUsuariotxt.requestFocus();
        }
    }//GEN-LAST:event_nUsuariotxtActionPerformed

    private void nUsuariotxtKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_nUsuariotxtKeyPressed
        if (evt.getKeyCode() == evt.VK_ENTER) {
            String nusuario = nUsuariotxt.getText();
            int editar = Central.editarUsuario(nusuario);
            if (nusuario.equals("")) {
                JOptionPane.showMessageDialog(null, "Campo não preenchido.");
                nUsuariotxt.setText("");
                nUsuariotxt.requestFocus();
            } else if (editar == 1) {
                JOptionPane.showMessageDialog(null, "Nome de usuário editado com sucesso!");
                this.dispose();
            } else if (editar == 2) {
                JOptionPane.showMessageDialog(null, "Nome de usuário indisponível.");
                nUsuariotxt.setText("");
                nUsuariotxt.requestFocus();
            }
        }
    }//GEN-LAST:event_nUsuariotxtKeyPressed

    private void b_concluidoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b_concluidoActionPerformed
        String nusuario = nUsuariotxt.getText();
        int editar = Central.editarUsuario(nusuario);
        if (nusuario.equals("")) {
            JOptionPane.showMessageDialog(null, "Campo não preenchido.");
            nUsuariotxt.setText("");
            nUsuariotxt.requestFocus();
        } else if (editar == 1) {
            JOptionPane.showMessageDialog(null, "Nome de usuário editado com sucesso!");
            this.dispose();
        } else if (editar == 2) {
            JOptionPane.showMessageDialog(null, "Nome de usuário indisponível.");
            nUsuariotxt.setText("");
            nUsuariotxt.requestFocus();
        }
    }//GEN-LAST:event_b_concluidoActionPerformed

    private void b_concluidoKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_b_concluidoKeyPressed
        if (evt.getKeyCode() == evt.VK_ENTER) {
            String nusuario = nUsuariotxt.getText();
            int editar = Central.editarUsuario(nusuario);
            if (nusuario.equals("")) {
                JOptionPane.showMessageDialog(null, "Campo não preenchido.");
                nUsuariotxt.setText("");
                nUsuariotxt.requestFocus();
            } else if (editar == 1) {
                JOptionPane.showMessageDialog(null, "Nome de usuário editado com sucesso!");
                this.dispose();
            } else if (editar == 2) {
                JOptionPane.showMessageDialog(null, "Nome de usuário indisponível.");
                nUsuariotxt.setText("");
                nUsuariotxt.requestFocus();
            }
        }
    }//GEN-LAST:event_b_concluidoKeyPressed

    public static void main(String args[]) {
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(EditarUsuario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(EditarUsuario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(EditarUsuario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(EditarUsuario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                EditarUsuario dialog = new EditarUsuario(new javax.swing.JFrame(), true);
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
    private javax.swing.JLabel l_nusuario;
    private javax.swing.JTextField nUsuariotxt;
    // End of variables declaration//GEN-END:variables
}
