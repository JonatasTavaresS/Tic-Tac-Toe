package telas;

import javax.swing.JOptionPane;
import modelo.Central;

public class SegundoJogador extends javax.swing.JDialog {

    public SegundoJogador(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        imagem = new javax.swing.JLabel();
        login = new javax.swing.JLabel();
        logintxt = new javax.swing.JTextField();
        senha = new javax.swing.JLabel();
        senhatxt = new javax.swing.JPasswordField();
        Entrar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        imagem.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/TicTacToe.png"))); // NOI18N

        login.setText("Nome de usuário");

        logintxt.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                logintxtKeyPressed(evt);
            }
        });

        senha.setText("Senha");

        senhatxt.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                senhatxtKeyPressed(evt);
            }
        });

        Entrar.setText("Entrar");
        Entrar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                EntrarMouseClicked(evt);
            }
        });
        Entrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                EntrarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(100, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(Entrar)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(senha)
                        .addComponent(login)
                        .addComponent(imagem, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(logintxt)
                        .addComponent(senhatxt)))
                .addGap(100, 100, 100))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addComponent(imagem)
                .addGap(18, 18, 18)
                .addComponent(login)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(logintxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(senha)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(senhatxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(Entrar)
                .addContainerGap(108, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void logintxtKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_logintxtKeyPressed
        if (evt.getKeyCode() == evt.VK_ENTER) {
            senhatxt.requestFocus();
        }
    }//GEN-LAST:event_logintxtKeyPressed

    private void senhatxtKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_senhatxtKeyPressed
        if (evt.getKeyCode() == evt.VK_ENTER) {
            String login = logintxt.getText();
            String senha = senhatxt.getText();
            login = login.replace(" ", "");
            if (!login.equals(Central.getJogador1().getLogin())) {
                int logado = Central.login2(login, senha);
                if (logintxt.getText().equals("") || senhatxt.getText().equals("")) {
                    JOptionPane.showMessageDialog(null, "Campo(s) não preenchido(s).");
                } else if (logado == 0) {
                    JOptionPane.showMessageDialog(null, "Olá " + login + ", seja bem vindo!");
                    dispose();
                    Jogador2 jogador2 = new Jogador2();
                    jogador2.setVisible(true);
                    Central.iniciar2();
                } else if (logado == 1) {
                    JOptionPane.showMessageDialog(null, "Sua senha está incorreta. Confira-a.");
                } else if (logado == 2) {
                    JOptionPane.showMessageDialog(null, "O nome de usuário inserido não pertence a uma conta.\nVerifique seu nome de usuário e tente novamente.");
                }
            } else {
                JOptionPane.showMessageDialog(null, "Não é possível jogar contra si prórpio.");
                logintxt.setText("");
                senhatxt.setText("");
                logintxt.requestFocus();
            }
        }
    }//GEN-LAST:event_senhatxtKeyPressed

    private void EntrarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_EntrarMouseClicked
        String login = logintxt.getText();
        String senha = senhatxt.getText();
        login = login.replace(" ", "");
        if (!login.equals(Central.getJogador1().getLogin())) {
            int logado = Central.login2(login, senha);
            if (logintxt.getText().equals("") || senhatxt.getText().equals("")) {
                JOptionPane.showMessageDialog(null, "Campo(s) não preenchido(s).");
            } else if (logado == 0) {
                JOptionPane.showMessageDialog(null, "Olá " + login + ", seja bem vindo!");
                dispose();
                Jogador2 jogador2 = new Jogador2();
                jogador2.setVisible(true);
                Central.iniciar2();
            } else if (logado == 1) {
                JOptionPane.showMessageDialog(null, "Sua senha está incorreta. Confira-a.");
            } else if (logado == 2) {
                JOptionPane.showMessageDialog(null, "O nome de usuário inserido não pertence a uma conta.\nVerifique seu nome de usuário e tente novamente.");
            }
        } else {
            JOptionPane.showMessageDialog(null, "Não é possível jogar contra si prórpio.");
            logintxt.setText("");
            senhatxt.setText("");
            logintxt.requestFocus();
        }
    }//GEN-LAST:event_EntrarMouseClicked

    private void EntrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_EntrarActionPerformed
        String login = logintxt.getText();
        String senha = senhatxt.getText();
        login = login.replace(" ", "");
        if (!login.equals(Central.getJogador1().getLogin())) {
            int logado = Central.login2(login, senha);
            if (logintxt.getText().equals("") || senhatxt.getText().equals("")) {
                JOptionPane.showMessageDialog(null, "Campo(s) não preenchido(s).");
            } else if (logado == 0) {
                JOptionPane.showMessageDialog(null, "Olá " + login + ", seja bem vindo!");
                dispose();
                Jogador2 jogador2 = new Jogador2();
                jogador2.setVisible(true);
                Central.iniciar2();
            } else if (logado == 1) {
                JOptionPane.showMessageDialog(null, "Sua senha está incorreta. Confira-a.");
            } else if (logado == 2) {
                JOptionPane.showMessageDialog(null, "O nome de usuário inserido não pertence a uma conta.\nVerifique seu nome de usuário e tente novamente.");
            }
        } else {
            JOptionPane.showMessageDialog(null, "Não é possível jogar contra si prórpio.");
            logintxt.setText("");
            senhatxt.setText("");
            logintxt.requestFocus();
        }
    }//GEN-LAST:event_EntrarActionPerformed

    public static void main(String args[]) {
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(SegundoJogador.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);

        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(SegundoJogador.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);

        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(SegundoJogador.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);

        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(SegundoJogador.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                SegundoJogador dialog = new SegundoJogador(new javax.swing.JFrame(), true);
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
    private javax.swing.JButton Entrar;
    private javax.swing.JLabel imagem;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel login;
    private javax.swing.JTextField logintxt;
    private javax.swing.JLabel senha;
    private javax.swing.JPasswordField senhatxt;
    // End of variables declaration//GEN-END:variables
}
