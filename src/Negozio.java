
public class Negozio {
    private static Prodotti[] listaProdottiMagazzino;
    private int contatoreQuantitaProdotti;

    public Negozio() {
        listaProdottiMagazzino = new Prodotti[100];
        contatoreQuantitaProdotti = 0;
    }

    public void addProdottoMagazzino(Prodotti p) {
        for (int i = 0; i < contatoreQuantitaProdotti; i++) {
            if (listaProdottiMagazzino[i].getNome().equals(p.getNome())) {
                listaProdottiMagazzino[i].setQuantitaProdotto(p.getQuantitaProdotto() + 1);
                return;
            }
        }

        if (contatoreQuantitaProdotti < listaProdottiMagazzino.length) {
            listaProdottiMagazzino[contatoreQuantitaProdotti] = p;
            listaProdottiMagazzino[contatoreQuantitaProdotti].setQuantitaProdotto(1);
            contatoreQuantitaProdotti++;
        } else {
            System.out.println("Il magazzino è pieno!");
        }
    }

    public void deleteProdottoMagazzino(Prodotti p) {
        p.setQuantitaProdotto(p.getQuantitaProdotto() - 1);
    }

    public Prodotti[] getListaProdottiMagazzino() {
        return listaProdottiMagazzino;
    }

}
