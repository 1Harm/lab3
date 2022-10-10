public class fac6 {

    public double factorialR(double x, int n) {
        double temp = x;
        if (Math.abs(x) < 1) {
            for (int i = 1; i <= n; i++) {
                temp += Math.pow(-1, i) * Math.pow(x, 2 * i + 1) / (2 * i + 1);
            }
            return Math.toDegrees(Math.abs(temp));
        }
        else
            return 0;
    }
}