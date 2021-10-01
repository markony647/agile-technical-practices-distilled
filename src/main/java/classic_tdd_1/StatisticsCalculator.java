package classic_tdd_1;

import java.util.List;

public class StatisticsCalculator {

    public int minValue(List<Integer> numbers) {
        checkIfNotEmpty(numbers);
        return numbers.stream().min(Integer::compareTo).orElse(0);
    }

    public int maxValue(List<Integer> numbers) {
        checkIfNotEmpty(numbers);
        return numbers.stream().max(Integer::compareTo).orElse(0);
    }

    public int elementsCount(List<Integer> numbers) {
        return numbers.size();
    }

    private void checkIfNotEmpty(List<Integer> numbers) {
        if (numbers.isEmpty()) {
            throw new RuntimeException("List should not be empty!");
        }
    }
}
