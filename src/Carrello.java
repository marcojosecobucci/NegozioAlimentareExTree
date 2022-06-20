import java.util.Objects;

public class Carrello {
    private Prodotti[] listaProdottiCarrello;
    private int contatoreQuantitaProdotti;
    private Negozio negozio;
    private Prodotti[] magazzino;

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
            for (int i = 0; i < magazzino.length; i++) {
                if (magazzino[i] != null) {
                    if (Objects.equals(magazzino[i].getNome(), p.getNome())) {
                        prodottoEsistente = true;
                        if (magazzino[i].getQuantitaProdotto() > 0) {
                            listaProdottiCarrello[contatoreQuantitaProdotti] = p;
                            contatoreQuantitaProdotti++;
                            negozio.deleteProdottoMagazzino(p);
                            disponibilitaProdotto = true;
                            break;
                        }
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

    public Prodotti[] getListaProdottiCarrello() {
        return listaProdottiCarrello;
    }
}
