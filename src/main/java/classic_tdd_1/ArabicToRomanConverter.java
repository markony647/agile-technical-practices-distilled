package classic_tdd_1;

public class ArabicToRomanConverter {

    public String convert(int arabicNumber) {
        if (arabicNumber < 4) {
            return "I".repeat(arabicNumber);
        }
        else {
            return "IV";
        }
    }
}
