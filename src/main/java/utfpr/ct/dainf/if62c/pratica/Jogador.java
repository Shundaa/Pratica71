package utfpr.ct.dainf.if62c.pratica;

/**
 * 
 */
public class Jogador implements Comparable<Jogador> {    

    public int getNumero() {
        return numero;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }
    int numero;
    String nome;
    public Jogador(int numero, String nome) {
        this.numero = numero;
        this.nome = nome;
    }
    @Override
    public String toString() {
        return numero + " - " + nome;
    }

    @Override
    public int compareTo(Jogador jogador) {
        return numero - jogador.numero;
    }
}