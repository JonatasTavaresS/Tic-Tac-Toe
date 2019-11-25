package telas;

import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import modelo.Central;

public class Jogador1 extends javax.swing.JFrame {

    Menu menu = new Menu();

    public Jogador1() {
        initComponents();
        Central.iniciar();
        jogador.setText(Central.getJogador1().getLogin());
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jMenuBar2 = new javax.swing.JMenuBar();
        jMenu2 = new javax.swing.JMenu();
        jMenu4 = new javax.swing.JMenu();
        jLayeredPane1 = new javax.swing.JLayeredPane();
        jButton1 = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        E1 = new javax.swing.JLabel();
        E2 = new javax.swing.JLabel();
        E3 = new javax.swing.JLabel();
        E6 = new javax.swing.JLabel();
        E5 = new javax.swing.JLabel();
        E4 = new javax.swing.JLabel();
        E7 = new javax.swing.JLabel();
        E8 = new javax.swing.JLabel();
        E9 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jogador = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jMenuItem1 = new javax.swing.JMenuItem();
        jMenuItem2 = new javax.swing.JMenuItem();
        jSeparator1 = new javax.swing.JPopupMenu.Separator();
        jMenuItem4 = new javax.swing.JMenuItem();
        jMenu3 = new javax.swing.JMenu();
        Listar = new javax.swing.JMenuItem();

        jMenu2.setText("File");
        jMenuBar2.add(jMenu2);

        jMenu4.setText("Edit");
        jMenuBar2.add(jMenu4);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("TIC TAC TOE");
        setResizable(false);

        jLayeredPane1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jButton1.setText("Voltar");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jLayeredPane1.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 400, -1, -1));

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/TicTacToe.png"))); // NOI18N
        jLayeredPane1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 20, -1, -1));

        E1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/transparente.png"))); // NOI18N
        E1.addMouseWheelListener(new java.awt.event.MouseWheelListener() {
            public void mouseWheelMoved(java.awt.event.MouseWheelEvent evt) {
                E1MouseWheelMoved(evt);
            }
        });
        E1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                E1MouseClicked(evt);
            }
        });
        jLayeredPane1.add(E1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 40, 100, 100));

        E2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/transparente.png"))); // NOI18N
        E2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                E2MouseClicked(evt);
            }
        });
        jLayeredPane1.add(E2, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 40, 100, 100));

        E3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/transparente.png"))); // NOI18N
        E3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                E3MouseClicked(evt);
            }
        });
        jLayeredPane1.add(E3, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 40, 100, 100));

        E6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/transparente.png"))); // NOI18N
        E6.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                E6MouseClicked(evt);
            }
        });
        jLayeredPane1.add(E6, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 160, 110, 100));

        E5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/transparente.png"))); // NOI18N
        E5.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                E5MouseClicked(evt);
            }
        });
        jLayeredPane1.add(E5, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 160, 100, 100));

        E4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/transparente.png"))); // NOI18N
        E4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                E4MouseClicked(evt);
            }
        });
        jLayeredPane1.add(E4, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 160, 100, 100));

        E7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/transparente.png"))); // NOI18N
        E7.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                E7MouseClicked(evt);
            }
        });
        jLayeredPane1.add(E7, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 280, 100, 100));

        E8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/transparente.png"))); // NOI18N
        E8.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                E8MouseClicked(evt);
            }
        });
        jLayeredPane1.add(E8, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 280, 100, 100));

        E9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/transparente.png"))); // NOI18N
        E9.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                E9MouseClicked(evt);
            }
        });
        jLayeredPane1.add(E9, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 280, 100, 100));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/jogo.png"))); // NOI18N
        jLayeredPane1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 40, -1, -1));

        jogador.setFont(new java.awt.Font("Tahoma", 0, 32)); // NOI18N
        jogador.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jogador.setText("Jogador");
        jLayeredPane1.add(jogador, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 140, 240, 60));

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 32)); // NOI18N
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel4.setText("Computador");
        jLayeredPane1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 220, 250, -1));

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/Xmenor.png"))); // NOI18N
        jLayeredPane1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 150, -1, -1));

        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/Omenor.png"))); // NOI18N
        jLayeredPane1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 210, -1, -1));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/1 (1).jpg"))); // NOI18N
        jLayeredPane1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, -10, 740, -1));

        jMenu1.setText("Conta");

        jMenuItem1.setText("Dados da conta");
        jMenuItem1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem1ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem1);

        jMenuItem2.setText("Excluir conta");
        jMenuItem2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem2ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem2);
        jMenu1.add(jSeparator1);

        jMenuItem4.setText("Sair da conta");
        jMenuItem4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem4ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem4);

        jMenuBar1.add(jMenu1);

        jMenu3.setText("Listar");

        Listar.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_L, java.awt.event.InputEvent.CTRL_MASK));
        Listar.setText("Listar jogadores");
        Listar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ListarActionPerformed(evt);
            }
        });
        jMenu3.add(Listar);

        jMenuBar1.add(jMenu3);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLayeredPane1)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLayeredPane1)
        );

        setSize(new java.awt.Dimension(736, 519));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        menu.setVisible(true);
        dispose();
    }//GEN-LAST:event_jButton1ActionPerformed

    private void E1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_E1MouseClicked
        if (Central.jogou(1) == true && Central.parar() == false) {
            Central.jogada1(1);
            E1.setIcon(new ImageIcon("src/imagens/X.png"));
            int jganhou = Central.verificarGanhou();
            if (jganhou == 1) {
                int resposta = JOptionPane.showConfirmDialog(this, "Você venceu! Deseja jogar novamente? ", "Confirme", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE);
                if (resposta == JOptionPane.YES_OPTION) {
                    this.setVisible(false);
                    Jogador1 novamente = new Jogador1();
                    novamente.setVisible(true);
                } else {
                    this.setVisible(false);
                    menu.setVisible(true);
                }
            } else if (jganhou == 2) {
                JOptionPane.showMessageDialog(this, "Partida empatada!");
            } else if (jganhou == 0) {
                int computador = Central.jogada2();
                if (computador == 2) {
                    E2.setIcon(new ImageIcon("src/imagens/O.png"));
                } else if (computador == 3) {
                    E3.setIcon(new ImageIcon("src/imagens/O.png"));
                } else if (computador == 4) {
                    E4.setIcon(new ImageIcon("src/imagens/O.png"));
                } else if (computador == 5) {
                    E5.setIcon(new ImageIcon("src/imagens/O.png"));
                } else if (computador == 6) {
                    E6.setIcon(new ImageIcon("src/imagens/O.png"));
                } else if (computador == 7) {
                    E7.setIcon(new ImageIcon("src/imagens/O.png"));
                } else if (computador == 8) {
                    E8.setIcon(new ImageIcon("src/imagens/O.png"));
                } else if (computador == 9) {
                    E9.setIcon(new ImageIcon("src/imagens/O.png"));
                }
                int cganhou = Central.verificarGanhou();
                if (cganhou == 1) {
                    int resposta = JOptionPane.showConfirmDialog(this, "Você venceu! Deseja jogar novamente? ", "Confirme", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE);
                    if (resposta == JOptionPane.YES_OPTION) {
                        this.setVisible(false);
                        Jogador1 novamente = new Jogador1();
                        novamente.setVisible(true);
                    } else {
                        this.setVisible(false);
                        menu.setVisible(true);
                    }
                } else if (cganhou == 2) {
                    JOptionPane.showMessageDialog(this, "Partida empatada!");
                }
            }
        }
    }//GEN-LAST:event_E1MouseClicked

    private void E1MouseWheelMoved(java.awt.event.MouseWheelEvent evt) {//GEN-FIRST:event_E1MouseWheelMoved

    }//GEN-LAST:event_E1MouseWheelMoved

    private void E2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_E2MouseClicked
        if (Central.jogou(2) == true && Central.parar() == false) {
            Central.jogada1(2);
            E2.setIcon(new ImageIcon("src/imagens/X.png"));
            int jganhou = Central.verificarGanhou();
            if (jganhou == 1) {
                int resposta = JOptionPane.showConfirmDialog(this, "Você venceu! Deseja jogar novamente? ", "Confirme", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE);
                if (resposta == JOptionPane.YES_OPTION) {
                    this.setVisible(false);
                    Jogador1 novamente = new Jogador1();
                    novamente.setVisible(true);
                } else {
                    this.setVisible(false);
                    menu.setVisible(true);
                }
            } else if (jganhou == 2) {
                JOptionPane.showMessageDialog(this, "Partida empatada!");
            } else if (jganhou == 0) {
                int computador = Central.jogada2();
                if (computador == 1) {
                    E1.setIcon(new ImageIcon("src/imagens/O.png"));
                } else if (computador == 3) {
                    E3.setIcon(new ImageIcon("src/imagens/O.png"));
                } else if (computador == 4) {
                    E4.setIcon(new ImageIcon("src/imagens/O.png"));
                } else if (computador == 5) {
                    E5.setIcon(new ImageIcon("src/imagens/O.png"));
                } else if (computador == 6) {
                    E6.setIcon(new ImageIcon("src/imagens/O.png"));
                } else if (computador == 7) {
                    E7.setIcon(new ImageIcon("src/imagens/O.png"));
                } else if (computador == 8) {
                    E8.setIcon(new ImageIcon("src/imagens/O.png"));
                } else if (computador == 9) {
                    E9.setIcon(new ImageIcon("src/imagens/O.png"));
                }
            }
            int cganhou = Central.verificarGanhou();
            if (cganhou == 1) {
                JOptionPane.showMessageDialog(this, "Computador venceu!");
            } else if (cganhou == 2) {
                JOptionPane.showMessageDialog(this, "Partida empatada!");
            }
        }
    }//GEN-LAST:event_E2MouseClicked

    private void E3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_E3MouseClicked
        if (Central.jogou(3) == true && Central.parar() == false) {
            Central.jogada1(3);
            E3.setIcon(new ImageIcon("src/imagens/X.png"));
            int jganhou = Central.verificarGanhou();
            if (jganhou == 1) {
                int resposta = JOptionPane.showConfirmDialog(this, "Você venceu! Deseja jogar novamente? ", "Confirme", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE);
                if (resposta == JOptionPane.YES_OPTION) {
                    this.setVisible(false);
                    Jogador1 novamente = new Jogador1();
                    novamente.setVisible(true);
                } else {
                    this.setVisible(false);
                    menu.setVisible(true);
                }
            } else if (jganhou == 2) {
                JOptionPane.showMessageDialog(this, "Partida empatada!");
            } else if (jganhou == 0) {
                int computador = Central.jogada2();
                if (computador == 1) {
                    E1.setIcon(new ImageIcon("src/imagens/O.png"));
                } else if (computador == 2) {
                    E2.setIcon(new ImageIcon("src/imagens/O.png"));
                } else if (computador == 4) {
                    E4.setIcon(new ImageIcon("src/imagens/O.png"));
                } else if (computador == 5) {
                    E5.setIcon(new ImageIcon("src/imagens/O.png"));
                } else if (computador == 6) {
                    E6.setIcon(new ImageIcon("src/imagens/O.png"));
                } else if (computador == 7) {
                    E7.setIcon(new ImageIcon("src/imagens/O.png"));
                } else if (computador == 8) {
                    E8.setIcon(new ImageIcon("src/imagens/O.png"));
                } else if (computador == 9) {
                    E9.setIcon(new ImageIcon("src/imagens/O.png"));
                }
                int cganhou = Central.verificarGanhou();
                if (cganhou == 1) {
                    JOptionPane.showMessageDialog(this, "Computador venceu!");
                } else if (cganhou == 2) {
                    JOptionPane.showMessageDialog(this, "Partida empatada!");
                }
            }
        }
    }//GEN-LAST:event_E3MouseClicked

    private void E4MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_E4MouseClicked
        if (Central.jogou(4) == true && Central.parar() == false) {
            Central.jogada1(4);
            E4.setIcon(new ImageIcon("src/imagens/X.png"));
            int jganhou = Central.verificarGanhou();
            if (jganhou == 1) {
                int resposta = JOptionPane.showConfirmDialog(this, "Você venceu! Deseja jogar novamente? ", "Confirme", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE);
                if (resposta == JOptionPane.YES_OPTION) {
                    this.setVisible(false);
                    Jogador1 novamente = new Jogador1();
                    novamente.setVisible(true);
                } else {
                    this.setVisible(false);
                    menu.setVisible(true);
                }
            } else if (jganhou == 2) {
                JOptionPane.showMessageDialog(this, "Partida empatada!");
            } else if (jganhou == 0) {
                int computador = Central.jogada2();
                if (computador == 1) {
                    E1.setIcon(new ImageIcon("src/imagens/O.png"));
                } else if (computador == 2) {
                    E2.setIcon(new ImageIcon("src/imagens/O.png"));
                } else if (computador == 3) {
                    E3.setIcon(new ImageIcon("src/imagens/O.png"));
                } else if (computador == 5) {
                    E5.setIcon(new ImageIcon("src/imagens/O.png"));
                } else if (computador == 6) {
                    E6.setIcon(new ImageIcon("src/imagens/O.png"));
                } else if (computador == 7) {
                    E7.setIcon(new ImageIcon("src/imagens/O.png"));
                } else if (computador == 8) {
                    E8.setIcon(new ImageIcon("src/imagens/O.png"));
                } else if (computador == 9) {
                    E9.setIcon(new ImageIcon("src/imagens/O.png"));
                }
                int cganhou = Central.verificarGanhou();
                if (cganhou == 1) {
                    JOptionPane.showMessageDialog(this, "Computador venceu!");
                } else if (cganhou == 2) {
                    JOptionPane.showMessageDialog(this, "Partida empatada!");
                }
            }
        }
    }//GEN-LAST:event_E4MouseClicked

    private void E5MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_E5MouseClicked
        if (Central.jogou(5) == true && Central.parar() == false) {
            Central.jogada1(5);
            E5.setIcon(new ImageIcon("src/imagens/X.png"));
            int jganhou = Central.verificarGanhou();
            if (jganhou == 1) {
                int resposta = JOptionPane.showConfirmDialog(this, "Você venceu! Deseja jogar novamente? ", "Confirme", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE);
                if (resposta == JOptionPane.YES_OPTION) {
                    this.setVisible(false);
                    Jogador1 novamente = new Jogador1();
                    novamente.setVisible(true);
                } else {
                    this.setVisible(false);
                    menu.setVisible(true);
                }
            } else if (jganhou == 2) {
                JOptionPane.showMessageDialog(this, "Partida empatada!");
            } else if (jganhou == 0) {
                int computador = Central.jogada2();
                if (computador == 1) {
                    E1.setIcon(new ImageIcon("src/imagens/O.png"));
                } else if (computador == 2) {
                    E2.setIcon(new ImageIcon("src/imagens/O.png"));
                } else if (computador == 3) {
                    E3.setIcon(new ImageIcon("src/imagens/O.png"));
                } else if (computador == 4) {
                    E4.setIcon(new ImageIcon("src/imagens/O.png"));
                } else if (computador == 6) {
                    E6.setIcon(new ImageIcon("src/imagens/O.png"));
                } else if (computador == 7) {
                    E7.setIcon(new ImageIcon("src/imagens/O.png"));
                } else if (computador == 8) {
                    E8.setIcon(new ImageIcon("src/imagens/O.png"));
                } else if (computador == 9) {
                    E9.setIcon(new ImageIcon("src/imagens/O.png"));
                }
                int cganhou = Central.verificarGanhou();
                if (cganhou == 1) {
                    int resposta = JOptionPane.showConfirmDialog(this, "Você venceu! Deseja jogar novamente? ", "Confirme", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE);
                    if (resposta == JOptionPane.YES_OPTION) {
                        this.setVisible(false);
                        Jogador1 novamente = new Jogador1();
                        novamente.setVisible(true);
                    } else {
                        this.setVisible(false);
                        menu.setVisible(true);
                    }
                } else if (cganhou == 2) {
                    JOptionPane.showMessageDialog(this, "Partida empatada!");
                }
            }
        }
    }//GEN-LAST:event_E5MouseClicked

    private void E6MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_E6MouseClicked
        if (Central.jogou(6) == true && Central.parar() == false) {
            Central.jogada1(6);
            E6.setIcon(new ImageIcon("src/imagens/X.png"));
            int jganhou = Central.verificarGanhou();
            if (jganhou == 1) {
                int resposta = JOptionPane.showConfirmDialog(this, "Você venceu! Deseja jogar novamente? ", "Confirme", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE);
                if (resposta == JOptionPane.YES_OPTION) {
                    this.setVisible(false);
                    Jogador1 novamente = new Jogador1();
                    novamente.setVisible(true);
                } else {
                    this.setVisible(false);
                    menu.setVisible(true);
                }
            } else if (jganhou == 2) {
                JOptionPane.showMessageDialog(this, "Partida empatada!");
            } else if (jganhou == 0) {
                int computador = Central.jogada2();
                if (computador == 1) {
                    E1.setIcon(new ImageIcon("src/imagens/O.png"));
                } else if (computador == 2) {
                    E2.setIcon(new ImageIcon("src/imagens/O.png"));
                } else if (computador == 3) {
                    E3.setIcon(new ImageIcon("src/imagens/O.png"));
                } else if (computador == 4) {
                    E4.setIcon(new ImageIcon("src/imagens/O.png"));
                } else if (computador == 5) {
                    E5.setIcon(new ImageIcon("src/imagens/O.png"));
                } else if (computador == 7) {
                    E7.setIcon(new ImageIcon("src/imagens/O.png"));
                } else if (computador == 8) {
                    E8.setIcon(new ImageIcon("src/imagens/O.png"));
                } else if (computador == 9) {
                    E9.setIcon(new ImageIcon("src/imagens/O.png"));
                }
                int cganhou = Central.verificarGanhou();
                if (cganhou == 1) {
                    JOptionPane.showMessageDialog(this, "Computador venceu!");
                } else if (cganhou == 2) {
                    JOptionPane.showMessageDialog(this, "Partida empatada!");
                }
            }
        }
    }//GEN-LAST:event_E6MouseClicked

    private void E7MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_E7MouseClicked
        if (Central.jogou(7) == true && Central.parar() == false) {
            Central.jogada1(7);
            E7.setIcon(new ImageIcon("src/imagens/X.png"));
            int jganhou = Central.verificarGanhou();
            if (jganhou == 1) {
                int resposta = JOptionPane.showConfirmDialog(this, "Você venceu! Deseja jogar novamente? ", "Confirme", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE);
                if (resposta == JOptionPane.YES_OPTION) {
                    this.setVisible(false);
                    Jogador1 novamente = new Jogador1();
                    novamente.setVisible(true);
                } else {
                    this.setVisible(false);
                    menu.setVisible(true);
                }
            } else if (jganhou == 2) {
                JOptionPane.showMessageDialog(this, "Partida empatada!");
            } else if (jganhou == 0) {
                int computador = Central.jogada2();
                if (computador == 1) {
                    E1.setIcon(new ImageIcon("src/imagens/O.png"));
                } else if (computador == 2) {
                    E2.setIcon(new ImageIcon("src/imagens/O.png"));
                } else if (computador == 3) {
                    E3.setIcon(new ImageIcon("src/imagens/O.png"));
                } else if (computador == 4) {
                    E4.setIcon(new ImageIcon("src/imagens/O.png"));
                } else if (computador == 5) {
                    E5.setIcon(new ImageIcon("src/imagens/O.png"));
                } else if (computador == 6) {
                    E6.setIcon(new ImageIcon("src/imagens/O.png"));
                } else if (computador == 8) {
                    E8.setIcon(new ImageIcon("src/imagens/O.png"));
                } else if (computador == 9) {
                    E9.setIcon(new ImageIcon("src/imagens/O.png"));
                }
                int cganhou = Central.verificarGanhou();
                if (cganhou == 1) {
                    JOptionPane.showMessageDialog(this, "Computador venceu!");
                } else if (cganhou == 2) {
                    JOptionPane.showMessageDialog(this, "Partida empatada!");
                }
            }
        }
    }//GEN-LAST:event_E7MouseClicked

    private void E8MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_E8MouseClicked
        if (Central.jogou(8) == true && Central.parar() == false) {
            Central.jogada1(8);
            E8.setIcon(new ImageIcon("src/imagens/X.png"));
            int jganhou = Central.verificarGanhou();
            if (jganhou == 1) {
                int resposta = JOptionPane.showConfirmDialog(this, "Você venceu! Deseja jogar novamente? ", "Confirme", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE);
                if (resposta == JOptionPane.YES_OPTION) {
                    this.setVisible(false);
                    Jogador1 novamente = new Jogador1();
                    novamente.setVisible(true);
                } else {
                    this.setVisible(false);
                    menu.setVisible(true);
                }
            } else if (jganhou == 2) {
                JOptionPane.showMessageDialog(this, "Partida empatada!");
            } else if (jganhou == 0) {
                int computador = Central.jogada2();
                if (computador == 1) {
                    E1.setIcon(new ImageIcon("src/imagens/O.png"));
                } else if (computador == 2) {
                    E2.setIcon(new ImageIcon("src/imagens/O.png"));
                } else if (computador == 3) {
                    E3.setIcon(new ImageIcon("src/imagens/O.png"));
                } else if (computador == 4) {
                    E4.setIcon(new ImageIcon("src/imagens/O.png"));
                } else if (computador == 5) {
                    E5.setIcon(new ImageIcon("src/imagens/O.png"));
                } else if (computador == 6) {
                    E6.setIcon(new ImageIcon("src/imagens/O.png"));
                } else if (computador == 7) {
                    E7.setIcon(new ImageIcon("src/imagens/O.png"));
                } else if (computador == 9) {
                    E9.setIcon(new ImageIcon("src/imagens/O.png"));
                }
                int cganhou = Central.verificarGanhou();
                if (cganhou == 1) {
                    JOptionPane.showMessageDialog(this, "Computador venceu!");
                } else if (cganhou == 2) {
                    JOptionPane.showMessageDialog(this, "Partida empatada!");
                }
            }
        }
    }//GEN-LAST:event_E8MouseClicked

    private void E9MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_E9MouseClicked
        if (Central.jogou(9) == true && Central.parar() == false) {
            Central.jogada1(9);
            E9.setIcon(new ImageIcon("src/imagens/X.png"));
            int jganhou = Central.verificarGanhou();
            if (jganhou == 1) {
                int resposta = JOptionPane.showConfirmDialog(this, "Você venceu! Deseja jogar novamente? ", "Confirme", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE);
                if (resposta == JOptionPane.YES_OPTION) {
                    this.setVisible(false);
                    Jogador1 novamente = new Jogador1();
                    novamente.setVisible(true);
                } else {
                    this.setVisible(false);
                    menu.setVisible(true);
                }
            } else if (jganhou == 2) {
                JOptionPane.showMessageDialog(this, "Partida empatada!");
            } else if (jganhou == 0) {
                int computador = Central.jogada2();
                if (computador == 1) {
                    E1.setIcon(new ImageIcon("src/imagens/O.png"));
                } else if (computador == 2) {
                    E2.setIcon(new ImageIcon("src/imagens/O.png"));
                } else if (computador == 3) {
                    E3.setIcon(new ImageIcon("src/imagens/O.png"));
                } else if (computador == 4) {
                    E4.setIcon(new ImageIcon("src/imagens/O.png"));
                } else if (computador == 5) {
                    E5.setIcon(new ImageIcon("src/imagens/O.png"));
                } else if (computador == 6) {
                    E6.setIcon(new ImageIcon("src/imagens/O.png"));
                } else if (computador == 7) {
                    E7.setIcon(new ImageIcon("src/imagens/O.png"));
                } else if (computador == 8) {
                    E8.setIcon(new ImageIcon("src/imagens/O.png"));
                }
                int cganhou = Central.verificarGanhou();
                if (cganhou == 1) {
                    JOptionPane.showMessageDialog(this, "Computador venceu!");
                } else if (cganhou == 2) {
                    JOptionPane.showMessageDialog(this, "Partida empatada!");
                }
            }
        }
    }//GEN-LAST:event_E9MouseClicked

    private void jMenuItem2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem2ActionPerformed
        int resposta = JOptionPane.showConfirmDialog(this, "Você quer mesmo Deletar sua conta para sempre? ", "Confirme", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE);
        if (resposta == JOptionPane.YES_OPTION) {
            Central.removerJogador();
            JOptionPane.showMessageDialog(this, "Conta Deletada");
            TelaInicial tela = new TelaInicial();
            this.dispose();
            tela.setVisible(true);
        }
    }//GEN-LAST:event_jMenuItem2ActionPerformed

    private void jMenuItem4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem4ActionPerformed
        dispose();
        TelaInicial login = new TelaInicial();
        login.setVisible(true);
    }//GEN-LAST:event_jMenuItem4ActionPerformed

    private void ListarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ListarActionPerformed
        ListarJogadores listar = new ListarJogadores(this, true);
        listar.setVisible(true);
    }//GEN-LAST:event_ListarActionPerformed

    private void jMenuItem1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem1ActionPerformed
        DadosConta tela = new DadosConta();
        tela.setVisible(true);
    }//GEN-LAST:event_jMenuItem1ActionPerformed

    public static void main(String args[]) {
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;

                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Jogador1.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Jogador1.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Jogador1.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Jogador1.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Jogador1().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel E1;
    private javax.swing.JLabel E2;
    private javax.swing.JLabel E3;
    private javax.swing.JLabel E4;
    private javax.swing.JLabel E5;
    private javax.swing.JLabel E6;
    private javax.swing.JLabel E7;
    private javax.swing.JLabel E8;
    private javax.swing.JLabel E9;
    private javax.swing.JMenuItem Listar;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLayeredPane jLayeredPane1;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenu jMenu3;
    private javax.swing.JMenu jMenu4;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuBar jMenuBar2;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuItem2;
    private javax.swing.JMenuItem jMenuItem4;
    private javax.swing.JPopupMenu.Separator jSeparator1;
    private javax.swing.JLabel jogador;
    // End of variables declaration//GEN-END:variables

    private Menu Menu() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
