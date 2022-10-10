public class factorial8 {
    public double factorialR(double x, int n) {
        double temp = 1.0;
        if (x < 1) {

            for (int i = 1; i <= n; i++) {
                temp -= Math.pow(-1, i-1) *(2*i - 3 )* (Math.pow(x, i) )/ (2 * i);
            }
            return temp;
        }
        else
            return 0;
    }
}
