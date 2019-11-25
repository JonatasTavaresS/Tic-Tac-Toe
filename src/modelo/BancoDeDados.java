package modelo;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import com.thoughtworks.xstream.XStream;
import com.thoughtworks.xstream.io.xml.DomDriver;

public class BancoDeDados {

    public static void gerarArquivo(ArrayList<Jogador> jogadores) {
        XStream xstream = new XStream(new DomDriver());
        xstream.alias("Jogadores", List.class);
        xstream.alias("Jogador", Jogador.class);
        File arquivo = new File("database/jogadores.xml");
        FileOutputStream gravar;
        try {
            gravar = new FileOutputStream(arquivo);
            gravar.write(xstream.toXML(jogadores).getBytes());
            gravar.close();
        } catch (IOException ex) {
            ex.printStackTrace();
        }
    }

    public static ArrayList<Jogador> lerArquivo() {
        ArrayList<Jogador> jogadores = new ArrayList<>();
        XStream xstream = new XStream(new DomDriver());
        xstream.alias("Jogadores", List.class);
        xstream.alias("Jogador", Jogador.class);
        xstream.processAnnotations(Jogador.class);
        try {
            BufferedReader input = new BufferedReader(new FileReader("database/jogadores.xml"));
            jogadores = (ArrayList<Jogador>) xstream.fromXML(input);
            input.close();
        } catch (IOException ex) {
            BancoDeDados.gerarArquivo(jogadores);
        }
        return jogadores;
    }
}
