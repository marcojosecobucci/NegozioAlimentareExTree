
public class Cliente implements Comparable<Cliente> {

    private final int eta;

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
        return Integer.compare(o.getEta(), this.getEta());
    }
}
