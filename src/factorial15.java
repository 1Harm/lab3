public class factorial15 {
    public void factorialR(int n) {
        double[] A = new double[n+1];
        A[1]=1;
        A[2]=2;
        A[3]=3;
        System.out.println(A[1]);
        System.out.println(A[2]);
        System.out.println(A[3]);
        for (int i =4; i < n+1; i++) {
            A[i]=A[i-1]+A[i-2]-2*A[i-3];
            System.out.println(A[i]);
        }
    }
}
