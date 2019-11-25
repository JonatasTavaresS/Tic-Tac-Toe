package modelo;

import java.util.ArrayList;
import java.util.Scanner;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

public class Central {

    private static ArrayList<Jogador> jogadores = BancoDeDados.lerArquivo();
    private static Jogador jogador1 = null;
    private static Jogador jogador2 = null;
    private static Scanner leitor = new Scanner(System.in);
    private static Partida partida = new Partida(Central.getJogador1());

    public static ArrayList<Jogador> getJogadores() {
        return jogadores;
    }

    public static void setJogadores(ArrayList<Jogador> jogadores) {
        Central.jogadores = jogadores;
    }

    public static Jogador getJogador1() {
        return jogador1;
    }

    public static void setJogador1(Jogador jogador1) {
        Central.jogador1 = jogador1;
    }

    public static Jogador getJogador2() {
        return jogador2;
    }

    public static void setJogador2(Jogador jogador2) {
        Central.jogador2 = jogador2;
    }

    public static Scanner getLeitor() {
        return leitor;
    }

    public static void setLeitor(Scanner leitor) {
        Central.leitor = leitor;
    }

    public static Partida getPartida() {
        return partida;
    }

    public static void setPartida(Partida partida) {
        Central.partida = partida;
    }

    public static int login(String login, String senha) {
        /*System.out.print("Nome de usuário: ");
         String login = leitor.nextLine();
         System.out.print("Senha: ");
         String senha = leitor.nextLine();*/
        for (Jogador j : jogadores) {
            if (j.getLogin().equals(login)) {
                if (j.getSenha().equals(senha)) {
                    System.out.println("\nOlá " + j.getLogin() + ", seja bem vindo!\n");
                    Central.setJogador1(j);
                    partida.setJogador1(j);
                    return 0;
                } else {
                    System.out.println("\nSua senha está incorreta. Confira-a.\n");
                    return 1;
                }
            }
        }
        System.out.println(
                "\nO nome de usuário inserido não pertence a uma conta.\nVerifique seu nome de usuário e tente novamente.\n");
        return 2;
    }

    public static int login2(String login, String senha) {
        /*System.out.print("Nome de usuário: ");
         String login = leitor.nextLine();
         System.out.print("Senha: ");
         String senha = leitor.nextLine();*/
        for (Jogador j : jogadores) {
            if (j.getLogin().equals(login)) {
                System.out.println(j.getLogin() + login);
                if (j.getSenha().equals(senha)) {
                    System.out.println("\nOlá " + j.getLogin() + ", seja bem vindo!\n");
                    Central.setJogador2(j);
                    partida.setJogador2(j);
                    return 0;
                } else {
                    System.out.println("\nSua senha está incorreta. Confira-a.\n");
                    return 1;
                }
            }
        }
        System.out.println(
                "\nO nome de usuário inserido não pertence a uma conta.\nVerifique seu nome de usuário e tente novamente.\n");
        return 2;
    }

    public static Jogador criarJogador(String nome, String senha) {
        /*System.out.print("Nome de usuário: ");
         String nome = leitor.nextLine();
         System.out.print("Senha: ");
         String senha = leitor.nextLine();
         System.out.print("Confirmar senha: ");
         String nsenha = leitor.nextLine();
         while (!senha.equals(nsenha)) {
         System.out.print("Senha: ");
         senha = leitor.nextLine();
         System.out.print("Confirmar senha: ");
         nsenha = leitor.nextLine();
         }*/
        Jogador jogador = new Jogador(nome, senha);
        return jogador;
    }

    public static boolean cadastrar(Jogador jogador) {
        boolean existe = false;
        for (Jogador j : jogadores) {
            if (j.getLogin().equals(jogador.getLogin())) {
                existe = true;
                break;
            }
        }
        if (!existe) {
            Central.jogadores.add(jogador);
            BancoDeDados.gerarArquivo(Central.jogadores);
        }
        return !existe;
    }

    public static void removerJogador() {
        for (Jogador j : jogadores) {
            if (j.getLogin().equals(Central.getJogador1().getLogin())) {
                Central.jogadores.remove(j);
                break;
            }
        }
        BancoDeDados.gerarArquivo(Central.getJogadores());
    }

    public static ArrayList<Jogador> rankingPontos() {
        double maior = 0;
        Jogador j1 = new Jogador(null, null);
        Jogador j2 = new Jogador(null, null);
        Jogador j3 = new Jogador(null, null);
        for (Jogador j : jogadores) {
            if (j.getPontos() > maior) {
                maior = j.getPontos();
                j1 = j;
            } else if (j.getPontos() == maior && maior == 0) {
                maior = j.getPontos();
                j1 = j;
            }

        }
        maior = 0;
        for (Jogador j : jogadores) {
            if (j.getPontos() > maior && j != j1) {
                maior = j.getPontos();
                j2 = j;
            } else if (j.getPontos() == maior && maior == 0 && j != j1) {
                maior = j.getPontos();
                j2 = j;
            }
        }
        maior = 0;
        for (Jogador j : jogadores) {
            if (j.getPontos() > maior && j != j1 && j != j2) {
                maior = j.getPontos();
                j3 = j;
            } else if (j.getPontos() == maior && maior == 0 && j != j1 && j != j2) {
                maior = j.getPontos();
                j3 = j;
            }

        }
        ArrayList<Jogador> rPontos = new ArrayList<>();
        rPontos.add(j1);
        rPontos.add(j2);
        rPontos.add(j3);
        return rPontos;
    }

    public static ArrayList<Jogador> rankingVitorias() {
        double maior = 0;
        Jogador j1 = new Jogador(null, null);
        Jogador j2 = new Jogador(null, null);
        Jogador j3 = new Jogador(null, null);
        for (Jogador j : jogadores) {
            if (j.getVitorias() > maior) {
                maior = j.getVitorias();
                j1 = j;
            } else if (j.getVitorias() == maior && maior == 0) {
                maior = j.getVitorias();
                j1 = j;
            }

        }
        maior = 0;
        for (Jogador j : jogadores) {
            if (j.getVitorias() > maior && j != j1) {
                maior = j.getVitorias();
                j2 = j;
            } else if (j.getVitorias() == maior && maior == 0 && j != j1) {
                maior = j.getVitorias();
                j2 = j;
            }
        }
        maior = 0;
        for (Jogador j : jogadores) {
            if (j.getVitorias() > maior && j != j1 && j != j2) {
                maior = j.getVitorias();
                j3 = j;
            } else if (j.getVitorias() == maior && maior == 0 && j != j1 && j != j2) {
                maior = j.getVitorias();
                j3 = j;
            }

        }
        ArrayList<Jogador> rVitorias = new ArrayList<>();
        rVitorias.add(j1);
        rVitorias.add(j2);
        rVitorias.add(j3);
        return rVitorias;
    }

    public static void iniciar() {
        Central.setPartida(new Partida(Central.getJogador1()));
        partida.setAtual(Central.getJogador1());
        partida.zerar();
        Jogador jogador1 = partida.getJogador1();
        for (Jogador j : jogadores) {
            if (j.getLogin().equals(jogador1.getLogin())) {
                j.setPontos(jogador1.getPontos());
            }
        }
        BancoDeDados.gerarArquivo(Central.jogadores);
    }

    public static void iniciar2() {
        Central.setPartida(new Partida(Central.getJogador1(), Central.getJogador2()));
        partida.zerar();
        Jogador jogador1 = partida.getJogador1();
        Jogador jogador2 = partida.getJogador2();
        for (Jogador j : jogadores) {
            if (j.getLogin().equals(jogador1.getLogin())) {
                j.setPontos(jogador1.getPontos());
            }
            if (j.getLogin().equals(jogador2.getLogin())) {
                j.setPontos(jogador2.getPontos());
            }
        }
        BancoDeDados.gerarArquivo(Central.jogadores);
    }

    public static void jogada1(int posicao) {
        if (partida.isModo() == false) {
            partida.setAtual(jogador1);
            partida.jogada1(posicao);
        } else {
            partida.jogada1(posicao);
            partida.setAtual(jogador2);
        }
    }

    public static int jogada2() {
        return partida.jogada2();
    }

    public static void jogada3(int posicao) {
        partida.jogada3(posicao);
        partida.setAtual(jogador1);
    }

    public static boolean jogou(int posicao) {
        return partida.jogou(posicao);
    }

    public static int verificarGanhou() {
        return partida.fimJogada();
    }

    public static boolean parar() {
        return partida.parar();
    }

    public static Jogador atual() {
        System.out.println(partida.getAtual());
        System.out.println(partida.getJogador1());
        return partida.getAtual();
    }

    public static void listar() {
        for (Jogador j : jogadores) {
            System.out.println(j.getLogin());
        }
    }

    /*
     public void procurarJogador() {
     System.out.print("Informe o nome de usuário de seu oponente: ");
     String procurado = leitor.nextLine();
     System.out.println(Central.jogadores);
     for (Jogador j : jogadores) {
     if (j.getLogin().equals(procurado)) {
     System.out
     .print("\nO jogador " + j.getLogin() + " foi encontrado!\nDeseja jogar uma partida com ele? ");
     String resposta = leitor.nextLine();
     Jogador jogador2 = j;
     if (resposta.equals("s")) {
     System.out.println("\nNome de usuário: " + j.getLogin());
     System.out.print("Senha: ");
     String senha = leitor.nextLine();
     while (!j.getSenha().equals(senha)) {
     System.out.println("\nSenha incorreta, tente novamente.\n");
     System.out.println("Nome de usuário: " + j.getLogin());
     senha = leitor.nextLine();
     }
     System.out.println("\nLogin efetuado com sucesso!\n");
     Partida partida = new Partida(Central.getJogador1(), jogador2);
     System.out
     .println("(" + Central.getJogador1().getPontos() + " pontos) " + Central.getJogador1().getLogin()
     + " x " + jogador2.getLogin() + " (" + jogador2.getPontos() + " pontos)\n");
     partida.jogarJogador();
     }
     }
     }
     System.out.println(Central.getJogadores());
     BancoDeDados.gerarArquivo(Central.jogadores);
     }
     */
    public static int editarUsuario(String nusuario) {
        if (!Central.getJogadores().contains(nusuario)) {
            getJogador1().setLogin(nusuario);
            BancoDeDados.gerarArquivo(Central.getJogadores());
            return 1;
        } else {
            return 0;
        }
    }

    public static int editarSenha(String senhaAtual, String nsenha, String confnSenha) {
        if (!senhaAtual.equals(Central.getJogador1().getSenha())) {
            return 1;
        } else if (nsenha.length() < 6) {
            return 2;
        } else if (senhaAtual.equals(Central.getJogador1().getSenha()) && nsenha.equals(confnSenha)) {
            Central.getJogador1().setSenha(nsenha);
            BancoDeDados.gerarArquivo(Central.getJogadores());
            return 3;
        } else {
            return 0;
        }
    }
}
