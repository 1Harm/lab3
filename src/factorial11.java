public class factorial11 {
    public void factorialR(int n) {
        double[] A = new double[n+1];
        A[0]=2;
        for (int i =1; i < n+1; i++) {
            A[i]=2+1/A[i-1];
            System.out.println(A[i]);
        }
    }
}
