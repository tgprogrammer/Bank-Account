package gross_calculator;

public class WeddingCake extends Cake{
    private int tiers;

    public WeddingCake() {
        super("Almonds");
    }

    public int getTiers() {
        return tiers;
    }

    public void setTiers(int tiers) {
        this.tiers = tiers;
    }
}
