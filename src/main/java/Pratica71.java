
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;
import utfpr.ct.dainf.if62c.pratica.Jogador;
import utfpr.ct.dainf.if62c.pratica.JogadorComparator;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 *
 */
public class Pratica71 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite o numero de jogadores:");
        int num = scanner.nextInt();
        System.out.println("Quantidade:" + num);
        ArrayList<Jogador> time = new ArrayList<>();
        for(int i = 0; i<num;i++){
        try {
           System.out.println("Digite o numero e o nome:");
            time.add(new Jogador(scanner.nextInt(),scanner.next()));
        } 
        catch (Exception e) {
            System.out.println(e.getLocalizedMessage());
        }
            
        }
        
        Collections.sort(time, new JogadorComparator(true,false));
        
        for(Jogador j: time){
            System.out.println(j);
        }
        Jogador pesquisa;
       int indice = Collections.binarySearch(time, new Jogador(10,"Neymar"), new JogadorComparator(true, false));
       if (indice>=0){
            pesquisa= time.get(indice);
            System.out.println(" Posicao = "+ pesquisa);
        }
    }
}