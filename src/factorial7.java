public class factorial7 {
    public double factorialR(double x,int n) {
        double temp = 1.0;
        if (Math.abs(x) < 1) {
            for (int i = 1; i <= n; i++) {
                temp += ((2 * i - 1) * Math.pow(x, 2 * i + 1)) / ((2 * i) * (2 * i + 1));
            }
            return Math.toDegrees(temp);
        }
        else
            return 0;
    }

}
