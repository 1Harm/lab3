public class FACTORIAL9 {
    public void factorialR(double a, double b,int n) {
        double temp=(b-a)/n;
        for (double i =a; i <b; i+=temp){
            System.out.print(i);
            if(i!=b){
                System.out.println(", ");
            }
        }

    }
}
