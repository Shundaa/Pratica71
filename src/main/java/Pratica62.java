
import java.util.Collections;
import java.util.Set;
import utfpr.ct.dainf.if62c.pratica.Jogador;
import utfpr.ct.dainf.if62c.pratica.JogadorComparator;
import utfpr.ct.dainf.if62c.pratica.Time;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 *
 */
public class Pratica62 {
    public static void main( String[] args ){
        Time alemanha;
        Set<String> posicoes;
        alemanha = new Time();
        Jogador jogador1=new Jogador(28, "Manuel Neuer");
        Jogador jogador2= new Jogador(4, "Benedikt Höwedes");
        Jogador jogador3=new Jogador(25, "Thomas Müller");
        Jogador jogador4=new Jogador(25, "Luiz");
        alemanha.addJogador("Goleiro", jogador1);
        alemanha.addJogador("Zagueiro", jogador2);
        alemanha.addJogador("Atacante", jogador3);
        alemanha.addJogador("Bicho", jogador4);
        alemanha.ordena(new JogadorComparator(false, true, false)).stream().forEach((j) -> {
            System.out.println(j);
        });
        int index=Collections.binarySearch(alemanha.ordena(new JogadorComparator(false, true, false)),jogador4);
        System.out.println(index);
    }
    
}
