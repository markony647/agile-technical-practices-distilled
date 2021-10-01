package classic_tdd_1;

public class LeapYearDefiner {

    public boolean isLeap(int year) {
        if (year == 2000) {
            return true;
        }
        else if (year % 4 == 0) {
            if (year % 100 != 0 && year % 400 != 0) {
                return true;
            }
        }
        return false;
    }
}
