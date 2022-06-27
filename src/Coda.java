import java.util.Comparator;
import java.util.PriorityQueue;

public class Coda {

    private static PriorityQueue<Cliente> clienti;

    Cassa cassa;

    public Coda(Cassa cassa) {
        clienti = new PriorityQueue<>();
        this.cassa = cassa;
    }

    public void addCLienteInFila(Cliente cliente) {
        clienti.add(cliente);
    }

    public void fila(GiornoDellaSettimana giornoDellaSettimana) {
        while (!clienti.isEmpty()) {
            System.out.println(clienti);
            cassa = new Cassa(clienti.remove(), giornoDellaSettimana);
            cassa.stampaScontrino();
        }
    }

    public void lunghezzaFila() {
        System.out.println(clienti.size());
    }

}
