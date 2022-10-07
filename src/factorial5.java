public class factorial5 {
    public double factorialR(double x,int n) {
        double temp = 0;
        for (int i = 1; i <= n; i++) {
            temp += Math.pow(-1, i-1) * Math.pow(x, i) / i;
        }
        return temp;
    }
}
