package classic_tdd_1;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class FizzBuzzTest {
    @Test
    void shouldRreturn1ifNumberIsOne() {
        assertEquals("1", new FizzBuzz().fizzBuzz(1));
    }

    @Test
    void shouldReturn2IfNumberIsTwo() {
        assertEquals("2", new FizzBuzz().fizzBuzz(2));
    }

    @Test
    void shouldReturn4IfNumberIsFour() {
        assertEquals("4", new FizzBuzz().fizzBuzz(4));
    }

    @Test
    void shouldReturnFizzIf3() {
        assertEquals("Fizz", new FizzBuzz().fizzBuzz(3));
    }

    @Test
    void shouldReturnBuzzIf5() {
        assertEquals("Buzz", new FizzBuzz().fizzBuzz(5));
    }

    @Test
    void shouldReturnFizzBuzzIf15() {
        assertEquals("FizzBuzz", new FizzBuzz().fizzBuzz(15));
    }
}
