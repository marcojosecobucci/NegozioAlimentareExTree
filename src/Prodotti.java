public class Prodotti {
    private final String nome;
    private final float prezzo;

    private final GenereProdotto genereProdotto;
    private int quantitaProdotto;

    public Prodotti(String nome, float prezzo, GenereProdotto genereProdotto) {
        this.nome = nome;
        this.prezzo = prezzo;
        this.genereProdotto = genereProdotto;
        quantitaProdotto = 0;
    }


    public String getNome() {
        return nome;
    }
    public int getQuantitaProdotto() {
        return quantitaProdotto;
    }
    public void setQuantitaProdotto(int quantitaProdotto) {
        this.quantitaProdotto = quantitaProdotto;
    }

    public float getPrezzo() {
        return prezzo;
    }

    public GenereProdotto getGenereProdotto() {
        return genereProdotto;
    }
}
