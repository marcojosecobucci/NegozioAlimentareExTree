import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Negozio superMarket = new Negozio();
        Cliente cliente1 = new Cliente(65, 1, new Carrello(superMarket));
        Cliente cliente2 = new Cliente(25, 0, new Carrello(superMarket));
        Cassa cassa;
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

        cassa = new Cassa(cliente1, GiornoDellaSettimana.LUNEDI);
        cassa.stampaScontrino();

        cliente2.carrello.addProdottoCarrello(caffe);
        cliente2.carrello.addProdottoCarrello(caffe);

        cliente2.carrello.addProdottoCarrello(stoviglie);

        cliente2.carrello.addProdottoCarrello(penna);

        cassa = new Cassa(cliente2, GiornoDellaSettimana.LUNEDI);
        cassa.stampaScontrino();

        superMarket.addProdottoMagazzino(caffe);
        superMarket.addProdottoMagazzino(caffe);

        superMarket.addProdottoMagazzino(stoviglie);
        superMarket.addProdottoMagazzino(stoviglie);

        superMarket.addProdottoMagazzino(penna);

        cliente2.carrello.addProdottoCarrello(caffe);
        cliente2.carrello.addProdottoCarrello(caffe);

        cliente2.carrello.addProdottoCarrello(stoviglie);

        cliente2.carrello.addProdottoCarrello(penna);

        cassa = new Cassa(cliente2, GiornoDellaSettimana.MARTEDI);
        cassa.stampaScontrino();
    }
}
