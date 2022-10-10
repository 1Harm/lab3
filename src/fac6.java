public class fac6 {

    public double factorialR(double x, int n) {
        double temp = 0;
        if (Math.abs(x) < 1) {
            for (int i = 0; i <= n; i++) {
                temp += Math.toDegrees(Math.abs(Math.pow(-1, i) * Math.pow(x, 2 * i + 1) / (2 * i + 1)));
            }
            return temp;
        }
        else
            return 0;
    }
}