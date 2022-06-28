import java.util.Arrays;

public class Carrello {
    private final Prodotti[] listaProdottiCarrello;
    private int contatoreQuantitaProdotti;
    private final Negozio negozio;
    private final Prodotti[] magazzino;

    public Carrello(Negozio negozio) {
        listaProdottiCarrello = new Prodotti[20];
        contatoreQuantitaProdotti = 0;
        this.negozio = negozio;
        magazzino = negozio.getListaProdottiMagazzino();
    }

    public void addProdottoCarrello(Prodotti p) {
        boolean prodottoEsistente = false;
        boolean disponibilitaProdotto = false;
        if (contatoreQuantitaProdotti <= 20) {
            for (Prodotti prodotti : magazzino) {
                if (prodotti != null && prodotti.getNome().equals(p.getNome())) {
                    prodottoEsistente = true;
                    if (prodotti.getQuantitaProdotto() > 0) {
                        System.out.println("In negozio rimangono: " + (prodotti.getQuantitaProdotto() - 1)
                                + " " + prodotti.getNome());
                        disponibilitaProdotto = true;
                        listaProdottiCarrello[contatoreQuantitaProdotti] = p;
                        contatoreQuantitaProdotti++;
                        negozio.deleteProdottoMagazzino(p);
                        break;
                    }
                }
            }
        } else {
            System.out.println("Carrello pieno!");
        }
        if (!prodottoEsistente) {
            System.out.println("Il prodotto non c'è in magazzino!");
        }
        if (!disponibilitaProdotto) {
            System.out.println("Il prodotto " + p.getNome() + " è esaurito!");
        }
    }

    //TODO: Implementare la possibilità di togliere qualcosa dal carrello.

    public Prodotti[] getListaProdottiCarrello() {
        return listaProdottiCarrello;
    }

    @Override
    public String toString() {
        return "Carrello{" +
                "listaProdottiCarrello=" + Arrays.toString(listaProdottiCarrello) +
                '}';
    }
}
