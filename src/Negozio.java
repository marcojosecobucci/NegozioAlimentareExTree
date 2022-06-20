import java.util.Objects;

public class Negozio {
    private static Prodotti[] listaProdottiMagazzino;
    private int contatoreQuantitaProdotti;

    public Negozio() {
        listaProdottiMagazzino = new Prodotti[100];
        contatoreQuantitaProdotti = 0;
    }

    public void addProdottoMagazzino(Prodotti p) {
        boolean addQuantita = false;
        for (int i = 0; i < listaProdottiMagazzino.length; i++) {
            if (listaProdottiMagazzino[i] != null) {
                if (Objects.equals(listaProdottiMagazzino[i].getNome(), p.getNome())) {
                    listaProdottiMagazzino[i].setQuantitaProdotto(p.getQuantitaProdotto() + 1);
                    addQuantita = true;
                    break;
                }
            }
        }

        if (!addQuantita) {
            listaProdottiMagazzino[contatoreQuantitaProdotti] = p;
            listaProdottiMagazzino[contatoreQuantitaProdotti].setQuantitaProdotto(p.getQuantitaProdotto() + 1);
            contatoreQuantitaProdotti++;
        }
    }

    public void deleteProdottoMagazzino(Prodotti p) {
        p.setQuantitaProdotto(p.getQuantitaProdotto() - 1);
    }

    public Prodotti[] getListaProdottiMagazzino() {
        return listaProdottiMagazzino;
    }

}
