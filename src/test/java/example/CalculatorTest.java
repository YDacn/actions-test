package example;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

import org.junit.jupiter.api.Test;

class CalculatorTest {

    private final Calculator calc = new Calculator();

    @Test
    void 正常系_1000円は1100円になる() {
        assertEquals(1100, calc.withTax(1000));
    }

    @Test
    void 境界値_0円は0円のまま() {
        assertEquals(0, calc.withTax(0));
    }

    @Test
    void 端数_999円は円未満切り捨てで1098円() {
        assertEquals(1098, calc.withTax(999));
    }

    @Test
    void 異常系_マイナス金額は例外() {
        assertThrows(IllegalArgumentException.class, () -> calc.withTax(-1));
    }
}
