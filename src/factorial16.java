public class factorial16 {
    public double factorialR(int n, int k) {
        double temp = 0;
        for (int i =1; i <= n; i++) {
            temp += Math.pow(i, k);
        }
        return temp;
    }
}