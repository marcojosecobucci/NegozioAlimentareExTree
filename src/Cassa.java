
public class Cassa {

    private Cliente cliente;
    Prodotti[] listaProdottiCarrello;
    private float valoreScontrino;
    private GiornoDellaSettimana giornoDellaSettimana;

    public Cassa(Cliente cliente, GiornoDellaSettimana giornoDellaSettimana) {
        this.cliente = cliente;
        this.giornoDellaSettimana = giornoDellaSettimana;
        valoreScontrino = 0;
        listaProdottiCarrello = cliente.carrello.getListaProdottiCarrello();
    }


    public void stampaScontrino() {
        sommaScontrino();
        String strValoreScontrino = String.format("%.02f", valoreScontrino);
        System.out.println("Totale: " + strValoreScontrino);

        aggiungiPunti();
    }

    public void stampaScontrino(int mesi) {
        sommaScontrino(mesi);
        String strValoreScontrino = String.format("%.02f", valoreScontrino);
        System.out.println("Totale: " + strValoreScontrino);
    }
    public void sommaScontrino() {
        for (int i = 0; i < listaProdottiCarrello.length; i++) {
            if (listaProdottiCarrello[i] != null) {
                passaggioProdotti(listaProdottiCarrello[i]);
                listaProdottiCarrello[i] = null;
            }
        }
        scontoPunti();
    }

    public void sommaScontrino(int mesi) {
        for (int i = 0; i < listaProdottiCarrello.length; i++) {
            if (listaProdottiCarrello[i] != null) {
                passaggioProdotti(listaProdottiCarrello[i]);
                listaProdottiCarrello[i] = null;
            }
        }
        String strValoreScontrino = String.format("%.02f", valoreScontrino / mesi);
        System.out.println("La rata sarà di " + strValoreScontrino + " al mese per un" );
    }

    public void passaggioProdotti(Prodotti p) {
        boolean verificaSconto = false;
        if ((giornoDellaSettimana == GiornoDellaSettimana.LUNEDI || giornoDellaSettimana == GiornoDellaSettimana.MERCOLEDI)
                && cliente.getEta() >= 60 && p.getGenereProdotto() == GenereProdotto.ALIMENTARE) {
            float sconto = p.getPrezzo() * 20 / 100;
            valoreScontrino += (p.getPrezzo() - sconto);
            verificaSconto = true;
        }

        if (!verificaSconto) {
            valoreScontrino += p.getPrezzo();
        }
    }

    private void scontoPunti() {
        while (valoreScontrino >= 10 && cliente.getPunti() >= 10) {
            valoreScontrino -= 10;
            cliente.setPunti(cliente.getPunti() - 10);
        }
    }

    private void aggiungiPunti() {
        while (valoreScontrino >= 10) {
            valoreScontrino -= 10;
            cliente.setPunti(cliente.getPunti() + 1);
        }
    }
}
