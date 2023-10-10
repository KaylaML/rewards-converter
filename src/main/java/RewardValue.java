public class RewardValue {

    private double cashValue;
    private int miles;

    public RewardValue(double cashValue) {
        this.cashValue = cashValue;
    }

    public RewardValue(int miles) {
        this.miles = miles;
    }

    public double getCashValue() {
        return miles * 0.0035 + cashValue;
    }

    public int getMilesValue() {
        return (int) (cashValue / 0.0035) + miles;
    }

}
