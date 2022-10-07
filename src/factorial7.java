public class factorial7 {
    public double factorialR(double x,int n) {
        double temp = 0;
        if (x < 1) {
            for (int i = 1; i <= n; i++) {
                temp += ((2 * i - 1) * Math.pow(x, 2 * i + 1)) / ((2 * i) * (2 * i + 1));
            }
            return temp;
        }
        else
            return 0;
    }

}
