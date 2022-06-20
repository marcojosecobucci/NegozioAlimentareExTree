public class Prodotti {
    private String nome;
    private float prezzo;

    private GenereProdotto genereProdotto;
    private int quantitaProdotto;

    public Prodotti(String nome, float prezzo, GenereProdotto genereProdotto) {
        this.nome = nome;
        this.prezzo = prezzo;
        this.genereProdotto = genereProdotto;
        quantitaProdotto = 0;
    }

    public void setQuantitaProdotto(int quantitaProdotto) {
        this.quantitaProdotto = quantitaProdotto;
    }

    public String getNome() {
        return nome;
    }

    public int getQuantitaProdotto() {
        return quantitaProdotto;
    }

    public float getPrezzo() {
        return prezzo;
    }

    public GenereProdotto getGenereProdotto() {
        return genereProdotto;
    }
}
