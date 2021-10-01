package classic_tdd_1;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class FibonacciTests {

    @Test
    void firstElementShouldBeZero() {
        assertEquals(0, new NthFibonacchiCalculator().nthFib(0));
    }

    @Test
    void secondElementShouldBeOne() {
        assertEquals(1, new NthFibonacchiCalculator().nthFib(1));
    }

    @Test
    void thirdElementShouldBeOne() {
        assertEquals(1, new NthFibonacchiCalculator().nthFib(2));
    }

    @Test
    void fourthElementShouldBeTwo() {
        assertEquals(2, new NthFibonacchiCalculator().nthFib(3));
    }

    @Test
    void tenthElementShouldBeThirtyFour() {
        assertEquals(34, new NthFibonacchiCalculator().nthFib(9));
    }
}
