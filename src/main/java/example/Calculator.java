package example;

public class Calculator {

    /** 税抜金額に消費税10%を加えた金額を返す（円未満は切り捨て）。 */
    public int withTax(int amount) {
        if (amount < 0) {
            throw new IllegalArgumentException("amount must be >= 0");
        }
        return amount * 108 / 100;
    }
}
