package classic_tdd_1;

import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class StatisticsCalculatorTest {

    @Test
    void shouldFindMinimumAmongPositiveIntegers() {
        StatisticsCalculator statisticsCalculator = new StatisticsCalculator();
        List<Integer> positiveIntegers = Arrays.asList(0, 8, 5);
        int expectedMin = 0;

        int min = statisticsCalculator.minValue(positiveIntegers);

        assertEquals(expectedMin, min);
    }

    @Test
    void shouldThrowExceptionIfSequenceIsEmptyWhenMinValue() {
        StatisticsCalculator statisticsCalculator = new StatisticsCalculator();
        List<Integer> positiveIntegers = Collections.emptyList();

        assertThrows(RuntimeException.class, () -> statisticsCalculator.minValue(positiveIntegers));
    }

    @Test
    void shouldFindMiniMumWihNegativeIntegersIncluded() {
        StatisticsCalculator statisticsCalculator = new StatisticsCalculator();
        List<Integer> positiveIntegers = Arrays.asList(0, 8, 5, 45, 90, -1, -498);
        int expectedMin = -498;

        int min = statisticsCalculator.minValue(positiveIntegers);

        assertEquals(expectedMin, min);
    }

    @Test
    void shouldFindMaxWithPositivesOnly() {
        StatisticsCalculator statisticsCalculator = new StatisticsCalculator();
        List<Integer> positiveIntegers = Arrays.asList(0, 8, 5);
        int expectedMax = 8;

        int max = statisticsCalculator.maxValue(positiveIntegers);

        assertEquals(expectedMax, max);
    }

    @Test
    void shouldThrowExceptionIfSequenceIsEmptyWhenMax() {
        StatisticsCalculator statisticsCalculator = new StatisticsCalculator();
        List<Integer> positiveIntegers = Collections.emptyList();

        assertThrows(RuntimeException.class, () -> statisticsCalculator.maxValue(positiveIntegers));
    }

    @Test
    void shouldFindMaxWithNegativeIntegersIncluded() {
        StatisticsCalculator statisticsCalculator = new StatisticsCalculator();
        List<Integer> numbers = Arrays.asList(0, 8, 5, 43543, -32432, -4, 98534);
        int expectedMax = 98534;

        int max = statisticsCalculator.maxValue(numbers);

        assertEquals(expectedMax, max);
    }

    @Test
    void shouldFindMaxWithNegativeIntegersOnly() {
        StatisticsCalculator statisticsCalculator = new StatisticsCalculator();
        List<Integer> numbers = Arrays.asList(-1, -56, -4, -8, -432423);
        int expectedMax = -1;

        int max = statisticsCalculator.maxValue(numbers);

        assertEquals(expectedMax, max);
    }

    @Test
    void shouldCountNumberOfElementsInSequenceWithSeveralElements() {
        StatisticsCalculator statisticsCalculator = new StatisticsCalculator();
        List<Integer> numbers = Arrays.asList(-1, -56, -4, -8, -432423);
        int expectedCount = numbers.size();

        int actualCount = statisticsCalculator.elementsCount(numbers);

        assertEquals(expectedCount, actualCount);
    }

    @Test
    void shouldCountNumberOfElementsInEmptySequence() {
        StatisticsCalculator statisticsCalculator = new StatisticsCalculator();
        List<Integer> numbers = Collections.emptyList();
        int expectedCount = 0;

        int actualCount = statisticsCalculator.elementsCount(numbers);

        assertEquals(expectedCount, actualCount);
    }
}
