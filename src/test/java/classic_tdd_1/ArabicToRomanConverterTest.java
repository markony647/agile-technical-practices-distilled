package classic_tdd_1;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ArabicToRomanConverterTest {

    @Test
    void testOneShouldBeConvertedToRoman() {
        ArabicToRomanConverter converter = new ArabicToRomanConverter();

        assertEquals("I", converter.convert(1));
    }

    @Test
    void testTwoShouldBeConvertedToRoman() {
        ArabicToRomanConverter converter = new ArabicToRomanConverter();

        assertEquals("II", converter.convert(2));
    }

    @Test
    void testFourShouldBeConvertedToRoman() {
        ArabicToRomanConverter converter = new ArabicToRomanConverter();

        assertEquals("IV", converter.convert(4));
    }

    @Test
    void testFiveShouldBeConvertedToRoman() {
        ArabicToRomanConverter converter = new ArabicToRomanConverter();

        assertEquals("V", converter.convert(5));
    }
}
