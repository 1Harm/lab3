public class factorial17 {
    public double factorialR(double n) {
        double temp = 0;
        for (int i =1; i <= n; i++) {
            temp += Math.pow(i, i);
        }
        return temp;
    }
}
