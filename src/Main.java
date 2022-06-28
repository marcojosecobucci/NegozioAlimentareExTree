
public class Main {
    public static void main(String[] args) {
        Negozio superMarket = new Negozio();
        Cliente cliente1 = new Cliente(65, 10, new Carrello(superMarket));
        Cliente cliente2 = new Cliente(25, 0, new Carrello(superMarket));
        Cliente cliente3 = new Cliente(78, 0, new Carrello(superMarket));
        Cliente cliente4 = new Cliente(82, 0, new Carrello(superMarket));
        Coda coda = new Coda(new Cassa());
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

        cliente2.carrello.addProdottoCarrello(caffe);
        cliente2.carrello.addProdottoCarrello(caffe);

        cliente2.carrello.addProdottoCarrello(stoviglie);

        cliente2.carrello.addProdottoCarrello(penna);


        superMarket.addProdottoMagazzino(caffe);
        superMarket.addProdottoMagazzino(caffe);

        superMarket.addProdottoMagazzino(stoviglie);
        superMarket.addProdottoMagazzino(stoviglie);

        superMarket.addProdottoMagazzino(penna);

        cliente3.carrello.addProdottoCarrello(caffe);
        cliente3.carrello.addProdottoCarrello(caffe);

        cliente3.carrello.addProdottoCarrello(stoviglie);

        cliente3.carrello.addProdottoCarrello(penna);


        superMarket.addProdottoMagazzino(caffe);
        superMarket.addProdottoMagazzino(caffe);

        superMarket.addProdottoMagazzino(stoviglie);
        superMarket.addProdottoMagazzino(stoviglie);

        superMarket.addProdottoMagazzino(penna);

        cliente4.carrello.addProdottoCarrello(caffe);
        cliente4.carrello.addProdottoCarrello(caffe);

        cliente4.carrello.addProdottoCarrello(stoviglie);

        cliente4.carrello.addProdottoCarrello(penna);


        coda.addCLienteInFila(cliente3);
        coda.addCLienteInFila(cliente1);
        coda.addCLienteInFila(cliente4);
        coda.addCLienteInFila(cliente2);
        coda.lunghezzaFila();
        coda.fila(GiornoDellaSettimana.LUNEDI);
        coda.lunghezzaFila();
    }
}
