package telas;

import java.awt.event.KeyEvent;
import javax.swing.JOptionPane;
import modelo.*;

public class Cadastro extends javax.swing.JDialog {

    public Cadastro(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        imagem = new javax.swing.JLabel();
        l_login = new javax.swing.JLabel();
        usuarioCadastro = new javax.swing.JTextField();
        l_senha = new javax.swing.JLabel();
        senhaCadastro = new javax.swing.JPasswordField();
        l_confirmar = new javax.swing.JLabel();
        csenhaCadastro = new javax.swing.JPasswordField();
        b_cadastrar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Cadastrar - se");
        setSize(new java.awt.Dimension(433, 447));

        imagem.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/TicTacToe.png"))); // NOI18N

        l_login.setText("Nome de usuário");

        usuarioCadastro.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                usuarioCadastroKeyPressed(evt);
            }
        });

        l_senha.setText("Senha");

        senhaCadastro.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                senhaCadastroKeyPressed(evt);
            }
        });

        l_confirmar.setText("Confirmar Senha");

        csenhaCadastro.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                csenhaCadastroKeyPressed(evt);
            }
        });

        b_cadastrar.setText("Cadastrar");
        b_cadastrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b_cadastrarActionPerformed(evt);
            }
        });
        b_cadastrar.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                b_cadastrarKeyPressed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(80, 80, 80)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(b_cadastrar)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(l_confirmar)
                        .addComponent(l_senha)
                        .addComponent(l_login)
                        .addComponent(senhaCadastro, javax.swing.GroupLayout.DEFAULT_SIZE, 252, Short.MAX_VALUE)
                        .addComponent(csenhaCadastro)
                        .addComponent(usuarioCadastro))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                        .addGap(32, 32, 32)
                        .addComponent(imagem)))
                .addContainerGap(105, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addComponent(imagem)
                .addGap(14, 14, 14)
                .addComponent(l_login)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(usuarioCadastro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(l_senha)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(senhaCadastro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(l_confirmar)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(csenhaCadastro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(b_cadastrar)
                .addContainerGap(49, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        setSize(new java.awt.Dimension(453, 404));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void b_cadastrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b_cadastrarActionPerformed
        String nomeCadastrado = usuarioCadastro.getText();
        String senhavar = senhaCadastro.getText();
        String confirmar = csenhaCadastro.getText();
        nomeCadastrado = nomeCadastrado.replace(" ", "");
        if (nomeCadastrado.equals("") || senhavar.equals("") || confirmar.equals("")) {
            JOptionPane.showMessageDialog(null, "Campo(s) não preenchido(s).");
        } else if (Central.cadastrar(Central.criarJogador(nomeCadastrado, senhavar)) == false) {
            JOptionPane.showMessageDialog(null, "Nome de usuário indisponível. Tente outro.");
        } else if (!senhavar.equals(confirmar)) {
            JOptionPane.showMessageDialog(null, "Senhas não correspondem.");
        } else if (senhavar.length() < 6) {
            JOptionPane.showMessageDialog(null, "A senha deve ter no mínimo 6 caracteres.");
        } else if (Central.cadastrar(Central.criarJogador(nomeCadastrado, senhavar)) == true) {
            JOptionPane.showMessageDialog(null, "Seu cadastro foi realizado com sucesso!");
            this.dispose();
        }
    }//GEN-LAST:event_b_cadastrarActionPerformed

    private void usuarioCadastroKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_usuarioCadastroKeyPressed
        if (evt.getKeyCode() == evt.VK_ENTER) {
            senhaCadastro.requestFocus();
        }
    }//GEN-LAST:event_usuarioCadastroKeyPressed

    private void senhaCadastroKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_senhaCadastroKeyPressed
        if (evt.getKeyCode() == evt.VK_ENTER) {
            csenhaCadastro.requestFocus();
        }
    }//GEN-LAST:event_senhaCadastroKeyPressed

    private void csenhaCadastroKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_csenhaCadastroKeyPressed
        if (evt.getKeyCode() == evt.VK_ENTER) {
            b_cadastrar.requestFocus();
        }
    }//GEN-LAST:event_csenhaCadastroKeyPressed

    private void b_cadastrarKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_b_cadastrarKeyPressed
        if (evt.getKeyCode() == evt.VK_ENTER) {
            String nomeCadastrado = usuarioCadastro.getText();
            String senhavar = senhaCadastro.getText();
            String confirmar = csenhaCadastro.getText();
            nomeCadastrado = nomeCadastrado.replace(" ", "");
            if (nomeCadastrado.equals("") || senhavar.equals("") || confirmar.equals("")) {
                JOptionPane.showMessageDialog(null, "Campo(s) não preenchido(s).");
            } else if (Central.cadastrar(Central.criarJogador(nomeCadastrado, senhavar)) == false) {
                JOptionPane.showMessageDialog(null, "Nome de usuário indisponível. Tente outro.");
            } else if (!senhavar.equals(confirmar)) {
                JOptionPane.showMessageDialog(null, "Senhas não correspondem.");
            } else if (senhavar.length() < 6) {
                JOptionPane.showMessageDialog(null, "A senha deve ter no mínimo 6 caracteres.");
            } else if (Central.cadastrar(Central.criarJogador(nomeCadastrado, senhavar)) == true) {
                JOptionPane.showMessageDialog(null, "Seu cadastro foi realizado com sucesso!");
                this.dispose();
            }
        }
    }//GEN-LAST:event_b_cadastrarKeyPressed

    public static void main(String args[]) {
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Cadastro.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Cadastro.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Cadastro.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Cadastro.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                Cadastro dialog = new Cadastro(new javax.swing.JFrame(), true);
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
    private javax.swing.JButton b_cadastrar;
    private javax.swing.JPasswordField csenhaCadastro;
    private javax.swing.JLabel imagem;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel l_confirmar;
    private javax.swing.JLabel l_login;
    private javax.swing.JLabel l_senha;
    private javax.swing.JPasswordField senhaCadastro;
    private javax.swing.JTextField usuarioCadastro;
    // End of variables declaration//GEN-END:variables
}
