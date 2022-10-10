public class factorial3 {
    public int factorial(int n){
        if (n <2) {
            return 1;
        }
        return n * factorial(n - 1);
    }
    public double factorialR(double x,int n) {
        double temp = x;
        for (int i = 1; i <= n; i++) {
            temp += Math.pow(-1, i) * Math.pow(x, 2*i+1) / factorial(2*i+1);
        }
        return temp;
    }
}
