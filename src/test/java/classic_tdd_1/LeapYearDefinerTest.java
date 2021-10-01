package classic_tdd_1;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class LeapYearDefinerTest {

    @Test
    void commonYear2001ShouldReturnFalse() {
        assertFalse(new LeapYearDefiner().isLeap(2001));
    }

    @Test
    void leapYear1996ShouldReturnTrue() {
        assertTrue(new LeapYearDefiner().isLeap(1996));
    }

    @Test
    void atypicalLeapYear2000ShouldReturnFalse() {
        assertTrue(new LeapYearDefiner().isLeap(2000));
    }

    @Test
    void atypicalCommonYear1900ShouldReturnFalse() {
        assertFalse(new LeapYearDefiner().isLeap(1900));
    }

    @Test
    void leapYear1764ShouldReturnTrue() {
        assertTrue(new LeapYearDefiner().isLeap(1764));
    }

    @Test
    void commonYearShouldReturnFalse() {
        assertFalse(new LeapYearDefiner().isLeap(2021));
    }
}
