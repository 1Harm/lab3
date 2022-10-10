public class factorial1 {
    public int factorial(int n){
        int temp = 1;
        for (int i = 2; i <= n; i++)
            temp *= i;
        return temp;
    }
    public double factorialR(int n) {
        double temp = 1;
        for (int i = 1; i <= n; i++)
            temp += 1.0/factorial(i);
        return  temp;
    }

}
