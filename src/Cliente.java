import java.util.Comparator;
import java.util.List;

public class Cliente implements Comparable<Cliente> {

    private int eta;

    private int punti;

    Carrello carrello;

    public Cliente(int eta, int punti, Carrello carrello) {
        this.eta = eta;
        this.punti = punti;
        this.carrello = carrello;
    }

    public int getEta() {
        return eta;
    }

    public int getPunti() {
        return punti;
    }

    public void setPunti(int punti) {
        this.punti = punti;
    }

    @Override
    public String toString() {
        return "Cliente{" +
                "eta=" + eta +
                ", punti=" + punti +
                '}';
    }

    @Override
    public int compareTo(Cliente o) {
        if(this.getEta() < o.getEta()) {
            return 1;
        } else if (this.getEta() > o.getEta()) {
            return -1;
        } else {
            return 0;
        }
    }
}
