package telas;

import javax.swing.JOptionPane;
import modelo.*;

public class TelaInicial extends javax.swing.JFrame {

    public TelaInicial() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLayeredPane1 = new javax.swing.JLayeredPane();
        l_imagem = new javax.swing.JLabel();
        l_login = new javax.swing.JLabel();
        logintxt = new javax.swing.JTextField();
        l_senha = new javax.swing.JLabel();
        senhatxt = new javax.swing.JPasswordField();
        jLabel4 = new javax.swing.JLabel();
        l_cadastrar = new javax.swing.JLabel();
        b_entrar = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Tic Tac Toe");
        setResizable(false);

        jLayeredPane1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        l_imagem.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/TicTacToe.png"))); // NOI18N
        jLayeredPane1.add(l_imagem, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 10, -1, -1));

        l_login.setText("Nome de usuário");
        jLayeredPane1.add(l_login, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 180, -1, -1));

        logintxt.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                logintxtKeyPressed(evt);
            }
        });
        jLayeredPane1.add(logintxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 200, 250, -1));

        l_senha.setText("Senha");
        jLayeredPane1.add(l_senha, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 230, -1, -1));

        senhatxt.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                senhatxtKeyPressed(evt);
            }
        });
        jLayeredPane1.add(senhatxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 250, 250, -1));

        jLabel4.setText("Você não possui uma conta?");
        jLayeredPane1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 340, -1, -1));

        l_cadastrar.setForeground(new java.awt.Color(255, 255, 255));
        l_cadastrar.setText("Cadastre - se");
        l_cadastrar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                l_cadastrarMouseClicked(evt);
            }
        });
        jLayeredPane1.add(l_cadastrar, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 340, -1, -1));

        b_entrar.setText("Entrar");
        b_entrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b_entrarActionPerformed(evt);
            }
        });
        b_entrar.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                b_entrarKeyPressed(evt);
            }
        });
        jLayeredPane1.add(b_entrar, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 300, -1, -1));

        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/1 (1).jpg"))); // NOI18N
        jLabel6.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));
        jLayeredPane1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(-10, -50, 830, 540));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLayeredPane1, javax.swing.GroupLayout.Alignment.TRAILING)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLayeredPane1, javax.swing.GroupLayout.Alignment.TRAILING)
        );

        setSize(new java.awt.Dimension(720, 480));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void l_cadastrarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_l_cadastrarMouseClicked
        Cadastro cadastro = new Cadastro(this, true);
        cadastro.setVisible(true);
    }//GEN-LAST:event_l_cadastrarMouseClicked

    private void b_entrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b_entrarActionPerformed
        Menu menu = new Menu();
        String login = logintxt.getText();
        String senha = senhatxt.getText();
        login = login.replace(" ", "");
        int logado = Central.login(login, senha);
        if (login.equals("") || senha.equals("")) {
            JOptionPane.showMessageDialog(null, "Campo(s) não preenchido(s).");
        } else if (logado == 0) {
            JOptionPane.showMessageDialog(null, "Olá " + login + ", seja bem vindo!");
            dispose();
            menu.setVisible(true);
        } else if (logado == 1) {
            JOptionPane.showMessageDialog(null, "Sua senha está incorreta. Confira-a.");
        } else if (logado == 2) {
            JOptionPane.showMessageDialog(null, "O nome de usuário inserido não pertence a uma conta.\nVerifique seu nome de usuário e tente novamente.");
        }
    }//GEN-LAST:event_b_entrarActionPerformed

    private void logintxtKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_logintxtKeyPressed
        if (evt.getKeyCode() == evt.VK_ENTER) {
            senhatxt.requestFocus();
        }
    }//GEN-LAST:event_logintxtKeyPressed

    private void senhatxtKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_senhatxtKeyPressed
        if (evt.getKeyCode() == evt.VK_ENTER) {
            Menu menu = new Menu();
            String login = logintxt.getText();
            String senha = senhatxt.getText();
            login = login.replace(" ", "");
            int logado = Central.login(login, senha);
            if (login.equals("") || senha.equals("")) {
                JOptionPane.showMessageDialog(null, "Campo(s) não preenchido(s).");
            } else if (logado == 0) {
                JOptionPane.showMessageDialog(null, "Olá " + login + ", seja bem vindo!");
                dispose();
                menu.setVisible(true);
            } else if (logado == 1) {
                JOptionPane.showMessageDialog(null, "Sua senha está incorreta. Confira-a.");
            } else if (logado == 2) {
                JOptionPane.showMessageDialog(null, "O nome de usuário inserido não pertence a uma conta.\nVerifique seu nome de usuário e tente novamente.");
            }
        }
    }//GEN-LAST:event_senhatxtKeyPressed

    private void b_entrarKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_b_entrarKeyPressed
        Menu menu = new Menu();
        String login = logintxt.getText();
        String senha = senhatxt.getText();
        login = login.replace(" ", "");
        int logado = Central.login(login, senha);
        if (login.equals("") || senha.equals("")) {
            JOptionPane.showMessageDialog(null, "Campo(s) não preenchido(s).");
        } else if (logado == 0) {
            JOptionPane.showMessageDialog(null, "Olá " + login + ", seja bem vindo!");
            dispose();
            menu.setVisible(true);
        } else if (logado == 1) {
            JOptionPane.showMessageDialog(null, "Sua senha está incorreta. Confira-a.");
        } else if (logado == 2) {
            JOptionPane.showMessageDialog(null, "O nome de usuário inserido não pertence a uma conta.\nVerifique seu nome de usuário e tente novamente.");
        }
    }//GEN-LAST:event_b_entrarKeyPressed

    public static void main(String args[]) {
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(TelaInicial.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TelaInicial.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TelaInicial.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TelaInicial.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        java.awt.EventQueue.invokeLater(() -> {
            new TelaInicial().setVisible(true);
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton b_entrar;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLayeredPane jLayeredPane1;
    private javax.swing.JLabel l_cadastrar;
    private javax.swing.JLabel l_imagem;
    private javax.swing.JLabel l_login;
    private javax.swing.JLabel l_senha;
    private javax.swing.JTextField logintxt;
    private javax.swing.JPasswordField senhatxt;
    // End of variables declaration//GEN-END:variables
}
