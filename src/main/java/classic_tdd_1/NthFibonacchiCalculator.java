package classic_tdd_1;

public class NthFibonacchiCalculator {

    //0,1,1,2,3,5,8,13,21,34
    public int nthFib(int n) {
        if (n == 0 || n == 1) {
            return n;
        } else if (n == 2) {
            return 1;
        } else {
            return nthFib(n - 1) + nthFib(n - 2);
        }
    }
}
