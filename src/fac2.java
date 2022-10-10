public class fac2 {
    public int factorial(int n){
        if (n < 2) {
            return 1;
        }
        return n * factorial(n - 1);
    }
    public double factorialR(int x,int n) {
        double temp = 1;
        for (int i = 1; i <= n; i++)
            temp += Math.pow(x,i)/factorial(i);
        return temp;
    }
}

