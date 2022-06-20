public class Cliente {


    private int eta;

    private int punti;

    Carrello carrello;

    public Cliente( int eta, int punti ,Carrello carrello) {
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
}
