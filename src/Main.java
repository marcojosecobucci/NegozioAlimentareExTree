import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Negozio superMarket = new Negozio();
        Carrello carrello1 = new Carrello(superMarket);
        Carrello carrello2 = new Carrello(superMarket);
        Cliente cliente1 = new Cliente(65, 1, carrello1);
        Cliente cliente2 = new Cliente(25, 0, carrello2);
        Cassa cassa1;
        Cassa cassa2;
        Prodotti caffe = new Prodotti("Caffe", 3, GenereProdotto.ALIMENTARE);
        Prodotti stoviglie = new Prodotti("Stoviglie", 5, GenereProdotto.PRODOTTO_CASA);
        Prodotti penna = new Prodotti("Penna", 0.5f, GenereProdotto.CANCELLERIA);

        superMarket.addProdottoMagazzino(caffe);
        superMarket.addProdottoMagazzino(caffe);
        superMarket.addProdottoMagazzino(caffe);
        superMarket.addProdottoMagazzino(caffe);

        superMarket.addProdottoMagazzino(stoviglie);
        superMarket.addProdottoMagazzino(stoviglie);

        superMarket.addProdottoMagazzino(penna);

        cliente1.carrello.addProdottoCarrello(caffe);
        cliente1.carrello.addProdottoCarrello(caffe);

        cliente1.carrello.addProdottoCarrello(stoviglie);

        cliente1.carrello.addProdottoCarrello(penna);

        cassa1 = new Cassa(cliente1, GiornoDellaSettimana.LUNEDI);
        cassa1.stampaScontrino();

        cliente2.carrello.addProdottoCarrello(caffe);
        cliente2.carrello.addProdottoCarrello(caffe);

        cliente2.carrello.addProdottoCarrello(stoviglie);

        cliente2.carrello.addProdottoCarrello(penna);

        cassa2 = new Cassa(cliente2, GiornoDellaSettimana.MARTEDI);
        cassa2.stampaScontrino();
    }
}
