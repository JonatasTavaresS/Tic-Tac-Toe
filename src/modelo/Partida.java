package modelo;

public class Partida {

    private Jogador jogador1;
    private Jogador jogador2;
    private Jogador vencedor;
    private Tabuleiro tabuleiro;
    private Jogador atual;
    private boolean modo; // se for "true" significa que o jogo será entre dois jogadores, e se for
    // "false" significa que o jogo será contra o computador

    public Partida(Jogador jogador1) {
        this.jogador1 = jogador1;
        this.modo = false;
        this.jogador2 = new Jogador("Computador", "123");
        this.vencedor = null;
        this.tabuleiro = new Tabuleiro();
        this.atual = jogador1;
    }

    public Partida(Jogador jogador1, Jogador jogador2) {
        this.jogador1 = jogador1;

        this.modo = true;
        this.jogador2 = jogador2;
        this.vencedor = null;
        this.tabuleiro = new Tabuleiro();
        this.atual = jogador1;
    }

    public Jogador getJogador1() {
        return this.jogador1;
    }

    public void setJogador1(Jogador jogador1) {
        this.jogador1 = jogador1;
    }

    public Jogador getJogador2() {
        return this.jogador2;
    }

    public void setJogador2(Jogador jogador2) {
        this.jogador2 = jogador2;
    }

    public Jogador getVencedor() {
        return this.vencedor;
    }

    public void setVencedor(Jogador vencedor) {
        this.vencedor = vencedor;
    }

    public Jogador getAtual() {
        return this.atual;
    }

    public void setAtual(Jogador atual) {
        this.atual = atual;
    }

    public boolean isModo() {
        return modo;
    }

    public void setModo(boolean modo) {
        this.modo = modo;
    }

    public void zerar() {
        tabuleiro.zerarPosicoes();
        tabuleiro.zerarTabuleiro();
    }

    public void jogada1(int posicao) {
        tabuleiro.jogada1(posicao);
    }

    public int jogada2() {
        this.setAtual(jogador2);
        return tabuleiro.jogada2();
    }

    public void jogada3(int posicao) {
        tabuleiro.jogada3(posicao);

    }

    public boolean jogou(int posicao) {
        if (tabuleiro.getPosicoes().contains(posicao) == false) {
            return true;

        } else {
            return false;
        }
    }

    /*public void jogarComputador() {
     while (!tabuleiro.getParar()) {
     tabuleiro.jogada1();
     this.atual = jogador1;
     this.fimJogada();
     if (tabuleiro.getParar()) {
     break;
     }
     tabuleiro.jogada2();
     this.atual = jogador2;
     this.fimJogada();
     }
     }*/

    /*public void jogarJogador() {
     tabuleiro.zerarPosicoes();
     tabuleiro.zerarTabuleiro();
     while (tabuleiro.getParar() == false) {
     tabuleiro.jogada1();
     this.atual = jogador1;
     this.fimJogada();
     if (tabuleiro.getParar() != false) {
     break;
     }
     tabuleiro.jogada3();
     this.atual = jogador2;
     this.fimJogada();
     }
     }*/
    public int fimJogada() {
        if (tabuleiro.verificarVitoria()) {
            if (this.isModo() == true) {
                if (this.getAtual() == this.getJogador2()) {
                    this.setAtual(this.getJogador1());
                } else if (this.getAtual() == this.getJogador1()) {
                    this.setAtual(this.getJogador2());
                }
            }
            this.setVencedor(this.getAtual());
            System.out.println("Fim de jogo. Vencedor:" + this.getVencedor().getLogin());
            if (this.vencedor.getLogin() != "Computador") {
                System.out.println("fooooi");
                this.vencedor.setVitorias(this.vencedor.getVitorias() + 1);
                if (this.modo == true) {
                    this.vencedor.setPontos(this.vencedor.getPontos() + 4);
                    if (this.vencedor == this.jogador1) {
                        if (this.jogador2.getPontos() <= 4) {
                            this.jogador2.setPontos(0);
                        } else {
                            this.jogador2.setPontos(this.jogador2.getPontos() - 4);
                        }
                    } else if (this.vencedor == this.jogador2) {
                        if (this.jogador1.getPontos() <= 4) {
                            this.jogador1.setPontos(0);
                        } else {
                            this.jogador1.setPontos(this.jogador1.getPontos() - 4);
                        }
                    }
                } else if (this.modo == false) {
                    this.vencedor.setPontos(this.vencedor.getPontos() + 1);
                }
            } else if (this.vencedor.getLogin() == "Computador") {
                System.out.println("fooooi");
                if (this.jogador1.getPontos() <= 0.5) {
                    this.jogador1.setPontos(0);
                } else {
                    this.jogador1.setPontos(this.jogador1.getPontos() - 0.5);
                }
            }
            tabuleiro.setParar(true);
            return 1;
        } else if (tabuleiro.verificarEmpate()) {
            this.vencedor = null;
            System.out.println("Jogo empatado.");
            if (this.modo == false) {
                this.jogador1.setPontos(this.jogador1.getPontos() + 0.5);
            }
            tabuleiro.setParar(true);
            return 2;
        } else {
            return 0;
        }
    }

    public boolean parar() {
        return tabuleiro.getParar();
    }

    @Override
    public String toString() {
        return "Partida [jogador1=" + jogador1 + ", jogador2=" + jogador2 + ", vencedor=" + vencedor + ", tabuleiro="
                + tabuleiro + ", atual=" + atual + ", modo=" + modo + "]";
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((atual == null) ? 0 : atual.hashCode());
        result = prime * result + ((jogador1 == null) ? 0 : jogador1.hashCode());
        result = prime * result + ((jogador2 == null) ? 0 : jogador2.hashCode());
        result = prime * result + (modo ? 1231 : 1237);
        result = prime * result + ((tabuleiro == null) ? 0 : tabuleiro.hashCode());
        result = prime * result + ((vencedor == null) ? 0 : vencedor.hashCode());
        return result;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        Partida other = (Partida) obj;
        if (atual == null) {
            if (other.atual != null) {
                return false;
            }
        } else if (!atual.equals(other.atual)) {
            return false;
        }
        if (jogador1 == null) {
            if (other.jogador1 != null) {
                return false;
            }
        } else if (!jogador1.equals(other.jogador1)) {
            return false;
        }
        if (jogador2 == null) {
            if (other.jogador2 != null) {
                return false;
            }
        } else if (!jogador2.equals(other.jogador2)) {
            return false;
        }
        if (modo != other.modo) {
            return false;
        }
        if (tabuleiro == null) {
            if (other.tabuleiro != null) {
                return false;
            }
        } else if (!tabuleiro.equals(other.tabuleiro)) {
            return false;
        }
        if (vencedor == null) {
            if (other.vencedor != null) {
                return false;
            }
        } else if (!vencedor.equals(other.vencedor)) {
            return false;
        }
        return true;
    }
}
