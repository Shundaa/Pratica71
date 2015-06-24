package utfpr.ct.dainf.if62c.pratica;

import java.util.Comparator;

/**
 *
 * 
 */
public class JogadorComparator implements Comparator<Jogador> {

    private boolean alfab;
    private boolean numeric;

    public JogadorComparator() {
        alfab = false;
        numeric = true;
    }

    public JogadorComparator(boolean a, boolean n) {
        this.alfab = a;
        this.numeric = n;
    }

    @Override
    public int compare(Jogador o1, Jogador o2) {

        if (alfab) {
            return comparanome(o1, o2);
        } else {
            return comparenumero(o1, o2);
        }

    }

    public int comparanome(Jogador o1, Jogador o2) {

        int tam = o1.nome.length();

        if (tam > o2.nome.length()) {
            tam = o2.nome.length();
        }

        for (int i = 0; i < tam; i++) {
            if (o1.nome.charAt(i) > o2.nome.charAt(i)) {
                return 1;
            }
            if (o1.nome.charAt(i) < o2.nome.charAt(i)) {
                return -1;
            }
        }
        if (o1.nome.length() > o2.nome.length()) {
            return 1;
        }
        if (o1.nome.length() < o2.nome.length()) {
            return -1;
        }

        if (o1.getNum() != o2.getNum()) {
            return o1.getNum() - o2.getNum();
        }
        return 0;
    }

    public int comparenumero(Jogador o1, Jogador o2) {
        
        if (o1.getNum() == o2.getNum()) {
            int tam = o1.nome.length();

            if (tam > o2.nome.length()) {
                tam = o2.nome.length();
            }

            for (int i = 0; i < tam; i++) {
                if (o1.nome.charAt(i) > o2.nome.charAt(i)) {
                    return 1;
                }
                if (o1.nome.charAt(i) < o2.nome.charAt(i)) {
                    return -1;
                }
            }
            if (o1.nome.length() > o2.nome.length()) {
                return 1;
            }
            if (o1.nome.length() < o2.nome.length()) {
                return -1;
            }

            return 0;
        }
        return o1.getNum() - o2.getNum();
    }

}