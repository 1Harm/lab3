public class factorial14 {
    public void factorialR(int n) {
        double[] A = new double[n+1];
        A[1]=1;
        A[2]=2;
        System.out.println(A[1]);
        System.out.println(A[2]);
        for (int i =3; i < n+1; i++) {
            A[i]=(A[i-2]+2*A[i-1])/3;
            System.out.println(A[i]);
        }
    }
}
