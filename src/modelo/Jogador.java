package modelo;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Objects;

public class Jogador {

    private String login;
    private String senha;
    private String dataCadastro;
    private int vitorias;
    private double pontos;

    public Jogador(String login, String senha) {
        this.login = login;
        this.senha = senha;
        this.pontos = 0;
        this.vitorias = 0;
        SimpleDateFormat fmt = new SimpleDateFormat("dd/MM/yyyy HH:mm");
        this.dataCadastro = fmt.format(new Date());
    }

    public String getLogin() {
        return this.login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public String getSenha() {
        return this.senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    public String getDataCadastro() {
        return this.dataCadastro;
    }

    public void setDataCadastro(String dataCadastro) {
        this.dataCadastro = dataCadastro;
    }

    public double getPontos() {
        return this.pontos;
    }

    public void setPontos(double pontos) {
        this.pontos = pontos;
    }

    public int getVitorias() {
        return vitorias;
    }

    public void setVitorias(int vitorias) {
        this.vitorias = vitorias;
    }

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 79 * hash + Objects.hashCode(this.login);
        hash = 79 * hash + Objects.hashCode(this.senha);
        hash = 79 * hash + Objects.hashCode(this.dataCadastro);
        hash = 79 * hash + this.vitorias;
        hash = 79 * hash + (int) (Double.doubleToLongBits(this.pontos) ^ (Double.doubleToLongBits(this.pontos) >>> 32));
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Jogador other = (Jogador) obj;
        if (!Objects.equals(this.login, other.login)) {
            return false;
        }
        if (!Objects.equals(this.senha, other.senha)) {
            return false;
        }
        if (!Objects.equals(this.dataCadastro, other.dataCadastro)) {
            return false;
        }
        if (this.vitorias != other.vitorias) {
            return false;
        }
        if (Double.doubleToLongBits(this.pontos) != Double.doubleToLongBits(other.pontos)) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Jogador{" + "login=" + login + ", senha=" + senha + ", dataCadastro=" + dataCadastro + ", vitorias=" + vitorias + ", pontos=" + pontos + '}';
    }
}
