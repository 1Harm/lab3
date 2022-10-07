public class factorial12 {
    public void factorialR(int n) {
        double[] A = new double[n+1];
        A[0]=1;
        for (int i =1; i < n+1; i++) {
            A[i]=(A[i-1]+1)/i;
            System.out.println(A[i]);
        }
    }
}
