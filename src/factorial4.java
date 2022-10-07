public class factorial4 {
    public int factorial(int n){
        if (n < 2) {
            return n;
        }
        return n * factorial(n - 1);
    }
    public double factorialR(double x,int n) {
        double temp = 0;
        for (int i = 1; i <= n; i++) {
            temp += Math.pow(-1, i) * Math.pow(x, 2*i) / factorial(2*i);
        }
        return x + temp;
    }
}
