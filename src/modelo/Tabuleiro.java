package modelo;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class Tabuleiro {

    private String[][] tabuleiro;
    private List<Integer> posicoes;
    private int posicao;
    private boolean parar;

    public Tabuleiro() {
        this.tabuleiro = new String[3][3];
        this.posicoes = new ArrayList<>();
        this.posicao = 0;
        this.parar = false;
    }

    public String[][] getTabuleiro() {
        return this.tabuleiro;
    }

    public void setTabuleiro(String[][] tabuleiro) {
        this.tabuleiro = tabuleiro;
    }

    public List<Integer> getPosicoes() {
        return this.posicoes;
    }

    public void setPosicoes(List<Integer> posicoes) {
        this.posicoes = posicoes;
    }

    public int getPosicao() {
        return this.posicao;
    }

    public void setPosicao(int posicao) {
        this.posicao = posicao;
    }

    public boolean getParar() {
        return this.parar;
    }

    public void setParar(boolean parar) {
        this.parar = parar;
    }

    public String[][] zerarTabuleiro() {
        String[][] tabuleiro = this.getTabuleiro();
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                tabuleiro[i][j] = " ";
            }
        }
        this.setTabuleiro(tabuleiro);
        return this.getTabuleiro();
    }

    public List<Integer> zerarPosicoes() {
        List<Integer> posicoes = new ArrayList<>();
        ;
        for (int i = 0; i < 9; i++) {
            posicoes.add(0);
        }
        this.setPosicao(0);
        this.setPosicoes(posicoes);
        return this.getPosicoes();
    }

    public boolean verificarVitoria() {
        String[][] tabuleiro = this.getTabuleiro();
        if (tabuleiro[0][0] == tabuleiro[0][1] && tabuleiro[0][1] == tabuleiro[0][2] && tabuleiro[0][0] != " ") {
            return true;
        } else if (tabuleiro[1][0] == tabuleiro[1][1] && tabuleiro[1][1] == tabuleiro[1][2] && tabuleiro[1][0] != " ") {
            return true;
        } else if (tabuleiro[2][0] == tabuleiro[2][1] && tabuleiro[2][1] == tabuleiro[2][2] && tabuleiro[2][0] != " ") {
            return true;
        } else if (tabuleiro[0][0] == tabuleiro[1][0] && tabuleiro[1][0] == tabuleiro[2][0] && tabuleiro[0][0] != " ") {
            return true;
        } else if (tabuleiro[0][1] == tabuleiro[1][1] && tabuleiro[1][1] == tabuleiro[2][1] && tabuleiro[0][1] != " ") {
            return true;
        } else if (tabuleiro[0][2] == tabuleiro[1][2] && tabuleiro[1][2] == tabuleiro[2][2] && tabuleiro[0][2] != " ") {
            return true;
        } else if (tabuleiro[0][0] == tabuleiro[1][1] && tabuleiro[1][1] == tabuleiro[2][2] && tabuleiro[0][0] != " ") {
            return true;
        } else if (tabuleiro[0][2] == tabuleiro[1][1] && tabuleiro[1][1] == tabuleiro[2][0] && tabuleiro[0][2] != " ") {
            return true;
        }
        return false;
    }

    public boolean verificarEmpate() {
        String[][] tabuleiro = this.getTabuleiro();
        for (int i = 0; i < tabuleiro.length; i++) {
            for (int j = 0; j < tabuleiro.length; j++) {
                if (tabuleiro[i][j].contentEquals(" ") == true) {
                    return false;
                }
            }
        }
        return true;
    }

    public void jogada1(int posicao) {
        List<Integer> posicoes = this.getPosicoes();
        for (int i = 1; i <= 9; i++) {
            if (posicao == i && posicoes.contains((i)) == false) {
                posicoes.add((i - 1), i);
                posicoes.remove(9);
                if (posicao == 1) {
                    tabuleiro[0][0] = ("X");
                } else if (posicao == 2) {
                    tabuleiro[0][1] = ("X");
                } else if (posicao == 3) {
                    tabuleiro[0][2] = ("X");
                } else if (posicao == 4) {
                    tabuleiro[1][0] = ("X");
                } else if (posicao == 5) {
                    tabuleiro[1][1] = ("X");
                } else if (posicao == 6) {
                    tabuleiro[1][2] = ("X");
                } else if (posicao == 7) {
                    tabuleiro[2][0] = ("X");
                } else if (posicao == 8) {
                    tabuleiro[2][1] = ("X");
                } else if (posicao == 9) {
                    tabuleiro[2][2] = ("X");
                }
            }
        }
        System.out.println(tabuleiro[0][0] + " | " + tabuleiro[0][1] + " | " + tabuleiro[0][2]);
        System.out.println(tabuleiro[1][0] + " | " + tabuleiro[1][1] + " | " + tabuleiro[1][2]);
        System.out.println(tabuleiro[2][0] + " | " + tabuleiro[2][1] + " | " + tabuleiro[2][2] + "\n");
        this.setPosicao(posicao);
        this.setPosicoes(posicoes);
        System.out.println(this.getPosicao());
    }

    public int jogada2() {
        int posicao = getPosicao();
        Random random = new Random();
        posicao = random.nextInt(9);
        while (posicoes.contains(posicao)) {
            posicao = random.nextInt(9);
        }
        for (int i = 1; i <= 9; i++) {
            if (posicao == i && posicoes.contains((i)) == false) {
                posicoes.add((i - 1), i);
                posicoes.remove(9);
                if (posicao == 1) {
                    tabuleiro[0][0] = ("O");
                } else if (posicao == 2) {
                    tabuleiro[0][1] = ("O");
                } else if (posicao == 3) {
                    tabuleiro[0][2] = ("O");
                } else if (posicao == 4) {
                    tabuleiro[1][0] = ("O");
                } else if (posicao == 5) {
                    tabuleiro[1][1] = ("O");
                } else if (posicao == 6) {
                    tabuleiro[1][2] = ("O");
                } else if (posicao == 7) {
                    tabuleiro[2][0] = ("O");
                } else if (posicao == 8) {
                    tabuleiro[2][1] = ("O");
                } else if (posicao == 9) {
                    tabuleiro[2][2] = ("O");
                }
            }
        }
        System.out.println(tabuleiro[0][0] + " | " + tabuleiro[0][1] + " | " + tabuleiro[0][2]);
        System.out.println(tabuleiro[1][0] + " | " + tabuleiro[1][1] + " | " + tabuleiro[1][2]);
        System.out.println(tabuleiro[2][0] + " | " + tabuleiro[2][1] + " | " + tabuleiro[2][2] + "\n");
        this.setPosicao(posicao);
        this.setPosicoes(posicoes);
        return this.getPosicao();
    }

    public void jogada3(int posicao) {
        List<Integer> posicoes = this.getPosicoes();
        for (int i = 1; i <= 9; i++) {
            if (posicao == i && posicoes.contains((i)) == false) {
                posicoes.add((i - 1), i);
                posicoes.remove(9);
                if (posicao == 1) {
                    tabuleiro[0][0] = ("O");
                } else if (posicao == 2) {
                    tabuleiro[0][1] = ("O");
                } else if (posicao == 3) {
                    tabuleiro[0][2] = ("O");
                } else if (posicao == 4) {
                    tabuleiro[1][0] = ("O");
                } else if (posicao == 5) {
                    tabuleiro[1][1] = ("O");
                } else if (posicao == 6) {
                    tabuleiro[1][2] = ("O");
                } else if (posicao == 7) {
                    tabuleiro[2][0] = ("O");
                } else if (posicao == 8) {
                    tabuleiro[2][1] = ("O");
                } else if (posicao == 9) {
                    tabuleiro[2][2] = ("O");
                }
            }
        }
        System.out.println(tabuleiro[0][0] + " | " + tabuleiro[0][1] + " | " + tabuleiro[0][2]);
        System.out.println(tabuleiro[1][0] + " | " + tabuleiro[1][1] + " | " + tabuleiro[1][2]);
        System.out.println(tabuleiro[2][0] + " | " + tabuleiro[2][1] + " | " + tabuleiro[2][2] + "\n");
        this.setPosicao(posicao);
        this.setPosicoes(posicoes);
        System.out.println(this.getPosicao());
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + (parar ? 1231 : 1237);
        result = prime * result + posicao;
        result = prime * result + ((posicoes == null) ? 0 : posicoes.hashCode());
        result = prime * result + Arrays.deepHashCode(tabuleiro);
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
        Tabuleiro other = (Tabuleiro) obj;
        if (parar != other.parar) {
            return false;
        }
        if (posicao != other.posicao) {
            return false;
        }
        if (posicoes == null) {
            if (other.posicoes != null) {
                return false;
            }
        } else if (!posicoes.equals(other.posicoes)) {
            return false;
        }
        if (!Arrays.deepEquals(tabuleiro, other.tabuleiro)) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Tabuleiro [tabuleiro=" + Arrays.toString(tabuleiro) + ", posicoes=" + posicoes + ", posicao=" + posicao
                + ", parar=" + parar + "]";
    }

}
